package com.raghib.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TooltipOrHelpText {

	// Mouse Over
	public static String tooltipHeader = "//a[text()='Tooltip']";
	// URL
	public static String bootstrapTooltipURL = System.getProperty("user.dir")+"\\SupportFile\\Tooltips.html";
	// Capture the text and store in a variable and validate the same.
	public static String TooltipMessage = "//div[@class='tooltip-inner']";

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get(bootstrapTooltipURL);
		driver.manage().window().maximize();
		WebElement moveToElement = driver.findElement(By.xpath(tooltipHeader));

		Actions action = new Actions(driver);
		action.moveToElement(moveToElement).perform();

		String result = driver.findElement(By.xpath(TooltipMessage)).getText();

		System.out.println("Result : " + result);

		//driver.quit();
	}
}
