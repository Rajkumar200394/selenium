package org.browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args)  {
			
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\user\\eclipse-workspace\\Seleniumday1\\driver\\chromedriver.exe");
			
	// creating a object for webdriver
			WebDriver driver=new ChromeDriver();
			
	//to launch the url
			driver.get("https://www.amazon.in/");
			
	//to maximize the given web page
			driver.manage().window().maximize();
			
		WebElement username=driver.findElement(By.id("twotabsearchtextbox"));
	//sending values
			username.sendKeys("Rajkumar");
			
		//	WebElement password=driver.findElement(By.id("pass"));
			//password.sendKeys("Rajkumar@123");
			
			//WebElement btnlogin=driver.findElement(By.xpath("//input[@value='Male']"));
		//	driver.wait();
			//btnlogin.click();
			
}
}