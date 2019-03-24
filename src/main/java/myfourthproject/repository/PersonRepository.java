package myfourthproject.repository;

import org.springframework.data.repository.CrudRepository;

import myfourthproject.model.Person;

public interface PersonRepository extends CrudRepository<Person, Integer> {

}
