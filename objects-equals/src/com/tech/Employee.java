package com.tech;

public class Employee {
	String name;
	Integer age;
	boolean active;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public Employee(String name, Integer age, boolean active) {
		super();
		this.name = name;
		this.age = age;
		this.active = active;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", active=" + active + "]";
	}

}
