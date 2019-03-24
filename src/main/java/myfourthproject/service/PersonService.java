package myfourthproject.service;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import myfourthproject.model.Person;

@Service
public class PersonService {

	private Map<String, Person> persons = new HashMap<String, Person>();
	
	@PostConstruct
	private void setup() {
//		add(new Person(1, "Aasdgklajer", 1));
	}
	
	public void add(Person person) {
		persons.put(UUID.randomUUID().toString(), person);
	}

	public Person getPerson(String id) {
		return persons.get(id);
	}

	public Map<String, Person> get() {
		return persons;
	}
	
	public void update(String id, Person person) {
		persons.replace(id, person);
	}
	
	public void delete(String id) {
		persons.remove(id);
	}
}
