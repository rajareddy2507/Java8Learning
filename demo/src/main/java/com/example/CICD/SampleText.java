package com.example.CICD;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SampleText {
	@RequestMapping("/welcome")
	@ResponseBody
	public String display(){
		return ("Hello EveryOne.. Welcome to Spring Boot");
	}
}
