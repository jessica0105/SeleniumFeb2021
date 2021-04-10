package menuHRM;

import org.openqa.selenium.support.FindBy;

import java.util.List;

import org.openqa.selenium.WebElement;
import comun.Base;

public class Menu extends Base{
	
	@FindBy(xpath="//ul[@id='mainMenuFirstLevelUnorderedList']/li/a/b")
	List<WebElement> list_Menu;
	
	@FindBy(xpath="//ul[@id='mainMenuFirstLevelUnorderedList']//ul/li/a")
	List<WebElement> list_subMenu;
	
	@FindBy(id="welcome")
	WebElement link_welcome;
	
	@FindBy(linkText = "Logout")
	WebElement link_logout;
	
	
	public void seleccionaMenuSubMenu(String menu, String subMenu) throws Exception{
		selectElementByValue(list_Menu, menu);
		selectElementByValue(list_subMenu, subMenu);
		
		
	}
	

}
