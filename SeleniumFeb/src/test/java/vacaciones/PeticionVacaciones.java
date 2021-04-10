package vacaciones;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;

import com.fasterxml.jackson.databind.JsonNode;

import LoginHRM.Login;

import comun.Base;

public class PeticionVacaciones extends Base{
	
	public static Logger  logger = logger.getlogger(PeticionVacaciones.class);
	String path = System.getProperty("user.dir");
	WebDriver driver;
	String userJS, passwordJS, mensajeErrorJS;
	String userEx, passwordEx, mensajeErrorEx;
	
	
	@BeforeTest
	public void leerDatos() {
		JsonNode nodeTree = readJsonFileByNode(path+ "/data/json/data.json", "usuario1");
		userJS = nodeTree.path("user").asText();
		passwordJS = nodeTree.path("password").asText();
		mensajeErrorJS = nodeTree.path("mensajeError").asText();
	}
	

}
