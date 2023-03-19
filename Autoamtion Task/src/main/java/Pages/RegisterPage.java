package Pages;

import Base.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage extends DriverManager {

    @FindBy(id = "FirstName")
    WebElement firstNameField;
    @FindBy(id = "LastName")
    WebElement lastNameField;
    @FindBy(id = "Email")
    WebElement emailField;
    @FindBy(id = "Password")
    WebElement passwordField;
    @FindBy(id = "ConfirmPassword")
    WebElement confirmPasswordField;
    @FindBy(id = "register-button")
    WebElement registerBtn;
    @FindBy(className = "result")
    WebElement registrationConfirmationMessage;

    public RegisterPage() {
        PageFactory.initElements(webDriver.get(), this);
    }
    public void enterFirstName(){
        firstNameField.sendKeys("test");
    }
    public void enterLastName(){
        lastNameField.sendKeys("test");
    }
    public void enterEmail(){
        emailField.sendKeys("fymiqija@finews.biz");
    }
    public void enterPassword(){
        passwordField.sendKeys("P@ssw0rd");
    }
    public void enterConfirmPassword(){
        confirmPasswordField.sendKeys("P@ssw0rd");
    }
    public void clickRegisterBtn(){
        registerBtn.click();
    }
    public String getRegistrationConfirmation(){
        return registrationConfirmationMessage.getText();
    }
}
