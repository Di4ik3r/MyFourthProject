package myfourthproject.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import myfourthproject.model.Person;
import myfourthproject.repository.PersonRepository;

@RestController
@RequestMapping("/persons")
public class PersonController {

	@Autowired
	private PersonRepository personRepository;

	@GetMapping("/add")
	public @ResponseBody String addNewUser(@RequestParam String name, @RequestParam Integer age) {

		Person n = new Person();
		n.setName(name);
		n.setAge(age);
		personRepository.save(n);
		return "Saved";
	}

	@GetMapping
	public @ResponseBody Iterable<Person> get() {
		return personRepository.findAll();
	}

	@RequestMapping("/{id}")
	public Optional<Person> get(@PathVariable("id") Integer id) {
		return personRepository.findById(id);
	}

	@PostMapping
	public void add(@RequestBody Person person) {
		personRepository.save(person);
	}

	@PutMapping("/{id}")
	public void update(@RequestBody Person person, @PathVariable("id") Integer id) {
		personRepository.deleteById(id);
		personRepository.save(person);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Integer id) {
		personRepository.deleteById(id);
	}
}
