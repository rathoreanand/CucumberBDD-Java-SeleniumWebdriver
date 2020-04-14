package stepDefinitions.helpers;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import pages.methods.commonMethods;

public class hooks {
    @Before
    public void before() {
        System.out.println("Before function executed!!");
    }

    @After
    public void after() {
        commonMethods.tearDown();
    }
}
