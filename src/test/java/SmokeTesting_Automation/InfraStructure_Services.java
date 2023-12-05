package SmokeTesting_Automation;

import org.testng.annotations.Test;

import InfraStructureServices_testCases.JIRA_SSOLogin;
import pageObjects.SmokeTesting_POM;

public class InfraStructure_Services extends  JIRA_SSOLogin{
	@Test(priority=2)
	public void InfraServices() throws InterruptedException 

	{

		SmokeTesting_POM InfraServices=new SmokeTesting_POM(driver);
		InfraServices.InfraModuleSelection();
		Thread.sleep(5000);
		driver.switchTo().frame("rw_iframe");
		InfraServices.InfraCategory();
		InfraServices.InfraCategoryInput();
		InfraServices.InfraSubCategory();
		InfraServices.InfraSubCategoryInput();
		InfraServices.RequestType();
		InfraServices.RequestTypeInput();
		InfraServices.Vcentername();
		InfraServices.Clustername();
		InfraServices.Datastorename();
		InfraServices.Currentsize();
		InfraServices.AmountIncrease();
		InfraServices.EnterJustification_Infra();
		driver.switchTo().parentFrame();
		InfraServices.CREATE();
		Thread.sleep(15000);
		Refresh();
		ValidatingPortal();
		InfraServices.ItViewNavigation();
		windowhandles();
		Refresh();
		SwitchUserSmoke_ManagerApproval();
		Refresh();
		SwitchUserSmoke_UserApproval();
		Refresh();
		Thread.sleep(8000);
		InfraServices.SubtaskDescriptionClick();
		Thread.sleep(2000);
		Thread.sleep(2000);
		InfraServices.EDITTransition();
		InfraServices.AssignmentGroup();
		EstimateSize();
		InfraServices.UPDATE();
		Thread.sleep(5000);
		InfraServices.EDITTransition();
		InfraServices.Assigntome();
		InfraServices.UPDATE();
		Thread.sleep(5000);
		InfraServices.WORKINPROGRESS_Software();
		Thread.sleep(3000);
		InfraServices.CloseTrans_Software();
		CloseCode();
		InfraServices.closenotes();
		ActualSize();
		InfraComments();
		Thread.sleep(3000);
		driver.switchTo().parentFrame();
		InfraServices.closebutton();
		Thread.sleep(15000);
		Refresh();
		ParentTicketClick();
		System.out.println("Infra Services Smoke Testing is Completed");
		ITViewTicketValidationFields();










	}
}