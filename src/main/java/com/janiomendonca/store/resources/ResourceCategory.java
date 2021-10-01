package com.janiomendonca.store.resources;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
@RequestMapping(value="/Categories")
public class ResourceCategory {
	
	@RequestMapping(method=RequestMethod.GET)
	public String listing () {
		
		return "REST is working";
		
	}
}
