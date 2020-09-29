package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {

    private WebDriver driver;

    public  HomePage(){
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
