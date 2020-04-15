package stepDefinitions;

import io.cucumber.java.en.When;
import pages.locators.HomePage;
import utils.Base;

public class when extends Base {
    public static HomePage homePage;

    @When("User enters his {string}, {string}, {string}, {string} and {string}")
    public void userEntersHisAnd(String arg0, String arg1, String arg2, String arg3, String arg4) {
        homePage = new HomePage(driver);
        homePage.getName().sendKeys(arg0);
    }
}
