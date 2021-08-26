package org.stepdefinition;

import org.adactinlocator.AdactinLocator;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CucumberTableStep extends AdactinLocator {
	static AdactinLocator locator;

	@Given("User should be in adactin page")
	public void user_should_be_in_adactin_page() {
		getChromeDriver();
		loadUrl("http://adactinhotelapp.com/");
		maximizeBrowser();

	}

	@When("user should enter username and password")
	public void user_should_enter_username_and_password() {
		locator = new AdactinLocator();
		WebElement userName2 = locator.getUserName();
		userName2.sendKeys("apple");
		WebElement password2 = locator.getPassword();
		password2.sendKeys("mango");
		
	}

	@When("user should click login button")
	public void user_should_click_login_button() {
		locator.getBtnLogin().click();
		

	}

	@Then("user should enter into the adactin application")
	public void user_should_enter_into_the_adactin_application() {

	}

}
