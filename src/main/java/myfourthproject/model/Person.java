package myfourthproject.model;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Person {

	@Id
//    @GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	private String name;
	
	private Integer age;

//	public Person() {
//
//	}
//
//	public Person(Integer id, String name, Integer age) {
//		this.id = id;
//		this.name = name;
//		this.age = age;
//	}

	public Integer getId() {
		return this.id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}