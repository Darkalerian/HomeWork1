package homeworkqaauto.pages;

import homeworkqaauto.utils.ElementsSelectors;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ItemPage extends BasePage {

    public ItemPage(WebDriver driver) {
        super(driver);
    }


    public static WebElement linkAddToCard() {
        element = driver.findElement(ElementsSelectors.ADD_TO_CARD_BUTTON);
        return element;
    }

    public static WebElement linkProceedeToCheckout() {
        element = driver.findElement(ElementsSelectors.PROCEED_TO_CHECKOUT_BUTTON);
        return element;
    }

}
