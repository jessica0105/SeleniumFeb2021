package selenium;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import comun.LeerProperties;

public class SeleniumTest {
	public static Logger log = Logger.getLogger(SeleniumTest.class);
	static LeerProperties prop = new LeerProperties();

	public static void main(String[] args) {
		// guardar el .exe en la carpeta de chromedriver
		String rutaChrome = System.getProperty("user.dir") + "\\chromedriver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", rutaChrome);
		
		// opciones para abrir el explorador
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--start-maximized");
		option.addArguments("--incognito");
		WebDriver driver = new ChromeDriver(option);
		
		// otra forma de maximizar
		//driver.manage().window().maximize();
		// implicit wait -- sirve para demorar la ejecución
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.MILLISECONDS);

		prop.getSystemProperties();
		String url = System.getProperty("URL");

		driver.get(url);
		WebElement txt_usernamebyId = driver.findElement(By.id("txtUsername"));
		WebElement txt_usernamebyName = driver.findElement(By.name("txtUsername"));
		WebElement txt_usernamebyXpath = driver.findElement(By.xpath("//div[@id='divUsername']/input"));
		
		//-------- ejercicio utilizar estos elementos
	
		
		driver.findElement(By.cssSelector(""));
		driver.findElement(By.tagName(""));
		
		
		// escribe el usuario
		txt_usernamebyId.sendKeys("Admin");
		// limpiar el campo usuario
		//txt_usernamebyName.clear();
		
		// driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		
		// contraseña
		WebElement txt_passwordById = driver.findElement(By.id("txtPassword"));
		//Element txt_passwordByName = driver.findElement(By.name("txtPassword"));
		//WebElement txt_passwordByXpath = driver.findElement(By.xpath("//div[@id='txtPassword']/input"));
		txt_passwordById.sendKeys("admin123");
		
		WebElement btn_login = driver.findElement(By.id("btnLogin"));
		btn_login.click();
		log.info("Todo fue exitoso");
		
		try {
			WebElement link_welcome = driver.findElement(By.xpath("//a[@id='welcome']"));
			
			if(link_welcome.getSize()!=null) {
				System.out.println("El login fue exitoso");
			}
		}catch(NoSuchElementException e) {
			System.out.println("El login no fue exitoso");
			}

}// main
	//clase que genero un nombre random y un numero random en un arreglo
	public String randomName() {
		String[] gente = new String[] {"Jessica, Samanta"};
				return "";
		
	}
}
