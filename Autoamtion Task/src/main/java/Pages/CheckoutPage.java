package Pages;

import Base.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage extends DriverManager {
    public CheckoutPage() {
        PageFactory.initElements(webDriver.get(), this);
    }

    @FindBy(id = "termsofservice")
    WebElement termsOfServiceBtn;

    @FindBy(id = "checkout")
    WebElement checkoutBtn;
    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[1]")
    WebElement pageTitle;

    public void clickOnTermOfService(){
        termsOfServiceBtn.click();
    }
    public void clickOnCheckOut(){
        checkoutBtn.click();
    }
    public String getPageTitle(){
        return pageTitle.getText();
    }

}
