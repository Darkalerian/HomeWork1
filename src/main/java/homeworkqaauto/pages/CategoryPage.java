package homeworkqaauto.pages;

import homeworkqaauto.utils.ElementsSelectors;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CategoryPage extends BasePage {

    public CategoryPage(WebDriver driver) {
        super(driver);
    }

    public static WebElement linkItem() {
        element = driver.findElement(ElementsSelectors.CATEGORY_ITEM_LINK);
        return element;
    }

}
