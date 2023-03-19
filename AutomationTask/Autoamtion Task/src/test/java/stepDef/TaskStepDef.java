package stepDef;

import Pages.SubscribeKSAEngPage;
import Utility.Util;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class TaskStepDef {
    SubscribeKSAEngPage subscribeKSAEngPage = new SubscribeKSAEngPage();
    @Given("the subscribe page opens")
    public void theSubscribePageOpens() {
        Assert.assertEquals(Util.getURL(), "https://subscribe.stctv.com/sa-en");
    }

    @When("the selected county is {string}")
    public void theSelectedCountyIs(String county) {
        Assert.assertTrue((subscribeKSAEngPage.getCountryName()).contains(county),"The wrong country is selected");
    }

    @When("the selected language is {string}")
    public void theSelectedLanguageIs(String language) {
        Assert.assertTrue(Util.getURL().contains(language));
    }

    @Then("the package type {string} is showing")
    public void thePackageTypeIsShowing(String type) {
        if (type == "LITE") {
            Assert.assertTrue((subscribeKSAEngPage.getLiteSubType()).contains(type), "the lite sub isn't showing");
            Assert.assertTrue(subscribeKSAEngPage.isLiteSubShowing());
        }
        if (type == "CLASSIC") {
            Assert.assertTrue((subscribeKSAEngPage.getClassicSubType()).contains(type), "the lite sub isn't showing");
            Assert.assertTrue(subscribeKSAEngPage.isClassicSubShowing());
        }
        if (type == "PREMIUM") {
            Assert.assertTrue((subscribeKSAEngPage.getPremiumSubType()).contains(type), "the lite sub isn't showing");
            Assert.assertTrue(subscribeKSAEngPage.isPremiumSubShowing());
        }
    }

    @And("the package {string} price {string} is correct")
    public void thePackagePriceIsCorrect(String price, String type) {
        if (type == "LITE") {
            Assert.assertEquals(price, subscribeKSAEngPage.getLiteSubPrice(), "The price is different");
        }
        if (type == "CLASSIC") {
            Assert.assertEquals(price, subscribeKSAEngPage.getClassicSubPrice(), "The price is different");
        }
        if (type == "PREMIUM") {
            Assert.assertEquals(price, subscribeKSAEngPage.getPremiumSubPrice(), "The price is different");
        }
    }
}
