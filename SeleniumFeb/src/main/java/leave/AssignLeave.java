package leave;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import comun.Base;

public class AssignLeave extends Base {
	// PageObject
	@FindBy(name = "assignleave[txtEmployee][empName]")
	WebElement txt_name;

	@FindBy(id = "assignleave_txtLeaveType")
	WebElement dp_leaveType;

	// 2021-04-17
	@FindBy(id = "assignleave_txtFromDate")
	WebElement txt_fromDate;

	@FindBy(id = "assignleave_txtToDate")
	WebElement txt_toDate;

	@FindBy(id = "assignleave_partialDays")
	WebElement dp_partialDay;

	@FindBy(id = "assignleave_txtComment")
	WebElement txt_Comment;

	@FindBy(id = "assignBtn")
	WebElement btn_assign;

	@FindBy(xpath = "//div[@id='leaveBalanceConfirm']//p")
	WebElement text_mensaje;
	
	@FindBy(id = "confirmOkButton")
	WebElement btn_ok;

	@FindBy(id = "confirmCancelButton")
	WebElement btn_cancel;
	
	@FindBy(xpath= "//div[@class='box single']//h1")
	WebElement text_header;

	public void pedirVacacionesValidas(String name, String leaveType, String fromDate, String toDate, String Duration, String comment) {
		highlighElement(txt_name);
		ingresarTexto(txt_name, name);
		scroll(dp_leaveType);
		highlighElement(dp_leaveType);
		selectDropdownByValue(dp_leaveType, leaveType);
		highlighElement(txt_fromDate);
		ingresarTexto(txt_fromDate, fromDate);
		highlighElement(txt_toDate);
		ingresarTexto(txt_toDate, toDate);
		scroll(dp_partialDay);
		highlighElement(dp_partialDay);
		selectDropdownByValue(dp_partialDay, Duration);
		highlighElement(txt_Comment);
		ingresarTexto(txt_Comment, comment);
		highlighElement(btn_assign);
		click(btn_assign);
		if (getText(text_mensaje).equals(mensajeEsperado)) {
			Reporter.log("El mensaje esperado es igual al obtenido [ " + mensajeEsperado + "] " + " [ "
					+ getText(text_mensaje) + "]");
		}else {
			Assert.fail("El emnsaje esperado no es igual al obtenido [")
		}
		

	}

}// end class
