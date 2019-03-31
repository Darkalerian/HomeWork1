package com.homeworkqaauto.testcases;

import com.homeworkqaauto.pages.BasePage;
import com.homeworkqaauto.pages.CategoryPage;
import com.homeworkqaauto.pages.HomePage;
import com.homeworkqaauto.pages.ItemPage;
import com.homeworkqaauto.utils.Constant;
import com.homeworkqaauto.utils.ElementsSelectors;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddItemToCardTest {


    @Test
    public void checkCategory() throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "C:/Users/wowa/Desktop/Java/HomeWork1/src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        BasePage.driver = driver;
        driver.get(Constant.HOMEPAGE_URL);


        HomePage.linkCategory().click();
        CategoryPage.linkItem().click();
        ItemPage.linkAddToCard().click();
        Thread.sleep(2000);
        ItemPage.linkProceedeToCheckout().click();
        Assert.assertEquals(driver.findElement(ElementsSelectors.CARD_TABLE_ITEMNAME_CELL).getText(), "Faded Short Sleeve T-shirts");
        Thread.sleep(5000);
        driver.close();
    }
}
