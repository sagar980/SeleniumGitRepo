package Testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Indexvalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\eclipse\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      
	      driver.get("https://www.guru99.com/");
	      
	      WebElement t =driver.findElement(By.xpath("//li[@class='fa fa-chevron-circle-right']"));
	      System.out.println("The Element is " + t.getTagName());
	      driver.close();
	}

}
