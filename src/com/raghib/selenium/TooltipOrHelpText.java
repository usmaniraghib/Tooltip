package com.raghib.selenium;

/**
 * Reference:-
 * https://www.youtube.com/watch?v=S66oHwQK2Zw
 */
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class TooltipOrHelpText extends BaseClass {

	public static WebDriver driver;
	public static String browserName = "chrome";
	public static String browserVersion = "116";
	
	// Mouse Over
	public static String tooltipHeader = "//a[text()='Tooltip']";
	// URL
	public static String bootstrapTooltipURL = System.getProperty("user.dir") + "\\SupportFile\\Tooltips.html";
	// Capture the text and store in a variable and validate the same.
	public static String TooltipMessage = "//div[@class='tooltip-inner']";
	
	public static void main(String[] args) throws InterruptedException {
		// Chrome Browser
		driver = BaseClass.getDriver(browserName, browserVersion);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get(bootstrapTooltipURL);
		
		WebElement moveToElement = driver.findElement(By.xpath(tooltipHeader));

		Actions action = new Actions(driver);
		action.moveToElement(moveToElement).perform();

		String result = driver.findElement(By.xpath(TooltipMessage)).getText();

		System.out.println("Result : " + result);

		//BaseClass.quitDriver();
	}
}