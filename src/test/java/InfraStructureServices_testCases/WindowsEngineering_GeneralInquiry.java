package InfraStructureServices_testCases;

import java.util.ResourceBundle;

import org.testng.annotations.Test;

import pageObjects.InfraStructureServices_POM;

public class WindowsEngineering_GeneralInquiry extends JIRA_SSOLogin {
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
		WindowsEngineering.Infra_SubCategory_Enter();
		WindowsEngineering.EnterJustification();
		driver.switchTo().parentFrame();
		WindowsEngineering.CREATE();
		Thread.sleep(15000);
		Refresh();
		ValidatingPortal();
		WindowsEngineering.ItViewNavigation();
		windowhandles();
		Refresh();
		ITViewTicketValidationFields();
		WindowsEngineering.SubtaskDescriptionClick();
		Thread.sleep(2000);
		ITViewTicketValidationFields();
		WindowsEngineering.EDITTransition();
		WindowsEngineering.AssignmentGroup();
		EstimateSize();
		WindowsEngineering.UPDATE();
		Thread.sleep(30000);
		WindowsEngineering.EDITTransition();
		WindowsEngineering.Assigntome();
		WindowsEngineering.UPDATE();
		Thread.sleep(30000);
		WindowsEngineering.WORKINPROGRESS();
		Thread.sleep(5000);
		WindowsEngineering.CloseTrans();
		CloseCode();
		WindowsEngineering.closenotes();
		ActualSize();
		InfraComments();
		Thread.sleep(3000);
		driver.switchTo().parentFrame();
		WindowsEngineering.closebutton();
		Thread.sleep(30000);
		Refresh();
		ITViewTicketValidationFields();
		ParentTicketClick();
		ITViewTicketValidationFields();
	}
}


