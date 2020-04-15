package pages.methods;

import utils.Base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class commonMethods extends Base{
    public static Properties prop;
    public final static int TIMEOUT  = 30;
    public final static int PAGE_LOAD_TIMEOUT  = 50;

    public static void launchApp() throws IOException {
        FileInputStream fis = new FileInputStream("src/test/java/utils/global.properties");
        prop = new Properties();
        prop.load(fis);
        getDriver(prop.getProperty("browserName"));
        setupBrowser();
        driver.get(prop.getProperty("QA"));
    }

    public static void setupBrowser(){
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
    }

    public static void tearDown() {
        if (driver != null) {
            driver.close();
            driver.quit();
        }
    }

}
