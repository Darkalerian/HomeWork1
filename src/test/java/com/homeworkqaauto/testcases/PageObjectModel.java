package com.homeworkqaauto.testcases;

import com.homeworkqaauto.actions.SignIn;
import com.homeworkqaauto.pages.BasePage;
import com.homeworkqaauto.utils.Constant;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class PageObjectModel {
    private static WebDriver driver = null;

    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:/Users/wowa/Desktop/Java/HomeWork1/src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        BasePage.driver = driver;
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(Constant.HOMEPAGE_URL);
        Thread.sleep(2000);
        //SignIn.ExecuteLogin(driver);
        SignIn.ExecuteLogin(driver, Constant.VALID_USER_NAME, Constant.VALID_PASSWORD);
        Thread.sleep(5000);
        SignIn.executelogout(driver);
        Thread.sleep(2000);
        driver.quit();
        //ExcelDataStorage.setCellData("Passed",1,3);


    }
}
