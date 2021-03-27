package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import comun.Base;

public class SeleniumBase extends Base{
	WebDriver driver;

	@FindBy(id = "txtUsername")
	WebElement txt_userName;

	@FindBy(id = "txtPassword")
	WebElement txt_password;

	@FindBy(id = "btnLogin")
	WebElement btn_login;

	@FindBy(id = "spanMessage")
	WebElement text_mensajeDeError;

	@FindBy(xpath = "//a[@id='welcome']")
	WebElement link_welcome;
	
	@BeforeTest
	public void initDriver() {
		driver = startWebDriver();
		PageFactory.initElements(driver, this);
	}//end initDriver
	
	@Test(enabled = true, priority=1)
	public void loginFallido() {
		//ingresarTexto(txt_userName, "Jessica");
		//ingresarTexto(txt_password, "jessi");
	}// end loginFallido
	
}// class
