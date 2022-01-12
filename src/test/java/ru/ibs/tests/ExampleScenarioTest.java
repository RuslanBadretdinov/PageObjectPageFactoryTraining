package ru.ibs.tests;

import org.junit.jupiter.api.Test;
import ru.ibs.framework.pages.InsuranceTravelsPage;
import ru.ibs.framework.pages.StartPage;
import ru.ibs.tests.base.BaseTests;

public class ExampleScenarioTest extends BaseTests {

    StartPage startPage = new StartPage();
    InsuranceTravelsPage insuranceTravelsPage = new InsuranceTravelsPage();

    @Test
    public void exampleScenario() {

//        startPage.closeCookies();
//        startPage.selectBaseMenuText("Страхование");
//        startPage.selectSubMenuByText("Путешествия");

        //insuranceTravelsPage.checkOpenPage();
        //insuranceTravelsPage.checkOutOnline();

        pageManager.getStartPage()
                .closeCookies()
                .selectBaseMenuText("Страхование")
                .selectSubMenuByText("Путешествия")
                .checkOpenPage()
                .checkOutOnline();
    }
}
