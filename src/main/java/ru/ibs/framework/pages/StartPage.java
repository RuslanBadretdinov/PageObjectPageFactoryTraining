package ru.ibs.framework.pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class StartPage extends BasePage{

    @FindBy(xpath = "//button[contains(@class, 'cookie') and text() = 'Закрыть']")
        private WebElement cookiesBtnClose;

    @FindBy(xpath = "//a[@role = 'button' and contains(@class, 'kitt-top-menu')]")
    private List<WebElement> listBaseMenu;

    @FindBy(xpath = "//a[contains(@class, 'menu__link_second')]")
    private List<WebElement> listSubMenu;

    public StartPage closeCookies() {
        cookiesBtnClose.click();
        return pageManager.getStartPage();
    }

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
