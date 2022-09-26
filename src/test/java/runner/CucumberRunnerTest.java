package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:target/cucumber/cucumber-reports.html",
        "json:target/cucumber/cucumber-reports.json"},
        features = {"src/test/resources/features/TeamRCB.feature"},
        glue = {"steps"},
        tags = "@TestVagrant1")

public class CucumberRunnerTest {

}