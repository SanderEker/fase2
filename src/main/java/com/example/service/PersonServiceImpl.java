package com.example.service;

import java.util.Collection;

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
	
	public Collection<Person> findAllPersons(){
		return (Collection<Person>)personRepository.findAll();
	}
	

}
