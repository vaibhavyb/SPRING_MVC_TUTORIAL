package com.vaibhav.AllLearn.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.vaibhav.AllLearn.model.Person;

@Controller
public class Allcontrollers {
	
	StringBuffer orders=new StringBuffer();

	@RequestMapping("/welcome")
	@ResponseBody
	public String display2() {
		return "I am Normal Shit";
	}
	
	@RequestMapping("/home")
	public String display() {
		return "index";
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/submit_ordername")
	public String submitted(@RequestParam String order,ModelMap model) {
		model.put("order", order);
		orders.append(order);
	    return "submit_ordername";	
	}
	@RequestMapping(method=RequestMethod.POST,value="/final")
	public String submit(@ModelAttribute("person") Person person,ModelMap model) {
		//@ModelAttribute is used to get data as object of some class FROM jsp
		String order_data=orders.toString();
		model.put("orderdata", order_data);
		model.addAttribute("person", person);//passing object INTO jsp
		return "the_final";	
	}
	
	
}
