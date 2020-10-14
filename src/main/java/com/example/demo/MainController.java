package com.example.demo;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/test1")
public class MainController {

	@RequestMapping(value = "/index", 
			method = {RequestMethod.POST})
	@ResponseBody
	public List<Syain> output1(
			@RequestBody List<Syain> syainList) {
		for(Syain syain : syainList) {
			System.out.println(syain.getBangou());
			System.out.println(syain.getName());	
			
		}
		return syainList;
	}
}