package guru.springframework.controllers;

import guru.springframework.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jt on 5/24/17.
 */
@RestController
public class SetterInjectedController {
    private GreetingService greetingService;

    @RequestMapping(value = "/helloSetter", method = RequestMethod.GET)
    public ResponseEntity sayHello(){
        return new ResponseEntity<String>(greetingService.sayGreeting(), HttpStatus.OK);
    }

    @Autowired
    public void setGreetingService(@Qualifier("setterGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
