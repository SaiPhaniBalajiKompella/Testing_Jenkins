package testBase;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.ResourceBundle;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	public WebDriver driver;
	public ResourceBundle rb;
	int i=1;

	@BeforeClass
	public void setup() throws InterruptedException {
		rb=ResourceBundle.getBundle("Login");
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(rb.getString("appURL"));  //Reading Data From Properties File.
		driver.manage().window().maximize();
	}

	public void windowhandles() {
		Set<String> windows = driver.getWindowHandles(); 
		for (String ServiceDeskPortal : windows)
		{
			driver.switchTo().window(ServiceDeskPortal);
		}
	}
	public void Refresh() throws InterruptedException {
		driver.navigate().refresh();
		Thread.sleep(6000);
		driver.navigate().refresh();
		Thread.sleep(6000);
		driver.navigate().refresh();
		Thread.sleep(3000);

	}
	public void EstimateSize() {
		WebElement EstimateSize=driver.findElement(By.id("customfield_19701"));
		Select objSelect =new Select(EstimateSize);
		objSelect.selectByVisibleText("MICRO < 30 min");
	}
	public void ActualSize() {
		WebElement ActualSize=driver.findElement(By.id("customfield_19700"));
		Select actualsize =new Select(ActualSize);
		actualsize.selectByVisibleText("MICRO < 30 min");
	}
	public void InfraComments() {
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@class='tox-edit-area__iframe']")));
		driver.findElement(By.xpath("//*[@id=\"tinymce\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"tinymce\"]")).sendKeys("testing");
	}
	public void ParentTicketClick() {
		driver.findElement(By.xpath("//*[@id=\"parent_issue_summary\"]")).click();
	}
	public void CloseCode() throws InterruptedException {
		Select closecode =new Select(driver.findElement(By.id("customfield_11648")));
		closecode.selectByVisibleText("Transferred");
		Thread.sleep(3000);
	}
	
	public void ValidatingPortal() throws InterruptedException {
		Refresh();
		Thread.sleep(5000);
		System.out.println("***************PORTAL FORM FIELD VALIDATIONS***************");
		
		//Ticket Title
		System.out.println("Ticket Title");
		System.out.println(driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div[2]/div[3]/main/div[2]/div[2]/div/div[1]/div[1]/h1")).getText());
		System.out.println("*************************");
		
		//Buttons Present
		
		//Don't Notify Me Button
		System.out.println(driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div[2]/div[3]/main/div[2]/div[2]/div/div[2]/div[3]/div/ul[1]/li[1]/a/div[2]")).getText());
		System.out.println("*************************");
		//Share Button
		System.out.println(driver.findElement(By.xpath("//*[@id=\"rw_content\"]/div[2]/div/div[2]/div[3]/div/ul[1]/li[2]/a/div[2]")).getText());;
		System.out.println("*************************");
		//Cancel Request Button
		//System.out.println(driver.findElement(By.xpath("//*[@id=\"com.atlassian.servicedesk:workflow-transition-111\"]/div[2]")).getText());
		//System.out.println("*************************");
		//Back Button
		System.out.println(driver.findElement(By.xpath("//*[@id='backBtn']")).getText());
		System.out.println("*************************");
		//Request Details 
		int iCount = 0;
		iCount = driver.findElements(By.xpath("//*[@class='rw_item_section']")).size();
		for(i=1;i<=iCount;i++) {
			System.out.println("*************************");
			System.out.println(driver.findElement(By.xpath("//*[@class='rw_item_section'][" +i+ "]")).getText());
		}
	}
	
	public void ITViewTicketValidationFields() throws InterruptedException {
		int iCount = 0;
		Thread.sleep(5000);
		System.out.println("***************MAIN TICKET FORM FIELD VALIDATIONS***************");
		
		iCount =driver.findElements(By.xpath("//*[@id='issue-content']/div/div/div[1]/div")).size();
		System.out.println(iCount);
		for(i=1;i<=iCount;i++) {
			System.out.println("********************************************************************************************");
			System.out.println(driver.findElement(By.xpath("//*[@id='issue-content']/div/div/div[1]/div[" +i+ "]")).getText());
		}
		iCount =driver.findElements(By.xpath("//*[@id='issue-content']/div/div/div[2]/div")).size();
		System.out.println(iCount);
		for(i=1;i<=iCount;i++) {
			System.out.println("********************************************************************************************");
			System.out.println(driver.findElement(By.xpath("//*[@id='issue-content']/div/div/div[2]/div[" +i+ "]")).getText());
		}
		Thread.sleep(5000);
		
	}
	
	//Screenshot Method when the testCase is failed.
		public String captureScreen(String tname) throws IOException {
			String timeStamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
			TakesScreenshot takesScreenshot = (TakesScreenshot) driver; 
			File source = takesScreenshot.getScreenshotAs(OutputType.FILE);
			String destination = System.getProperty("user.dir") + "\\screenshots\\" + tname + "_" + timeStamp + ".png";
			try 
			{
				FileUtils.copyFile(source, new File(destination)); 
			} 
			catch (Exception e) 
			{ 
				e.getMessage(); 
			} 
			return destination;
		}
		
	public void SwitchUser() throws InterruptedException {
		String TicketURL=driver.getCurrentUrl();
		driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[1]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"app-switcher\"]/div[1]/ul/li[5]/a")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//*[@id=\"main-navigation-tabs-2-tab\"]/div/div/div/div/form/div[1]/div/div[1]/span/div/div/div[1]")).click();
		driver.findElement(By.xpath("//*[@id='react-select-2-input']")).sendKeys("sunil.thota@cotiviti.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='react-select-2-input']")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//*[@id=\"main-navigation-tabs-2-tab\"]/div/div/div/div/form/div[3]/div/button[1]/span")).click();
		Thread.sleep(6000);
		driver.get(TicketURL);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"com.atlassian.servicedesk.approvals-plugin:approve-approval\"]/span")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[1]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"app-switcher\"]/div[1]/ul/li[5]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"sr-exit-switch-user\"]/a")).click();
		driver.get(TicketURL);
		}
	public void SwitchUserSmoke_ManagerApproval() throws InterruptedException {
		String TicketURL=driver.getCurrentUrl();
		driver.findElement(By.xpath("//*[@id=\"admin_menu\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"scriptrunner_section\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"main-navigation-tabs-2\"]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"searchResults\"]/div[18]/a/div/span[1]/span/span")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//*[@id=\"main-navigation-tabs-2-tab\"]/div/div/div/div/form/div[1]/div/div[1]/span/div/div/div[1]")).click();
		driver.findElement(By.xpath("//*[@id='react-select-2-input']")).sendKeys("sunil.thota@cotiviti.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='react-select-2-input']")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//*[@id=\"main-navigation-tabs-2-tab\"]/div/div/div/div/form/div[3]/div/button[1]/span")).click();
		Thread.sleep(6000);
		driver.get(TicketURL);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"com.atlassian.servicedesk.approvals-plugin:approve-approval\"]/span")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"admin_menu\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"scriptrunner_section\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"sr-exit-switch-user\"]/a")).click();
		Thread.sleep(5000);
		driver.get(TicketURL);
		}
	
	public void SwitchUserSmoke_ITApproval() throws InterruptedException {
		String TicketURL=driver.getCurrentUrl();
		driver.findElement(By.xpath("//*[@id=\"admin_menu\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"scriptrunner_section\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"main-navigation-tabs-2\"]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"searchResults\"]/div[18]/a/div/span[1]/span/span")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//*[@id=\"main-navigation-tabs-2-tab\"]/div/div/div/div/form/div[1]/div/div[1]/span/div/div/div[1]")).click();
		driver.findElement(By.xpath("//*[@id='react-select-2-input']")).sendKeys("kancharana.chandra@cotiviti.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='react-select-2-input']")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//*[@id=\"main-navigation-tabs-2-tab\"]/div/div/div/div/form/div[3]/div/button[1]/span")).click();
		Thread.sleep(6000);
		driver.get(TicketURL);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"com.atlassian.servicedesk.approvals-plugin:approve-approval\"]/span")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"header-details-user-fullname\"]/span/span/img")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"log_out\"]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/section/div/div/p[3]/a")).click();
		Thread.sleep(8000);
		driver.get(TicketURL);

		}
	
	
	public void SwitchUserSmoke_ITApproval_Onshore() throws InterruptedException {
		String TicketURL=driver.getCurrentUrl();
		driver.findElement(By.xpath("//*[@id=\"admin_menu\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"scriptrunner_section\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"main-navigation-tabs-2\"]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"searchResults\"]/div[18]/a/div/span[1]/span/span")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//*[@id=\"main-navigation-tabs-2-tab\"]/div/div/div/div/form/div[1]/div/div[1]/span/div/div/div[1]")).click();
		driver.findElement(By.xpath("//*[@id='react-select-2-input']")).sendKeys("simar.raina@cotiviti.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='react-select-2-input']")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//*[@id=\"main-navigation-tabs-2-tab\"]/div/div/div/div/form/div[3]/div/button[1]/span")).click();
		Thread.sleep(6000);
		driver.get(TicketURL);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"com.atlassian.servicedesk.approvals-plugin:approve-approval\"]/span")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"header-details-user-fullname\"]/span/span/img")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"log_out\"]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/section/div/div/p[3]/a")).click();
		Thread.sleep(8000);
		driver.get(TicketURL);

		}
	
	public void SwitchUserSmoke_ITApproval_Onshore_App_ID() throws InterruptedException {
		String TicketURL=driver.getCurrentUrl();
		driver.findElement(By.xpath("//*[@id=\"admin_menu\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"scriptrunner_section\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"main-navigation-tabs-2\"]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"searchResults\"]/div[18]/a/div/span[1]/span/span")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//*[@id=\"main-navigation-tabs-2-tab\"]/div/div/div/div/form/div[1]/div/div[1]/span/div/div/div[1]")).click();
		driver.findElement(By.xpath("//*[@id='react-select-2-input']")).sendKeys("shirley.joe@cotiviti.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='react-select-2-input']")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//*[@id=\"main-navigation-tabs-2-tab\"]/div/div/div/div/form/div[3]/div/button[1]/span")).click();
		Thread.sleep(6000);
		driver.get(TicketURL);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"com.atlassian.servicedesk.approvals-plugin:approve-approval\"]/span")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"header-details-user-fullname\"]/span/span/img")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"log_out\"]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/section/div/div/p[3]/a")).click();
		Thread.sleep(8000);
		driver.get(TicketURL);

		}
	
	public void SwitchUserSmoke_UserApproval() throws InterruptedException {
		String TicketURL=driver.getCurrentUrl();
		driver.findElement(By.xpath("//*[@id=\"admin_menu\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"scriptrunner_section\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"main-navigation-tabs-2\"]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"searchResults\"]/div[18]/a/div/span[1]/span/span")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//*[@id=\"main-navigation-tabs-2-tab\"]/div/div/div/div/form/div[1]/div/div[1]/span/div/div/div[1]")).click();
		driver.findElement(By.xpath("//*[@id='react-select-2-input']")).sendKeys("tyson.coates@cotiviti.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='react-select-2-input']")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//*[@id=\"main-navigation-tabs-2-tab\"]/div/div/div/div/form/div[3]/div/button[1]/span")).click();
		Thread.sleep(6000);
		driver.get(TicketURL);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"com.atlassian.servicedesk.approvals-plugin:approve-approval\"]/span")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"header-details-user-fullname\"]/span/span/img")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"log_out\"]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/section/div/div/p[3]/a")).click();
		Thread.sleep(8000);
		driver.get(TicketURL);

		}
	
	public void SwitchUserSmoke_Facilities() throws InterruptedException {
		String TicketURL=driver.getCurrentUrl();
		driver.findElement(By.xpath("//*[@id=\"admin_menu\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"scriptrunner_section\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"main-navigation-tabs-2\"]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"searchResults\"]/div[18]/a/div/span[1]/span/span")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//*[@id=\"main-navigation-tabs-2-tab\"]/div/div/div/div/form/div[1]/div/div[1]/span/div/div/div[1]")).click();
		driver.findElement(By.xpath("//*[@id='react-select-2-input']")).sendKeys("craig.lewis@cotiviti.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='react-select-2-input']")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//*[@id=\"main-navigation-tabs-2-tab\"]/div/div/div/div/form/div[3]/div/button[1]/span")).click();
		Thread.sleep(6000);
		driver.get(TicketURL);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"com.atlassian.servicedesk.approvals-plugin:approve-approval\"]/span")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"header-details-user-fullname\"]/span/span/img")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"log_out\"]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/section/div/div/p[3]/a")).click();
		Thread.sleep(8000);
		driver.get(TicketURL);

		}
	
	public void SwitchUserSmoke_SS() throws InterruptedException {
		String TicketURL=driver.getCurrentUrl();
		driver.findElement(By.xpath("//*[@id=\"admin_menu\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"scriptrunner_section\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"main-navigation-tabs-2\"]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"searchResults\"]/div[18]/a/div/span[1]/span/span")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//*[@id=\"main-navigation-tabs-2-tab\"]/div/div/div/div/form/div[1]/div/div[1]/span/div/div/div[1]")).click();
		driver.findElement(By.xpath("//*[@id='react-select-2-input']")).sendKeys("xavier.cortez@cotiviti.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='react-select-2-input']")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//*[@id=\"main-navigation-tabs-2-tab\"]/div/div/div/div/form/div[3]/div/button[1]/span")).click();
		Thread.sleep(6000);
		driver.get(TicketURL);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"com.atlassian.servicedesk.approvals-plugin:approve-approval\"]/span")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"header-details-user-fullname\"]/span/span/img")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"log_out\"]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/section/div/div/p[3]/a")).click();
		Thread.sleep(8000);
		driver.get(TicketURL);

		}
	
	public void SwitchUserSmoke_JiraETAccess() throws InterruptedException {
		String TicketURL=driver.getCurrentUrl();
		driver.findElement(By.xpath("//*[@id=\"admin_menu\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"scriptrunner_section\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"main-navigation-tabs-2\"]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"searchResults\"]/div[18]/a/div/span[1]/span/span")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//*[@id=\"main-navigation-tabs-2-tab\"]/div/div/div/div/form/div[1]/div/div[1]/span/div/div/div[1]")).click();
		driver.findElement(By.xpath("//*[@id='react-select-2-input']")).sendKeys("lema.craig@cotiviti.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='react-select-2-input']")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//*[@id=\"main-navigation-tabs-2-tab\"]/div/div/div/div/form/div[3]/div/button[1]/span")).click();
		Thread.sleep(6000);
		driver.get(TicketURL);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"com.atlassian.servicedesk.approvals-plugin:approve-approval\"]/span")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"header-details-user-fullname\"]/span/span/img")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"log_out\"]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/section/div/div/p[3]/a")).click();
		Thread.sleep(8000);
		driver.get(TicketURL);

		}

	
	public void SwitchUserSmoke_JiraETEnhancement() throws InterruptedException {
		String TicketURL=driver.getCurrentUrl();
		driver.findElement(By.xpath("//*[@id=\"admin_menu\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"scriptrunner_section\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"main-navigation-tabs-2\"]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"searchResults\"]/div[18]/a/div/span[1]/span/span")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//*[@id=\"main-navigation-tabs-2-tab\"]/div/div/div/div/form/div[1]/div/div[1]/span/div/div/div[1]")).click();
		driver.findElement(By.xpath("//*[@id='react-select-2-input']")).sendKeys("slaughter.monique@cotiviti.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='react-select-2-input']")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//*[@id=\"main-navigation-tabs-2-tab\"]/div/div/div/div/form/div[3]/div/button[1]/span")).click();
		Thread.sleep(6000);
		driver.get(TicketURL);
		Refresh();
		Thread.sleep(5000);

		}
	
	
}
