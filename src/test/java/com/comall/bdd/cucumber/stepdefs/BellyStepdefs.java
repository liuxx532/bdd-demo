package com.comall.bdd.cucumber.stepdefs;

import com.comall.bdd.domain.Belly;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by lgx on 17/5/4.
 */
public class BellyStepdefs {
    private Belly belly;
    private int waitingTime;

    @Given("^I have (\\d+) cukes in my belly$")
    public void iHaveCukesInMyBelly(int cukes) throws Throwable {
        belly = new Belly();
        belly.eat(cukes);
    }

    @When("^I wait (\\d+) hour$")
    public void iWaitHour(int waitingTime) throws Throwable {
        this.waitingTime = waitingTime;
    }

    @Then("^my belly should (.*)$")
    public void myBellyShouldGrowl(String expectedSound) throws Throwable {
        String actualSound = belly.getSound(waitingTime);
        assertThat(actualSound, is(expectedSound));
    }
}
