package ru.ibs.tests.steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.DataTableType;
import io.cucumber.java.ru.И;
import ru.ibs.tests.managers.PageManager;

public class StartPageStep {
    PageManager pageManager = PageManager.getInstance();

    @И("Закрытие cookies")
    public void closeCookies() {
        pageManager.getStartPage().closeCookies();
    }

    @И("^BaseMenu '(.+)'$")
    public void selectBaseMenuText(String nameMenu) {
        pageManager.getStartPage().selectBaseMenuText(nameMenu);
    }

//    @И("BaseMenu Cookies {string} {string}")
//    public void selectBaseMenuText(String nameMenu, String string2) {
//        pageManager.getStartPage().selectBaseMenuText(nameMenu);
//    }

//    //Регулярные выражения
//    @И("^BaseMenu Cookies (\\d+) рублей $")
//    public void selectBaseMenuText(int arg1) {
//        pageManager.getStartPage().selectBaseMenuText(nameMenu);
//    }

    @И("^SubMenu '(.+)'$")
    public void selectSubMenuByText(String nameSubMenu) {
        pageManager.getStartPage().selectSubMenuByText(nameSubMenu);
    }

    @И("пользователь снимает со счёта {int} рублей")
    public void пользователь_снимает_со_счета_рублей(Integer int1) {

    }

    @И("^Заполняем поля формы:^")
    public void fillFields(DataTable dataTable) {

    }
}
