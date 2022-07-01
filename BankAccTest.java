package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccTest {

    BankAcc acc1 = new BankAcc(2000.00);
    BankAcc acc2 = new BankAcc(4000.00);

    @BeforeEach
    void setUp() {

    }

    @Test
    @DisplayName("Checking deposit():")
    void deposit() {
        assertEquals(2800.00, acc1.deposit(800.00));
        assertEquals(4000.00, acc2.deposit(6000.00));
    }

    @Test
    @DisplayName("Checking withdraw():")
    void withdraw() {
        assertEquals(2800.00, acc1.withdraw(2000.00));
        assertEquals(2000.00, acc2.withdraw(2000.00));
    }
}