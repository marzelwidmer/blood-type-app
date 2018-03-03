package ch.keepcalm.web.bloodtypeapp.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by marcelwidmer on 25/06/16.
 */
@RestController
public class HelloDocker {

    @Value( "${appconf.value:defaultValue}" )
    private String appConfValue;

    @Value( "${appconf.otherValue:defaultOtherValue}" )
    private String appConfOtherValue;

    @Value( "${spring.profiles.active}" )
    private String profile;


    @RequestMapping("/")
    public String home() {
        return "Hello Docker World.... this is a config value : " + appConfValue + " and " + appConfOtherValue +  " from profile " + profile;
    }
}
