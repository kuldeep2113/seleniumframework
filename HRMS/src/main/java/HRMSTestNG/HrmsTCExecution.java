package HRMSTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Login.LoginObjects;



public class HrmsTCExecution {

	WebDriver driver;
	LoginObjects obj = new LoginObjects();


	@BeforeTest
	public void setup()
	{
		obj.openBrowser();

	}

	@Test	
	public void exection() {

		obj.manageWindow();

		obj.openUrl("https://hrmslive.webdunia.net/Login");

		obj.pageTitle();

		obj.findElement(By.xpath("//*[@id=\"txtUserName\"]"),"kuldeep.louvanshi@webdunia.net");

		obj.findElement(By.xpath("//*[@id=\"txtPassword\"]"), "Kuldeep%$890");

		obj.relativeLocator();

		obj.hoverOnElement(By.xpath("//*[@id=\"top\"]"));

		obj.clickOnElement(By.xpath("//*[@class='arrow open']"));

		obj.clickOnElement(By.xpath("//*[@href=\"/TimeSheet/TimeSheet\"]"));





	}	

	@AfterTest
	public void endExecution()
	{
		System.out.println("first class tc is done");

		//obj.closeBrowser();
	}



}
