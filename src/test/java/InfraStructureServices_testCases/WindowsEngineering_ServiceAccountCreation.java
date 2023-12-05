package InfraStructureServices_testCases;

import java.util.ResourceBundle;

import org.testng.annotations.Test;

import pageObjects.InfraStructureServices_POM;

public class WindowsEngineering_ServiceAccountCreation extends JIRA_SSOLogin {
	public ResourceBundle rb;
	int i=1;

	@Test(priority=2)
	public void  WindowsEngineering() throws InterruptedException 
	{
		InfraStructureServices_POM  WindowsEngineering =new InfraStructureServices_POM(driver);
		WindowsEngineering.InfraModuleSelection();
		driver.switchTo().frame("rw_iframe");
		WindowsEngineering.CategoryValue_WE();
		WindowsEngineering.Infra_Category_Enter_WE();
		WindowsEngineering.SubCategoryValue();
		WindowsEngineering.Infra_SubCategory_Enter_WE_ServiceAccountCreation();
		
	}}
