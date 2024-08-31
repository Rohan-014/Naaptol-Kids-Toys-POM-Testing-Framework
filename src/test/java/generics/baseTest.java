package generics;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import Pages.HomePage;
import Pages.KidsAndToysPage;
import Pages.RemoteControlToys;

public class baseTest {
	
	// We have to create before class and after class in this
	String url;
	protected HomePage hPage;
	protected KidsAndToysPage ktPage;
	protected RemoteControlToys rctPage;
	protected WebDriver driver;
	protected ExtentReports reports;
	protected ExtentTest test;
	
	@BeforeClass
	
	public void ReportConf() {
		
		reports = new ExtentReports("E:\\Documents\\Naaptol_POM\\Report.html");
		
		test = reports.startTest("Naaptol Kids And Toys categories testing");
		
	}
	
	@BeforeMethod
	
	public void setup() throws IOException {
		
		driver=new ChromeDriver();
		
		// Created a property class object for retrieving data from config.properties file
		
		Properties properties = new Properties();
		
		//Given the path using fileinputstream
		
		FileInputStream file = new FileInputStream("E:\\Documents\\Naaptol_POM\\src\\main\\resources\\config.properties");
		
		// Load file in it
		
		properties.load(file);
		
		// useing getproperty method stored in a new string variable
		
		url = properties.getProperty("url");
		
		driver.get(url);
		
		driver.manage().window().maximize();
		
		// home page object
		
		hPage = new HomePage(driver);
		
		// kids and toys page object
		
		ktPage = new KidsAndToysPage(driver);
		
		// remote control toys page object
		
		rctPage = new RemoteControlToys(driver);
		
	}
	
	@AfterMethod
	
	public void teradown() {
		
		driver.close();
	}
	
	@AfterClass
	
	public void  flush() {
		
		reports.flush();
		
		reports.endTest(test);
	}

}
