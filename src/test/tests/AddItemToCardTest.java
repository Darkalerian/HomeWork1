package tests;

import homeworkqaauto.pages.CategoryPage;
import homeworkqaauto.pages.HomePage;
import homeworkqaauto.pages.ItemPage;
import homeworkqaauto.utils.Constant;
import homeworkqaauto.utils.DriversList;
import homeworkqaauto.utils.DriversCreator;
import homeworkqaauto.utils.ElementsSelectors;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddItemToCardTest {
    private static WebDriver driver;
    private static WebDriverWait waitButton;

    @BeforeClass
    public static void  init(){
        driver = DriversCreator.getBrowserInstance(DriversList.CHROME,Constant.HOMEPAGE_URL);
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