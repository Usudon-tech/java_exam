package com.example.test_spring_mvc_usui.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/name-form")
public class ReceiveNameController {

    @ModelAttribute
    public ReceiveNameForm setUpForm(){
        return new ReceiveNameForm();
    }

    @RequestMapping("")
    public String input_name(){
        return "name-form";
    }

    @RequestMapping("/finished")
    public String show_finished(String name){
        System.out.println(name);
        return "finished";
    }

    @RequestMapping("/finished1")
    public String show_finished1(String name){
        System.out.println(name);
        return "finished";
    }
}
