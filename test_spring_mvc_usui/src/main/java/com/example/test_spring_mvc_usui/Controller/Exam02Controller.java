package com.example.test_spring_mvc_usui.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exam02")
public class Exam02Controller {

    @RequestMapping("/show-company-introduction")
    public String showCompanyIntroduction(){
        return "exam-02.html";
    }
}
