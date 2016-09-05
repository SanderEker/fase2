package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.Person;
import com.example.service.PersonServiceImpl;

@Controller
public class WebController {

	@Autowired
	PersonServiceImpl personServiceImpl;
	
	@RequestMapping("/")
	public String start(Model model){
//	
//	Person person = new Person();
//	person.setFirstName("barry");
//	person.setLastname("cool");
//	
//	personServiceImpl.savePerson(person);
	model.addAttribute("person", new Person());
	return "index";
	}
	
	@RequestMapping("personSave")
		public String savePerson(@ModelAttribute("person")Person person, Model model){
		if (!personServiceImpl.personExists(person)) {
			personServiceImpl.savePerson(person);
			model.addAttribute("persons",personServiceImpl.findAllPersons());
				return "person";
		} else {
			return "person already exists";
		}
	}
	
	@RequestMapping("person")
	public String showPersons(Model  model){
		
		model.addAttribute("persons",personServiceImpl.findAllPersons());
		return "person";
	}

}
