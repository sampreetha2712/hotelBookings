package example2.bookingsdemo;

import org.jsondoc.spring.boot.starter.EnableJSONDoc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableJSONDoc
public class BookingsdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookingsdemoApplication.class, args);
    }
}
