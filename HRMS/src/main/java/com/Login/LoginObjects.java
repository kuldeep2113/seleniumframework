package com.Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.locators.RelativeLocator.RelativeBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;


public class LoginObjects {

	private WebDriver driver;

	public void openBrowser()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	public void manageWindow()
	{
		driver.manage().window().maximize();
	}
	public String openUrl(String url)
	{
		driver.get(url);
		return url;
	}

	public String pageTitle()
	{
		String actualtitle = driver.getTitle();
		System.out.println(actualtitle);
		return actualtitle;
	}

	public void findElement(By locator, String value)
	{
		driver.findElement(locator).sendKeys(value);
	}
	
	public void relativeLocator()
	{
		driver.findElement(RelativeLocator.withTagName("input").below(By.xpath("//*[@id=\"txtPassword\"]"))).click();
	}

	public void closeBrowser() {
		driver.close();
	}

	public WebElement hoverOnElement(By locator)
	{
		Actions act = new Actions(driver);
		WebElement we = driver.findElement(locator);
		act.moveToElement(we).build().perform();
		return we;
	}
	
	public void clickOnElement(By locator)
	{
		driver.findElement(locator).click();
	}
	
	public void waitForElement(By locator)
	{
        @SuppressWarnings("deprecation")
		WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).click();
        
	}








}
