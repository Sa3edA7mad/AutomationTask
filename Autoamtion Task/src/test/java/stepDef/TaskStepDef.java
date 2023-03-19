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
    public void thePackageTypeIsShowing(String arg0, String arg1) {
    }

    @Then("the package price {string} is correct")
    public void thePackagePriceIsCorrect(String arg0, String arg1) {
    }

    @Then("the currency {string} is correct")
    public void theCurrencyIsCorrect(String arg0, String arg1) {
    }



}
