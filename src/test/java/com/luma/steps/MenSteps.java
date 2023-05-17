package com.luma.steps;

import com.luma.pages.HomePage;
import com.luma.pages.MenPage;
import com.luma.pages.ShoppingCartPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class MenSteps {
    @When("^I Mouse Hover on Men Menu$")
    public void iMouseHoverOnMenMenu() throws InterruptedException {
        new HomePage().mouseHoverOnMenMenu();
    }

    @And("^I Mouse Hover on Bottoms$")
    public void iMouseHoverOnBottoms() throws InterruptedException {
        new HomePage().mouseHoverOnBottoms();
    }

    @And("^I click on Pants$")
    public void iClickOnPants() throws InterruptedException {
        new HomePage().mouseHoverAndClickOnPants();
    }

    @And("^I mouse hover on product name Cronus Yoga Pant and click on size$")
    public void iMouseHoverOnProductNameCronusYogaPantAndClickOnSize() throws InterruptedException {
        new MenPage().mouseHoverOnCoronusYogaPantsAndClickOn32();
    }

    @And("^I mouse Hover on product name Cronus Yoga Pant and click on colour Black$")
    public void iMouseHoverOnProductNameCronusYogaPantAndClickOnColourBlack() throws InterruptedException {
        new MenPage().mouseHoverOnCoronusYogaPantsAndClickOnBlack();
    }

    @And("^I Mouse Hover on product name Cronus Yoga Pant and click on Add to cart button$")
    public void iMouseHoverOnProductNameCronusYogaPantAndClickOnAddToCartButton() throws InterruptedException {
        new MenPage().mouseHoverOnCoronusYogaPantsAndClickOnAddToCart();
    }

    @And("^I verify the text \"([^\"]*)\"$")
    public void iVerifyTheText(String expectedText) {
        Assert.assertEquals(expectedText, new MenPage().getAddedToCartMessage(), "The added to cart message is not displayed");
    }

    @And("^I click on Shopping cart link into message$")
    public void iClickOnShoppingCartLinkIntoMessage() {
        new MenPage().clickOnShoppingCartElement();
    }

    @And("^I verify the product name \"([^\"]*)\"$")
    public void iVerifyTheProductName(String expectedText) {
        Assert.assertEquals(expectedText, new ShoppingCartPage().getCoronusYogaPantText(), "Cronus Yoga Pant text element is not displayed");
    }

    @And("^I Verify the product size \"([^\"]*)\"$")
    public void iVerifyTheProductSize(String expectedText) {
        Assert.assertEquals(expectedText, new ShoppingCartPage().getSize32Text(), "'32' text element is not displayed");
    }


    @Then("^I verify the product colour \"([^\"]*)\"$")
    public void iVerifyTheProductColour(String expectedText) {
        Assert.assertEquals(expectedText, new ShoppingCartPage().getColourBlackText(), "'Black' text element is not displayed" );
    }

    @And("^I verify the text of \"([^\"]*)\"$")
    public void iVerifyTheTextOf(String expectedText) {
        Assert.assertEquals(expectedText, new ShoppingCartPage().getShoppingCartText(), "Shopping cart text element is not displayed");
    }


}
