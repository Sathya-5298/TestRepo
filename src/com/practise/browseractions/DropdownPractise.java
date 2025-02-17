package com.practise.browseractions;

import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DropdownPractise 
{
	public static void main(String[] args) throws InterruptedException
	{
		String url = "https://www.spicejet.com/";
		ChromeOptions co = new ChromeOptions();
		co.setExperimentalOption("excludeSwitches",Arrays.asList("disable-popup-blocking"));
		
		WebDriver driver = new ChromeDriver(co);
		driver.get(url);
		driver.manage().window().maximize();
		
		WebElement currencyDropdown = driver.findElement(By.xpath("//div[@style='flex: 0.3 1 0%; margin-left: 10px;']"));
		currencyDropdown.click();
		
		WebElement currencyValue = driver.findElement(By.xpath("//div[@style='height: 200px; width: 140px;'] //div[text() = 'INR']"));
		currencyValue.click();
		
		System.out.println(currencyDropdown.getText());
		
		WebElement passengerDropdown = driver.findElement(By.xpath("//div[@data-testid ='home-page-travellers']"));
		passengerDropdown.click();
		
		WebElement adult = driver.findElement(By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']"));
		
		
		for (int i = 1; i < 5; i++)
		{
			adult.click();
		}
		
		// child add - //div[@data-testid='Children-testID-plus-one-cta']
		WebElement child = driver.findElement(By.xpath("//div[@data-testid='Children-testID-plus-one-cta']"));
		child.click();
		
		//infant add - //div[@data-testid='Infant-testID-plus-one-cta']
		WebElement infant = driver.findElement(By.xpath("//div[@data-testid='Infant-testID-plus-one-cta']"));
		infant.click();
		
		System.out.println(passengerDropdown.getText());
		
		Thread.sleep(2500);
		
		driver.quit();
		
	}
}
