package com.zisal.rms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created on 2/6/18.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Controller
@SpringBootApplication
public class RMSApplication {

    public static void main(String [] args) {
        SpringApplication.run(RMSApplication.class);
    }

    @GetMapping("/")
    public String displayIndex() {
        return "index";
    }
}
