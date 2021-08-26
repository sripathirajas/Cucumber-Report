package org.adactinlocator;

import org.base.LibGlobal;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class AdactinLocator extends LibGlobal {
	
	public AdactinLocator() {
		PageFactory.initElements(driver, this);
		
		
	}
	
	
	@FindBy(id="username")
	private WebElement userName;
	
	@FindBys({@FindBy(id="password"), @FindBy(xpath="//input[@type='password']")
	})
	private WebElement password;
	
	
	@FindAll({@FindBy(id="login"),@FindBy(className="login_button")})
	private WebElement btnLogin;


	public WebElement getUserName() {
		return userName;
	}


	public WebElement getPassword() {
		return password;
	}


	public WebElement getBtnLogin() {
		return btnLogin;
	}


	





	
	
	

}
