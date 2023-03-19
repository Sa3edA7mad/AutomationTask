package Pages;

import Base.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PasswordRecoveryPage extends DriverManager {
    @FindBy(name = "send-email")
    WebElement sentEmailBtn;
    @FindBy(xpath = "//*[@id=\"bar-notification\"]/div/p")
    WebElement confirmationMessage;
    public PasswordRecoveryPage (){
        PageFactory.initElements(webDriver.get(), this);
    }
    public void clickSendEmailBtn(){
        sentEmailBtn.click();
    }
    public String confirmationMessage(){
        return confirmationMessage.getText();
    }
}
