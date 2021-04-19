package stepsDefinitions;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.TelaInicialPage;

import static org.junit.Assert.assertEquals;
import static utils.Utils.*;

import org.openqa.selenium.By;

public class ActionsSteps {
	
	@Quando("eu acionar o submenu field")
	public void euAcionarOSubmenuField() {
	  Na(TelaInicialPage.class).acionarSubMenuCustomField();
	}

	@Entao("^o sistema acessa a pagina field$")
	public void oSistemaAcessaAPaginaField() throws Throwable {
		assertEquals("Add Custom Field", driver.findElement(By.id("heading")).getText());		
	}



}
