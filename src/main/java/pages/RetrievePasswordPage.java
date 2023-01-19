package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RetrievePasswordPage {

    private WebDriver driver;
    private By statusAlert = By.tagName("h1");

    public RetrievePasswordPage(WebDriver driver){
        this.driver = driver;
    }

    public String getAlertText(){
        return driver.findElement(statusAlert).getText();
    }
}
