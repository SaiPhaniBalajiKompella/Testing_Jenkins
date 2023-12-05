package SmokeTesting_Automation;

import org.testng.annotations.Test;

import InfraStructureServices_testCases.JIRA_SSOLogin;
import pageObjects.SmokeTesting_POM;

public class Software_Services extends  JIRA_SSOLogin{



	@Test(priority=2)
	public void SoftwareServices() throws InterruptedException 

	{

		SmokeTesting_POM SoftwareServices=new SmokeTesting_POM(driver);
		SoftwareServices.SoftwareModuleSelection();
		driver.switchTo().frame("rw_iframe");
		SoftwareServices.SoftwareCategory();
		SoftwareServices.SoftwareItemInput();
		SoftwareServices.Activity_ActionSoftware();
		SoftwareServices.ActivityActionInput_Software();
		SoftwareServices.SelectApplication();
		SoftwareServices.SelectApplicationInput();
		SoftwareServices.Description();
		SoftwareServices.EnterJustification();
		driver.switchTo().parentFrame();
		SoftwareServices.CREATE();
		Thread.sleep(15000);
		Refresh();
		ValidatingPortal();
		SoftwareServices.ItViewNavigation();
		windowhandles();
		Refresh();
		SwitchUserSmoke_ManagerApproval();
		Refresh();
		SwitchUserSmoke_ITApproval_Onshore();
		Refresh();
		Thread.sleep(15000);
		SoftwareServices.SubtaskDescriptionClick();
		Thread.sleep(2000);
		SoftwareServices.EDITTransition();
		SoftwareServices.AssignmentGroup();
		EstimateSize();
		SoftwareServices.UPDATE();
		Thread.sleep(10000);
		SoftwareServices.EDITTransition();
		SoftwareServices.Assigntome();
		SoftwareServices.UPDATE();
		Thread.sleep(8000);
		SoftwareServices.WORKINPROGRESS_Software();
		Thread.sleep(3000);
		SoftwareServices.CloseTrans_Software();
		CloseCode();
		SoftwareServices.closenotes();
		ActualSize();
		InfraComments();
		Thread.sleep(3000);
		driver.switchTo().parentFrame();
		SoftwareServices.closebutton();
		Thread.sleep(15000);
		Refresh();
		ParentTicketClick();
        System.out.println("Software Services Smoke Testing is Completed");
		ITViewTicketValidationFields();
	}











}
