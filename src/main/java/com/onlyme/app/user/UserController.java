package com.onlyme.app.user;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class UserController {

    @RequestMapping(method = RequestMethod.GET, path = "/users")
    public String getUsers(){
        return "Hello World";
    }
}
