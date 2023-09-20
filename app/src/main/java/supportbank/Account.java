package supportbank;

import java.util.ArrayList;

class Account {
    private String name;
    private double moneyFromBank;
    ArrayList<Transaction> allTransaction = new ArrayList<Transaction>();


    public void addMoneyToBank(double amountToAdd) {
        this.moneyFromBank += amountToAdd;
    }

    public void reduceMoneyInBank(double amountToAdd) {
        this.moneyFromBank += amountToAdd;
    }

    public double getMoneyFromBank() {
        return moneyFromBank;
    }

    public String getName() {
        return name;
    }

    public void addMoney(double amount) {
        moneyFromBank += amount;
    }

    public void deductMoney(double amount) {
        moneyFromBank -= amount;
    }

    public void printAllTransaction() {
        for (Transaction transaction : allTransaction) {
            System.out.println(transaction.getTransactionMessage());
        }

    }

    public void addTransaction(String date, String from, String to, String narrative, double amount) {
        allTransaction.add(new Transaction(date, from, to, narrative, amount));
    }

    public Account(String name) {
        this.name = name;
        this.moneyFromBank = 0.0;
    }
}