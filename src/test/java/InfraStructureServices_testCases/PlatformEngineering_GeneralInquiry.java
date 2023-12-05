package InfraStructureServices_testCases;

import java.util.ResourceBundle;

import org.testng.annotations.Test;

import pageObjects.InfraStructureServices_POM;

public class PlatformEngineering_GeneralInquiry extends JIRA_SSOLogin {
	public ResourceBundle rb;
	int i=1;

	@Test(priority=2)
	public void PlatformEngineering() throws InterruptedException 
{
		InfraStructureServices_POM PlatformEngineering =new InfraStructureServices_POM(driver);
		PlatformEngineering.InfraModuleSelection();
		driver.switchTo().frame("rw_iframe");
		PlatformEngineering.CategoryValue_PE();
		PlatformEngineering.Infra_Category_Enter_PE();
		PlatformEngineering.SubCategoryValue();
		PlatformEngineering.Infra_SubCategory_Enter();
		PlatformEngineering.EnterJustification();
		driver.switchTo().parentFrame();
		PlatformEngineering.CREATE();
		Thread.sleep(15000);
		Refresh();
		ValidatingPortal();
		PlatformEngineering.ItViewNavigation();
		windowhandles();
		Refresh();
		ITViewTicketValidationFields();
		PlatformEngineering.SubtaskDescriptionClick();
		Thread.sleep(2000);
		ITViewTicketValidationFields();
		PlatformEngineering.EDITTransition();
		PlatformEngineering.AssignmentGroup();
		EstimateSize();
		PlatformEngineering.UPDATE();
		Thread.sleep(30000);
		PlatformEngineering.EDITTransition();
		PlatformEngineering.Assigntome();
		PlatformEngineering.UPDATE();
		Thread.sleep(30000);
		PlatformEngineering.WORKINPROGRESS();
		Thread.sleep(5000);
		PlatformEngineering.CloseTrans();
		CloseCode();
		PlatformEngineering.closenotes();
		ActualSize();
		InfraComments();
		Thread.sleep(3000);
		driver.switchTo().parentFrame();
		PlatformEngineering.closebutton();
		Thread.sleep(30000);
		Refresh();
		ITViewTicketValidationFields();
		ParentTicketClick();
		ITViewTicketValidationFields();
}
}


