package com.zerobank.stepdefinitions;

import com.zerobank.utilities.Driver;
import io.cucumber.core.api.Scenario;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.util.concurrent.TimeUnit;

public class Hooks {

    @Before
    public void setUp(){
        Driver.get().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }

    @After
    public void teatDown(Scenario scenario){
        if(scenario.isFailed()){
            final byte [] screenshoot=((TakesScreenshot) Driver.get()).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshoot,"image/png");

        }
        Driver.closeDriver();

    }



}
