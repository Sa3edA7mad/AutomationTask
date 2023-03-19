package Runner;

import Base.CutomizeTestNGCucmberRunner;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = "src/test/resources/Feature/Task.feature",
		glue = { "stepDef", "Hooks" }
		)

public class Runner extends CutomizeTestNGCucmberRunner {

}
