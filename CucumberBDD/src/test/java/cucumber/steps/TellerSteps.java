package cucumber.steps;

import cucumber.api.java.en.When;
import cucumber.helpers.DomainHelper;

public class TellerSteps {
    private DomainHelper domainHelper;
    public TellerSteps(DomainHelper domainHelper) {
        this.domainHelper=domainHelper;
    }

    @When("^I request \\$(\\d+)$")
    public void iRequest$(int amount) {
        domainHelper.getTeller().withdrawCash(domainHelper.getAccount(), amount);
    }
}
