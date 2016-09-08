package com.example.service;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.domain.Person;
import com.example.repository.PersonRepository;

@Service
public class PersonServiceImpl {
	

	@Autowired
	PersonRepository personRepository;
	
//	public Person findById(long id){
//		return personRepository.findById(id);
//	}
	
	public Person savePerson(Person person){
		return personRepository.save(person);
	}
	
	public List<Person> findAllPersons(){
		return (List<Person>)personRepository.findAll();
	}
	
	public List<Person> findAllPersonsSorted(){
		List<Person> unsorted = (List<Person>)personRepository.findAll();
		unsorted.sort(null);
		return unsorted;
	}
	
	public boolean personExists(Person person) {
		
		return false;
	}
	

}
