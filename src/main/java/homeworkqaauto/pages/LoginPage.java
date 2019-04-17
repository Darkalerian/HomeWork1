package homeworkqaauto.pages;

import homeworkqaauto.utils.ElementsSelectors;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public static WebElement emailField() {
        element = driver.findElement(ElementsSelectors.EMAIL_LOGIN_FIELD);
        return element;
    }

    public static WebElement passwordField() {
        element = driver.findElement(ElementsSelectors.PASSWORD_LOGIN_FIELD);
        return element;
    }

    public static WebElement signInButton() {
        element = driver.findElement(ElementsSelectors.SUBMIT_LOGIN_BUTTON);
        return element;
    }


}
