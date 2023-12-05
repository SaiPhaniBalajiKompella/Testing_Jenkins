package InfraStructureServices_testCases;

import java.util.ResourceBundle;

import org.testng.annotations.Test;

import pageObjects.InfraStructureServices_POM;

public class EnterpriseStorage_GeneralInquiry extends JIRA_SSOLogin {
	public ResourceBundle rb;
	int i=1;

	@Test(priority=2)
	public void EnterpriseMonitoring() throws InterruptedException 
{
		InfraStructureServices_POM EnterpriseStorage=new InfraStructureServices_POM(driver);
		EnterpriseStorage.InfraModuleSelection();
		driver.switchTo().frame("rw_iframe");
		EnterpriseStorage.CategoryValue_ES();
		EnterpriseStorage.Infra_Category_Enter_ES();
		EnterpriseStorage.SubCategoryValue();
		EnterpriseStorage.Infra_SubCategory_Enter();
		EnterpriseStorage.EnterJustification();
		driver.switchTo().parentFrame();
		EnterpriseStorage.CREATE();
		Thread.sleep(15000);
		Refresh();
		ValidatingPortal();
		EnterpriseStorage.ItViewNavigation();
		windowhandles();
		Refresh();
		ITViewTicketValidationFields();
		EnterpriseStorage.SubtaskDescriptionClick();
		Thread.sleep(2000);
		ITViewTicketValidationFields();
		EnterpriseStorage.EDITTransition();
		EnterpriseStorage.AssignmentGroup();
		EstimateSize();
		EnterpriseStorage.UPDATE();
		Thread.sleep(30000);
		EnterpriseStorage.EDITTransition();
		EnterpriseStorage.Assigntome();
		EnterpriseStorage.UPDATE();
		Thread.sleep(30000);
		EnterpriseStorage.WORKINPROGRESS();
		Thread.sleep(5000);
		EnterpriseStorage.CloseTrans();
		CloseCode();
		EnterpriseStorage.closenotes();
		ActualSize();
		InfraComments();
		Thread.sleep(3000);
		driver.switchTo().parentFrame();
		EnterpriseStorage.closebutton();
		Thread.sleep(30000);
		Refresh();
		ITViewTicketValidationFields();
		ParentTicketClick();
		ITViewTicketValidationFields();
}
}


