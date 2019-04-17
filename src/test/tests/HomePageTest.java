package tests;

import homeworkqaauto.utils.Constant;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePageTest {


    @Test
    public void checkCategory() throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", ".\\src\\main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(Constant.HOMEPAGE_URL);
        Assert.assertEquals(driver.getTitle(), "My Store");
        Thread.sleep(2000);
        driver.close();
    }
}
