Feature: Withdraw cash from account
  As an accounter holder, I want to withdraw cash,
  In order to pay for my daily expenses

  Scenario: Withdraw cash from account in credit
    Given I have a balance of $100 in my account
    When I request $20
    Then $20 should be dispensed