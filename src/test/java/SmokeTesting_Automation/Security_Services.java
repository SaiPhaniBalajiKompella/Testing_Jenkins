package SmokeTesting_Automation;

import org.testng.annotations.Test;

import InfraStructureServices_testCases.JIRA_SSOLogin;
import pageObjects.SmokeTesting_POM;

public class Security_Services extends JIRA_SSOLogin{
	@Test(priority=2)
	public void SecurityServices() throws InterruptedException 

	{

		SmokeTesting_POM SS=new SmokeTesting_POM(driver);
		SS.SecurityModuleSelection();
		Thread.sleep(5000);
		driver.switchTo().frame("rw_iframe");
		SS.SecurityRequestType();
		SS.SecurityRequestTypeInput();
		SS.SecurityCategoryType();
		Thread.sleep(5000);
		SS.SecurityCategoryTypeInput();
		driver.switchTo().parentFrame();
		SS.CREATE();
		Thread.sleep(15000);
		Refresh();
		ValidatingPortal();
		SS.ItViewNavigation();
		windowhandles();
		Refresh();
		SwitchUserSmoke_SS();
		Refresh();
		Thread.sleep(10000);
		SS.SubtaskDescriptionClick();
		Thread.sleep(2000);
		SS.EDITTransition();
		SS.AssignmentGroup();
		EstimateSize();
		SS.UPDATE();
		Thread.sleep(10000);
		SS.EDITTransition();
		SS.Assigntome();
		SS.UPDATE();
		Thread.sleep(8000);
		SS.WORKINPROGRESS_Software();
		Thread.sleep(3000);
	    SS.CloseTrans_Software();
		CloseCode();
		SS.closenotes();
		ActualSize();
		InfraComments();
		Thread.sleep(3000);
		driver.switchTo().parentFrame();
		SS.closebutton();
		Thread.sleep(15000);
		Refresh();
		ParentTicketClick();
        System.out.println("Security Services Smoke Testing is Completed");
		ITViewTicketValidationFields();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	
}