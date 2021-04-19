package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BasePage {
	@FindBy(id = "menu_admin_viewAdminModule")
	public WebElement abaAdmin;
	
	@FindBy(id = "menu_pim_viewPimModule")
	public WebElement abaPim;
	
	@FindBy(id = "menu_pim_Configuration")
	public WebElement menuConfiguration;
	
	@FindBy(id = "menu_pim_listCustomFields")
	public WebElement menuCustomFields;
	
	
}
