package com.kodilla.bank.homework;

public class CashMachine {
    public int[] amounts;
    public int size;

    public CashMachine() {
        this.size = 0;
        this.amounts = new int[0];
    }

    public int addCheck(int withdraw) {
        this.size++;
        int[] newTab = new int[this.size];
        System.arraycopy(amounts, 0, newTab, 0, amounts.length);
        newTab[this.size - 1] = withdraw;
        this.amounts = newTab;
        return withdraw;
    }

    public int addPay(int deposit) {
        this.size++;
        int[] newTab = new int[this.size];
        System.arraycopy(amounts, 0, newTab, 0, amounts.length);
        newTab[this.size - 1] = deposit;
        this.amounts = newTab;
        return deposit;
    }

    public int[] getAmounts() {
        return amounts;
    }

    public double getSummary() {
        if (this.amounts.length == 0) {
            System.out.println("The total amount of money in transactions is 0.");
            return 0;
        }
        double sum = 0;
        for (int i = 0; i < this.amounts.length; i++) {
            sum += amounts[i];
        }
        System.out.println("The sum of transactions is: " + sum);
        return sum;
    }

    public double getAveragePaychecks() {
        if (this.amounts.length == 0) {
            System.out.println("There are no paychecks to be calculated.");
            return 0;
        }
        double sum = 0;
        int i = 0;
        if (amounts[i] < 0) {
            for (i = 0; i < this.amounts.length; i++) {
                sum += amounts[i];
            }
        }
        System.out.println("The average paycheck amount is: " + sum / this.amounts.length);
        return sum / this.amounts.length;
    }

    public double getAveragePayments() {
        if (this.amounts.length == 0) {
            System.out.println("There are no payments to be calculated.");
            return 0;
        }
        double sum = 0;
        int i = 0;
        if (amounts[i] > 0) {
            for (i = 0; i < this.amounts.length; i++) {
                sum += amounts[i];
            }
        }
        System.out.println("The average payment amount is: " + sum / this.amounts.length);
        return sum / this.amounts.length;
    }

    public void countThePaychecks() {
        int countPC = 0;
        int i = 0;
        countPC++;

        for (i = 0; i < amounts.length; i++) {
            if (amounts[i] < 0) {
                double numberOfPaychecks = countPC - 1;
                System.out.println("The number of paychecks done is: " + numberOfPaychecks);
            }
        }
    }
        public void countThePayments () {
            int countPM = 0;
            int i = 0;
            countPM++;

            for (i = 0; i < amounts.length; i++) {
                if (amounts[i] > 0) {
                    double numberOfPayments = countPM - 1;
                    System.out.println("The number of payments done is: " + numberOfPayments);
                }
            }
        }
    }
