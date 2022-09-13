package runtest;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true,
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        //plugin = {"pretty", "html:reports/report.html"},
        features = {"./src/test/resources/features"},
        glue = {"com.swaglabs.steps" , "com.swaglabs.config"},
        tags = "@testeswaglabs")


public class RunTest {

}

