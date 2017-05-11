package com.coderpark.controller;

import com.coderpark.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by zhaopin on 2016/11/13.
 */
@RestController
public class UserController {

  private Logger log = LoggerFactory.getLogger(UserController.class);
  @Autowired
  private UserService userService;

  @RequestMapping(value = "/success", method = RequestMethod.POST)
  @ResponseBody
  public String loginSuccess() {
    return "success";
  }

  @RequestMapping(value = "/index", method = RequestMethod.GET)
  public String frontPage() {
    log.debug("--mapping index");
    return "index";
  }
}
