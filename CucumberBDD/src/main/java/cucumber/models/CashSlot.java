package cucumber.models;

public class CashSlot {
    private int content;
    public int getContents() {
        return content;
    }

    public void dispenseMoney(int amount) {
        content=amount;
    }
}
