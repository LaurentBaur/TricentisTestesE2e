package runner;

import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;

import drivers.Drivers;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith (Cucumber.class)
@CucumberOptions(
		features="src/test/resources/features",
		glue="tricentis.steps",
		tags="@positivo",
		dryRun=false,
		monochrome=false,
		snippets=SnippetType.CAMELCASE,
		plugin= {"pretty","html:target/cucumber-report.html"}
		
		)

public class Executa extends Drivers{

	
	public static void iniciarTeste(String url) {
		drivers = new ChromeDriver();
		drivers.manage().window().maximize();
		drivers.get(url);
	}
	
	public static void finalizarTeste() {
		drivers.quit();
	}
}
