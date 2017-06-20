package ch.keepcalm.web.bloodtypeapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by marcelwidmer on 25/06/16.
 */
@RestController
public class HelloDocker {

    @RequestMapping("/")
    public String home() {
        return "Hello Docker World....";
    }
}
