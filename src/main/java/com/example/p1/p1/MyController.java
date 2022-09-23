package com.example.p1.p1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MyController {

    @GetMapping("/")
    public String home(){
        return "home"; // home.html return
    }

    @GetMapping("/ex01") //주소창이 .../ex01 일때
    public String ex01(){
        return "ex01"; // html file name (ex01.html파일)
    }

    @PostMapping("/ex01/answer") //form의 action과 같아야함.
    public String ex01Answer(String id, String pwd, Model model){
        model.addAttribute("id", id);
        model.addAttribute("pwd", pwd);
        return "ex01Answer";
    }

    @GetMapping("/ex02")
    public String ex02(){
        return "ex02";
    }

    @PostMapping("/ex02/answer")
    public String ex02Answer(String id, String po, Model model){
        model.addAttribute("name", id);
        model.addAttribute("po", po);
        int salary = 0;
        switch(po){
            case "사원" -> salary = 3500;
            case "대리" -> salary = 5000;
            case "팀장" -> salary = 7000;
            case "임원" -> salary = 9900;
        }
        model.addAttribute("salary", salary);
        return "ex02Answer";
    }

}
