package stepDefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.locators.HomePage;
import pages.methods.commonMethods;
import utils.Base;

import java.io.IOException;

public class given extends Base {
    public static HomePage homePage;

    @Given("User is on Angular practise home page")
    public void userIsOnAngularPractiseHomePage() throws IOException {
        commonMethods.launchApp();
        homePage = new HomePage(driver);
        WebDriverWait wait = new WebDriverWait(driver, 3);
        wait.until(ExpectedConditions.visibilityOf(homePage.getName()));
        if (homePage.getName().isDisplayed()){
            System.out.println("Name text box is displayed");
        }
    }
}
