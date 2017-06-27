package com.blog.controller;

import com.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by zhaopin on 2016/11/13.
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/success", method = RequestMethod.POST)
    @ResponseBody
    public String loginSuccess() {
        return "success";
    }

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String frontPage() {
        return "index";
    }
}
