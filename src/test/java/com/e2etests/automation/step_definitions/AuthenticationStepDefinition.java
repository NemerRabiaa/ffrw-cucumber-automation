package com.e2etests.automation.step_definitions;

import com.e2etests.automation.page_objects.AuthenticationPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AuthenticationStepDefinition {

	private AuthenticationPage authenticationPage;

	public AuthenticationStepDefinition() {
		this.authenticationPage = new AuthenticationPage();
	}

	@Given("Je me connecte sur l application Mercury")
	public void jeMeConnecteSurLApplicationMercury() {
		authenticationPage.goToURL();
	}

	@When("Je saisi le username {string}")
	public void jeSaisiLeUsername(String name) {
		authenticationPage.fillUserName(name);

	}

	@When("Je saisi le password {string}")
	public void jeSaisiLePassword(String password) {
		authenticationPage.fillPassowrd(password);

	}

	@When("je clique sur le button Submit")
	public void jeCliqueSurLeButtonSubmit() {
		authenticationPage.clickOnSubmitButton();
	}

	@Then("Je me redirige vers la pagr home {string}")
	public void jeMeRedirigeVersLaPagrHome(String text) {

		String message = AuthenticationPage.weLcomeMessage.getText();
		Assert.assertEquals(message, text);

	}

}
