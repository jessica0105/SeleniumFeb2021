package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SeleniumTestEdge {

	public static void main(String[] args) {
		String rutaEdge = System.getProperty("user.dir") + "\\edgedriver\\msedgedriver.exe";
		System.setProperty("webdriver.edge.driver", rutaEdge);

		WebDriver driver = new EdgeDriver();
		driver.get("https://developer.microsoft.com/en-us/microsoft-edge/tools/webdriver/");

	}

}
