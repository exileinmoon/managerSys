package webs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "webs")
public class WebsysApplication {
    public static void main(String[] args) {
        SpringApplication.run(WebsysApplication.class, args);
    }
}