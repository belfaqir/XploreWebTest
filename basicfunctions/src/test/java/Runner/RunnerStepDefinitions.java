package Runner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		// features = "classpath:testcases.feature"
		// features = "classpath:navigation.feature"
		features = "src/test/resources/futures"
		
		,glue={"StepDefinitions"}
		//,glue={"cucumber_tuto_replay.StepDefinitionG"}
		,monochrome=true
				,plugin={"pretty","html:target/htmlReport/report"}
		// ,plugin={"pretty","html:/cucumber_tuto_replay/target/htmlReport/"})
		// ,tags="@smoketest"
		)
public class RunnerStepDefinitions {

}
