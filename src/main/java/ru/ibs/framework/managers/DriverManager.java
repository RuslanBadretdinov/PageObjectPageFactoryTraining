package ru.ibs.framework.managers;

import org.apache.commons.exec.OS;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.ibs.framework.utils.PropertyConstants;

import java.util.concurrent.TimeUnit;

/**
 * Инициализация драйвера
 */
public class DriverManager {

    private static DriverManager INSTANCE = null;
    private TestPropertiesManager testPropertiesManager = TestPropertiesManager.getInstance();

    private WebDriver driver;

    private DriverManager() {

    }

    public static DriverManager getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new DriverManager();
        }
        return INSTANCE;
    }

    public WebDriver getDriver() {
        if (driver == null) {
            initDriver();
        }
        return driver;
    }

    private void initDriver() {

        //Пример запуска через любой браузер
//        if (testPropertiesManager.getProperty("chrome"/*можно было через PropertiesConstants*/).equals("chrome")) {
//            System.setProperty("webdriver.chrome.driver", testPropertiesManager.getProperty(PropertyConstants.PATH_CHROME_DRIVER_WINDOWS));
//            driver = new ChromeDriver();
//        } else if {
//
//        }

        //Для Windows
        System.setProperty("webdriver.chrome.driver", testPropertiesManager.getProperty(PropertyConstants.PATH_CHROME_DRIVER_WINDOWS));
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    public void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
