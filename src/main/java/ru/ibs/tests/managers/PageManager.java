package ru.ibs.tests.managers;

import ru.ibs.tests.pages.InsuranceTravelsPage;
import ru.ibs.tests.pages.StartPage;

public class PageManager {

    private StartPage startPage;
    private InsuranceTravelsPage insuranceTravelsPage;

    private static PageManager INSTANCE = null;

    private PageManager() {

    }

    public static PageManager getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new PageManager();
        }
        return INSTANCE;
    }

    public StartPage getStartPage() {
        if (startPage == null) {
            startPage = new StartPage();
        }
        return startPage;
    }

    public InsuranceTravelsPage getInsuranceTravelsPage() {
        if (insuranceTravelsPage == null) {
            insuranceTravelsPage = new InsuranceTravelsPage();
        }
        return insuranceTravelsPage;
    }

}
