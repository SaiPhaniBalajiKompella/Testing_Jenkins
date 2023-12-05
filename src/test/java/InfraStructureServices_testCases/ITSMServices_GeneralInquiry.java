package InfraStructureServices_testCases;

import java.util.ResourceBundle;

import org.testng.annotations.Test;

import pageObjects.InfraStructureServices_POM;

public class ITSMServices_GeneralInquiry extends JIRA_SSOLogin {
	public ResourceBundle rb;
	int i=1;

	@Test(priority=2)
	public void ITSMServices() throws InterruptedException 
{
		InfraStructureServices_POM ITSMServices=new InfraStructureServices_POM(driver);
		ITSMServices.InfraModuleSelection();
		driver.switchTo().frame("rw_iframe");
		ITSMServices.CategoryValue_ITSM();
		ITSMServices.Infra_Category_Enter_ITSM();
		ITSMServices.SubCategoryValue();
		ITSMServices.Infra_SubCategory_Enter();
		ITSMServices.EnterJustification();
		driver.switchTo().parentFrame();
		ITSMServices.CREATE();
		Thread.sleep(15000);
		Refresh();
		ValidatingPortal();
		ITSMServices.ItViewNavigation();
		windowhandles();
		Refresh();
		ITViewTicketValidationFields();
		ITSMServices.SubtaskDescriptionClick();
		Thread.sleep(2000);
		ITViewTicketValidationFields();
		ITSMServices.EDITTransition();
		ITSMServices.AssignmentGroup();
		EstimateSize();
		ITSMServices.UPDATE();
		Thread.sleep(30000);
		ITSMServices.EDITTransition();
		ITSMServices.Assigntome();
		ITSMServices.UPDATE();
		Thread.sleep(30000);
		ITSMServices.WORKINPROGRESS();
		Thread.sleep(5000);
		ITSMServices.CloseTrans();
		CloseCode();
		ITSMServices.closenotes();
		ActualSize();
		InfraComments();
		Thread.sleep(3000);
		driver.switchTo().parentFrame();
		ITSMServices.closebutton();
		Thread.sleep(30000);
		Refresh();
		ITViewTicketValidationFields();
		ParentTicketClick();
		ITViewTicketValidationFields();
}
}


