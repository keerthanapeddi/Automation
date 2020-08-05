package Runner;

import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;

import Utilities.BaseClass;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)	
@CucumberOptions(features={"src\\test\\java\\FeatureFiles\\NavigateToElementsAndFillTextBox.feature"} , glue= {"src\\test\\java\\StepDefinitions"}, monochrome=true)

public class RunnerClass extends BaseClass 
{

	@Before
	public void launchApplication()
	{
		launchBrowser();
	}

	@After
	public void tearDrop()
	{
		quitDriver();
	}

}
