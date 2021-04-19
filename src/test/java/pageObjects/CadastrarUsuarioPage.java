package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class CadastrarUsuarioPage {

	@FindBy(name = "systemUser[employeeName][empName]")
	public WebElement campoEmployee;

	@FindBy(name = "systemUser[userName]")
	public WebElement campoUserName;

	@FindBy(name = "systemUser[password]")
	public WebElement campoPassword;

	@FindBy(name = "systemUser[confirmPassword]")
	public WebElement campoConfirmPassword;

	@FindBy(name = "btnSave")
	public WebElement btnSave;

	public void preencherCampoEmployeeName(String employerName) {
		campoEmployee.sendKeys(employerName);
	}

	public void preencherCampoUserName(String userName) {
		campoUserName.sendKeys(userName);
	}

	public void preencherCampoPassword(String password) {
		campoPassword.sendKeys(password);
	}

	public void preencherCampoConfirmPassword(String confirmPassword) {
		campoConfirmPassword.sendKeys(confirmPassword);
	}

	public void acionarBtnSave() {
		btnSave.click();
	}

}
