package Pages;

import Base.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage extends DriverManager {
    @FindBy(xpath = "/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")
    WebElement registerBtn;
    @FindBy(className = "ico-login")
    WebElement loginBtn;
    @FindBy(className = "ico-logout")
    WebElement logoutBtn;
    @FindBy(id = "small-searchterms")
    WebElement searchField;
    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div/div/div[2]/h2/a")
    WebElement searchResult;
    @FindBy(id = "customerCurrency")
    WebElement currencyDropdown;
    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div[1]/div[1]/div[2]/ul/li[1]/a")
    WebElement computerCategory;
    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div[2]/div[1]/div[2]/ul/li[1]/ul/li[1]/a")
    WebElement subComputerCategory;
    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div[1]/div[2]/div[2]/ul/li[1]/a")
    WebElement appleManufacturer;
    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div[2]/div/div[1]/h1")
    WebElement appleTitle;
    @FindBy(id = "add-to-cart-button-35")
    WebElement addToCartBtn;
    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div/div/div[2]/h2/a")
    WebElement BuildYourOwnComputerProduct;
    @FindBy(css = "button[class='button-2 add-to-wishlist-button']")
    WebElement addToWishListBtn;
    @FindBy(css = "button[class='button-2 add-to-compare-list-button']")
    WebElement addToCompareList;

    public HomePage() {
        PageFactory.initElements(webDriver.get(), this);
    }

    public void clickRegisterBtn() {
        registerBtn.click();
    }

    public void clickLoginButton() {
        loginBtn.click();
    }

    public String getLogoutBtnText() {
        return logoutBtn.getText();
    }

    public void searchForItem() {
        searchField.sendKeys("Build your own computer" + "\n");
    }
    public void searchForItemIfYouWait() {
        searchField.sendKeys("If You Wait (donation)" + "\n");
    }

    public String getSearchResult() {
        return searchResult.getText();
    }

    public void selectUSDollar() {
        Select dropCurrency = new Select(currencyDropdown);
        dropCurrency.selectByVisibleText("US Dollar");
    }

    public void selectEuro() {
        Select dropCurrency = new Select(currencyDropdown);
        dropCurrency.selectByVisibleText("Euro");
    }

    public void clickCategory() {
        computerCategory.click();
    }

    public void clickSubCategory() {
        subComputerCategory.click();
    }
    public void selectManufacturer(){
        appleManufacturer.click();
    }
    public String getAppleTitle(){
        return appleTitle.getText();
    }
    public void clickAddToCart(){
        addToCartBtn.click();
    }
    public void clickOnProduct(){
        BuildYourOwnComputerProduct.click();
    }
    public void clickAddToWishListBtn(){
        addToWishListBtn.click();
    }
    public void clickOnAddToCompare(){
        addToCompareList.click();
    }
    public void moveToCart(){
        webDriver.get().navigate().to("https://demo.nopcommerce.com/cart");
    }
}
