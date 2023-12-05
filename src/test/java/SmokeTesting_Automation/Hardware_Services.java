package SmokeTesting_Automation;

import org.testng.annotations.Test;

import InfraStructureServices_testCases.JIRA_SSOLogin;
import pageObjects.SmokeTesting_POM;

public class Hardware_Services extends JIRA_SSOLogin{

	@Test(priority=2)
	public void HardwareServices() throws InterruptedException 

	{

		SmokeTesting_POM HardwareServices=new SmokeTesting_POM(driver);
		HardwareServices.HardwareModuleSelection();
		driver.switchTo().frame("rw_iframe");
		HardwareServices.HardwareCategory();
		HardwareServices.HardwareItemInput();
		HardwareServices.Activity_Action();
		HardwareServices.ActivityActionInput();
		HardwareServices.ConfigItem();
		HardwareServices.AvailableAsset();
		HardwareServices.AvailableAssetInput();
		HardwareServices.RAM();
		HardwareServices.Location();
		HardwareServices.UserLocationInput();
		HardwareServices.EnterJustification();
		driver.switchTo().parentFrame();
		HardwareServices.CREATE();
		Thread.sleep(15000);
		Refresh();
		ValidatingPortal();
		HardwareServices.ItViewNavigation();
		windowhandles();
		Refresh();
		SwitchUserSmoke_ManagerApproval();
		Refresh();
		SwitchUserSmoke_ITApproval();
		driver.navigate().refresh();
		Thread.sleep(5000);
		HardwareServices.SubtaskDescriptionClick();
		Thread.sleep(2000);
		HardwareServices.EDITTransition();
		HardwareServices.AssignmentGroup();
		EstimateSize();
		HardwareServices.UPDATE();
		Thread.sleep(5000);
		HardwareServices.EDITTransition();
		HardwareServices.Assigntome();
		HardwareServices.UPDATE();
		Thread.sleep(5000);
		HardwareServices.WORKINPROGRESS_Hardware();
		Thread.sleep(5000);
		HardwareServices.CloseTrans_Hardware();
		CloseCode();
		HardwareServices.closenotes();
		ActualSize();
		InfraComments();
		Thread.sleep(3000);
		driver.switchTo().parentFrame();
		HardwareServices.closebutton();
		Thread.sleep(15000);
		Refresh();
		ParentTicketClick();
        System.out.println("Hardware Services Smoke Testing is Completed");
		ITViewTicketValidationFields();
	}

}
