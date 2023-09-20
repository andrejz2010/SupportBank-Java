package supportbank;

import java.util.HashMap;

public class BankingSystem {
    private HashMap<String, Account> accounts = new HashMap<String, Account>();

    public void createAccount(String name) {

        accounts.putIfAbsent(name, new Account(name));
    }

    public void makeTransaction(String date, String from, String to, String narrative, double amount) {

        accounts.get(from).addMoneyToBank(amount);
        accounts.get(to).deductMoney(amount);
        accounts.get(from).addTransaction(date, from, to, narrative, amount);
        accounts.get(to).addTransaction(date, from, to, narrative, amount);

    }

    public HashMap<String, Account> getAccounts() {
        return accounts;
    }

    public void listALl() {
        System.out.println("All accounts and balances: ");
        for (Account account : accounts.values()) {
            System.out.println(account.getName() + ": " + account.getMoneyFromBank());
        }


    }
}
