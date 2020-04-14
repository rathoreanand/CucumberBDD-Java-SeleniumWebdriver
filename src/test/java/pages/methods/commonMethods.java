package pages.methods;

import org.openqa.selenium.WebDriver;
import utils.base;
import java.util.concurrent.TimeUnit;

public class commonMethods {
    public static WebDriver driver;
    public final static int TIMEOUT  = 30;
    public final static int PAGE_LOAD_TIMEOUT  = 50;

    public static void launchApp(String URL) {
        driver = base.getDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
        driver.get(URL);
    }

    public static void tearDown() {
        if (driver != null) {
            driver.close();
            driver.quit();
        }
    }

}
