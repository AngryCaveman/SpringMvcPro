package com.my.spring_mvc_pro.interfaceController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/interface")
public class InterfacePage {
    @RequestMapping("001")
    @ResponseBody
    public String getParamByGet(
            @RequestParam(value="username", required=true)String name,
            @RequestParam(value="usersex",required=false)String sex,
            @RequestParam(value="remark",required=false)String remark
                               ) {
        System.out.println(name + " " + sex+" "+remark);
        System.out.println("branch 001 update");
        System.out.println("test branch 001 balabala。。。。");
        System.out.println("test branch 001 balabala。。。。");
        return "success";
    }

}
