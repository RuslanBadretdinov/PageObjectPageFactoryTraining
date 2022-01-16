package ru.ibs.tests.pages;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.ibs.tests.managers.DriverManager;
import ru.ibs.tests.managers.PageManager;

//Класс с методами без локаторов для всех классов
public abstract class BasePage {

    protected DriverManager driverManager = DriverManager.getInstance();
    protected PageManager pageManager = PageManager.getInstance();

    protected WebDriverWait wait = new WebDriverWait(driverManager.getDriver(), 30, 2000);
    protected Actions actions = new Actions(driverManager.getDriver());

    public BasePage() {
        PageFactory.initElements(driverManager.getDriver(), this);
    }

}
