package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/FeatureWithTags",glue= {"StepDefinitions"},
tags="@smoke or @regression")
//tags="@smoke and @regression" in this case sample 3 will run only
//@smoke and not @regression
public class TestRunnerRunwithSingleTag {

}
