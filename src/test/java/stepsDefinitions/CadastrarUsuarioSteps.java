package stepsDefinitions;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.CadastrarUsuarioPage;
import pageObjects.TelaInicialPage;

import static org.junit.Assert.assertTrue;
import static utils.Utils.*;


import org.openqa.selenium.By;

public class CadastrarUsuarioSteps {

	@Quando("que eu acesse a aba admin")
	public void queEuAcesseAAbaAdmin() {
		Na(TelaInicialPage.class).acionarAbaAdmin();
	}

	@Quando("acionar o botao add")
	public void acionarOBotaoAdd() {
	   Na(TelaInicialPage.class).acionarBotaoAd();
	}

	@Quando("colocar no campo Employee Name {string}")
	public void colocarNoCampoEmployeeName(String employerName) {
	   Na(CadastrarUsuarioPage.class).preencherCampoEmployeeName(employerName);
	}

	@Quando("colocar no campo Username {string}")
	public void colocarNoCampoUsername(String userName) {
		 Na(CadastrarUsuarioPage.class).preencherCampoUserName(userName);
	}

	@Quando("colocar no campo Password {string}")
	public void colocarNoCampoPassword(String password) {
		 Na(CadastrarUsuarioPage.class).preencherCampoPassword(password);
	}

	@Quando("colocar no campo Confirm Password {string}")
	public void colocarNoCampoConfirmPassword(String confirmPassword) {
		 Na(CadastrarUsuarioPage.class).preencherCampoConfirmPassword(confirmPassword);
	}

	@Quando("acionar o botao save")
	public void acionarOBotaoSave() {
	    // Write code here that turns the phrase above into concrete actions
		Na(CadastrarUsuarioPage.class).acionarBtnSave();
	}


	@Entao("^o sistema cadastra o usuario \"([^\"]*)\"$")
	public void oSistemaCadastraOUsuario(String usuarioCadastrado) throws Throwable {
		assertTrue(driver.findElement(By.xpath("//a[text()='"+ usuarioCadastrado +"']")).isDisplayed());
	}
	
}
