package com.gatto.tdd.course.model;

public class Employee {
	private String name;
	private double salary;
	private Role role;

	public Employee(String name, double salary, Role role) {
		super();
		this.name = name;
		this.salary = salary;
		this.role = role;
	}

	public String getName() {
		return name;
	}

	public Role getRole() {
		return role;
	}

	public double getSalary() {
		return salary;
	}
}
