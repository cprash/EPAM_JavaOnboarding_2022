package cucumber.steps;

import cucumber.api.java.en.Given;
import cucumber.helpers.DomainHelper;
import org.junit.Assert;

public class AccountsSteps {

    private DomainHelper domainHelper;

    public AccountsSteps(DomainHelper domainHelper) {
        this.domainHelper=domainHelper;
    }

    @Given("^I have a balance of \\$(\\d+) in my account$")
    public void iHaveABalanceOf$InMyAccount(int amount)  {
        domainHelper.getAccount().deposit(amount);
        Assert.assertEquals(amount,domainHelper.getAccount().getBalance());
    }
}
