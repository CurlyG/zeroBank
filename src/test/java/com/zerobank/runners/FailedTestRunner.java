package com.zerobank.runners;

//this class is for running every failed test
//this class will read rerun.txt and run the failed tests

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
    features="@target/rerun.txt",
        glue = "com/zerobank/stepdefinitions"
        )

public class FailedTestRunner {
}
