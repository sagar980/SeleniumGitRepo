package Testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

			
			System.setProperty("webdriver.chrome.driver", "C:\\selenium\\eclipse\\Chromedriver.exe");
			String ExceptedResponse="We welcome your feedback - but we won't get it unless you complete the form correctly.";
			
			String ExpectedForename="Forename is required";
			
			String ExpectedEmail="Email is required";
			
			String ExpectedMessage="Message is required";
			
			
			WebDriver driver= new ChromeDriver();
			driver.get("https://jupiter.cloud.planittesting.com/#/");
			
			driver.manage().window().maximize();
			
			//click on contact
			
			driver.findElement(By.xpath("//*[@id=\'nav-contact\']/a")).click();
			
			Thread.sleep(2000);
			
			//click on submit
			
			driver.findElement(By.xpath("//a[text()='Submit']")).click();
			
			Thread.sleep(4000);
			
			//Data Validation
			
			String response = driver.findElement(By.xpath("//*[@id=\'header-message\']/div")).getText();
			
			System.out.println(response);
			
			if(ExceptedResponse.contentEquals(response))
			{
				System.out.println("Test case passed by matching expectation and Actual response");
				
			}
			
			else {
				System.out.println("Test case not passed by matching expectation and Actual response");
			}
			
			String response1 = driver.findElement(By.xpath("//*[@id=\'forename-err\']")).getText();
			
			System.out.println(response1);
			
			if(ExpectedForename.contains(response1))
			{
				System.out.println("Test case passed by matching expectation and Actual response");
			}
			
			
			else {
				System.out.println("Test case not passed by matching expectation and Actual response");
			}
			
			
			
			String response2 = driver.findElement(By.xpath("//*[@id=\'email-err\']")).getText();
			
			System.out.println(response2);
			if(ExpectedEmail.contains(response2))
			{
				System.out.println("Test case passed by matching expectation and Actual response");
			}
			
			
			else {
				System.out.println("Test case not passed by matching expectation and Actual response");
			}
			
			
			String response3 = driver.findElement(By.xpath("//*[@id=\'message-err\']")).getText();
			
			System.out.println(response3);
			
			if (ExpectedMessage.contains(response3))
			{
				System.out.println("Test case passed by matching expectation and Actual response");
			}
			
			
			else {
				System.out.println("Test case not passed by matching expectation and Actual response");
			}
			
			//Enter shopping details
		
			driver.findElement(By.id("forename")).sendKeys("John");
			driver.findElement(By.id("surname")).sendKeys("example");
			driver.findElement(By.xpath("//*[@id=\'email\']")).sendKeys("john.example@planit.net.au");
			driver.findElement(By.xpath("//*[@id=\'telephone\']")).sendKeys("02 1234 5678");
			driver.findElement(By.id("message")).sendKeys("Tell us about it");
			
			// click on submit button
			driver.findElement(By.xpath("//a[text()='Submit']")).click();
			
			Thread.sleep(15000);
			
			System.out.println("Validate errors are gone");
			
			driver.quit();
	}
	
		
	
	}


