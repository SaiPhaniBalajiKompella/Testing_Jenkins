package InfraStructureServices_testCases;

import java.util.ResourceBundle;

import org.testng.annotations.Test;

import pageObjects.InfraStructureServices_POM;

public class HadoopEngineering_GeneralInquiry extends JIRA_SSOLogin {
	public ResourceBundle rb;
	int i=1;

	@Test(priority=2)
	public void HadoopEngineering() throws InterruptedException 
{
		InfraStructureServices_POM HadoopEngineering=new InfraStructureServices_POM(driver);
		HadoopEngineering.InfraModuleSelection();
		driver.switchTo().frame("rw_iframe");
		HadoopEngineering.CategoryValue_HE();
		HadoopEngineering.Infra_Category_Enter_HE();
		HadoopEngineering.SubCategoryValue();
		HadoopEngineering.Infra_SubCategory_Enter();
		HadoopEngineering.EnterJustification();
		driver.switchTo().parentFrame();
		HadoopEngineering.CREATE();
		Thread.sleep(15000);
		Refresh();
		ValidatingPortal();
		HadoopEngineering.ItViewNavigation();
		windowhandles();
		Refresh();
		ITViewTicketValidationFields();
		HadoopEngineering.SubtaskDescriptionClick();
		Thread.sleep(2000);
		ITViewTicketValidationFields();
		HadoopEngineering.EDITTransition();
		HadoopEngineering.AssignmentGroup();
		EstimateSize();
		HadoopEngineering.UPDATE();
		Thread.sleep(30000);
		HadoopEngineering.EDITTransition();
		HadoopEngineering.Assigntome();
		HadoopEngineering.UPDATE();
		Thread.sleep(30000);
		HadoopEngineering.WORKINPROGRESS();
		Thread.sleep(5000);
		HadoopEngineering.CloseTrans();
		CloseCode();
		HadoopEngineering.closenotes();
		ActualSize();
		InfraComments();
		Thread.sleep(3000);
		driver.switchTo().parentFrame();
		HadoopEngineering.closebutton();
		Thread.sleep(30000);
		Refresh();
		ITViewTicketValidationFields();
		ParentTicketClick();
		ITViewTicketValidationFields();
}
}


