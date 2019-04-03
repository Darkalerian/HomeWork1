package com.homeworkqaauto.testcases;

import com.homeworkqaauto.pages.BasePage;
import com.homeworkqaauto.pages.CategoryPage;
import com.homeworkqaauto.pages.HomePage;
import com.homeworkqaauto.pages.ItemPage;
import com.homeworkqaauto.utils.Constant;
import com.homeworkqaauto.utils.ElementsSelectors;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddItemToCardTest {
    private static WebDriver driver;
    private static WebDriverWait waitButton;

    @BeforeClass
    public static void  init(){
        System.setProperty("webdriver.chrome.driver", ".\\src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        BasePage.driver = driver;
        driver.get(Constant.HOMEPAGE_URL);
        waitButton = new WebDriverWait(driver,10);

    }

    @AfterClass
    public static void out (){
        driver.close();
    }



    @Test
    public void checkCategory() throws InterruptedException {

        HomePage.linkCategory().click();
        CategoryPage.linkItem().click();
        ItemPage.linkAddToCard().click();
        waitButton.until(ExpectedConditions.visibilityOf(ItemPage.linkProceedeToCheckout()));
        ItemPage.linkProceedeToCheckout().click();
        Assert.assertEquals(driver.findElement(ElementsSelectors.CARD_TABLE_ITEMNAME_CELL).getText(), "Faded Short Sleeve T-shirts");
        Thread.sleep(2000);

    }
}
