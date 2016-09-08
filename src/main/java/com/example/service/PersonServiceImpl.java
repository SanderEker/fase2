package com.example.service;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.domain.Person;
import com.example.repository.PersonRepository;

@Service
public class PersonServiceImpl {
	

	@Autowired
	PersonRepository personRepository;
	
	public Person savePerson(Person person){
		return personRepository.save(person);
	}
	
	public Iterable<Person> findAllPersons(){
		return personRepository.findAll();
	}

	public Iterable<Person> showAllByOrderByFirstnameAsc() {
		return personRepository.findAllByOrderByFirstnameAsc();
	}
	
	public Iterable<Person> showAllByOrderByLastnameAsc() {
		return personRepository.findAllByOrderByLastnameAsc();
	}
	
	public Iterable<Person> showAllByOrderByAgeAsc() {
		return personRepository.findAllByOrderByAgeAsc();
	}
}
