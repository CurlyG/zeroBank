package com.zerobank.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)  //we are telling JUnit to run our class using Cucumber
@CucumberOptions(
        plugin = {"json:target/cucumber.json",             //it is cucumber option using for reporting purposes
                "html:target/default-cucumber-reports",
                "rerun:target/rerun.txt"
        },
        features = "src/test/resources/features/",
        glue = "com/zerobank/stepdefinitions",  // it shows the path to the step definitions package
        dryRun=false, //If dryRun is on/true → cucumber will not execute the java code.
        // It will only check if the cucumber steps have matching step defs.
         tags = "@wip"

)



public class CukesRunner {

}
