package com.gatto.tdd.course;

import com.gatto.tdd.course.model.Employee;

public class SalaryCalculator {

    public double calculate(Employee employee) {
        switch (employee.getRole()) {
        case DEVELOPER:
            if (employee.getSalary() > 3000) {
                return employee.getSalary() * 0.8;
            }
            return employee.getSalary() * 0.9;
        case DBA:
        case TESTER:
            if (employee.getSalary() > 2500) {
                return employee.getSalary() * 0.75;
            }
            return employee.getSalary() * 0.85;
        }
        throw new RuntimeException("Invalid Employee");
    }
}
