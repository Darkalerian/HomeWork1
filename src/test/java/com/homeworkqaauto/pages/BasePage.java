package com.homeworkqaauto.pages;

import com.homeworkqaauto.utils.ElementsSelectors;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public abstract class BasePage {
    public static WebDriver driver;
    public static boolean bResult;
    public static WebElement element;

    public BasePage(WebDriver driver) {
        BasePage.driver = driver;
        BasePage.bResult = true;
        BasePage.element = null;
    }

    public static WebElement linkLogin() {
        element = driver.findElement(ElementsSelectors.LOGIN_BUTTON_LINK);
        return element;
    }

    public static WebElement linkCategory() {
        element = driver.findElement(ElementsSelectors.CATEGORY_MENU_ITEM_LINK);
        return element;
    }

    public static WebElement linkLogout() {
        element = driver.findElement(ElementsSelectors.LOGOUT_BUTTON_LINK);
        return element;
    }

}
