package guru.springframework.controllers;

import guru.springframework.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * Created by jt on 5/24/17.
 */
@RestController
public class PropertyInjectedController {

    @Autowired
    @Qualifier("greetingServiceImpl")
    public GreetingService greetingServiceImpl;

    @RequestMapping(value = "/helloProperty", method = RequestMethod.GET)
    public ResponseEntity sayHello(){
        return new ResponseEntity<String>(greetingServiceImpl.sayGreeting(), HttpStatus.OK);
    }

}
