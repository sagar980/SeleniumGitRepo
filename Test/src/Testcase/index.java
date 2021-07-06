package Testcase;



import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class index {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\eclipse\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	     
	      driver.get("https://www.google.co.in/");
	     
	      driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("Software");
	      
	      Thread.sleep(2000);
	      driver.findElement(By.className("gNO89b")).click();
	     
	      
	      driver.findElement(By.xpath("//*[@id=\'rso\']/div[3]/div/div/div[1]/a/div/cite")).click();
	      
	      
	      
	      driver.navigate().back();
	      
	      System.out.println("Wikipedia link is returned");
	      
	      Thread.sleep(2000);
	      driver.get("https://www.google.co.in/");
	      driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("Testing");
	      
	      Thread.sleep(2000);
	      
	      driver.findElement(By.className("gNO89b")).click();
	      
	      Thread.sleep(2000);
	      
	      WebElement t= driver.findElement(By.xpath("//cite[@class='iUh30 Zu0yb qLRx3b tjvcx']"));
	      
	      Thread.sleep(2000);
	      
	      System.out.println("The element is " + t.getText());
	      
	      
	  
	      driver.close();   
	}
}
