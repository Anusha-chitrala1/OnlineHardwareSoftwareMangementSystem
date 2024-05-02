package com.main.EmployeeController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.main.Service.EmployeeService;
import com.main.dto.EmployeeDto;

@RestController
@RequestMapping("/Employee")
public class EmployeeController {
 @Autowired
 private EmployeeService userService;
 @PostMapping("/register")

 public ResponseEntity<String> register(@RequestBody EmployeeDto cDto){
	   
//	  System.out.println(cDto);
	  
	   String result = userService.register(cDto);
	  
	  
	  return new ResponseEntity<String>(result, HttpStatus.CREATED);
 }
 
 
}
