package ru.ibs.tests.steps;

import io.cucumber.java.ru.И;
import ru.ibs.tests.managers.PageManager;

public class InsuranceTravelsPageStep {
    PageManager pageManager = PageManager.getInstance();

    @И("^Проверка страницы '(.+)'$")
    public void checkOpenPage(String s1) {
        pageManager.getInsuranceTravelsPage().checkOpenPage(s1);
    }

    @И("^SubMenu '(.+)'$")
    public void selectSubMenuByText(String nameSubMenu) {
        pageManager.getStartPage().selectSubMenuByText(nameSubMenu);
    }

    @И("Следующая страница")
    public void checkOutOnline() {
        pageManager.getInsuranceTravelsPage().checkOutOnline();
    }
}
