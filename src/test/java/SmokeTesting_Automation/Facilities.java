package SmokeTesting_Automation;

import org.testng.annotations.Test;

import InfraStructureServices_testCases.JIRA_SSOLogin;
import pageObjects.SmokeTesting_POM;

public class Facilities extends JIRA_SSOLogin {
	
	@Test(priority=2)
	public void FacilitiesServices() throws InterruptedException 

	{

		SmokeTesting_POM Facilities=new SmokeTesting_POM(driver);
		Facilities.FacilitiesModuleSelection();
		Thread.sleep(5000);
		driver.switchTo().frame("rw_iframe");
		Facilities.FacilitiesCategory();
		Facilities.FacilitiesCategoryInput();
		Facilities.Location();
		Facilities.UserLocationInput();
		Facilities.CurrentSeat();
		Facilities.NewSeat();
		Facilities.ShortDescription();
		Facilities.DetailedDescription();
		driver.switchTo().parentFrame();
		Facilities.CREATE();
		Thread.sleep(15000);
		Refresh();
		ValidatingPortal();
		Facilities.ItViewNavigation();
		windowhandles();
		Refresh();
		SwitchUserSmoke_Facilities();
		Refresh();
		Thread.sleep(5000);
		Facilities.SubtaskDescriptionClick();
		Thread.sleep(2000);
		Facilities.EDITTransition();
		Facilities.AssignmentGroup();
		EstimateSize();
		Facilities.UPDATE();
		Thread.sleep(5000);
		Facilities.EDITTransition();
		Facilities.Assigntome();
		Facilities.UPDATE();
		Thread.sleep(5000);
		Facilities.WORKINPROGRESS_Software();
		Thread.sleep(3000);
		Facilities.CloseTrans_Software();
		CloseCode();
		Facilities.closenotes();
		ActualSize();
		InfraComments();
		Thread.sleep(3000);
		driver.switchTo().parentFrame();
		Facilities.closebutton();
		Thread.sleep(15000);
		Refresh();
		ParentTicketClick();
        System.out.println("Facilities Smoke Testing is Completed");
		ITViewTicketValidationFields();
		
		
		
		
		
		

}
	
}