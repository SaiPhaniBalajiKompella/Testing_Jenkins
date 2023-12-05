package SmokeTesting_Automation;

import org.testng.annotations.Test;

import InfraStructureServices_testCases.JIRA_SSOLogin;
import pageObjects.SmokeTesting_POM;

public class Application_And_Account_Services extends JIRA_SSOLogin{


	@Test(priority=2)
	public void AppAccServices() throws InterruptedException 

	{

		SmokeTesting_POM AppAccServices=new SmokeTesting_POM(driver);
		AppAccServices.AppandAcc_ModuleSelection();
		Thread.sleep(5000);
		driver.switchTo().frame("rw_iframe");
		AppAccServices.AppAccCategory();
		AppAccServices.AppAccCategoryInput();
		AppAccServices.AppAccSubCategory();
		AppAccServices.AppAccSubCategoryInput();
		AppAccServices.Activity_ActionAppAcc();
		AppAccServices.ActivityActionInput_AppAcc();
		AppAccServices.Domain();
		AppAccServices.DomainInput();
		AppAccServices.Desktop();
		AppAccServices.DesktopInput();
		AppAccServices.RequestorManager();
		AppAccServices.ReqManagerInput();
		Thread.sleep(5000);
		AppAccServices.EnterJustification();
		driver.switchTo().parentFrame();
		AppAccServices.CREATE();
		Thread.sleep(15000);
		Refresh();
		ValidatingPortal();
		AppAccServices.ItViewNavigation();
		windowhandles();
		Refresh();
		SwitchUserSmoke_ManagerApproval();
		Refresh();
		SwitchUserSmoke_ITApproval_Onshore_App_ID();
		driver.navigate().refresh();
		Thread.sleep(5000);
		AppAccServices.SubtaskDescriptionClick();
		Thread.sleep(2000);
		AppAccServices.EDITTransition();
		AppAccServices.AssignmentGroup();
		EstimateSize();
		AppAccServices.UPDATE();
		Thread.sleep(5000);
		AppAccServices.EDITTransition();
		AppAccServices.Assigntome();
		AppAccServices.UPDATE();
		Thread.sleep(5000);
		AppAccServices.WORKINPROGRESS_Software();
		Thread.sleep(3000);
		AppAccServices.CloseTrans_Software();
		CloseCode();
		AppAccServices.closenotes();
		ActualSize();
		InfraComments();
		Thread.sleep(3000);
		driver.switchTo().parentFrame();
		AppAccServices.closebutton();
		Thread.sleep(15000);
		Refresh();
		ParentTicketClick();
        System.out.println("App & Acc Services Smoke Testing is Completed");
    	ITViewTicketValidationFields();
	}
}
