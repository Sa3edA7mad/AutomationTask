package stepDef;

import Pages.*;
import Utility.Util;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.checkerframework.checker.units.qual.C;
import org.testng.Assert;

public class FWDStepdefs {
    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();
    LoginPage loginPage = new LoginPage();
    PasswordRecoveryPage passwordRecoveryPage = new PasswordRecoveryPage();
    CheckoutPage checkoutPage = new CheckoutPage();

    @Given("web site opens")
    public void webSiteOpens() {
        Assert.assertEquals(Util.getURL(), "https://demo.nopcommerce.com/");
    }

    @When("user click on register button")
    public void userClickOnRegisterButton() {
        homePage.clickRegisterBtn();
    }

    @When("user enters data and click on register")
    public void userEntersDataAndClickOnRegister() {

        registerPage.enterFirstName();
        registerPage.enterLastName();
        registerPage.enterEmail();
        registerPage.enterPassword();
        registerPage.enterConfirmPassword();
        registerPage.clickRegisterBtn();
    }

    @Then("confirmation message is shown")
    public void confirmationMessageIsShown() {
        Assert.assertEquals(registerPage.getRegistrationConfirmation(), "Your registration completed", "The registration failed");
    }

    @When("user click on login button")
    public void userClickOnLoginButton() {
        homePage.clickLoginButton();
    }

    @When("user enters data and click on login")
    public void userEntersDataAndClickOnLogin() {
        registerPage.enterEmail();
        registerPage.enterPassword();
        loginPage.clickLoginBtn();
    }

    @Then("user logged in")
    public void userLoggedIn() {
        Assert.assertEquals(homePage.getLogoutBtnText(), "Log out", "Login failed");
    }

    @When("user clicks on forgot password")
    public void userClicksOnForgotPassword() {
        loginPage.clickForgotPasswordBtn();
    }

    @When("user enter email")
    public void userEnterEmail() {
        registerPage.enterEmail();
        passwordRecoveryPage.clickSendEmailBtn();
    }

    @Then("recovery confirmation message is shown")
    public void recoveryConfirmationMessageIsShown() {
        Assert.assertEquals(passwordRecoveryPage.confirmationMessage(), "Email with instructions has been sent to you.");
    }

    @When("user enter \\(Build your own computer) in search")
    public void userEnterBuildYourOwnComputerInSearch() {
        homePage.searchForItem();
    }

    @Then("related search result are shown")
    public void relatedSearchResultAreShown() {
        Assert.assertEquals(homePage.getSearchResult(), "Build your own computer");
    }

    @When("user select euro")
    public void userSelectEuro() {
        homePage.selectEuro();
    }

    @When("user select us")
    public void userSelectUs() {
        homePage.selectUSDollar();
    }

    @Then("currency is changed")
    public void currencyIsChanged() {
    }

    @Then("user can select different categories")
    public void userCanSelectDifferentCategories() {
        homePage.clickCategory();
        homePage.clickSubCategory();
    }

    @Then("user filter using manufacturers")
    public void userFilterUsingManufacturers() {
        homePage.selectManufacturer();
    }

    @Then("validate filer is applied correctly")
    public void validateFilerIsAppliedCorrectly() {
        Assert.assertEquals(homePage.getAppleTitle(), "Apple");
    }

    @Then("click add to cart")
    public void clickAddToCart() {
        homePage.clickAddToCart();
    }

    @When("clicking on item")
    public void clickingOnItem() {
        homePage.clickOnProduct();
    }

    @When("user enter \\(If You Wait) in search")
    public void userEnterIfYouWaitInSearch() {
        homePage.searchForItemIfYouWait();
    }

    @Then("click on add to wishlist")
    public void clickOnAddToWishlist() {
        homePage.clickAddToWishListBtn();
    }

    @Then("click on add to compare list")
    public void clickOnAddToCompareList() {
        homePage.clickOnAddToCompare();
    }

    @When("navigate to cart")
    public void navigateToCart() {
        homePage.moveToCart();
    }

    @When("user agree to the terms and click on continue")
    public void userAgreeToTheTermsAndClickOnContinue() {
        checkoutPage.clickOnTermOfService();
        checkoutPage.clickOnCheckOut();
    }

    @Then("user moved to check out screen")
    public void userMovedToCheckOutScreen() {
        Assert.assertEquals(checkoutPage.getPageTitle(), "Checkout");
    }
}
