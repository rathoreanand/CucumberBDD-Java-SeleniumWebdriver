package stepDefinitions;

import io.cucumber.java.en.Given;
import pages.methods.commonMethods;

public class given {
    @Given("User is on Angular practise home page")
    public void userIsOnAngularPractiseHomePage() {
        commonMethods.launchApp("https://rahulshettyacademy.com/angularpractice/");
    }
}
