package InfraStructureServices_testCases;

import java.util.ResourceBundle;

import org.testng.annotations.Test;

import pageObjects.InfraStructureServices_POM;

public class KubernetesServices_GeneralInquiry extends JIRA_SSOLogin {
	public ResourceBundle rb;
	int i=1;

	@Test(priority=2)
	public void KubernetesServices() throws InterruptedException 
{
		InfraStructureServices_POM KubernetesServices=new InfraStructureServices_POM(driver);
		KubernetesServices.InfraModuleSelection();
		driver.switchTo().frame("rw_iframe");
		KubernetesServices.CategoryValue_KS();
		KubernetesServices.Infra_Category_Enter_KS();
		KubernetesServices.SubCategoryValue();
		KubernetesServices.Infra_SubCategory_Enter();
		KubernetesServices.EnterJustification();
		driver.switchTo().parentFrame();
		KubernetesServices.CREATE();
		Thread.sleep(15000);
		Refresh();
		ValidatingPortal();
		KubernetesServices.ItViewNavigation();
		windowhandles();
		Refresh();
		ITViewTicketValidationFields();
		KubernetesServices.SubtaskDescriptionClick();
		Thread.sleep(2000);
		ITViewTicketValidationFields();
		KubernetesServices.EDITTransition();
		KubernetesServices.AssignmentGroup();
		EstimateSize();
		KubernetesServices.UPDATE();
		Thread.sleep(30000);
		KubernetesServices.EDITTransition();
		KubernetesServices.Assigntome();
		KubernetesServices.UPDATE();
		Thread.sleep(30000);
		KubernetesServices.WORKINPROGRESS();
		Thread.sleep(5000);
		KubernetesServices.CloseTrans();
		CloseCode();
		KubernetesServices.closenotes();
		ActualSize();
		InfraComments();
		Thread.sleep(3000);
		driver.switchTo().parentFrame();
		KubernetesServices.closebutton();
		Thread.sleep(30000);
		Refresh();
		ITViewTicketValidationFields();
		ParentTicketClick();
		ITViewTicketValidationFields();
}
}

