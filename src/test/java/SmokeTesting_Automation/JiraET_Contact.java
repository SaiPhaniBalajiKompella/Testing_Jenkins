package SmokeTesting_Automation;

import org.testng.annotations.Test;

import InfraStructureServices_testCases.JIRA_SSOLogin;
import pageObjects.SmokeTesting_POM;

public class JiraET_Contact extends  JIRA_SSOLogin {
	@Test(priority=2)
	public void InfraServices() throws InterruptedException 

	{

		SmokeTesting_POM JiraETServices=new SmokeTesting_POM(driver);
		JiraETServices.JiraETModuleSelection_CTact();
		Thread.sleep(5000);
		driver.switchTo().frame("rw_iframe");
		JiraETServices.ContactRequestType();
		JiraETServices.ContactRequestTypeInput();
		JiraETServices.ContactHidden();
		driver.switchTo().parentFrame();
		JiraETServices.CREATE();
		Thread.sleep(15000);
		Refresh();
		JiraETServices.ItViewNavigation();
		windowhandles();
		Refresh();
		System.out.println("JiraET Contact Smoke Testing is Completed");
	}
}