package com.user.action.login;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "classpath:features/login/"}, glue = "com.user.action.login" ,plugin = { "pretty", "json:target/cucumber-reports/Cucumber.json" })
public class LoginActionTest {

}
