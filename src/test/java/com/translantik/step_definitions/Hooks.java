package com.translantik.step_definitions;

import com.translantik.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
    @Before
    public void setUp(){

    }
    @After
    public void closure() throws InterruptedException {
        Thread.sleep(3000);
        Driver.closeDriver();
    }
}
