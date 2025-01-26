package testrunner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features/login.feature",  // Path to the feature files
    glue = {"stepdefinition"},       // Package where step definitions and hooks are located
    plugin = {
        "pretty",                            // Pretty output for the console
        "html:target/cucumber-report.html",   // HTML report location
        
    },
    dryRun = false,                          // Skip execution of glue code
    monochrome = true
)
public class TestRunner  {
}


