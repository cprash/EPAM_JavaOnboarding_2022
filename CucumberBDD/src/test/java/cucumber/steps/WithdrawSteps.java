package cucumber.steps;


import cucumber.api.java.en.Then;
import cucumber.helpers.DomainHelper;
import org.junit.Assert;


public class WithdrawSteps {


    public DomainHelper domainHelper;
        public WithdrawSteps(DomainHelper domainHelper) {
        this.domainHelper = domainHelper;
    }



    @Then("^\\$(\\d+) should be dispensed$")
    public void $ShouldBeDispensed(int dispensedAmount) throws Throwable {
        domainHelper.getCashSLot();
        Assert.assertEquals(dispensedAmount,domainHelper.getCashSLot().getContents());
    }
}
