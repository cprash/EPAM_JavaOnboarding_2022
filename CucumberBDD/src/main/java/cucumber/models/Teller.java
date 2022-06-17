package cucumber.models;

public class Teller {

    private final CashSlot cashSlot;

    public Teller(CashSlot cashSlot) {
        this.cashSlot=cashSlot;
    }

    public void withdrawCash(Account account, int amount) {
        cashSlot.dispenseMoney(amount);
    }
}
