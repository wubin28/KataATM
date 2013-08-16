package com.wubinben.kata.kataatm;

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
    private static final Logger LOGGER = Logger.getLogger(AtmStepdefs.class.getName());
    private AtmFacade atmFacade = AtmFacade.newInstance();

    public AtmStepdefs() {
        // To turn on logging, set level to be Level.INFO.
        LOGGER.setLevel(Level.OFF);
    }

    @Given("^the old balance of my account is (\\d+)$")
    public void the_old_balance_of_my_account_is(int oldBalance) throws Throwable {
        this.atmFacade.setOldBalance(oldBalance);
    }

    @When("^I (deposit in RMB Yuan|withdraw in RMB Yuan|recharge electricity in unit) (\\d+) using an ATM$")
    public void I_do_self_service(String action, int amount) throws Throwable {
        LOGGER.info(">>action: " + action);
        this.atmFacade.doSelfService(action, amount);
    }

    @Then("^the new balance should be (\\d+)$")
    public void the_new_balance_should_be(int newBalance) throws Throwable {
        assertEquals("the new balance is not right.", newBalance, this.atmFacade.getBalance());
    }

    @And("^the added units in the electricity card should be (\\d+)$")
    public void the_added_units_in_the_electricity_card_should_be(int addedUnits) throws Throwable {
        assertEquals("the added units are not right.", addedUnits, this.atmFacade.getAddedUnits());
    }
}
