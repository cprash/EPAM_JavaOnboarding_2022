package cucumber.helpers;

import cucumber.models.Account;
import cucumber.models.CashSlot;
import cucumber.models.Teller;

public class DomainHelper {
    private Account account;
    private Teller teller;

    private CashSlot cashSlot;

    public Account getAccount() {
        if(account==null)
            account=new Account();
        return account;
    }

    public Teller getTeller() {
        if(teller==null)
            teller=new Teller(getCashSLot());
        return teller;
    }

    public CashSlot getCashSLot() {
        if(cashSlot==null)
            cashSlot=new CashSlot();
        return cashSlot;
    }
}
