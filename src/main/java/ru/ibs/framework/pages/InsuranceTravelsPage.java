package ru.ibs.framework.pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InsuranceTravelsPage extends BasePage{

    @FindBy(xpath = "//h1[@data-test-id]")
    protected WebElement title;

    @FindBy(xpath = "//span[text() = 'Оформить онлайн']/../../a[@data-test-id]")
    protected WebElement buttonCheckOutOnline;

    public InsuranceTravelsPage checkOpenPage() {
        Assertions.assertEquals("Заголовок отсутствует, не соответствует требуемому",
                "Купить туристическую страховку для выезда за границу  — СберБанк", (driverManager.getDriver().getTitle()));
        return pageManager.getInsuranceTravelsPage();
    }

    public Object checkOutOnline() {
        buttonCheckOutOnline.click();
        System.out.println("Следующая страница");
        return new Object();
    }
}
