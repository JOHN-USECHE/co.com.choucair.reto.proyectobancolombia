package co.com.choucair.reto.proyectobancolombia.runners;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions (

        features = "src/test/resources/features/simuladorBancolombia.feature",
        tags = "@scenario1",
        glue = "co.com.choucair.reto.proyectobancolombia",
        snippets = SnippetType.CAMELCASE)

public class RunnerTags {
}