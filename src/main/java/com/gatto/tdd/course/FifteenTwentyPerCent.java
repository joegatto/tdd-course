package com.gatto.tdd.course;

import com.gatto.tdd.course.model.Employee;

public class FifteenTwentyPerCent implements CalculationRule {

    @Override
    public double calculate(Employee employee) {
        if (employee.getSalary() > 2500) {
            return employee.getSalary() * 0.75;
        }
        return employee.getSalary() * 0.85;
    }

}
