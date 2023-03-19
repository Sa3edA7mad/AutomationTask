package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import Base.DriverManager;


public class SubscribeKSAEngPage extends DriverManager {

    @FindBy(id = "country-name")
    WebElement countryName;

    @FindBy(id = "name-lite")
    WebElement liteSubType;
    @FindBy(id = "currency-lite")
    WebElement liteSubAmount;
    @FindBy(xpath = "//*[@id=\"currency-lite\"]/i/text()[1]")
    WebElement currencyType;

    public String getCountryName(){
        System.out.println(countryName.getText());
       return countryName.getText();

    }
    public Boolean isLiteSubShowing(){
        return liteSubType.isDisplayed();
    }
    public String getLiteSubPrice(){
        return liteSubAmount.getText();
    }
    public String getCurrencyType(){
        return currencyType.getText();
    }

}
