package ru.ibs.tests.managers;

import ru.ibs.tests.utils.PropertyConstants;

import java.util.concurrent.TimeUnit;

/**
 * Настройка драйвера
 */
public class InitManager {

    private static final TestPropertiesManager props = TestPropertiesManager.getInstance();
    private static final DriverManager driverManager = DriverManager.getInstance();

    public static void initFramework() {
        driverManager.getDriver().manage().window().maximize();
        driverManager.getDriver().manage().timeouts()
                .pageLoadTimeout(Integer.parseInt(props.getProperty(PropertyConstants.PAGE_LOAD_TIMEOUT)), TimeUnit.SECONDS);
        driverManager.getDriver().manage().timeouts()
                .implicitlyWait(Integer.parseInt(props.getProperty(PropertyConstants.IMPLICITLY_WAIT)), TimeUnit.SECONDS);
        driverManager.getDriver().get(props.getProperty(PropertyConstants.BASE_URL));
    }

    public static void quitFramework() {
        driverManager.quitDriver();
    }

}
