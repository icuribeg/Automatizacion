package co.com.choucair.certification.proyectolatam.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

    @RunWith(CucumberWithSerenity.class)
    @CucumberOptions(features = "src/test/resources/features/validacionLatam.feature",
            tags = "@historia",
            glue = "co.com.choucair.certification.proyectolatam.stepdefinitions",
            snippets = SnippetType.CAMELCASE )
    public class RunnerTags {
}
