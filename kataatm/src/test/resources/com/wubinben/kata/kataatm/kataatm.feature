Feature: Kata ATM
  In order to make the ATM serve me as much as possible
  As a customer of a bank
  I want to use ATM to check the balance, deposit money, withdraw money, and recharge units to an electricity card.

  Scenario Outline: ATM Services
    Given the balance of account is 0
    When I <do> a kind of self-service using an ATM
    And in <amount>
    When I check the balance
    Then the balance should be <balance>
    And the added units in the electricity card should be <addedUnits>

  Examples:
    | do | amount | balance | addedUnits |
    | deposit | 1000 | 1000 | 0          |
    | withdraw | 300 | 700  | 0          |
    | recharge electricity | 100 | 500 | 100 |
