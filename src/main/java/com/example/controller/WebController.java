package com.example.controller;

import java.util.List;

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
		model.addAttribute("person", new Person());
		return "index";
	}
	
	@RequestMapping("personSave")
	public String savePerson(@ModelAttribute("person")Person person, Model model){
		personServiceImpl.savePerson(person);
		return "index";
	}
	
	@RequestMapping("person")
	public String showPersons(Model  model){
		model.addAttribute("persons",personServiceImpl.findAllPersons());
		return "person";
	}
	
	@RequestMapping("findAllPersons")
	public String findAllPersons(Model model){
		List<Person> persons =(List<Person>)personServiceImpl.findAllPersons();
		model.addAttribute("persons", persons);
		return "person";
	}
	
	@RequestMapping("sortByFirstname")
	public String sortByFirstname(Model model){
		List<Person> persons = (List<Person>)personServiceImpl.showAllByOrderByFirstnameAsc();
		model.addAttribute("persons", persons);
		return "person";
	}
	
	@RequestMapping("sortByLastname")
	public String sortByLastname(Model model){
		List<Person> persons = (List<Person>)personServiceImpl.showAllByOrderByLastnameAsc();
		model.addAttribute("persons", persons);
		return "person";
	}	
	@RequestMapping("sortByAge")
	public String sortByAge(Model model){
		List<Person> persons = (List<Person>)personServiceImpl.showAllByOrderByAgeAsc();
		model.addAttribute("persons", persons);
		return "person";
	}	
}
