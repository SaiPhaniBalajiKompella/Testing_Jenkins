package InfraStructureServices_testCases;

import java.util.ResourceBundle;

import org.testng.annotations.Test;

import pageObjects.InfraStructureServices_POM;

public class DataBaseServices_GeneralInquiry extends JIRA_SSOLogin {
	
	
	public ResourceBundle rb;
	int i=1;

	@Test(priority=2)
	public void DBServices() throws InterruptedException 

	{
		InfraStructureServices_POM DBServices=new InfraStructureServices_POM(driver);
		DBServices.InfraModuleSelection();
		driver.switchTo().frame("rw_iframe");
		DBServices.CategoryValue();
		DBServices.Infra_Category_EnterDB();
		DBServices.SubCategoryValue();
		DBServices.Infra_SubCategory_Enter();
		DBServices.EnterJustification();
		driver.switchTo().parentFrame();
		DBServices.CREATE();
		Thread.sleep(15000);
		Refresh();
		ValidatingPortal();
		DBServices.ItViewNavigation();
		windowhandles();
		Refresh();
		ITViewTicketValidationFields();
		DBServices.SubtaskDescriptionClick();
		Thread.sleep(2000);
		ITViewTicketValidationFields();
		DBServices.EDITTransition();
		DBServices.AssignmentGroup();
		EstimateSize();
		DBServices.UPDATE();
		Thread.sleep(30000);
		DBServices.EDITTransition();
		DBServices.Assigntome();
		DBServices.UPDATE();
		Thread.sleep(30000);
		DBServices.WORKINPROGRESS();
		Thread.sleep(5000);
		DBServices.CloseTrans();
		CloseCode();
		DBServices.closenotes();
		ActualSize();
		InfraComments();
		Thread.sleep(3000);
		driver.switchTo().parentFrame();
		DBServices.closebutton();
		Thread.sleep(30000);
		Refresh();
		ITViewTicketValidationFields();
		ParentTicketClick();
		ITViewTicketValidationFields();
		}
}
