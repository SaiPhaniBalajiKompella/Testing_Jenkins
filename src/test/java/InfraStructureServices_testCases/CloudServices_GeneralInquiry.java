package InfraStructureServices_testCases;

import java.util.ResourceBundle;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import pageObjects.InfraStructureServices_POM;


public class CloudServices_GeneralInquiry extends JIRA_SSOLogin{
	public ResourceBundle rb;
	int i=1;

	@Test(priority=2)
	public void CloudServices() throws InterruptedException 

	{

		InfraStructureServices_POM CloudServices=new InfraStructureServices_POM(driver);
		CloudServices.InfraModuleSelection();
		driver.switchTo().frame("rw_iframe");
		CloudServices.CategoryValue();
		CloudServices.Infra_Category_Enter();
		CloudServices.SubCategoryValue();
		CloudServices.Infra_SubCategory_Enter();
		CloudServices.EnterJustification();
		driver.switchTo().parentFrame();
		CloudServices.CREATE();
		Thread.sleep(15000);
		Refresh();
		ValidatingPortal();
		CloudServices.ItViewNavigation();
		windowhandles();
		Refresh();
		ITViewTicketValidationFields();
		CloudServices.SubtaskDescriptionClick();
		Thread.sleep(2000);
		ITViewTicketValidationFields();
		CloudServices.EDITTransition();
		CloudServices.AssignmentGroup();
		EstimateSize();
		CloudServices.UPDATE();
		Thread.sleep(30000);
		CloudServices.EDITTransition();
		CloudServices.Assigntome();
		CloudServices.UPDATE();
		Thread.sleep(30000);
		CloudServices.WORKINPROGRESS();
		Thread.sleep(5000);
		CloudServices.CloseTrans();
		CloseCode();
		CloudServices.closenotes();
		ActualSize();
		InfraComments();
		Thread.sleep(3000);
		driver.switchTo().parentFrame();
		CloudServices.closebutton();
		Thread.sleep(30000);
		Refresh();
		ITViewTicketValidationFields();
		ParentTicketClick();
		ITViewTicketValidationFields();
}
	
}