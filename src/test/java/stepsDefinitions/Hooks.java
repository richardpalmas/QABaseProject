package stepsDefinitions;

import static utils.Utils.Na;
import static utils.Utils.acessarSistema;
import static utils.Utils.capturarTela;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import pageObjects.LoginPage;

public class Hooks {
	
	@Before(value = "not @Login")
	public void setUp() {
		acessarSistema();
		Na(LoginPage.class).realizarLogin("Admin", "admin123");
	}
	
	@Before(value = "@Login")
	public void funcionalidadeLogin() {
		acessarSistema();
	}
	
	@After
	public void tearDown(Scenario scenario) {
		capturarTela(scenario);
		//driver.quit();
	}

}
