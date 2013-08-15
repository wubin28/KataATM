Feature: Kata ATM
  In order to make the ATM serve me as much as possible
  As a customer of a bank
  I want to use ATM to check the balance, deposit money, withdraw money, and recharge units to an electricity card.

  Scenario Outline: ATM Services
    Given the initial balance of account is 0
    When I <selfService>
    And <amount> using an ATM
    And I check the balance
    Then the balance should be <balance>
    And the added units in the electricity card should be <addedUnits>

  Examples:
    | selfService                     | amount | balance | addedUnits |
    | deposit in RMB Yuan           | 1000   | 1000   | 0          |
    | withdraw in RMB Yuan          | 300    | 700    | 0          |
    | recharge electricity in unit | 100    | 500     | 100       |
