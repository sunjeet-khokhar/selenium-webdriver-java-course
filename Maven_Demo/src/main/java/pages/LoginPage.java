package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;

    private By UserName = By.id("username");
    private By Password = By.id("password");
    private By LoginButton = By.cssSelector("#login > button");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void EnterUserName(String User){
        driver.findElement(UserName).sendKeys(User);
    }

    public void EnterPassword(String Pwd){
        driver.findElement(Password).sendKeys(Pwd);
    }



}
