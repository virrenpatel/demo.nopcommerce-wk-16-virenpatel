package com.nopcommerce.demo.cucumber.steps;

import com.nopcommerce.demo.pages.Computer;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TopMenuTab {

    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
        new Computer().clickOnDesktop();
    }

    @When("^I click on computer tab$")
    public void iClickOnComputerTab() {
        new Computer().clickOnComputer();
    }

    @Then("^I should navigate to Computer Page successfully$")
    public void iShouldNavigateToComputerPageSuccessfully() {
    }


    @When("^I click on desktop tab$")
    public void iClickOnDesktopTab() {
        new Computer().clickOnDesktop();
    }

    @Then("^I should navigate to desktop Page successfully$")
    public void iShouldNavigateToDesktopPageSuccessfully() {
    }
}
