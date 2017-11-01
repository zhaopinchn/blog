package com.blog.marry;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by admin on 2017/7/25.
 */
@Controller
public class MarryController {

    @GetMapping(value = "/marry")
    public String marryYou() {
        return "/share/marry";
    }
}
