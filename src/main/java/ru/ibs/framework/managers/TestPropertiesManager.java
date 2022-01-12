package ru.ibs.framework.managers;

import org.openqa.selenium.WebDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestPropertiesManager {

    private final Properties properties = new Properties();

    private static TestPropertiesManager INSTANCE = null;

    private TestPropertiesManager testPropertiesManager;

    private TestPropertiesManager() {
        loadApplicationProperties();
        loadCustomProperties();
    }

    public static TestPropertiesManager getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new TestPropertiesManager();
        }
        return INSTANCE;
    }

    public TestPropertiesManager getTestPropertiesManager() {
        if (testPropertiesManager == null) {
            testPropertiesManager = new TestPropertiesManager();
        }
        return testPropertiesManager;
    }

    private void loadApplicationProperties() {
        String nameFile = System.getProperty("propFile", "application"); //propFile - для maven
        try {
            properties.load(new FileInputStream("src/main/resources/" + nameFile + ".properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //Если системные переменные совпадут с переменной из properties, то в properties объекта (уже считанного)
    //будет переопределение переменной на значение из System.getProperties
    //Как я понял, через мавен можно инициализировать (делать) переменную в System.
    private void loadCustomProperties() {
        properties.forEach((key, value) -> System.getProperties() //системные переменные
                .forEach((customUserKey, customUserValue) -> {
                    if (key.toString().equals(customUserKey.toString()) &&
                        !value.toString().equals(customUserValue.toString())) {
                        properties.setProperty(key.toString(), customUserValue.toString());
                    }
                }));
    }

    public String getProperty(String key, String defaultValue) {
        return properties.getProperty(key, defaultValue);
    }

    public String getProperty(String key) {
        return properties.getProperty(key);
    }
}
