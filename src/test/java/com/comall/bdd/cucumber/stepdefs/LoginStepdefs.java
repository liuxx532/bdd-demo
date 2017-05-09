package com.comall.bdd.cucumber.stepdefs;

import com.comall.bdd.domain.TestUser;
import com.comall.bdd.web.rest.TestUserResource;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by lgx on 17/5/5.
 */
public class LoginStepdefs extends StepDefs{

    private static WebDriver driver = null;

    private TestUser testUser;

    private TestUserResource testUserResource;

    private String username;

    @Given("^A  user '(.*)' with password '(.*)'$")
    public void aUserTomWithPassword(String username, String password) throws Throwable {
        testUser = new TestUser();
        testUser.setUsername(username);
        testUser.setPassword(password);
    }

    @And("^the  user  and  password  with  (.*) role$")
    public void theUserAndPasswordWithFARole(String role) throws Throwable {
        testUser.setRole(role);
    }

    @When("^I sign in with '(.*)'$")
    public void iSignInWithTom(String username) throws Throwable {
        this.username = username;

    }

    @Then("^I should see a '(.*)' button$")
    public void iShouldSeeACreateNewTargetButton(String expectedResult) throws Throwable {
        testUserResource = new TestUserResource();
        String actualResult = testUserResource.login(username);
        assertThat(actualResult, is(expectedResult));

    }

    @When("^I enter the button$")
    public void iEnterTheButton() throws Throwable {

    }

    @Then("^I should see a (.*)  with  target  edit$")
    public void iShouldSeeANewPageWithTargetEdit(String expectedResult) throws Throwable {
        String actualResult = testUserResource.enterButtons();
        assertThat(actualResult, is(expectedResult));
    }
}
