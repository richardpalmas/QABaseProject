package stepsDefinitions;


import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import pageObjects.LoginPage;

import static org.junit.Assert.assertEquals;
import static utils.Utils.*;

import org.openqa.selenium.By;

public class LoginSteps {
	
	@Dado("que eu preencha o campo username com {string}")
	public void queEuPreenchaOCampoUsernameCom(String usuario) {
		Na(LoginPage.class).preencherCampoUsuario(usuario);
	}

	@Dado("que eu preencha o campo password com {string}")
	public void queEuPreenchaOCampoPasswordCom(String senha) {
		Na(LoginPage.class).preencherCampoSenha(senha);
	}

	@Dado("clique no botao entrar")
	public void cliqueNoBotaoEntrar() {
		Na(LoginPage.class).clicarNoBotaoLogin();
	}
	
	@Entao("o sistema apresenta a mensagem de usuario invalido")
	public void oSistemaApresentaAMensagemDeUsuarioInvalido() {
	    assertEquals("Invalid credentials", driver.findElement(By.id("spanMessage")).getText());
	}

	@Entao("o sistema apresenta o usuario logado")
	public void oSistemaApresentaOUsuarioLogado() {
		 assertEquals("Welcome Linda", driver.findElement(By.linkText("Welcome Linda")).getText());
	}



	

}
