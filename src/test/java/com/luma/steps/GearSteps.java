package com.luma.steps;

import com.luma.pages.GearPage;
import com.luma.pages.HomePage;
import com.luma.pages.OvernightDufflePage;
import com.luma.pages.ShoppingCartPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class GearSteps {
    @When("^I mouse hover on gear menu$")
    public void iMouseHoverOnGearMenu() throws InterruptedException {
        new HomePage().mouseHoverOnGearMenu();
    }

    @And("^I click on bags$")
    public void iClickOnBags() throws InterruptedException {
        new HomePage().mouseHoverAndClickOnBags();
    }

    @And("^I click on product name Overnight Duffle$")
    public void iClickOnProductNameOvernightDuffle() throws InterruptedException {
        new GearPage().clickOnOvernightDuffleElement();
    }

    @And("^I change the quantity \"([^\"]*)\"$")
    public void iChangeTheQuantity(String qty) throws InterruptedException {
        new OvernightDufflePage().sendQtyToInputQuantityBox(qty);
    }

    @And("^I click on Add to cart button$")
    public void iClickOnAddToCartButton() throws InterruptedException {
        new OvernightDufflePage().clickOnOverAddToCartButton();
    }

    @And("^I verify the text of the product \"([^\"]*)\"$")
    public void iVerifyTheTextOfTheProduct(String expectedText) throws InterruptedException {
        Assert.assertEquals(expectedText, new OvernightDufflePage().getAddedToCartMessage());
    }

    @And("^I click on shopping cart link into messae$")
    public void iClickOnShoppingCartLinkIntoMessae() throws InterruptedException {
        new OvernightDufflePage().clickOnShoppingCartElement();
    }

    @And("^I verify the produt name \"([^\"]*)\"$")
    public void iVerifyTheProdutName(String expectedText) throws InterruptedException {
        Assert.assertEquals(expectedText, new ShoppingCartPage().getTextProductNameTextElement());
    }

    @And("^I verify the quantity \"([^\"]*)\"$")
    public void iVerifyTheQuantity(String expectedText) throws InterruptedException {
        Assert.assertEquals(expectedText, new ShoppingCartPage().getInputQty());
    }

    @And("^I Verify the product price \"([^\"]*)\"$")
    public void iVerifyTheProductPrice(String expectedText) throws InterruptedException {
        Assert.assertEquals(expectedText, new ShoppingCartPage().getProductPrice());
    }

    @And("^I Change quantity to \"([^\"]*)\"$")
    public void iChangeQuantityTo(String qty) throws InterruptedException {
        new ShoppingCartPage().sendQtyToUpdateInQuantityBox(qty);
    }

    @And("^I click on update shopping cart button$")
    public void iClickOnUpdateShoppingCartButton() throws InterruptedException {
        new ShoppingCartPage().clickUpdateShoppingCartButton();
    }

    @Then("^I Verify the price of the product \"([^\"]*)\"$")
    public void iVerifyThePriceOfTheProduct(String expectedText) throws InterruptedException {
        Assert.assertEquals(expectedText, new ShoppingCartPage().getUpdatedProductPrice());
    }
}
