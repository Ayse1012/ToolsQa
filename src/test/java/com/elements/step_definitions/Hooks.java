package com.elements.step_definitions;

import io.cucumber.java.Before;
import com.elements.utilities.Driver;
import org.junit.After;
import org.junit.AfterClass;

import java.util.concurrent.TimeUnit;

public class Hooks {

    @Before
    public void setUp(){
        Driver.get().manage().window().maximize();
        Driver.get().manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

    }

    @After
    public void tearDown()  {

    }



}
