package com.luma.steps;

import com.luma.pages.HomePage;
import com.luma.pages.WomenPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class WomenSteps {
    @Given("^I am on home page$")
    public void iAmOnHomePage() {
    }

    @When("^I mouse Hover on Women Menu$")
    public void iMouseHoverOnWomenMenu() throws InterruptedException {
        new HomePage().mouseHoverOnWomenMenu();
    }

    @And("^I mouse Hover on Tops$")
    public void iMouseHoverOnTops() throws InterruptedException {
        new HomePage().mouseHoverOnTops();
    }

    @And("^I click on Jackets$")
    public void iClickOnJackets() throws InterruptedException {
        new HomePage().mouseHoverAndClickOnJackets();
    }

    @Then("^I verify the products name display in alphabetical order$")
    public void iVerifyTheProductsNameDisplayInAlphabeticalOrder() throws InterruptedException {
        Assert.assertEquals(new WomenPage().productListAfterSorting(), new WomenPage().productListBeforeSorting());
    }

    @Then("^I verify the products price display in low to high$")
    public void iVerifyTheProductsPriceDisplayInLowToHigh() throws InterruptedException {
        Assert.assertEquals(new WomenPage().priceListAfterSorting(), new WomenPage().priceListBeforeSorting());
    }
}
