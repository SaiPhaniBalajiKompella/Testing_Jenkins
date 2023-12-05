package SmokeTesting_Automation;

import org.testng.annotations.Test;

import InfraStructureServices_testCases.JIRA_SSOLogin;
import pageObjects.SmokeTesting_POM;

public class JiraET_Access extends  JIRA_SSOLogin {
	
	@Test(priority=2)
	public void InfraServices() throws InterruptedException 

	{

		SmokeTesting_POM JiraETServices=new SmokeTesting_POM(driver);
		JiraETServices.JiraETModuleSelection_Access();
		Thread.sleep(5000);
		driver.switchTo().frame("rw_iframe");
		JiraETServices.JiraEnv();
		JiraETServices.JiraEnvInput();
		JiraETServices.JiraAccess();
		JiraETServices.JiraAccessInput();
		JiraETServices.EnterJustification();
		driver.switchTo().parentFrame();
		JiraETServices.CREATE();
		Thread.sleep(15000);
		Refresh();
		ValidatingPortal();
		JiraETServices.ItViewNavigation();
		windowhandles();
		Refresh();
		SwitchUserSmoke_JiraETAccess();
		Refresh();
		Thread.sleep(5000);
		JiraETServices.SubtaskDescriptionClick();
		Thread.sleep(2000);
		JiraETServices.EDITTransition();
		JiraETServices.AssignmentGroup();
		EstimateSize();
		JiraETServices.UPDATE();
		Thread.sleep(5000);
		JiraETServices.EDITTransition();
		JiraETServices.Assigntome();
		JiraETServices.UPDATE();
		Thread.sleep(5000);
		JiraETServices.WORKINPROGRESS_Software();
		Thread.sleep(3000);
		JiraETServices.CloseTrans_Software();
		CloseCode();
		JiraETServices.closenotes();
		ActualSize();
		InfraComments();
		Thread.sleep(3000);
		driver.switchTo().parentFrame();
		JiraETServices.closebutton();
		Thread.sleep(15000);
		Refresh();
		ParentTicketClick();
        System.out.println("JiraET Access Smoke Testing is Completed");
        ITViewTicketValidationFields();
        
}
}