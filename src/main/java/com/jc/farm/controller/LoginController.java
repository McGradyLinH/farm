package com.jc.farm.controller;

import com.jc.farm.entity.User;
import com.jc.farm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @Desc
 * @Author LinXing
 * @Date 2020/3/24 11:25
 * @Version 1.0
 */
@Controller
public class LoginController {
    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public String login(@RequestParam("username") String username, @RequestParam("pwd") String password,
                        HttpSession session, Map<String,Object> resultMap){
        User user = userService.getUser(username, password);
        if (user != null){
            session.setAttribute("user",username);
            return "redirect:/index.html";
        }else {
            resultMap.put("msg","用户名密码错误！");
            return "login";
        }
    }

}
