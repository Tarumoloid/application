package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.validation.annotation.Validated;

import javax.persistence.EntityNotFoundException;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/postStaff")
public class RestController {
	
	@Autowired
	StaffService service;
	   
	  //全件表示
	  @CrossOrigin
	  @RequestMapping(value="/selectall", method=RequestMethod.GET)
	  public List<Staff> counterSelectAll() {
		  //3秒間停止する
		  try {
			  Thread.sleep(5000);
			  System.out.println("selectCall");
		  }catch (Exception ex){
		  	ex.printStackTrace();
		  }
	    return service.selectAll(); 
	  }


	//POSTに対するメソッド
    @CrossOrigin
	@RequestMapping(value="/post", method=RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
	public Staff insertStaff(@RequestBody Staff staff){
	      return service.create(staff);
	}
}
