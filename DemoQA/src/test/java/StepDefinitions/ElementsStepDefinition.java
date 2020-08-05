package StepDefinitions;

import io.cucumber.java.en.Given;
import pageObjects.ElementsPage;

public class ElementsStepDefinition {
	
	@Given("user navigates elements page")
	public void user_navigates_elements_page() 
	{
		ElementsPage.navigateToElementsPage();
	}

}
