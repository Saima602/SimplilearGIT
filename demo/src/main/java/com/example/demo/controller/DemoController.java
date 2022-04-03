package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	@Value("${server.port}")
	private String demVal;
	
   //@GetMapping("/demo")
   @RequestMapping("/demo")
   public void getDemo() {
	   System.out.println("Port is :: "+demVal);
   }
   
   
}