package stepsDefinitions;

import io.cucumber.java.pt.Dado;
import static utils.Utils.*;


public class TesteSteps {
	
	
	
	@Dado("que eu acesse o sistema")
	public void que_eu_acesse_o_sistema() {
	    acessarSistema();
	}


}
