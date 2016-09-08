package com.example.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.domain.Person;

public interface PersonRepository extends CrudRepository<Person, Long> {

	Iterable<Person> findAllByOrderByFirstnameAsc();
	Iterable<Person> findAllByOrderByLastnameAsc();
	Iterable<Person> findAllByOrderByAgeAsc();

//	Person findById(long id);
//	Person save(Person person);
}
