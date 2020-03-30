package com.jc.farm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @Desc
 * @Author LinXing
 * @Date 2020/3/18 10:30
 * @Version 1.0
 */
@Controller
public class HelloController {
    @RequestMapping("/success")
    public String abc(Map<String,Object> resultMap, HttpSession session) {
        session.setAttribute("user","abc");
        resultMap.put("hello","lx");
        int[] array = new int[3];
        array[0] = 1 ;
        array[1] = 2 ;
        array[2] = 3 ;
        resultMap.put("list",array);
        return "success";
    }

}
