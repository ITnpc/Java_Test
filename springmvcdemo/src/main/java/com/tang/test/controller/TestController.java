package com.tang.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class TestController {

    @RequestMapping("/viewAll")
    public ModelAndView viewAll(String name, String pwd) {
        ModelAndView mv = new ModelAndView();
        System.out.println("进入了控制器viewAll()方法...");
        System.out.println("name="+name);
        System.out.println("pwd"+pwd);
        mv.setViewName("hello1.jsp");
        return mv;
    }
}
