package runtest;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true,
                snippets = CucumberOptions.SnippetType.CAMELCASE,
                features = {"./src/test/resources/features"},
                glue = {"com.automationpractice.steps","com.automationpractice.config"},
                tags = "@checkout")



public class RunTest {


}
