package SmokeTesting_Automation;

import org.testng.annotations.Test;

import InfraStructureServices_testCases.JIRA_SSOLogin;
import pageObjects.SmokeTesting_POM;

public class Generic_Service_Request extends JIRA_SSOLogin {
	

	@Test(priority=2)
	public void GSRServices() throws InterruptedException 

	{

		SmokeTesting_POM GSR=new SmokeTesting_POM(driver);
		GSR.GSRModuleSelection();
		Thread.sleep(5000);
		driver.switchTo().frame("rw_iframe");
		GSR.GSRRequestType();
		GSR.GSRRequestTypeInput();
		GSR.GSRCategory();
		GSR.GSRCategoryInput();
		GSR.GSRSubCategory();
		GSR.GSRSubCategoryInput();
		GSR.RequestSummary();
		GSR.RequiredDescription();
		driver.switchTo().parentFrame();
		GSR.CREATE();
		Thread.sleep(15000);
		Refresh();
		ValidatingPortal();
		GSR.ItViewNavigation();
		windowhandles();
		Refresh();
		GSR.EDITTransition();
		GSR.AssignmentGroup();
		EstimateSize();
		GSR.UPDATE();
		Thread.sleep(5000);
		GSR.EDITTransition();
		GSR.Assigntome();
		GSR.UPDATE();
		Thread.sleep(5000);
		GSR.WORKINPROGRESS_GSR();
		Thread.sleep(3000);
		GSR.CloseTrans_GSR();
		CloseCode();
		GSR.closenotes();
		ActualSize();
		InfraComments();
		Thread.sleep(3000);
		driver.switchTo().parentFrame();
		GSR.closebutton();
		Thread.sleep(15000);
		Refresh();
        System.out.println("GSR Smoke Testing is Completed");
        
}
	
}
