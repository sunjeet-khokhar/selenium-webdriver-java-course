package base;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;

import java.util.List;

public class BaseTest {
    //private WebDriver driver;
    private  String browser = "chromedriver" ;
    //driver = new ChromeDriver();
    protected HomePage page = new HomePage();



    public void setup() {
        //System.setProperty("webdriver.chrome.driver", "resources/"+browser);
        try {
            //driver.manage().window().setSize(new Dimension(375,812));
            page.create_driver_object(browser);
            page.get_url("https://the-internet.herokuapp.com/");
            //driver.manage().window().maximize();
            /*WebElement el = driver.findElement(By.linkText("Shifting Content"));
            el.click();
            List<WebElement> l;
            l = driver.findElements(By.tagName("a"));
            System.out.println(l.size()+"\n");
            System.out.println(driver.getTitle());
            driver.quit();*/
        }

        catch (Exception e) {
            System.out.println("Error, driver failed to load");
        }
/*
        finally {
            driver.quit();
        }
*/
    }

    public static void main(String args[]) {
        BaseTest t = new BaseTest();
        t.setup();
    }

}
