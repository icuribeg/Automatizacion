package co.com.choucair.certification.reto5.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/automationUtestSite.feature",
        tags = "@escenario1",
        glue = "co.com.choucair.certification.reto5.stepdefinitions",
        snippets = SnippetType.CAMELCASE )

public class RunnerTags {
}
