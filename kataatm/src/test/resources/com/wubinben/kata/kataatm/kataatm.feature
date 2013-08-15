Feature: Kata ATM
  In order to make the ATM serve me as much as possible
  As a customer of a bank
  I want to use ATM to check the balance, deposit money, withdraw money, and recharge units to an electricity card.

  Scenario Outline: ATM Services
    Given the old balance of my account is <oldBalance>
    When I <selfService> <amount> using an ATM
    Then the new balance should be <newBalance>
    And the added units in the electricity card should be <addedUnits>

  Examples:
    | oldBalance | selfService                     | amount | newBalance | addedUnits |
    | 0          | deposit in RMB Yuan           | 1000   | 1000      | 0          |
    | 1000      | withdraw in RMB Yuan          | 300    | 700        | 0          |
    | 700       | recharge electricity in unit | 100    | 500        | 100       |
