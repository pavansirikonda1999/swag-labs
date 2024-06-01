package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class maven {
	@BeforeClass
	public void fakeLandingPage(){
      WebDriver driver;
      System.setProperty("webdriver.geko.driver","C:\\pavan\\geckodriver-v0.34.0-win32 (1)\\gekodriver.exe");
      driver=new FirefoxDriver();
      driver.manage().window().maximize();
      driver.get("https://course.ultimateqa.com/collections");
      System.out.println("Test case successfully");
}
	@Test
	public void services(){
	      WebDriver driver;
	      System.setProperty("webdriver.geko.driver","C:\\pavan\\geckodriver-v0.34.0-win32 (1)\\gekodriver.exe");
	      driver=new FirefoxDriver();
	      driver.manage().window().maximize();
	      driver.get("https://course.ultimateqa.com/collections");
	      System.out.println("Test case successfully");
	}
	@Test
	public void blog(){
	      WebDriver driver;
	      System.setProperty("webdriver.geko.driver","C:\\pavan\\geckodriver-v0.34.0-win32 (1)\\gekodriver.exe");
	      driver=new FirefoxDriver();
	      driver.manage().window().maximize();
	      driver.get("https://course.ultimateqa.com/collections");
	      System.out.println("Test case successfully");
	}
}

