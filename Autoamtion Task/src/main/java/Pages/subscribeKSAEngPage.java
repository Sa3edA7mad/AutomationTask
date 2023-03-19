package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class subscribeKSAEngPage {
    @FindBy(id = "country-name")
    WebElement countryName;
    @FindBy(id = "name-lite")
    WebElement liteSubType;
    @FindBy(id = "currency-lite")
    WebElement liteSubAmount;
    @FindBy(xpath = "//*[@id=\"currency-lite\"]/i/text()[1]")
    WebElement currencyType;

    String getCountryName(){
       return countryName.getText();
    }
    Boolean isLiteSubShowing(){
        return liteSubType.isDisplayed();
    }
    String getLiteSubPrice(){
        return liteSubAmount.getText();
    }
    String getCurrencyType(){
        return currencyType.getText();
    }

}
