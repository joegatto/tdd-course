package com.gatto.tdd.course;

import com.gatto.tdd.course.model.Employee;

public class SalaryCalculator {

    public double calculate(Employee employee) {
        return employee.getRole().getRule().calculate(employee);
    }
}
