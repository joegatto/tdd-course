package com.gatto.tdd.course;

import com.gatto.tdd.course.model.Employee;

public class TenTwentyPerCent implements CalculationRule {

    @Override
    public double calculate(Employee employee) {
        if (employee.getSalary() > 3000) {
            return employee.getSalary() * 0.8;
        }
        return employee.getSalary() * 0.9;
    }

}
