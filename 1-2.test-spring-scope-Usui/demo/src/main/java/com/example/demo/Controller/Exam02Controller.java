package com.example.demo.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/ex02")
public class Exam02Controller {

    @Autowired
    private HttpSession settion;

    @RequestMapping("")
    public String inputUser(){
        return "exam02";
    }

    List<String> Num;

    @RequestMapping("/result")
    public String result(String num1, String num2, List Num){
        settion.getAttribute(num1);
        settion.getAttribute(num2);

        int num = num1 + num2;
    }

}
