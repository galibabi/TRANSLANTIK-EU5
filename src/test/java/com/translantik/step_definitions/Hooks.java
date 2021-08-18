package com.translantik.step_definitions;

import com.translantik.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import java.util.concurrent.TimeUnit;

public class Hooks {
    @Before
    public void setUp(){
        Driver.get().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Driver.get().manage().window().maximize();

    }
    @After
    public void closure() throws InterruptedException {
        Thread.sleep(3000);
        Driver.closeDriver();
    }
}
