package InfraStructureServices_testCases;

import java.util.ResourceBundle;

import org.testng.annotations.Test;

import pageObjects.InfraStructureServices_POM;

public class DataBaseServices_QualityEngineRequests extends JIRA_SSOLogin {
	public ResourceBundle rb;
	int i=1;

	@Test(priority=2)
	public void DBServices_QER() throws InterruptedException 
	{
		//Type of Request- Create Database Link Between Schemas
		
		InfraStructureServices_POM DBServices=new InfraStructureServices_POM(driver);
		DBServices.InfraModuleSelection();
		driver.switchTo().frame("rw_iframe");
		DBServices.CategoryValue();
		DBServices.Infra_Category_EnterDB();
		DBServices.SubCategoryValue();
		DBServices.Infra_SubCategory_EnterQER();
		DBServices.TypeOfRequestsClick();
		DBServices.TypeOfRequests_Enter();
		DBServices.IsThisHumanaClientClick();
		DBServices.IsThisHumanaClientEnter();
		Thread.sleep(5000);
		DBServices.NameOfSchemas();
		DBServices.ServersTheyresideOn();
		DBServices.Description();
		DBServices.EnterJustification();
		driver.switchTo().parentFrame();
		DBServices.CREATE();
		Thread.sleep(20000);
		ValidatingPortal();
		DBServices.ItViewNavigation();
		windowhandles();
		Thread.sleep(5000);
		Refresh();
		rb=ResourceBundle.getBundle("InfraStructureServices");
		if((rb.getString("Humana"))=="Yes") {
			SwitchUser();
			Refresh();
			DBServices.SubtaskDescriptionClick();
			Thread.sleep(2000);
			ITViewTicketValidationFields();
			DBServices.EDITTransition();
			DBServices.AssignmentGroup();
			Thread.sleep(5000);
			EstimateSize();
			DBServices.UPDATE();
			Thread.sleep(30000);
			DBServices.EDITTransition();
			DBServices.Assigntome();
			DBServices.UPDATE();
			Thread.sleep(30000);
			DBServices.WORKINPROGRESS();
			Thread.sleep(5000);
			DBServices.CloseTrans();
			CloseCode();
			DBServices.closenotes();
			ActualSize();
			InfraComments();
			Thread.sleep(3000);
			driver.switchTo().parentFrame();
			DBServices.closebutton();
			Thread.sleep(30000);
			Refresh();
			ITViewTicketValidationFields();
			ParentTicketClick();
			ITViewTicketValidationFields();
		}
		else {
			DBServices.SubtaskDescriptionClick();
			Thread.sleep(2000);
			ITViewTicketValidationFields();
			DBServices.EDITTransition();
			DBServices.AssignmentGroup();
			Thread.sleep(5000);
			EstimateSize();
			DBServices.UPDATE();
			Thread.sleep(30000);
			DBServices.EDITTransition();
			DBServices.Assigntome();
			DBServices.UPDATE();
			Thread.sleep(30000);
			DBServices.WORKINPROGRESS();
			Thread.sleep(5000);
			DBServices.CloseTrans();
			CloseCode();
			DBServices.closenotes();
			ActualSize();
			InfraComments();
			Thread.sleep(3000);
			driver.switchTo().parentFrame();
			DBServices.closebutton();
			Thread.sleep(30000);
			Refresh();
			ITViewTicketValidationFields();
			ParentTicketClick();
			ITViewTicketValidationFields();
		}
		











	}

}
