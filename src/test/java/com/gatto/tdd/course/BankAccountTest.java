package com.gatto.tdd.course;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BankAccountTest {

    BankAccount acc;

    @Before
    public void setUp() throws Exception {
        acc = new BankAccount(100);
    }

    @Test
    public void testDeposit() {
        acc.deposit(50);
        assertEquals(acc.getBalance(), 150);
    }

    @Test
    public void testWithdraw() {
        acc.withdraw(50);
        assertEquals(acc.getBalance(), 50);
    }

    @Test
    public void testWithdrawWithPenalty() {
        assertTrue(acc.withdraw(110));
        assertEquals(acc.getBalance(), -15);
    }

    @Test
    public void testWithdrawWithHugeAmount() {
        assertTrue(acc.withdraw(1));
        assertEquals(acc.getBalance(), 99);
    }
    
    @Test
    public void testWithdrawWithAmountBiggerThan1000() {
        assertFalse(acc.withdraw(1001));
        assertEquals(acc.getBalance(), 100);
    }

    @After
    public void tearDown() throws Exception {

    }

}
