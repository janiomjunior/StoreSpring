package com.janiomendonca.store.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.janiomendonca.store.domain.Category;

@RestController
@RequestMapping(value="/Categories")
public class ResourceCategory {
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Category> listing () {
		
		Category cat1 = new Category (1, "Informatics");
		Category cat2 = new Category (2, "Officer");
		
		List<Category> list = new ArrayList<>();
		list.add(cat1);
		list.add(cat2);
		
		
		return list;
		
	}
}
