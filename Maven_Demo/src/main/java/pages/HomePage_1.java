package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage_1 {

    private WebDriver driver;

    public HomePage_1(){
        //this.driver = driver;

    }

    public void create_driver_object(String browser){
        System.setProperty("webdriver.chrome.driver", "resources/"+browser);
        driver = new ChromeDriver();
        //return driver;
    }

    public void get_url(String url){
        driver.get(url);
    }

}
