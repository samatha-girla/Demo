package com.phis.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
             "html:target/default-cucumber-reports",
              "json:target/cucumber.json"
        },
        features = "src/test/resources/features",
        glue = "com/phis/step_definitions"
        , dryRun = false
        , tags = "@test"
)
public class SmokeTestRunner {
}
