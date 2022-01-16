package ru.ibs.tests.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import ru.ibs.tests.managers.InitManager;

public class Hooks {

    @Before
    public void before() {
        InitManager.initFramework();
    }

    @After
    public void after() {
        InitManager.quitFramework();
    }

}
