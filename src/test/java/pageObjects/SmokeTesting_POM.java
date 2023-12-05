package pageObjects;

import java.util.ResourceBundle;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SmokeTesting_POM extends BasePage{
	public ResourceBundle rb;

	public SmokeTesting_POM(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath= "//*[@id=\"rw_content\"]/div/div[4]/div/div/div/div/div/div/div/div[10]/button")
	WebElement HardWareServices;
	@FindBy(xpath= "//*[@id='s2id_customfield_11373']")
	WebElement HardwareItem;
	@FindBy(xpath= "//*[@id='select2-drop']/div/input")
	WebElement HardwareInput;
	@FindBy(xpath= "//*[@id='s2id_customfield_14000']")
	WebElement Activity_Action_Hardware;
	@FindBy(xpath= "//*[@id='s2id_customfield_12700']")
	WebElement Activity_Action_Software;
	@FindBy(xpath= "//*[@id='s2id_customfield_13680']")
	WebElement Activity_Action_AppAcc;
	@FindBy(xpath= "//*[@id='customfield_11585']")
	WebElement ConfigItem;
	@FindBy(xpath= "//*[@id='s2id_customfield_11586']/a")
	WebElement AvailableAsset;
	@FindBy(xpath= "//*[@id='customfield_11587']")
	WebElement RequiredRAM;
	@FindBy(xpath= "//*[@id='s2id_customfield_12701']")
	WebElement UserLocation;
	@FindBy(xpath= "//*[@id='rw_request_header']/h1/a")
	WebElement ITView;
	@FindBy(xpath= "//*[@id=\"rw_content\"]/div/div[4]/div/div/div/div/div/div/div/div[9]/button")
	WebElement SoftwareServices;
	@FindBy(xpath= "//*[@id='s2id_customfield_11375']/a/span[1]")
	WebElement SoftwareItem;
	@FindBy(xpath= "//*[@id='select2-drop']/div/input")
	WebElement SoftwareInput;
	@FindBy(xpath= "//*[@id=\"rw_content\"]/div/div[4]/div/div/div/div/div/div/div/div[7]/button")
	WebElement InfraStructureServices;
	@FindBy(xpath= "//*[@id=\"rw_content\"]/div/div[4]/div/div/div/div/div/div/div/div[6]/button")
	WebElement AppandAccServices;
	@FindBy(xpath= "//*[@id=\"customfield_11543\"]")
	WebElement justification;
	@FindBy(xpath= "//*[@id=\"customfield_12725\"]")
	WebElement justification_Infra;
	@FindBy(xpath= "//*[@id='rw_popup_dialog']/div[1]/div[3]/button[2]/span")
	WebElement Create;
	@FindBy(xpath= "//table/tbody/tr[1]/td[2]/a")
	WebElement SubtaskDescription;
	@FindBy(xpath= "//table/tbody/tr[2]/td[2]/a")
	WebElement SubtaskDescription2;
	@FindBy(xpath= " //*[@id='edit-issue']")
	WebElement Edit;
	@FindBy(xpath= "//*[@id='customfield_11333-field']")
	WebElement Assignmentgroup;
	@FindBy(xpath= "//*[@id='accxiaedit-issue-submit']")
	WebElement Update;
	@FindBy(xpath= "//*[@id='assign-to-me-trigger']")
	WebElement AssignToMe;
	@FindBy(xpath= "//*[@id='action_id_81']/span")
	WebElement WorkInProgress_Hardware;
	@FindBy(xpath= "//*[@id='action_id_11']/span")
	WebElement WorkInProgress_Software;
	@FindBy(xpath= "//*[@id='action_id_1051']/span")
	WebElement WorkInProgress_GSR;
	@FindBy(xpath= "//*[@id='action_id_1031']/span")
	WebElement Close_GSR;
	@FindBy(xpath= "//*[@id='action_id_91']/span")
	WebElement CloseTransition_Hardware;
	@FindBy(xpath= "//*[@id='action_id_31']/span")
	WebElement CloseTransition_Software;
	@FindBy(xpath= "//*[@id='customfield_11321']")
	WebElement CloseNotes;
	@FindBy(xpath= "//*[@id='accxiaissue-workflow-transition-submit']")
	WebElement CloseButton;
	@FindBy(xpath= "//*[@id='s2id_customfield_13011']/a/span[1]")
	WebElement SelectApplication;
	@FindBy(xpath= "//*[@id=\"customfield_11716\"]")
	WebElement Description;
	@FindBy(xpath= "//*[@id=\"s2id_customfield_13223\"]/a/span[1]")
	WebElement AppAccCategory;
	@FindBy(xpath= "//*[@id=\"s2id_customfield_13223:1\"]/a/span[1]")
	WebElement AppAccSubCategory;
	@FindBy(xpath= "//*[@id='select2-drop']/div/input")
	WebElement AppAccInput;
	@FindBy(xpath= "//*[@id=\"s2id_customfield_13408\"]/a/span[1]")
	WebElement Domain;
	@FindBy(xpath= "//*[@id=\"s2id_customfield_13408:1\"]/a/span[1]")
	WebElement Desktop;
	@FindBy(xpath= "//*[@id=\"s2id_customfield_13409\"]/a/span[1]")
	WebElement ReqManager;
	@FindBy(xpath= "//*[@id=\"s2id_customfield_13200\"]/a/span[1]")
	WebElement InfraCategory;
	@FindBy(xpath= "//*[@id=\"s2id_customfield_13200:1\"]/a/span[1]")
	WebElement InfraSubCategory;
	@FindBy(xpath= "//*[@id='select2-drop']/div/input")
	WebElement InfraInput;
	@FindBy(xpath= "//*[@id=\"s2id_customfield_26500\"]/a/span[1]")
	WebElement RequestType;
	@FindBy(xpath= "//*[@id=\"customfield_27500\"]")
	WebElement Vcenter_Name;
	@FindBy(xpath= "//*[@id=\"customfield_27501\"]")
	WebElement Cluster_Name;
	@FindBy(xpath= "//*[@id=\"customfield_27502\"]")
	WebElement Datastore_Name;
	@FindBy(xpath= "//*[@id=\"customfield_26514\"]")
	WebElement CurrentSize;
	@FindBy(xpath= "//*[@id=\"customfield_27503\"]")
	WebElement Amount_Increase;
	@FindBy(xpath= "//*[@id='rw_content']/div/div[4]/div/div/div/div/div/div/div/div[11]/button")
	WebElement Facilities;
	@FindBy(xpath= "//*[@id=\"s2id_customfield_11548\"]")
	WebElement MoveRequest;
	@FindBy(xpath= "//*[@id='select2-drop']/div/input")
	WebElement FacilitiesInput;
	@FindBy(xpath= "//*[@id=\"customfield_11553\"]")
	WebElement CurrentSeat;
	@FindBy(xpath= "//*[@id=\"customfield_11554\"]")
	WebElement NewSeat;
	@FindBy(xpath= "//*[@id=\"customfield_11558\"]")
	WebElement ShortDescription;
	@FindBy(xpath= "/html/body/div[3]/div[1]/section/main/div/div/div[1]/div/div/form/div[11]/div/div/div[2]/div/div[2]/div/div[2]/div")
	WebElement DetailedDescription;
	@FindBy(xpath= "//*[@id='rw_content']/div/div[4]/div/div/div/div/div/div/div/div[8]/button")
	WebElement SecurityServices;
	@FindBy(xpath= "/html/body/div[3]/div[1]/section/main/div[1]/div/div[1]/div/div/form/div[3]/div/div/a/span[1]")
	WebElement RequestType_Security;
	@FindBy(xpath= "//*[@id='select2-drop']/div/input")
	WebElement SecurityInput;
	@FindBy(xpath= "//*[@id=\"s2id_customfield_11370\"]/a")
	WebElement Category_Security;
	@FindBy(xpath= "//*[@id='rw_content']/div/div[4]/div/div/div/div/div/div/div/div[12]/button")
	WebElement GSR;
	@FindBy(xpath= "//*[@id=\"s2id_customfield_13018\"]/a/span[1]")
	WebElement RequestType_GSR;
	@FindBy(xpath= "//*[@id=\"s2id_customfield_13019\"]/a/span[1]")
	WebElement Category;
	@FindBy(xpath= "//*[@id=\"s2id_customfield_13020\"]/a/span[1]")
	WebElement SubCategory;
	@FindBy(xpath= "//*[@id=\"summary\"]")
	WebElement RequestSummary;
	@FindBy(xpath= "/html/body/div[3]/div[1]/section/main/div/div/div[1]/div/div/form/div[9]/div[1]/div/div[2]/div/div[2]/div/div[2]/div")
	WebElement RequestDescription;
	@FindBy(xpath= "//*[@id='select2-drop']/div/input")
	WebElement GSRInput;
	@FindBy(xpath= "//*[@id='rw_content']/div/div[4]/div/div/div/div/div/div/div/div[18]/button")
	WebElement HRServices;
	@FindBy(xpath= "//*[@id='rw_content']/div/div[4]/div/div/div/div/div/div/div/div[14]/button")
	WebElement JiraETAccess;
	@FindBy(xpath= "//*[@id='select2-drop']/div/input")
	WebElement JiraETInput;
	@FindBy(xpath= "//*[@id=\"s2id_customfield_23403\"]/a")
	WebElement Environment;
	@FindBy(xpath= "//*[@id=\"s2id_customfield_19900\"]/a/span[1]")
	WebElement JiraAccess;
	@FindBy(xpath= "//*[@id='rw_content']/div/div[4]/div/div/div/div/div/div/div/div[15]/button")
	WebElement JiraETAssgngroup;
	@FindBy(xpath= "//*[@id='rw_content']/div/div[4]/div/div/div/div/div/div/div/div[16]/button")
	WebElement JiraETEnhancement;
	@FindBy(xpath= "//*[@id='rw_content']/div/div[4]/div/div/div/div/div/div/div/div[17]/button")
	WebElement Jira_Contact;
	@FindBy(xpath= "//*[@id=\"s2id_customfield_22200\"]/a")
	WebElement JiraContactType;
	@FindBy(xpath= "//*[@id=\"customfield_23201\"]")
	WebElement JiraContactTypeHidden;
	@FindBy(xpath= "//*[@id=\"s2id_customfield_22201\"]/a/span[1]")
	WebElement Jira_AG_Need;
	@FindBy(xpath= "//*[@id='s2id_customfield_20500']/a/span[1]")
	WebElement Jira_AG_Need_ET;
	@FindBy(xpath= "//*[@id='customfield_22202']")
	WebElement Jira_AG_Name;
	@FindBy(xpath= "//*[@id=\"s2id_autogen3\"]")
	WebElement Jira_AG_Members;
	@FindBy(xpath= "//*[@id='s2id_autogen4']")
	WebElement Jira_AG_Owners;
	@FindBy(xpath= "//*[@id=\"customfield_11543\"]")
	WebElement Jira_RFN;
	@FindBy(xpath= "//*[@id=\"s2id_autogen3\"]")
	WebElement JiraETInputAG;
	@FindBy(xpath= "//*[@id=\"s2id_autogen4\"]")
	WebElement JiraETInputAGM;
	@FindBy(xpath= "//*[@id=\"customfield_20502\"]")
	WebElement UrgentNeed;
	@FindBy(xpath= "//*[@id=\"s2id_customfield_20501\"]/a/span[1]")
	WebElement TypeOfAddition;
	@FindBy(xpath= "//*[@id='select2-drop']/div/input")
	WebElement JiraET_Input;
	@FindBy(xpath= "//*[@id=\"action_id_31\"]/span")
	WebElement JIRAET_WIP;
	@FindBy(xpath= "//*[@id=\"action_id_41\"]/span")
	WebElement JIRAET_CLOSE;
	@FindBy(xpath= "//*[@id=\"action_id_61\"]/span")
	WebElement JIRAET_ONHOLD;
	@FindBy(xpath= "//*[@id=\"action_id_131\"]/span")
	WebElement JIRAET_Proceed;
	
	public void JIRAET_Proceed() {
		JIRAET_Proceed.click();
	}
	
	public void JIRAET_WIP() {
		JIRAET_WIP.click();
	}
	public void JIRAET_CLOSE() {
		JIRAET_CLOSE.click();
	}
	public void JIRAET_ONHOLD() {
		JIRAET_ONHOLD.click();
	}
	
	public void Jira_AG_TOA_ET() {
		TypeOfAddition.click();
	}
	public void Jira_AG_TOA_ETInput() throws InterruptedException {
		rb=ResourceBundle.getBundle("SmokeTest");
		JiraET_Input.sendKeys(rb.getString("TypeofAddition"));
		Thread.sleep(1000);
		JiraET_Input.sendKeys(Keys.ENTER);
	}
	

	
	public void Jira_AG_Need() {
		Jira_AG_Need.click();
	}
	public void Jira_AG_NeedInput() throws InterruptedException {
		rb=ResourceBundle.getBundle("SmokeTest");
		JiraETInput.sendKeys(rb.getString("Need"));
		Thread.sleep(1000);
		JiraETInput.sendKeys(Keys.ENTER);
	}
	
	public void Jira_AG_Need_ET() {
		 Jira_AG_Need_ET.click();
	}
	public void Jira_AG_NeedInput_ET() throws InterruptedException {
		rb=ResourceBundle.getBundle("SmokeTest");
		JiraETInput.sendKeys(rb.getString("NeedET"));
		Thread.sleep(1000);
		JiraETInput.sendKeys(Keys.ENTER);
	}
	
	public void Jira_HUN() throws InterruptedException {
		rb=ResourceBundle.getBundle("SmokeTest");
		UrgentNeed.sendKeys(rb.getString("ReasonForNeed"));
	}
	
	public void Jira_AGMembers() {
		Jira_AG_Members.click();
	}
	public void Jira_AG_MembersInput() throws InterruptedException {
		rb=ResourceBundle.getBundle("SmokeTest");
		JiraETInputAG.sendKeys(rb.getString("Assignment_Members"));
		Thread.sleep(1000);
		JiraETInputAG.sendKeys(Keys.ENTER);
	}
	public void Jira_AG_Owners() {
		Jira_AG_Owners.click();
	}
	public void Jira_AG_OwnersInput() throws InterruptedException {
		rb=ResourceBundle.getBundle("SmokeTest");
		 JiraETInputAGM.sendKeys(rb.getString("Assignment_Owner"));
		Thread.sleep(1000);
		 JiraETInputAGM.sendKeys(Keys.ENTER);
	}
	public void Jira_AG_Name() throws InterruptedException {
		rb=ResourceBundle.getBundle("SmokeTest");
		Jira_AG_Name.sendKeys(rb.getString("Assignmentgroup_Name"));
	}
	public void Jira_RFN() throws InterruptedException {
		rb=ResourceBundle.getBundle("SmokeTest");
		Jira_RFN.sendKeys(rb.getString("ReasonForNeed"));
	}
	public void SecurityRequestType() {
		RequestType_Security.click();
	}
	public void SecurityRequestTypeInput() throws InterruptedException {
		rb=ResourceBundle.getBundle("SmokeTest");
		SecurityInput.sendKeys(rb.getString("SecurityRequestType"));
		Thread.sleep(1000);
		SecurityInput.sendKeys(Keys.ENTER);
	}

	public void ContactHidden() throws InterruptedException {
		rb=ResourceBundle.getBundle("SmokeTest");
		JiraContactTypeHidden.sendKeys(rb.getString("ContactHidden"));
	}
	public void ContactRequestType() {
		JiraContactType.click();
	}
	public void ContactRequestTypeInput() throws InterruptedException {
		rb=ResourceBundle.getBundle("SmokeTest");
		JiraETInput.sendKeys(rb.getString("JiraETContact"));
		Thread.sleep(1000);
		JiraETInput.sendKeys(Keys.ENTER);
	}

	public void SecurityCategoryType() {
		Category_Security.click();
	}
	public void SecurityCategoryTypeInput() throws InterruptedException {
		rb=ResourceBundle.getBundle("SmokeTest");
		SecurityInput.sendKeys(rb.getString("SecurityCategory"));
		Thread.sleep(5000);
		SecurityInput.sendKeys(Keys.ENTER);
	}

	public void GSRRequestType() {
		RequestType_GSR.click();
	}
	public void GSRRequestTypeInput() throws InterruptedException {
		rb=ResourceBundle.getBundle("SmokeTest");
		GSRInput.sendKeys(rb.getString("GSRRequestType"));
		Thread.sleep(1000);
		GSRInput.sendKeys(Keys.ENTER);
	}
	public void GSRCategory() {
		Category.click();
	}
	public void GSRCategoryInput() throws InterruptedException {
		rb=ResourceBundle.getBundle("SmokeTest");
		GSRInput.sendKeys(rb.getString("Category"));
		Thread.sleep(1000);
		GSRInput.sendKeys(Keys.ENTER);
	}
	public void GSRSubCategory() {
		SubCategory.click();
	}
	public void GSRSubCategoryInput() throws InterruptedException {
		rb=ResourceBundle.getBundle("SmokeTest");
		GSRInput.sendKeys(rb.getString("SubCategory"));
		Thread.sleep(1000);
		GSRInput.sendKeys(Keys.ENTER);
	}
	public void RequestSummary() throws InterruptedException {
		rb=ResourceBundle.getBundle("SmokeTest");
		RequestSummary.sendKeys(rb.getString("Justification"));
	}

	public void RequiredDescription() throws InterruptedException {
		rb=ResourceBundle.getBundle("SmokeTest");
		WebElement RequestDescription=driver.findElement(By.xpath("//*[@class='wysiwyg-create-request']/div/div[2]/div/div[2]/div/div[2]/p"));
		RequestDescription.click();
		RequestDescription.sendKeys(rb.getString("Justification"));
	}
	public void FacilitiesCategory() {
		MoveRequest.click();
	}

	public void FacilitiesCategoryInput() throws InterruptedException {
		rb=ResourceBundle.getBundle("SmokeTest");
		FacilitiesInput.sendKeys(rb.getString("FacilitiesCategory"));
		Thread.sleep(1000);
		FacilitiesInput.sendKeys(Keys.ENTER);
	}

	public void CurrentSeat() throws InterruptedException {
		rb=ResourceBundle.getBundle("SmokeTest");
		CurrentSeat.sendKeys(rb.getString("Justification"));
	}

	public void NewSeat() throws InterruptedException {
		rb=ResourceBundle.getBundle("SmokeTest");
		NewSeat.sendKeys(rb.getString("Justification"));
	}

	public void ShortDescription() throws InterruptedException {
		rb=ResourceBundle.getBundle("SmokeTest");
		ShortDescription.sendKeys(rb.getString("Justification"));
	}

	public void DetailedDescription() throws InterruptedException {
		rb=ResourceBundle.getBundle("SmokeTest");
		WebElement DetailedDescription=driver.findElement(By.xpath("//*[@class='wysiwyg-create-request']/div/div[2]/div/div[2]/div/div[2]"));
		DetailedDescription.click();
		DetailedDescription.sendKeys(rb.getString("Justification"));
	}

	public void InfraCategory() {
		InfraCategory.click();
	}

	public void InfraSubCategory() {
		InfraSubCategory.click();
	}

	public void InfraCategoryInput() throws InterruptedException {
		rb=ResourceBundle.getBundle("SmokeTest");
		InfraInput.sendKeys(rb.getString("InfraCategory"));
		Thread.sleep(1000);
		InfraInput.sendKeys(Keys.ENTER);
	}

	public void InfraSubCategoryInput() throws InterruptedException {
		rb=ResourceBundle.getBundle("SmokeTest");
		InfraInput.sendKeys(rb.getString("InfraSubCategory"));
		Thread.sleep(1000);
		InfraInput.sendKeys(Keys.ENTER);
	}

	public void RequestType() {
		RequestType.click();
	}

	public void RequestTypeInput() throws InterruptedException {
		rb=ResourceBundle.getBundle("SmokeTest");
		InfraInput.sendKeys(rb.getString("RequestType"));
		Thread.sleep(1000);
		InfraInput.sendKeys(Keys.ENTER);
	}

	public void AppAccCategory() {
		AppAccCategory.click();
	}

	public void AppAccSubCategory() {
		AppAccSubCategory.click();
	}

	public void Domain() {
		Domain.click();
	}

	public void Desktop() {
		Desktop.click();
	}

	public void DomainInput() throws InterruptedException {
		rb=ResourceBundle.getBundle("SmokeTest");
		AppAccInput.sendKeys(rb.getString("Domain"));
		Thread.sleep(1000);
		AppAccInput.sendKeys(Keys.ENTER);
	}

	public void DesktopInput() throws InterruptedException {
		rb=ResourceBundle.getBundle("SmokeTest");
		AppAccInput.sendKeys(rb.getString("Desktop"));
		Thread.sleep(1000);
		AppAccInput.sendKeys(Keys.ENTER);
	}

	public void RequestorManager() {
		ReqManager.click();
	}

	public void ReqManagerInput() throws InterruptedException {
		rb=ResourceBundle.getBundle("SmokeTest");
		AppAccInput.sendKeys(rb.getString("RM"));
		Thread.sleep(3000);
		AppAccInput.sendKeys(Keys.ENTER);
	}

	public void AppAccCategoryInput() throws InterruptedException {
		rb=ResourceBundle.getBundle("SmokeTest");
		AppAccInput.sendKeys(rb.getString("AppAccCategory"));
		Thread.sleep(1000);
		AppAccInput.sendKeys(Keys.ENTER);
	}

	public void AppAccSubCategoryInput() throws InterruptedException {
		rb=ResourceBundle.getBundle("SmokeTest");
		AppAccInput.sendKeys(rb.getString("AppAccSubCategory"));
		Thread.sleep(1000);
		AppAccInput.sendKeys(Keys.ENTER);
	}
	public void Activity_ActionAppAcc() {
		Activity_Action_AppAcc.click();
	}

	public void ActivityActionInput_AppAcc() throws InterruptedException {
		rb=ResourceBundle.getBundle("SmokeTest");
		AppAccInput.sendKeys(rb.getString("Activity_Action_AppAcc"));
		Thread.sleep(1000);
		AppAccInput.sendKeys(Keys.ENTER);
	}
	public void ItViewNavigation() {
		ITView.click();
	}
	public void EnterJustification() throws InterruptedException {
		rb=ResourceBundle.getBundle("SmokeTest");
		justification.sendKeys(rb.getString("Justification"));
	}

	public void EnterJustification_Infra() throws InterruptedException {
		rb=ResourceBundle.getBundle("SmokeTest");
		justification_Infra.sendKeys(rb.getString("Justification"));
	}

	public void HardwareModuleSelection() {
		HardWareServices.click();
	}

	public void SoftwareCategory() {
		SoftwareItem.click();
	}

	public void SoftwareItemInput() throws InterruptedException {
		rb=ResourceBundle.getBundle("SmokeTest");
		SoftwareInput.sendKeys(rb.getString("SoftwareItem"));
		Thread.sleep(1000);
		SoftwareInput.sendKeys(Keys.ENTER);
	}

	public void  SelectApplication() {
		SelectApplication.click();
	}

	public void SelectApplicationInput() throws InterruptedException {
		rb=ResourceBundle.getBundle("SmokeTest");
		SoftwareInput.sendKeys(rb.getString("SelectApplication"));
		Thread.sleep(1000);
		SoftwareInput.sendKeys(Keys.ENTER);
	}

	public void Description() {
		rb=ResourceBundle.getBundle("SmokeTest");
		Description.sendKeys(rb.getString("Description"));
	}

	public void Activity_ActionSoftware() {
		Activity_Action_Software.click();
	}

	public void ActivityActionInput_Software() throws InterruptedException {
		rb=ResourceBundle.getBundle("SmokeTest");
		HardwareInput.sendKeys(rb.getString("Activity_Action_Software"));
		Thread.sleep(1000);
		HardwareInput.sendKeys(Keys.ENTER);
	}

	public void HardwareCategory() {
		HardwareItem.click();
	}

	public void HardwareItemInput() throws InterruptedException {
		rb=ResourceBundle.getBundle("SmokeTest");
		HardwareInput.sendKeys(rb.getString("HardwareItem"));
		Thread.sleep(1000);
		HardwareInput.sendKeys(Keys.ENTER);
	}


	public void Activity_Action() {
		Activity_Action_Hardware.click();
	}

	public void ActivityActionInput() throws InterruptedException {
		rb=ResourceBundle.getBundle("SmokeTest");
		HardwareInput.sendKeys(rb.getString("Activity_Action"));
		Thread.sleep(1000);
		HardwareInput.sendKeys(Keys.ENTER);
	}

	public void ConfigItem() {
		rb=ResourceBundle.getBundle("SmokeTest");
		ConfigItem.sendKeys(rb.getString("ConfigItem"));
	}

	public void AvailableAsset() {
		AvailableAsset.click();
	}

	public void AvailableAssetInput() throws InterruptedException {
		rb=ResourceBundle.getBundle("SmokeTest");
		HardwareInput.sendKeys(rb.getString("AvailableAsset"));
		Thread.sleep(1000);
		HardwareInput.sendKeys(Keys.ENTER);
	}

	public void RAM() {
		rb=ResourceBundle.getBundle("SmokeTest");
		RequiredRAM.sendKeys(rb.getString("RequiredRam"));
	}

	public void Location() {
		UserLocation.click();
	}

	public void UserLocationInput() throws InterruptedException {
		rb=ResourceBundle.getBundle("SmokeTest");
		HardwareInput.sendKeys(rb.getString("Location"));
		Thread.sleep(1000);
		HardwareInput.sendKeys(Keys.ENTER);
	}

	public void CREATE() {
		Create.click();
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
		Thread.sleep(3000);
		Assignmentgroup.sendKeys("TestAssignmentGroupJIRA");
		Thread.sleep(3000);
		Assignmentgroup.sendKeys(Keys.ENTER);
	}

	public void UPDATE() throws InterruptedException {
		Update.click();
		Thread.sleep(5000);
	}
	public void Assigntome() {
		AssignToMe.click();
	}
	public void CloseTrans_Hardware() throws InterruptedException {
		CloseTransition_Hardware.click();
		Thread.sleep(5000);
	}

	public void CloseTrans_Software() throws InterruptedException {
		CloseTransition_Software.click();
		Thread.sleep(5000);
	}
	public void closenotes() {
		CloseNotes.sendKeys("testing");
	}
	public void WORKINPROGRESS_Hardware() {
		WorkInProgress_Hardware.click();
	}

	public void WORKINPROGRESS_Software() {
		WorkInProgress_Software.click();
	}

	public void WORKINPROGRESS_GSR() {
		WorkInProgress_GSR.click();
	}

	public void CloseTrans_GSR() throws InterruptedException {
		Close_GSR.click();
		Thread.sleep(5000);
	}
	public void closebutton() {
		CloseButton.click();
	}
	public void SoftwareModuleSelection() {
		SoftwareServices.click();
	}
	public void InfraModuleSelection() {
		InfraStructureServices.click();
	}
	public void AppandAcc_ModuleSelection() {
		AppandAccServices.click();
	}

	public void Vcentername() throws InterruptedException {
		rb=ResourceBundle.getBundle("SmokeTest");
		Vcenter_Name.sendKeys(rb.getString("Vcenter_Name"));
	}

	public void Clustername() throws InterruptedException {
		rb=ResourceBundle.getBundle("SmokeTest");
		Cluster_Name.sendKeys(rb.getString("Cluster_Name"));
	}

	public void Datastorename() throws InterruptedException {
		rb=ResourceBundle.getBundle("SmokeTest");
		Datastore_Name.sendKeys(rb.getString("DataStore_Name"));
	}

	public void Currentsize() throws InterruptedException {
		rb=ResourceBundle.getBundle("SmokeTest");
		CurrentSize.sendKeys(rb.getString("CurrentSize"));
	}

	public void AmountIncrease() throws InterruptedException {
		rb=ResourceBundle.getBundle("SmokeTest");
		Amount_Increase.sendKeys(rb.getString("AmountIncrease"));
	}
	public void FacilitiesModuleSelection() {
		Facilities.click();
	}
	public void GSRModuleSelection() {
		GSR.click();
	}
	public void SecurityModuleSelection() {
		SecurityServices.click();
	}
	public void JiraETModuleSelection_Access() {
		JiraETAccess.click();
	}
	public void JiraEnv() throws InterruptedException {
		Environment.click();
		Thread.sleep(5000);
	}
	public void JiraEnvInput() throws InterruptedException {
		rb=ResourceBundle.getBundle("SmokeTest");
		JiraETInput.sendKeys(rb.getString("JiraEnvironment"));
		Thread.sleep(1000);
		JiraETInput.sendKeys(Keys.ENTER);
	}

	public void JiraAccess() throws InterruptedException {
		JiraAccess.click();
		Thread.sleep(5000);
	}
	public void JiraAccessInput() throws InterruptedException {
		rb=ResourceBundle.getBundle("SmokeTest");
		JiraETInput.sendKeys(rb.getString("JiraAccess"));
		Thread.sleep(1000);
		JiraETInput.sendKeys(Keys.ENTER);
	}
	public void JiraETModuleSelection_AG() {
		JiraETAssgngroup.click();
	}
	public void JiraETModuleSelection_ET() {
		JiraETEnhancement.click();
	}
	public void JiraETModuleSelection_CTact() {
		Jira_Contact.click();
	}
	
	public void SubtaskDescriptionClick2() {
		SubtaskDescription2.click();
	}
}
