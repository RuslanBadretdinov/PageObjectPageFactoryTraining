package ru.ibs.framework.pages;

import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class StartPage extends BasePage{

    @FindBy(xpath = "//button[contains(@class, 'cookie') and text() = 'Закрыть']")
        private WebElement cookiesBtnClose;

    @FindBy(xpath = "//a[@role = 'button' and contains(@class, 'kitt-top-menu')]")
    private List<WebElement> listBaseMenu;

    @FindBy(xpath = "//a[contains(@class, 'menu__link_second')]")
    private List<WebElement> listSubMenu;

    @Step("Закрытие cookies")
    public StartPage closeCookies() {
        cookiesBtnClose.click();
        return pageManager.getStartPage();
    }

    @Step("Выбор базового меню '{nameMenu}'")
    public StartPage selectBaseMenuText(String nameMenu) {
        for (WebElement item : listBaseMenu) {
            if(item.getText().contains(nameMenu)) {
                item.click();
                return pageManager.getStartPage();
            }
        }
        Assertions.fail("Меню с текстом \""+nameMenu+"\" не найдено");
        return pageManager.getStartPage();
    }

    @Step
    public InsuranceTravelsPage selectSubMenuByText(String nameSubMenu) {
        for (WebElement item : listSubMenu) {
            if(item.getText().contains(nameSubMenu)) {
                item.click();
                return pageManager.getInsuranceTravelsPage();
            }
        }
        Assertions.fail("Подменю с текстом \""+nameSubMenu+"\" не найдено");
        return pageManager.getInsuranceTravelsPage();
    }

}
