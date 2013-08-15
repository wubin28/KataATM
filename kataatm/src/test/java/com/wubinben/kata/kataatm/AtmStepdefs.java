package com.wubinben.kata.kataatm;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created with IntelliJ IDEA.
 * User: Ben
 * Date: 13-8-15
 * Time: 上午7:05
 * To change this template use File | Settings | File Templates.
 */
public class AtmStepdefs {
    private int initialBalance;
    private static final Logger LOGGER = Logger.getLogger(AtmStepdefs.class.getName());

    public AtmStepdefs() {
        // To turn on logging, set level to be Level.INFO.
        LOGGER.setLevel(Level.INFO);
    }

    @Given("^the initial balance of account is (\\d+)$")
    public void the_initial_balance_of_account_is(int initialBalance) throws Throwable {
        this.initialBalance = initialBalance;
    }

    @When("^I (deposit|withdraw|recharge electricity) a kind of self-service using an ATM$")
    public void I_deposit_a_kind_of_self_service_using_an_ATM(String action) throws Throwable {
        LOGGER.info(">>action: " + action);
    }

    @When("^in (\\d+)$")
    public void in(int arg1) throws Throwable {
        // Express the Regexp above with the code you wish you had
        throw new PendingException();
    }

    @When("^I check the balance$")
    public void I_check_the_balance() throws Throwable {
        // Express the Regexp above with the code you wish you had
        throw new PendingException();
    }

    @Then("^the balance should be (\\d+)$")
    public void the_balance_should_be(int arg1) throws Throwable {
        // Express the Regexp above with the code you wish you had
        throw new PendingException();
    }

    @Then("^the added units in the electricity card should be (\\d+)$")
    public void the_added_units_in_the_electricity_card_should_be(int arg1) throws Throwable {
        // Express the Regexp above with the code you wish you had
        throw new PendingException();
    }
}
