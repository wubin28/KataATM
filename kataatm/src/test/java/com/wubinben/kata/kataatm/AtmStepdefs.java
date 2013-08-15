package com.wubinben.kata.kataatm;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.logging.Level;
import java.util.logging.Logger;
import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: Ben
 * Date: 13-8-15
 * Time: 上午7:05
 * To change this template use File | Settings | File Templates.
 */
public class AtmStepdefs {
    private int balance;
    private static final Logger LOGGER = Logger.getLogger(AtmStepdefs.class.getName());
    private int amount;
    private int addedUnits;

    public AtmStepdefs() {
        // To turn on logging, set level to be Level.INFO.
        LOGGER.setLevel(Level.INFO);
    }

    @Given("^the initial balance of account is (\\d+)$")
    public void the_initial_balance_of_account_is(int balance) throws Throwable {
        this.balance = balance;
    }

    @When("^I (deposit in RMB Yuan|withdraw in RMB Yuan|recharge electricity in unit) (\\d+) using an ATM$")
    public void I_do_self_service(String action, int amount) throws Throwable {
        this.amount = amount;
        LOGGER.info(">>action: " + action);
    }

    @And("^I check the balance$")
    public void I_check_the_balance() throws Throwable {
        this.balance = 1000;
        this.addedUnits = 0;
    }

    @Then("^the balance should be (\\d+)$")
    public void the_balance_should_be(int currentBalance) throws Throwable {
        assertEquals("the current balance is not right.", currentBalance, this.balance);
    }

    @And("^the added units in the electricity card should be (\\d+)$")
    public void the_added_units_in_the_electricity_card_should_be(int addedUnits) throws Throwable {
        assertEquals("the added units are not right.", addedUnits, this.addedUnits);
    }
}
