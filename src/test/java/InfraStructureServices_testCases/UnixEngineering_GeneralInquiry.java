package InfraStructureServices_testCases;

import java.util.ResourceBundle;

import org.testng.annotations.Test;

import pageObjects.InfraStructureServices_POM;

public class UnixEngineering_GeneralInquiry extends JIRA_SSOLogin {
	public ResourceBundle rb;
	int i=1;

	@Test(priority=2)
	public void UnixEngineering() throws InterruptedException 
{
		InfraStructureServices_POM UnixEngineering =new InfraStructureServices_POM(driver);
		UnixEngineering.InfraModuleSelection();
		driver.switchTo().frame("rw_iframe");
		UnixEngineering.CategoryValue_UE();
		UnixEngineering.Infra_Category_Enter_UE();
		UnixEngineering.SubCategoryValue();
		UnixEngineering.Infra_SubCategory_Enter();
		UnixEngineering.EnterJustification();
		driver.switchTo().parentFrame();
		UnixEngineering.CREATE();
		Thread.sleep(15000);
		Refresh();
		ValidatingPortal();
		UnixEngineering.ItViewNavigation();
		windowhandles();
		Refresh();
		ITViewTicketValidationFields();
		UnixEngineering.SubtaskDescriptionClick();
		Thread.sleep(2000);
		ITViewTicketValidationFields();
		UnixEngineering.EDITTransition();
		UnixEngineering.AssignmentGroup();
		EstimateSize();
		UnixEngineering.UPDATE();
		Thread.sleep(30000);
		UnixEngineering.EDITTransition();
		UnixEngineering.Assigntome();
		UnixEngineering.UPDATE();
		Thread.sleep(30000);
		UnixEngineering.WORKINPROGRESS();
		Thread.sleep(5000);
		UnixEngineering.CloseTrans();
		CloseCode();
		UnixEngineering.closenotes();
		ActualSize();
		InfraComments();
		Thread.sleep(3000);
		driver.switchTo().parentFrame();
		UnixEngineering.closebutton();
		Thread.sleep(30000);
		Refresh();
		ITViewTicketValidationFields();
		ParentTicketClick();
		ITViewTicketValidationFields();
}
}


