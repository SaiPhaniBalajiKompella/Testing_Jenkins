package InfraStructureServices_testCases;

import java.util.ResourceBundle;

import org.testng.annotations.Test;

import pageObjects.InfraStructureServices_POM;

public class NetworkingServices_GeneralInquiry extends JIRA_SSOLogin {
	public ResourceBundle rb;
	int i=1;

	@Test(priority=2)
	public void NetworkingServices() throws InterruptedException 
{
		InfraStructureServices_POM NetworkingServices =new InfraStructureServices_POM(driver);
		NetworkingServices.InfraModuleSelection();
		driver.switchTo().frame("rw_iframe");
		NetworkingServices.CategoryValue_NS();
		NetworkingServices.Infra_Category_Enter_NS();
		NetworkingServices.SubCategoryValue();
		NetworkingServices.Infra_SubCategory_Enter();
		NetworkingServices.EnterJustification();
		driver.switchTo().parentFrame();
		NetworkingServices.CREATE();
		Thread.sleep(15000);
		Refresh();
		ValidatingPortal();
		NetworkingServices.ItViewNavigation();
		windowhandles();
		Refresh();
		ITViewTicketValidationFields();
		NetworkingServices.SubtaskDescriptionClick();
		Thread.sleep(2000);
		ITViewTicketValidationFields();
		NetworkingServices.EDITTransition();
		NetworkingServices.AssignmentGroup();
		EstimateSize();
		NetworkingServices.UPDATE();
		Thread.sleep(30000);
		NetworkingServices.EDITTransition();
		NetworkingServices.Assigntome();
		NetworkingServices.UPDATE();
		Thread.sleep(30000);
		NetworkingServices.WORKINPROGRESS();
		Thread.sleep(5000);
		NetworkingServices.CloseTrans();
		CloseCode();
		NetworkingServices.closenotes();
		ActualSize();
		InfraComments();
		Thread.sleep(3000);
		driver.switchTo().parentFrame();
		NetworkingServices.closebutton();
		Thread.sleep(30000);
		Refresh();
		ITViewTicketValidationFields();
		ParentTicketClick();
		ITViewTicketValidationFields();
}
}


