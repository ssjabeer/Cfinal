package com.Cfinal;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;


public class Baseclass {

	public static  WebDriver driver;
	public static  Properties prop;
	
	public   WebDriver browser(String name) {
		if(name.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Welcome\\eclipse-workspace\\Cfinal\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		return driver;
	}
	
	public  Properties getProperties() throws IOException  {
		FileInputStream file = new FileInputStream("C:\\Users\\Welcome\\eclipse-workspace\\Cfinal\\src\\main\\java\\com\\Cfinal\\hide.properties");
		prop = new Properties();
		prop.load(file);
		return prop;
	}
	
	public  void geturl(String url) {
		driver.get(url);
	}
	
	public static  void senddata(WebElement data,String name) {
		data.sendKeys(name);
	}
	
	public static void clickelement(WebElement elements) {
		elements.click();
	}
	
	public static void swait(int val) throws InterruptedException 
	  {
		 Thread.sleep(val);
	  }
	
	@SuppressWarnings("deprecation")
	public static void iwait() {
		 driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
	 }
	
	public  Select dropDowns(WebElement element) {
		Select options = new Select(element);
		return options;
	}
	
	public  void selectbyValue(WebElement element,String value) {
		dropDowns(element).selectByValue(value);
	}
	
	public  void selectbyVisibleText(WebElement element,String text) {
		dropDowns(element).selectByVisibleText(text);
	}
	
//	public  void implicitwait() {
//		
//		Duration time1 = Duration.ofSeconds(30);
//		//driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
//		driver.manage().timeouts().implicitlyWait(time1);
//		 //int i = Integer.parseInt(time); 
//	}
	
	public  void totakeScreenshot(String filename) throws IOException { 
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\Welcome\\eclipse-workspace\\Cfinal\\screenshot\\"+filename+".png");
		Files.copy(src, dest);
	}
	
	
	
//	public static <Takess> void Takess(String value) throws IOException {
//		 Takess ts = (Takess) driver;
//			File src = ((TakesScreenshot) ts).getScreenshotAs(OutputType.FILE);
//			File dest= new File("C:\\Users\\Welcome\\eclipse-workspace\\Automation_Project\\Screenshott\\pic.png");
//			Files.copy(src, dest);
//	 }	 
}
