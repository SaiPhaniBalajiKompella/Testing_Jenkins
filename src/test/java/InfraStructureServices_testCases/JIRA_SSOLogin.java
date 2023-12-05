package InfraStructureServices_testCases;

import org.testng.annotations.Test;

import pageObjects.SSO_Login;
import testBase.BaseClass;

public class JIRA_SSOLogin extends BaseClass {

	@Test(priority=1)
	public void Login() throws InterruptedException {
		SSO_Login login=new SSO_Login(driver);	
		login.EmailID();
		login.Password();
		login.Signin();
		Thread.sleep(5000);
		login.Code();
		Thread.sleep(10000);
		login.Verify();
		login.SERVICEDESKPORTAL();
		windowhandles();
		/*
		 * Thread.sleep(5000); login.SERVICEREQUESTS();
		 */

	}














}
