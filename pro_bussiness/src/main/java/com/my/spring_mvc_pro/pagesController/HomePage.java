package com.my.spring_mvc_pro.pagesController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/homepage")
public class HomePage {

    @RequestMapping("001")
    public String sayHello() {
        System.out.println("branch 001 update homepage");
        return "/HomePage/homepage";
    }
}
