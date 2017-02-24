package com.gatto.tdd.course;

import com.gatto.tdd.course.model.Employee;
import com.gatto.tdd.course.model.Role;

public class SalaryCalculator {

	public double calculate(Employee employee) {
		if (employee.getRole().equals(Role.DEVELOPER)) {
			if (employee.getSalary() > 3000) {
				return employee.getSalary() * 0.8;
			}
			return employee.getSalary() * 0.9;
		}
		return employee.getSalary() * 0.85;
	}

}
