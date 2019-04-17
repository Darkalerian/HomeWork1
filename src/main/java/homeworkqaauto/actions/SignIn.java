package homeworkqaauto.actions;

import homeworkqaauto.pages.HomePage;
import homeworkqaauto.pages.LoginPage;
//import homeworkqaauto.utils.ExcelDataStorage;
import org.openqa.selenium.WebDriver;

public class SignIn {
    public static void ExecuteLogin
            (WebDriver driver, String userName, String password) throws Exception {
//        ExcelDataStorage.SetExcelFile(Constant.PATH_TEST_DATA, Constant.FILENAME_TEST_DATA);
//        String userName = ExcelDataStorage.getCellData(1,1);
//        String password = ExcelDataStorage.getCellData(1,2);

        HomePage.linkLogin().click();
        LoginPage.emailField().sendKeys(userName);
        LoginPage.passwordField().sendKeys(password);
        System.out.println("Login success");
        LoginPage.signInButton().click();
    }

    public static void executelogout(WebDriver driver) {
        System.out.println("Logout success");
        LoginPage.linkLogout().click();

    }

}
