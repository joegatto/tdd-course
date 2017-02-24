package com.gatto.tdd.course;

import static org.junit.Assert.*;

import org.junit.Test;

import com.gatto.tdd.course.model.Employee;
import com.gatto.tdd.course.model.Role;

public class SalaryCalculatorTest {

    @Test
    public void testCalculateSalaryForDeveloperEarningBelowLimit() {
        Employee dev = new Employee("João", 1500.0, Role.DEVELOPER);
        SalaryCalculator sc = new SalaryCalculator();
        double salary = sc.calculate(dev);
        assertEquals(dev.getSalary() * 0.9, salary, 0.00001);
    }

    @Test
    public void testCalculateSalaryForDeveloperEarningAboveLimit() {
        Employee dev = new Employee("João", 4000.0, Role.DEVELOPER);
        SalaryCalculator sc = new SalaryCalculator();
        double salary = sc.calculate(dev);
        assertEquals(dev.getSalary() * 0.8, salary, 0.00001);
    }

    @Test
    public void testCalculateSalaryForDBAEarningBelowLimit() {
        Employee dba = new Employee("João", 500.0, Role.DBA);
        SalaryCalculator sc = new SalaryCalculator();
        double salary = sc.calculate(dba);
        assertEquals(dba.getSalary() * 0.85, salary, 0.00001);
    }

    @Test
    public void testCalculateSalaryForDBAEarningAboveLimit() {
        Employee dba = new Employee("João", 3000.0, Role.DBA);
        SalaryCalculator sc = new SalaryCalculator();
        double salary = sc.calculate(dba);
        assertEquals(dba.getSalary() * 0.75, salary, 0.00001);
    }

    @Test
    public void testCalculateSalaryForTesterEarningBelowLimit() {
        Employee tester = new Employee("João", 500.0, Role.TESTER);
        SalaryCalculator sc = new SalaryCalculator();
        double salary = sc.calculate(tester);
        assertEquals(tester.getSalary() * 0.95, salary, 0.00001);
    }

    @Test
    public void testCalculateSalaryForTesterEarningAboveLimit() {
        Employee tester = new Employee("João", 3000.0, Role.TESTER);
        SalaryCalculator sc = new SalaryCalculator();
        double salary = sc.calculate(tester);
        assertEquals(tester.getSalary() * 0.85, salary, 0.00001);
    }

    @Test
    public void testCalculateSalaryForDefault() {
        SalaryCalculator sc = new SalaryCalculator();
        double salary = sc.calculate(null);
        assertEquals(0, salary, 0.00001);
    }

}
