package ru.ibs.tests.base;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import ru.ibs.tests.managers.DriverManager;
import ru.ibs.tests.managers.InitManager;
import ru.ibs.tests.managers.PageManager;
import ru.ibs.tests.managers.TestPropertiesManager;
import ru.ibs.tests.utils.PropertyConstants;

public class BaseTests {

    protected DriverManager driverManager = DriverManager.getInstance();
    protected PageManager pageManager = PageManager.getInstance();
    protected TestPropertiesManager testPropertiesManager = TestPropertiesManager.getInstance();

    @BeforeAll
    public static void beforeAll() {
        InitManager.initFramework();
    }

    @BeforeEach
    public void before() {
        //driverManager.getDriver().get(testPropertiesManager.getProperty(PropertyConstants.BASE_URL));
    }


    @AfterAll
    public static void afterAll() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        InitManager.quitFramework();
    }

}
