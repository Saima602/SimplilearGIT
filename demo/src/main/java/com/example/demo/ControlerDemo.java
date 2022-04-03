package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControlerDemo {
  @Autowired
  ServiceDemo service;
  
	@GetMapping("/geTinytUrl")
  String getTinyURL(@PathVariable String geTinytUrl){
	return  service.SaveTheURL(getUrl);
  }
	@GetMapping("/getActualUrl")
	  String getTinyURL(@PathVariable String getActualUrl){
		return  service.fetchTheURLBasedOn(getActualUrl);
	  }
   
}
