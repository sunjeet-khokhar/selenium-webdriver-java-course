package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;

public class BaseTest_1 {
    private WebDriver driver;
    private  String browser = "chromedriver" ;
    //driver = new ChromeDriver();


    public void setup() {
        System.setProperty("webdriver.chrome.driver", "resources/"+browser);
        try {
            driver = new ChromeDriver();

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

    public void test_login_page() {

        try {
            driver.get("https://the-internet.herokuapp.com/login");
            LoginPage page = new LoginPage(driver);
            page.EnterUserName("honky-tonk");
            page.EnterPassword("Tonky-honk");
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
        BaseTest_1 t = new BaseTest_1();
        t.setup();
        t.test_login_page();
    }

}
