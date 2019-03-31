package com.homeworkqaauto.pages;

import com.homeworkqaauto.utils.ElementsSelectors;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CardPage extends BasePage {

    public CardPage(WebDriver driver) {
        super(driver);
    }

    public static WebElement itemNameTableCell() {
        element = driver.findElement(ElementsSelectors.CARD_TABLE_ITEMNAME_CELL);
        return element;
    }

}
