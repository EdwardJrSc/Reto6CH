package co.com.serenity.web.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions (
        features = "src/test/resources/features/user_history.feature",
        tags = "@stories",
        glue = " co.com.serenity.web.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)

public class RunnerTags {
}
