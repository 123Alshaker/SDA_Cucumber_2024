package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;




    @RunWith(Cucumber.class)
    @CucumberOptions(
             glue = "stepdefinitions/StepDefForHw",
            features = "src/test/resources/features",
            tags = "@Hw1 or @Hw2",
            dryRun = true
    )
    public class runnerHe {

    }
