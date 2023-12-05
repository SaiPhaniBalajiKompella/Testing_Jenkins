package InfraStructureServices_testCases;

import java.util.ResourceBundle;

import org.testng.annotations.Test;

import pageObjects.InfraStructureServices_POM;

public class OKTAServices_GeneralInquiry extends JIRA_SSOLogin {
	public ResourceBundle rb;
	int i=1;

	@Test(priority=2)
	public void OKTAServices() throws InterruptedException 
{
		InfraStructureServices_POM OKTAServices =new InfraStructureServices_POM(driver);
		OKTAServices.InfraModuleSelection();
		driver.switchTo().frame("rw_iframe");
		OKTAServices.CategoryValue_OS();
		OKTAServices.Infra_Category_Enter_OS();
		OKTAServices.SubCategoryValue();
		OKTAServices.Infra_SubCategory_Enter();
		OKTAServices.EnterJustification();
		driver.switchTo().parentFrame();
		OKTAServices.CREATE();
		Thread.sleep(15000);
		Refresh();
		ValidatingPortal();
		OKTAServices.ItViewNavigation();
		windowhandles();
		Refresh();
		ITViewTicketValidationFields();
		OKTAServices.SubtaskDescriptionClick();
		Thread.sleep(2000);
		ITViewTicketValidationFields();
		OKTAServices.EDITTransition();
		OKTAServices.AssignmentGroup();
		EstimateSize();
		OKTAServices.UPDATE();
		Thread.sleep(30000);
		OKTAServices.EDITTransition();
		OKTAServices.Assigntome();
		OKTAServices.UPDATE();
		Thread.sleep(30000);
		OKTAServices.WORKINPROGRESS();
		Thread.sleep(5000);
		OKTAServices.CloseTrans();
		CloseCode();
		OKTAServices.closenotes();
		ActualSize();
		InfraComments();
		Thread.sleep(3000);
		driver.switchTo().parentFrame();
		OKTAServices.closebutton();
		Thread.sleep(30000);
		Refresh();
		ITViewTicketValidationFields();
		ParentTicketClick();
		ITViewTicketValidationFields();
}
}


 