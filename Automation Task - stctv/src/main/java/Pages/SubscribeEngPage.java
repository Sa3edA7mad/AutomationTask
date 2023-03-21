package Pages;

import Base.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SubscribeEngPage extends DriverManager {

    @FindBy(id = "country-name")
    WebElement countryName;
    @FindBy(id = "name-lite")
    WebElement liteSubType;
    @FindBy(id = "currency-lite")
    WebElement liteSubAmount;
    //    @FindBy(xpath = "//*[@id=\"currency-lite\"]/i/text()[1]")
//    WebElement currencyType;
    @FindBy(id = "name-classic")
    WebElement classicSubType;
    @FindBy(id = "currency-classic")
    WebElement classicSubAmount;
    @FindBy(id = "name-premium")
    WebElement premiumSubType;
    @FindBy(id = "currency-premium")
    WebElement premiumSubAmount;
    @FindBy(id = "country-btn")
    WebElement countryBtn;
    @FindBy(xpath = "//*[@id=\"kw\"]")
    WebElement KuwaitBtn;
    @FindBy(xpath = "//*[@id=\"bh\"]")
    WebElement BahrainBtn;


    public SubscribeEngPage() {
        PageFactory.initElements(webDriver.get(), this);
    }

    public String getCountryName() {
        System.out.println(countryName.getText());
        return countryName.getText();
    }

    public Boolean isLiteSubShowing() {
        return liteSubType.isDisplayed();
    }

    public String getLiteSubType() {
        System.out.println(liteSubType.getText());
        return liteSubType.getText();
    }

    public String getLiteSubPrice() {
        return liteSubAmount.getText();
    }

    //    public String getCurrencyType(){
//        return currencyType.getText();
//    }
    public Boolean isClassicSubShowing() {
        return classicSubType.isDisplayed();
    }

    public String getClassicSubType() {
        System.out.println(classicSubType.getText());
        return liteSubType.getText();
    }
    public String getClassicSubPrice() {
        return classicSubAmount.getText();
    }
    public String getPremiumSubType() {
        System.out.println(premiumSubType.getText());
        return premiumSubType.getText();
    }
    public String getPremiumSubPrice() {
        return premiumSubAmount.getText();
    }
    public Boolean isPremiumSubShowing() {
        return premiumSubType.isDisplayed();
    }
    public void clickOnCountriesArrow(){
        countryBtn.click();
    }
    public void selectKuwait(){
        KuwaitBtn.click();
    }
    public void selectBahrin(){
        BahrainBtn.click();
    }

}
