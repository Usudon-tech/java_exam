package com.example.demo.Controller;

//import java.lang.reflect.Member;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.domain.Member;

@Controller
@RequestMapping("/input")
public class thymeleafController {

    @ModelAttribute
    public Member setUpForm(){
        return new Member();
    }

    @RequestMapping("")
    public String input(){
        return "ex-thymeleaf-input";
    }

    @RequestMapping("/output")
    public String output(Member member, Model model){
        model.addAttribute("name", member.getName());
        model.addAttribute("age", member.getAge());
        model.addAttribute("list", member.getHobbyList());
        return "ex-thymeleaf-result";
    }

}
