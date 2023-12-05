package pageObjects;

import java.util.ResourceBundle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SSO_Login extends BasePage{
	public ResourceBundle rb;

	public SSO_Login(WebDriver driver) {
		super(driver);
	}

	//Elements on the page.

	@FindBy(xpath= "//*[@id='input27']")
	WebElement emailid;

	@FindBy(xpath= "//*[@id='input35']")
	WebElement password;

	@FindBy(xpath= "//*[@id='form19']/div[2]/input")
	WebElement signin;

	@FindBy(xpath= "//*[@id='form62']/div[2]/input")
	WebElement receivecode;

	@FindBy(xpath= "//*[@id='form80']/div[2]/input")
	WebElement verify;

	@FindBy(xpath= "//*[@id='portal-link-link']")
	WebElement servicedeskportal;

	@FindBy(xpath= "/html/body/div[3]/div/div[1]/div[2]/div[3]/main/div[2]/div/div[3]/div/div/div[1]/div/div[1]/div/ul/li[2]")
	WebElement servicerequests;

	//Action Methods for Login.

	public void EmailID() {
		rb=ResourceBundle.getBundle("Login");
		emailid.sendKeys(rb.getString("emailid"));
	}
	public void Password() {
		rb=ResourceBundle.getBundle("Login");
		password.sendKeys(rb.getString("password"));
	}
	public void Signin() {
		signin.click();
	}
	public void Code() {
		receivecode.click();
	}
	public void Verify() {
		verify.click();
	}
	public void SERVICEDESKPORTAL() {
		servicedeskportal.click();
	}
	public void SERVICEREQUESTS() {
		servicerequests.click();
	}


}
