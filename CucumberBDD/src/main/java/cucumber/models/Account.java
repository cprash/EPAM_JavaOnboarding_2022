package cucumber.models;

public class Account {
    int balance;
    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        balance=balance+amount;
    }
}
