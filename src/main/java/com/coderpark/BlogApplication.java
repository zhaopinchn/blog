package com.coderpark;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Controller
@EnableWebMvc
@SpringBootApplication
public class BlogApplication {


	public static void main(String[] args) {
		SpringApplication.run(BlogApplication.class, args);
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		return "/index";
	}
}
