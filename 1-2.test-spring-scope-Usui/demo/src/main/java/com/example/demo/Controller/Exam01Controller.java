package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Exam01Controller")
public class Exam01Controller {

    @RequestMapping("")
    public String inputUser(){
        return "exam01";
    }

    @RequestMapping("/output")
    public String outputUser(String meil, String password, Model model){

        model.getAttribute(meil);
        model.getAttribute(password);

        if(meil.equals("yamada@sample.com") && password.equals("yamayama")){
            return "ok";
        }else{
            return "No";
        }
    }
}
