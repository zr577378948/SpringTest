
package com.example.test.controller;

import com.example.test.entity.User;
import com.example.test.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping("/test")
    public String test(Model model){
        List<User> allUser = userService.findAll();
        model.addAttribute("user",allUser);
        return "allUser";
    }


}
