package SmokeTesting_Automation;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import InfraStructureServices_testCases.JIRA_SSOLogin;
import pageObjects.SmokeTesting_POM;

public class JiraET_Enhancement  extends  JIRA_SSOLogin {
	@Test(priority=2)
	public void InfraServices() throws InterruptedException 

	{

		SmokeTesting_POM JiraETServices=new SmokeTesting_POM(driver);
		JiraETServices.JiraETModuleSelection_ET();
		Thread.sleep(5000);
		driver.switchTo().frame("rw_iframe");
		JiraETServices.Jira_AG_Need_ET();
		JiraETServices.Jira_AG_NeedInput_ET();
		JiraETServices.Jira_HUN();
		JiraETServices.Jira_AG_TOA_ET();
		JiraETServices.Jira_AG_TOA_ETInput();
		JiraETServices.Jira_RFN();
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
		SwitchUserSmoke_JiraETEnhancement();
		JiraETServices.JIRAET_ONHOLD();
		JiraETServices.JIRAET_Proceed();
		JiraETServices.JIRAET_WIP();
		JiraETServices.JIRAET_CLOSE();
		String TicketURL=driver.getCurrentUrl();
		driver.findElement(By.xpath("//*[@id=\"header-details-user-fullname\"]/span/span/img")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"log_out\"]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/section/div/div/p[3]/a")).click();
		Thread.sleep(8000);
		driver.get(TicketURL);
		
		
		

}
	
}