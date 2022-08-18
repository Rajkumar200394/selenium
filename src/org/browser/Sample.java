package org.browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
	
	private void m1() {
		System.out.println("test1 successful");
	}

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\eclipse-workspace\\Seleniumday1\\driver\\chromedriver.exe");
		
		// creating a object for webdriver
		WebDriver driver=new ChromeDriver();
		
		//to launch the url
		driver.get("https://www.facebook.com/");
		
		//to maximize the given web page
		driver.manage().window().maximize();
		
		WebElement username=driver.findElement(By.id("email"));
		//sending values
		username.sendKeys("Rajkumar");
		
		WebElement password=driver.findElement(By.id("pass"));
		password.sendKeys("Rajkumar@123");
			
		String title=driver.getTitle();
		System.out.println(title);
		
		String currenturl=driver.getCurrentUrl();
		System.out.println(currenturl);
	}
}
