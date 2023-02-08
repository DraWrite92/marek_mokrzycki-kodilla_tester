package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTestSuite {

    @Test
    public void shouldHaveZeroLengthInitially() {
        CashMachine cashLength = new CashMachine();
        int[] amounts = cashLength.getAmounts();
        assertEquals(0, amounts.length);
    }

    @Test
    public void shouldAddSeveralActionsToArray() {
        CashMachine cashActions = new CashMachine();
        cashActions.add(100);
        cashActions.add(-50);
        cashActions.add(200);
        cashActions.add(-100);

        int[] amounts = cashActions.getAmounts();
        assertEquals(4, amounts.length);
        assertEquals(100, amounts[0]);
        assertEquals(-50, amounts[1]);
        assertEquals(200, amounts[2]);
        assertEquals(-100, amounts[3]);
    }
}
