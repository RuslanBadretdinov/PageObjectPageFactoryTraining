package ru.ibs.tests.pages;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InsuranceTravelsPage extends BasePage{

    @FindBy(xpath = "//div[contains(@class, 'page-teaser-dict__row')]//h1")
    protected WebElement title;

    @FindBy(xpath = "//span[text() = 'Оформить онлайн']/../../a[@data-test-id]")
    protected WebElement buttonCheckOutOnline;

    //@Step
    @DisplayName("Нажатие на открытие страницы")
    public InsuranceTravelsPage checkOpenPage(String s1) {
        Assertions.assertEquals(title.getText() ,
                s1, "Заголовок отсутствует, не соответствует требуемому");
        return pageManager.getInsuranceTravelsPage();
    }

    //@Step
    @DisplayName("В JUnit5  это название не из алюр отчёта, а что-то другое")
    public Object checkOutOnline() {
        buttonCheckOutOnline.click();
        System.out.println("Следующая страница");
        return new Object();
    }
}
