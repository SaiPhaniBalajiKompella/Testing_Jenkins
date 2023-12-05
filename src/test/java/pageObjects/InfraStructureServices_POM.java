package pageObjects;

import java.util.ResourceBundle;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InfraStructureServices_POM extends BasePage{
	public ResourceBundle rb;

	//Adding BasePage Constructor to the respective POM Class.

	public InfraStructureServices_POM(WebDriver driver) {
		super(driver);
	}

	//Cloud Services Xpaths and Action Methods:

	@FindBy(xpath= "//*[@class='rw_request_type_group rw_request_type_group_separator']/div/div[3]/div[2]/button")
	WebElement InfraStructureServices;

	@FindBy(xpath= "//*[@id='s2id_customfield_13200']/a")
	WebElement Infra_Category;

	@FindBy(xpath= "//*[@id=\"select2-drop\"]/div/input")
	WebElement Infra_CategoryValue;

	@FindBy(xpath= "//*[@id=\"s2id_customfield_13200:1\"]/a")
	WebElement Infra_Subcategory;

	@FindBy(xpath= "//*[@id=\"select2-drop\"]/div/input")
	WebElement Infra_SubCategoryValue;

	@FindBy(xpath= "//*[@id=\"customfield_11543\"]")
	WebElement justification;

	@FindBy(xpath= "//*[@id='rw_popup_dialog']/div[1]/div[3]/button[2]/span")
	WebElement Create;

	@FindBy(xpath= "//*[@id='rw_request_header']/h1/a")
	WebElement ITView;

	@FindBy(xpath= "//table/tbody/tr[1]/td[2]/a")
	WebElement SubtaskDescription;

	@FindBy(xpath= " //*[@id='edit-issue']")
	WebElement Edit;

	@FindBy(xpath= "//*[@id='customfield_11333-field']")
	WebElement Assignmentgroup;

	@FindBy(xpath= "//*[@id='accxiaedit-issue-submit']")
	WebElement Update;

	@FindBy(xpath= "//*[@id='assign-to-me-trigger']")
	WebElement AssignToMe;

	@FindBy(xpath= "//*[@id='action_id_11']/span")
	WebElement WorkInProgress;

	@FindBy(xpath= "//*[@id='action_id_31']/span")
	WebElement CloseTransition;

	@FindBy(xpath= "//*[@id='customfield_11321']")
	WebElement CloseNotes;

	@FindBy(xpath= "//*[@id='accxiaissue-workflow-transition-submit']")
	WebElement CloseButton;

	public void InfraModuleSelection() {
		InfraStructureServices.click();
	}
	public void CategoryValue() {
		Infra_Category.click();
	}
	public void Infra_Category_Enter() throws InterruptedException {
		rb=ResourceBundle.getBundle("InfraStructureServices");
		Infra_CategoryValue.sendKeys(rb.getString("CloudServices"));
		Thread.sleep(1000);
		Infra_CategoryValue.sendKeys(Keys.ENTER);
	}
	public void SubCategoryValue() {
		Infra_Subcategory.click();
	}
	public void Infra_SubCategory_Enter() throws InterruptedException {
		rb=ResourceBundle.getBundle("InfraStructureServices");
		Infra_SubCategoryValue.sendKeys(rb.getString("CloudServicesSubCategory"));
		Thread.sleep(1000);
		Infra_SubCategoryValue.sendKeys(Keys.ENTER);
	}
	public void EnterJustification() throws InterruptedException {
		rb=ResourceBundle.getBundle("InfraStructureServices");
		justification.sendKeys(rb.getString("CloudServicesJustification"));
	}
	public void CREATE() {
		Create.click();
	}
	public void ItViewNavigation() {
		ITView.click();
	}
	public void SubtaskDescriptionClick() {
		SubtaskDescription.click();
	}

	public void EDITTransition() throws InterruptedException {
		Edit.click();
		Thread.sleep(5000);
	}
	public void AssignmentGroup() throws InterruptedException {
		Assignmentgroup.click();
		Thread.sleep(5000);
		Assignmentgroup.sendKeys("TestAssignmentGroupJIRA");
		Thread.sleep(5000);
		Assignmentgroup.sendKeys(Keys.ENTER);
	}

	public void UPDATE() throws InterruptedException {
		Update.click();
		Thread.sleep(5000);
	}
	public void Assigntome() {
		AssignToMe.click();
	}
	public void CloseTrans() throws InterruptedException {
		CloseTransition.click();
		Thread.sleep(5000);
	}
	public void closenotes() {
		CloseNotes.sendKeys("testing");
	}
	public void WORKINPROGRESS() {
		WorkInProgress.click();
	}
	public void closebutton() {
		CloseButton.click();
	}

	//DB Services Xpaths and Action Methods:

	@FindBy(xpath= "//*[@id=\"select2-drop\"]/div/input")
	WebElement Infra_CategoryValueDB;

	@FindBy(xpath= "//*[@id=\"select2-drop\"]/div/input")
	WebElement Infra_SubCategoryValueQER;

	@FindBy(xpath= "//*[@id=\"s2id_customfield_13645\"]/a/span[1]")
	WebElement TypeOfRequests ;

	@FindBy(xpath= "//*[@id=\"select2-drop\"]/div/input")
	WebElement TypeOfRequestsEnter ;

	@FindBy(xpath= "//*[@id=\"content\"]/div[1]/div/div[1]/div/div/form/div[58]/div/div")
	WebElement IsThisHumanaClient  ;

	@FindBy(xpath= "//*[@id=\"select2-drop\"]/div/input")
	WebElement IsThisHumanaClientEnter ;

	@FindBy(xpath= "//*[@id=\"customfield_13509\"]")
	WebElement NameOfSchemas ;

	@FindBy(xpath= "//*[@id=\"customfield_13510\"]")
	WebElement ServersTheyResideOn;

	@FindBy(xpath= "//*[@id=\"customfield_11716\"]")
	WebElement Description ;


	public void Infra_Category_EnterDB() throws InterruptedException {
		rb=ResourceBundle.getBundle("InfraStructureServices");
		Infra_CategoryValueDB.sendKeys(rb.getString("DBServices"));
		Thread.sleep(1000);
		Infra_CategoryValueDB.sendKeys(Keys.ENTER);
	}

	public void Infra_SubCategory_EnterQER() throws InterruptedException {
		rb=ResourceBundle.getBundle("InfraStructureServices");
		Infra_SubCategoryValueQER.sendKeys(rb.getString("QERequests"));
		Thread.sleep(1000);
		Infra_SubCategoryValueQER.sendKeys(Keys.ENTER);
	}
	public void  TypeOfRequestsClick() throws InterruptedException {
		TypeOfRequests.click();
	}
	public void TypeOfRequests_Enter() throws InterruptedException {
		rb=ResourceBundle.getBundle("InfraStructureServices");
		TypeOfRequestsEnter.sendKeys(rb.getString("TypeofRequest1"));
		Thread.sleep(1000);
		TypeOfRequestsEnter.sendKeys(Keys.ENTER);
	}
	public void  IsThisHumanaClientClick() throws InterruptedException {
		IsThisHumanaClient.click();
	}
	public void IsThisHumanaClientEnter() throws InterruptedException {
		rb=ResourceBundle.getBundle("InfraStructureServices");
		IsThisHumanaClientEnter.sendKeys(rb.getString("Humana"));
		if(rb.getString("Humana")=="Yes") {
			Thread.sleep(3000);
			IsThisHumanaClientEnter.sendKeys(Keys.ENTER);
		}
		else {
			Thread.sleep(3000);
			IsThisHumanaClientEnter.sendKeys(Keys.DOWN);
			IsThisHumanaClientEnter.sendKeys(Keys.ENTER);
		}
	}

	public void NameOfSchemas() throws InterruptedException {
		rb=ResourceBundle.getBundle("InfraStructureServices");
		NameOfSchemas.sendKeys(rb.getString("CloudServicesJustification"));
	}

	public void ServersTheyresideOn() throws InterruptedException {
		rb=ResourceBundle.getBundle("InfraStructureServices");
		ServersTheyResideOn.sendKeys(rb.getString("CloudServicesJustification"));
	}


	public void Description() throws InterruptedException {
		rb=ResourceBundle.getBundle("InfraStructureServices");
		Description.sendKeys(rb.getString("CloudServicesJustification"));
	}

	//Datacenter Services Xpaths and Action Methods:

	@FindBy(xpath= "//*[@id='s2id_customfield_13200']/a")
	WebElement Infra_Category_DCS;

	@FindBy(xpath= "//*[@id=\"select2-drop\"]/div/input")
	WebElement Infra_CategoryValue_DCS;


	public void CategoryValue_DCS() {
		Infra_Category_DCS.click();
	}
	public void Infra_Category_Enter_DCS() throws InterruptedException {
		rb=ResourceBundle.getBundle("InfraStructureServices");
		Infra_CategoryValue_DCS.sendKeys(rb.getString("DatacenterServices"));
		Thread.sleep(1000);
		Infra_CategoryValue_DCS.sendKeys(Keys.ENTER);
	}

	//EnterPriseMonitoring Services Xpaths and Action Methods:

	@FindBy(xpath= "//*[@id='s2id_customfield_13200']/a")
	WebElement Infra_Category_EM;

	@FindBy(xpath= "//*[@id=\"select2-drop\"]/div/input")
	WebElement Infra_CategoryValue_EM;


	public void CategoryValue_EM() {
		Infra_Category_EM.click();
	}
	public void Infra_Category_Enter_EM() throws InterruptedException {
		rb=ResourceBundle.getBundle("InfraStructureServices");
		Infra_CategoryValue_EM.sendKeys(rb.getString("EnterpriseMonitoring"));
		Thread.sleep(1000);
		Infra_CategoryValue_EM.sendKeys(Keys.ENTER);
	}

	//EnterPriseStorage Services Xpaths and Action Methods:

	@FindBy(xpath= "//*[@id='s2id_customfield_13200']/a")
	WebElement Infra_Category_ES;

	@FindBy(xpath= "//*[@id=\"select2-drop\"]/div/input")
	WebElement Infra_CategoryValue_ES;


	public void CategoryValue_ES() {
		Infra_Category_ES.click();
	}
	public void Infra_Category_Enter_ES() throws InterruptedException {
		rb=ResourceBundle.getBundle("InfraStructureServices");
		Infra_CategoryValue_ES.sendKeys(rb.getString("EnterpriseStorage"));
		Thread.sleep(1000);
		Infra_CategoryValue_ES.sendKeys(Keys.ENTER);
	}

	//HadoopEngineering Services Xpaths and Action Methods:

	@FindBy(xpath= "//*[@id='s2id_customfield_13200']/a")
	WebElement Infra_Category_HE;

	@FindBy(xpath= "//*[@id=\"select2-drop\"]/div/input")
	WebElement Infra_CategoryValue_HE;


	public void CategoryValue_HE() {
		Infra_Category_HE.click();
	}
	public void Infra_Category_Enter_HE() throws InterruptedException {
		rb=ResourceBundle.getBundle("InfraStructureServices");
		Infra_CategoryValue_HE.sendKeys(rb.getString("HadoopEngineering"));
		Thread.sleep(1000);
		Infra_CategoryValue_HE.sendKeys(Keys.ENTER);
	}

	//ITSM Services Xpaths and Action Methods:

	@FindBy(xpath= "//*[@id='s2id_customfield_13200']/a")
	WebElement Infra_Category_ITSM;

	@FindBy(xpath= "//*[@id=\"select2-drop\"]/div/input")
	WebElement Infra_CategoryValue_ITSM;


	public void CategoryValue_ITSM() {
		Infra_Category_ITSM.click();
	}
	public void Infra_Category_Enter_ITSM() throws InterruptedException {
		rb=ResourceBundle.getBundle("InfraStructureServices");
		Infra_CategoryValue_ITSM.sendKeys(rb.getString("ITSMServices"));
		Thread.sleep(1000);
		Infra_CategoryValue_ITSM.sendKeys(Keys.ENTER);
	}

	//Kubernetes Services Xpaths and Action Methods:

	@FindBy(xpath= "//*[@id='s2id_customfield_13200']/a")
	WebElement Infra_Category_KS;

	@FindBy(xpath= "//*[@id=\"select2-drop\"]/div/input")
	WebElement Infra_CategoryValue_KS;


	public void CategoryValue_KS() {
		Infra_Category_KS.click();
	}
	public void Infra_Category_Enter_KS() throws InterruptedException {
		rb=ResourceBundle.getBundle("InfraStructureServices");
		Infra_CategoryValue_KS.sendKeys(rb.getString("KubernetesServices"));
		Thread.sleep(1000);
		Infra_CategoryValue_KS.sendKeys(Keys.ENTER);
	}
	//Networking Services Xpaths and Action Methods:

	@FindBy(xpath= "//*[@id='s2id_customfield_13200']/a")
	WebElement Infra_Category_NS;

	@FindBy(xpath= "//*[@id=\"select2-drop\"]/div/input")
	WebElement Infra_CategoryValue_NS;


	public void CategoryValue_NS() {
		Infra_Category_NS.click();
	}
	public void Infra_Category_Enter_NS() throws InterruptedException {
		rb=ResourceBundle.getBundle("InfraStructureServices");
		Infra_CategoryValue_NS.sendKeys(rb.getString("NetworkingServices"));
		Thread.sleep(1000);
		Infra_CategoryValue_NS.sendKeys(Keys.ENTER);
	}

	//OKTA SERVICES Xpaths and Action Methods:

	@FindBy(xpath= "//*[@id='s2id_customfield_13200']/a")
	WebElement Infra_Category_OS;

	@FindBy(xpath= "//*[@id=\"select2-drop\"]/div/input")
	WebElement Infra_CategoryValue_OS;


	public void CategoryValue_OS() {
		Infra_Category_OS.click();
	}
	public void Infra_Category_Enter_OS() throws InterruptedException {
		rb=ResourceBundle.getBundle("InfraStructureServices");
		Infra_CategoryValue_OS.sendKeys(rb.getString("OKTAServices"));
		Thread.sleep(1000);
		Infra_CategoryValue_OS.sendKeys(Keys.ENTER);
	}

	//Platform Engineering Xpaths and Action Methods:

	@FindBy(xpath= "//*[@id='s2id_customfield_13200']/a")
	WebElement Infra_Category_PE;

	@FindBy(xpath= "//*[@id=\"select2-drop\"]/div/input")
	WebElement Infra_CategoryValue_PE;


	public void CategoryValue_PE() {
		Infra_Category_PE.click();
	}
	public void Infra_Category_Enter_PE() throws InterruptedException {
		rb=ResourceBundle.getBundle("InfraStructureServices");
		Infra_CategoryValue_PE.sendKeys(rb.getString("PlatformEngineering"));
		Thread.sleep(1000);
		Infra_CategoryValue_PE.sendKeys(Keys.ENTER);
	}


	//Tableau Services Xpaths and Action Methods:

	@FindBy(xpath= "//*[@id='s2id_customfield_13200']/a")
	WebElement Infra_Category_TS;

	@FindBy(xpath= "//*[@id=\"select2-drop\"]/div/input")
	WebElement Infra_CategoryValue_TS;


	public void CategoryValue_TS() {
		Infra_Category_TS.click();
	}
	public void Infra_Category_Enter_TS() throws InterruptedException {
		rb=ResourceBundle.getBundle("InfraStructureServices");
		Infra_CategoryValue_TS.sendKeys(rb.getString("TableauServices"));
		Thread.sleep(1000);
		Infra_CategoryValue_TS.sendKeys(Keys.ENTER);
	}

	//Unix Engineering Xpaths and Action Methods:

	@FindBy(xpath= "//*[@id='s2id_customfield_13200']/a")
	WebElement Infra_Category_UE;

	@FindBy(xpath= "//*[@id=\"select2-drop\"]/div/input")
	WebElement Infra_CategoryValue_UE;


	public void CategoryValue_UE() {
		Infra_Category_UE.click();
	}
	public void Infra_Category_Enter_UE() throws InterruptedException {
		rb=ResourceBundle.getBundle("InfraStructureServices");
		Infra_CategoryValue_UE.sendKeys(rb.getString("UnixEngineering"));
		Thread.sleep(1000);
		Infra_CategoryValue_UE.sendKeys(Keys.ENTER);
	}
	
	//Windows Engineering Xpaths and Action Methods:

		@FindBy(xpath= "//*[@id='s2id_customfield_13200']/a")
		WebElement Infra_Category_WE;

		@FindBy(xpath= "//*[@id=\"select2-drop\"]/div/input")
		WebElement Infra_CategoryValue_WE;
		
		@FindBy(xpath= "//*[@id=\"select2-drop\"]/div/input")
		WebElement Interaction;
		
		@FindBy(xpath= "//*[@id=\"select2-drop\"]/div/input")
		WebElement DOchange;
		
		@FindBy(xpath= "//*[@id=\"select2-drop\"]/div/input")
		WebElement AccountOwner;
		
		@FindBy(xpath= "//*[@id=\"select2-drop\"]/div/input")
		WebElement Domain;
		
		@FindBy(xpath= "//*[@id=\"select2-drop\"]/div/input")
		WebElement ServiceAccountName;
		
		@FindBy(xpath= "//*[@id=\"select2-drop\"]/div/input")
		WebElement TypeOfAccount;

		public void CategoryValue_WE() {
			Infra_Category_WE.click();
		}
		public void Infra_Category_Enter_WE() throws InterruptedException {
			rb=ResourceBundle.getBundle("InfraStructureServices");
			Infra_CategoryValue_WE.sendKeys(rb.getString("WindowsEngineering"));
			Thread.sleep(1000);
			Infra_CategoryValue_WE.sendKeys(Keys.ENTER);
		}
		
		public void Infra_SubCategory_Enter_WE_ServiceAccountCreation() throws InterruptedException {
			rb=ResourceBundle.getBundle("InfraStructureServices");
			Infra_SubCategoryValue.sendKeys(rb.getString("WindowsServiceAccountCreation"));
			Thread.sleep(1000);
			Infra_SubCategoryValue.sendKeys(Keys.ENTER);
		}
}
