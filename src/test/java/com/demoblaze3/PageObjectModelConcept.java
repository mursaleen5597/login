package com.demoblaze3;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageObjectModelConcept
{
	 @FindBy(css = "#loginusername") public WebElement  username;
	 @FindBy(css = "#loginpassword") public WebElement password;
	 @FindBy(css = "#logInModal > div > div > div.modal-footer > button.btn.btn-primary") public WebElement login_button;
	 @FindBy(css = "#logInModal > div > div > div.modal-footer > button.btn.btn-secondary") public WebElement close_button;

}
