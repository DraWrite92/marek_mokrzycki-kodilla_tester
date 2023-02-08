package com.kodilla.bank.homework;

public class Bank {
    public static void main(String[] args) {

        CashMachine cashier1 = new CashMachine();
        cashier1.addCheck(-100);
        cashier1.addCheck(-200);
        cashier1.addPay(50);
        cashier1.addPay(100);
        cashier1.addPay(200);
        cashier1.addPay(350);

        cashier1.getSummary();
        cashier1.countThePaychecks();
        cashier1.countThePayments();
        cashier1.getAveragePaychecks();
        cashier1.getAveragePayments();


        CashMachine cashier2 = new CashMachine();
        cashier2.addCheck(-50);
        cashier2.addCheck(-200);
        cashier2.addPay(100);
        cashier2.addPay(50);

        cashier2.getSummary();
        cashier2.countThePaychecks();
        cashier2.countThePayments();
        cashier2.getAveragePaychecks();
        cashier2.getAveragePayments();
    }
}
