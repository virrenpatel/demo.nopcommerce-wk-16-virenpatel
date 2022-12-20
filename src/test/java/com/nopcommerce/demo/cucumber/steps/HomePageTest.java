package com.nopcommerce.demo.cucumber.steps;

import com.nopcommerce.demo.pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class HomePageTest {

    @When("^I click on Computer Tab$")
    public void iClickOnComputerTab() {
        new HomePage().clickOnMenuTab("Computers");
    }

    @Then("^I Verify Computer text$")
    public void iVerifyComputerText() {
        Assert.assertEquals("Computers page not displayed", "Computers",
                new HomePage().getPageTitleText());
    }

    @And("^I Click on Desktops link$")
    public void iClickOnDesktopsLink() {
        new HomePage().clickOnSubMenu("Desktops");
    }

    @And("^I verify Desktops text$")
    public void iVerifyDesktopsText() {
        Assert.assertEquals("Desktops page not displayed", "Desktops",
                new HomePage().getPageTitleText());
    }
}
