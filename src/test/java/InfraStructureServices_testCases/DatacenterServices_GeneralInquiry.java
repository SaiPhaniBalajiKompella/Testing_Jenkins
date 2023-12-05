package InfraStructureServices_testCases;

import java.util.ResourceBundle;

import org.testng.annotations.Test;

import pageObjects.InfraStructureServices_POM;

public class DatacenterServices_GeneralInquiry extends JIRA_SSOLogin {
	
	public ResourceBundle rb;
	int i=1;

	@Test(priority=2)
	public void DatacenterServices() throws InterruptedException 

	{

		InfraStructureServices_POM DatacenterServices=new InfraStructureServices_POM(driver);
		DatacenterServices.InfraModuleSelection();
		driver.switchTo().frame("rw_iframe");
		DatacenterServices.CategoryValue_DCS();
		DatacenterServices.Infra_Category_Enter_DCS();
		DatacenterServices.SubCategoryValue();
		DatacenterServices.Infra_SubCategory_Enter();
		DatacenterServices.EnterJustification();
		driver.switchTo().parentFrame();
		DatacenterServices.CREATE();
		Thread.sleep(15000);
		Refresh();
		ValidatingPortal();
		DatacenterServices.ItViewNavigation();
		windowhandles();
		Refresh();
		ITViewTicketValidationFields();
		DatacenterServices.SubtaskDescriptionClick();
		Thread.sleep(2000);
		ITViewTicketValidationFields();
		DatacenterServices.EDITTransition();
		DatacenterServices.AssignmentGroup();
		EstimateSize();
		DatacenterServices.UPDATE();
		Thread.sleep(30000);
		DatacenterServices.EDITTransition();
		DatacenterServices.Assigntome();
		DatacenterServices.UPDATE();
		Thread.sleep(30000);
		DatacenterServices.WORKINPROGRESS();
		Thread.sleep(5000);
		DatacenterServices.CloseTrans();
		CloseCode();
		DatacenterServices.closenotes();
		ActualSize();
		InfraComments();
		Thread.sleep(3000);
		driver.switchTo().parentFrame();
		DatacenterServices.closebutton();
		Thread.sleep(30000);
		Refresh();
		ITViewTicketValidationFields();
		ParentTicketClick();
		ITViewTicketValidationFields();
	}
}
