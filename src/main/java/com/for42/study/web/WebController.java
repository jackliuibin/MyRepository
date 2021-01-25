package com.for42.study.web;

import com.for42.study.model.User;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
public class WebController {

    @RequestMapping(value = "getUser", method = RequestMethod.POST)
    public User getUser() {
        User user = new User();
        user.setAge(11);
        user.setName("刘斌");
        user.setPass("123");
        return user;
    }

    @RequestMapping(value = "saveUser", method = RequestMethod.POST)
    public void saveUser(@Valid User user, BindingResult bindingResult){
        System.out.println("user:"+user);
        if(bindingResult.hasErrors()){
            List<ObjectError> list = bindingResult.getAllErrors();
            for(ObjectError error:list){
                System.out.println(error.getCode()+"-"+error.getDefaultMessage());
            }
        }
    }
}
