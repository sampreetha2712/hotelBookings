package example2.bookingsdemo;

import org.hibernate.cfg.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.constraints.NotNull;
import java.util.Date;

@Controller
public class ViewController {

    private String appMode;

    @Autowired
    public ViewController(org.springframework.core.env.Environment environment){
        appMode = environment.getProperty("app-mode");
    }

    @RequestMapping("/")
    public String index(Model model){
        model.addAttribute("datetime", new Date());
        model.addAttribute("username", "Sampreetha");
        model.addAttribute("mode", appMode);

        return "index";
    }
}
