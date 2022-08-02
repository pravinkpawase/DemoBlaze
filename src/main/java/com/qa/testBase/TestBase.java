package com.qa.testBase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.qa.pageLayer.HomePage;
import com.qa.utilities.Utility;
import com.qa.utilities.WebDriverListeners;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	public static WebDriver driver;
	public static WebDriverListeners eventListener;
	public static EventFiringWebDriver e_driver;
	public static HomePage h;
	public static Utility util;
	
	
	
	@BeforeMethod
	public void start(){
		String bw="Chrome";
		if(bw.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver =new ChromeDriver();
		}
		else if(bw .equalsIgnoreCase("Edge")){
			WebDriverManager.edgedriver();
			driver=new EdgeDriver();
		}
		else if(bw.equalsIgnoreCase("Firefox")){
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();	

		}
		else {
			System.out.println("Please Enter Valid Browser Name");
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://demoblaze.com/index.html");
		eventListener= new WebDriverListeners();
		e_driver =new EventFiringWebDriver(driver);
		e_driver.register(eventListener);
		driver=e_driver; 
		
		h=new HomePage();
		util=new Utility();
		
	}
	@AfterMethod
	public void turnOff() {
		driver.quit();
	}
}
