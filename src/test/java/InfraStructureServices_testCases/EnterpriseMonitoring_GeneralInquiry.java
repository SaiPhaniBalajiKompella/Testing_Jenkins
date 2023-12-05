package InfraStructureServices_testCases;

import java.util.ResourceBundle;

import org.testng.annotations.Test;

import pageObjects.InfraStructureServices_POM;

public class EnterpriseMonitoring_GeneralInquiry extends JIRA_SSOLogin{
	
	public ResourceBundle rb;
	int i=1;

	@Test(priority=2)
	public void EnterpriseMonitoring() throws InterruptedException 
{
		InfraStructureServices_POM EnterpriseMonitoring=new InfraStructureServices_POM(driver);
		EnterpriseMonitoring.InfraModuleSelection();
		driver.switchTo().frame("rw_iframe");
		EnterpriseMonitoring.CategoryValue_EM();
		EnterpriseMonitoring.Infra_Category_Enter_EM();
		EnterpriseMonitoring.SubCategoryValue();
		EnterpriseMonitoring.Infra_SubCategory_Enter();
		EnterpriseMonitoring.EnterJustification();
		driver.switchTo().parentFrame();
		EnterpriseMonitoring.CREATE();
		Thread.sleep(15000);
		Refresh();
		ValidatingPortal();
		EnterpriseMonitoring.ItViewNavigation();
		windowhandles();
		Refresh();
		ITViewTicketValidationFields();
		EnterpriseMonitoring.SubtaskDescriptionClick();
		Thread.sleep(2000);
		ITViewTicketValidationFields();
		EnterpriseMonitoring.EDITTransition();
		EnterpriseMonitoring.AssignmentGroup();
		EstimateSize();
		EnterpriseMonitoring.UPDATE();
		Thread.sleep(30000);
		EnterpriseMonitoring.EDITTransition();
		EnterpriseMonitoring.Assigntome();
		EnterpriseMonitoring.UPDATE();
		Thread.sleep(30000);
		EnterpriseMonitoring.WORKINPROGRESS();
		Thread.sleep(5000);
		EnterpriseMonitoring.CloseTrans();
		CloseCode();
		EnterpriseMonitoring.closenotes();
		ActualSize();
		InfraComments();
		Thread.sleep(3000);
		driver.switchTo().parentFrame();
		EnterpriseMonitoring.closebutton();
		Thread.sleep(30000);
		Refresh();
		ITViewTicketValidationFields();
		ParentTicketClick();
		ITViewTicketValidationFields();
}
}