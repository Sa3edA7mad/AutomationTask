package Pages;

import Base.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends DriverManager {
    public LoginPage() {
        PageFactory.initElements(webDriver.get(), this);
    }
    @FindBy(id = "Email")
    WebElement emailField;
    @FindBy(id = "Password")
    WebElement passwordField;
    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")
    WebElement loginBtn;
    @FindBy(className = "forgot-password")
    WebElement forgotPasswordBtn;

    public void clickLoginBtn(){
        loginBtn.click();
    }
    public void clickForgotPasswordBtn(){
        forgotPasswordBtn.click();
    }
}
