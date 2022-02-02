package com.adactin.runner;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\adactin\\feature\\Adactin.feature",
glue="com\\adactin\\stepdefinition")


public class TestRunner {

	public static WebDriver driver;
}
