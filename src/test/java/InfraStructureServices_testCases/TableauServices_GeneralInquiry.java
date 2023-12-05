package InfraStructureServices_testCases;

import java.util.ResourceBundle;

import org.testng.annotations.Test;

import pageObjects.InfraStructureServices_POM;

public class TableauServices_GeneralInquiry extends JIRA_SSOLogin {
	public ResourceBundle rb;
	int i=1;

	@Test(priority=2)
	public void TableauServices() throws InterruptedException 
{
		InfraStructureServices_POM TableauServices =new InfraStructureServices_POM(driver);
		TableauServices.InfraModuleSelection();
		driver.switchTo().frame("rw_iframe");
		TableauServices.CategoryValue_TS();
		TableauServices.Infra_Category_Enter_TS();
		TableauServices.SubCategoryValue();
		TableauServices.Infra_SubCategory_Enter();
		TableauServices.EnterJustification();
		driver.switchTo().parentFrame();
		TableauServices.CREATE();
		Thread.sleep(15000);
		Refresh();
		ValidatingPortal();
		TableauServices.ItViewNavigation();
		windowhandles();
		Refresh();
		ITViewTicketValidationFields();
		TableauServices.SubtaskDescriptionClick();
		Thread.sleep(2000);
		ITViewTicketValidationFields();
		TableauServices.EDITTransition();
		TableauServices.AssignmentGroup();
		EstimateSize();
		TableauServices.UPDATE();
		Thread.sleep(30000);
		TableauServices.EDITTransition();
		TableauServices.Assigntome();
		TableauServices.UPDATE();
		Thread.sleep(30000);
		TableauServices.WORKINPROGRESS();
		Thread.sleep(5000);
		TableauServices.CloseTrans();
		CloseCode();
		TableauServices.closenotes();
		ActualSize();
		InfraComments();
		Thread.sleep(3000);
		driver.switchTo().parentFrame();
		TableauServices.closebutton();
		Thread.sleep(30000);
		Refresh();
		ITViewTicketValidationFields();
		ParentTicketClick();
		ITViewTicketValidationFields();
}
}


