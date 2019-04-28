package com.spring.rest.webservice.api;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.rest.webservice.dao.GreetingDAO;
import com.spring.rest.webservice.pojo.GreetingPojo;


@RestController
public class GreetingdDetails {

	@Autowired
	private GreetingDAO greetingDAO;
	
	@GetMapping(name="/greetingAll")
	public List<GreetingPojo> GreetingAll() {
		return (List<GreetingPojo>) greetingDAO.findAll();
	}
	
	@GetMapping(path="/greeting/{id}")
	public GreetingPojo Greeting(@PathVariable("id") Integer id) {
		return greetingDAO.findById(id).get();
	}
	
	@PostMapping(name="/greeting")
	public GreetingPojo savaGreetingPojo(@RequestBody GreetingPojo greetingPojo){
		greetingDAO.save(greetingPojo);
		return greetingPojo;
	}
}
