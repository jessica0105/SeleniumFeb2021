package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import comun.LeerProperties;

public class SeleniumTestNG {
	static LeerProperties prop = new LeerProperties();
	static WebDriver driver;
	static String path = System.getProperty("user.dir");

	@BeforeTest
	public void startWebDriver() {
		try {
			prop.getSystemProperties();
			String browser = System.getProperty("BROWSER");
			String url = System.getProperty("URL");
			switch (browser) {
			case "chrome":
				System.setProperty("webdriver.chrome.driver", path + "\\chromedriver\\chromedriver.exe");
				// opciones para abrir el explorador
				ChromeOptions option = new ChromeOptions();
				option.addArguments("--start-maximized");
				option.addArguments("--incognito");
				WebDriver driver = new ChromeDriver(option);
				driver.get(url);
				break;
			case "firefox":
				System.setProperty("webdriver.gecko.driver", path + "\\geckodriver\\geckodriver.exe");
				FirefoxOptions foption = new FirefoxOptions();
				foption.addArguments("--start maximized");
				foption.addArguments("--incognito");
				driver = new FirefoxDriver(foption);
				driver.get(url);
				break;
			case "edge":
				System.setProperty("webdriver.edge.driver", path + "\\edgedriver\\msedgedriver.exe");
				EdgeOptions eoption = new EdgeOptions();
				eoption.addArguments("--start maximized");
				eoption.addArguments("--incognito");
				driver = new EdgeDriver(eoption);
				driver.get(url);
				break;

			default:
				System.out.println("El driver [" + browser + "] no está configurado para funcionar en este proyecto");
			}// end switch
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.MILLISECONDS);
			Reporter.log("El web Driver fue inicializado [" + browser + "]", true);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("El driver no puede ser inicializado");
		} // END CATCH
	}// metodo starWebtDriver

	@Test(enabled = true, priority = 3)
	public void LoginFallido() {
		WebElement txt_usernamebyId = driver.findElement(By.id("txtUsername"));
		WebElement txt_passwordById = driver.findElement(By.id("txtPassword"));
		WebElement btn_login = driver.findElement(By.id("btnLogin"));

		txt_usernamebyId.sendKeys("Jessi");
		Reporter.log("El usuario fue ingresado correctamente");
		txt_passwordById.sendKeys("admin12345");
		Reporter.log("El password fue ingresado correctamente");
		btn_login.click();
		Reporter.log("Se dio clic en el botón de login");

		WebElement text_mensajeDeError = driver.findElement(By.id("spanMessage"));

		Assert.assertEquals(text_mensajeDeError.getText(), "Invalid credentials");
		Reporter.log(text_mensajeDeError.getText(), true);
	}// end loginFallido

	@Test(enabled = true, priority = 1)
	public void LoginSoloUsuario() {
		WebElement txt_usernamebyId = driver.findElement(By.id("txtUsername"));
		WebElement txt_passwordById = driver.findElement(By.id("txtPassword"));
		txt_passwordById.clear();
		WebElement btn_login = driver.findElement(By.id("btnLogin"));

		txt_usernamebyId.sendKeys("Jessi");
		Reporter.log("El usuario fue ingresado correctamente");
		btn_login.click();
		Reporter.log("Se dio clic en el botón de login");

		WebElement text_mensajeDeError = driver.findElement(By.id("spanMessage"));

		Assert.assertEquals(text_mensajeDeError.getText(), "Password cannot be empty");
		Reporter.log(text_mensajeDeError.getText(), true);
	}// end LoginSoloUsuario

	@Test(enabled = true, priority = 2)
	public void LoginSoloPassword() {
		WebElement txt_usernamebyId = driver.findElement(By.id("txtUsername"));
		txt_usernamebyId.clear();
		WebElement txt_passwordById = driver.findElement(By.id("txtPassword"));
		WebElement btn_login = driver.findElement(By.id("btnLogin"));

		txt_passwordById.sendKeys("admin12345");
		Reporter.log("El password fue ingresado correctamente");
		btn_login.click();
		Reporter.log("Se dio clic en el botón de login");

		WebElement text_mensajeDeError = driver.findElement(By.id("spanMessage"));

		Assert.assertEquals(text_mensajeDeError.getText(), "Username cannot be empty");
		Reporter.log(text_mensajeDeError.getText(), true);
	}// end LoginSoloPassword

	@Test(enabled = true, priority = 4)
	public void loginExitoso() {
		WebElement txt_usernamebyId = driver.findElement(By.id("txtUsername"));
		WebElement txt_passwordById = driver.findElement(By.id("txtPassword"));
		WebElement btn_login = driver.findElement(By.id("btnLogin"));

		txt_usernamebyId.sendKeys("Admin");
		Reporter.log("El usuario fue ingresado correctamente");
		txt_passwordById.sendKeys("admin123");
		Reporter.log("El password fue ingresado correctamente");
		btn_login.click();
		Reporter.log("Se dio clic en el botón de login");

		try {
			WebElement link_welcome = driver.findElement(By.xpath("//a[@id='welcome']"));

			if (link_welcome.getSize() != null) {
				Reporter.log("El login fue exitoso", true);
			}
		} catch (NoSuchElementException e) {
			Assert.fail("El login no fue exitoso");
		}
		
	}// endLogin exitoso
}// end class
