package comun;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;

public class Base {
	static LeerProperties prop = new LeerProperties();
	static WebDriver driver;
	static String path = System.getProperty("user.dir");
	

	public WebDriver startWebDriver() {
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
			PageFactory.initElements(driver, this);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.MILLISECONDS);
			Reporter.log("El web Driver fue inicializado [" + browser + "]", true);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("El driver no puede ser inicializado");
		} // END CATCH
		return driver;
	}// metodo starWebtDriver


}// end class
