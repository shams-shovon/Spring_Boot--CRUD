package com.shovon.Chalk_in_hand;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloWorld {
	
	@GetMapping("/hello-world")
	public String GetMessage() {
		return  "I am here";
	}

}
