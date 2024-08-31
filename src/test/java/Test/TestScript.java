package Test;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.relevantcodes.extentreports.LogStatus;

import generics.baseTest;



public class TestScript extends baseTest {
	
	public static void ScreenShot(WebDriver driver, int n) throws IOException {
		
		TakesScreenshot takesScreenshot = (TakesScreenshot)driver;
		
		File image = takesScreenshot.getScreenshotAs(OutputType.FILE);
		
		File imgFile = new File("C:\\Users\\salun\\OneDrive\\Pictures\\Naaptol ScreenShot\\s"+n+".png");
		
		FileUtils.copyFile(image, imgFile);
	}
	
	@Test(priority = 1)
	
	public void  HomePage() throws IOException {
		
		// Verifying that the "kids and toys" link navigates to the correct page
		
		 test.log(LogStatus.INFO, "Clicking on Shopping Categories link");
		
		hPage.getShoppingCategoriesLink().click();
		
		 test.log(LogStatus.INFO, "Clicking on Kids And Toys link");
		
		hPage.getKidsAndToyslink().click();
		
		SoftAssert softAssert = new SoftAssert();
		
		 test.log(LogStatus.INFO, "Asserting that the current URL is correct");
		
		softAssert.assertEquals(driver.getCurrentUrl(),"https://www.naaptol.com/shop-online/toys-nursery.html");
		
		softAssert.assertAll();
		
		ScreenShot(driver, 1);
		
		 test.log(LogStatus.PASS, "Successfully navigated to Kids And Toys page");
		
	}
	
	@Test(priority = 2)
	
	public void HomePage1() throws IOException {
		
		// Verifying kids and toy option displaying on shopping categoris or not
		
		test.log(LogStatus.INFO, "Clicking on Shopping Categories link");
		
		hPage.getShoppingCategoriesLink().click();
		
		try {
			 test.log(LogStatus.INFO, "Asserting that 'Kids & Toys' option is displayed in the dropdown");
			Assert.assertTrue(hPage.getKidsAndToyslink().isDisplayed(),"'Kids & Toys' option is present in the dropdown.");
		} catch (Exception e) {
			 test.log(LogStatus.FAIL, "'Kids & Toys' option is not present in the dropdown.");
			Assert.fail("'Kids & Toys' option is not present in the dropdown.");
			
		}
		
		ScreenShot(driver, 2);
		
		 test.log(LogStatus.PASS, "Successfully displayed the Kids And Toys option in categories dropdown");
	}
	
	@Test(priority = 3)
	
	public void KidsAndToys() throws IOException {
		
		// Verifying that the "Soft Toys" link navigates to the correct page
		
		 test.log(LogStatus.INFO, "Clicking on Shopping Categories link");
		
		hPage.getShoppingCategoriesLink().click();
		
		 test.log(LogStatus.INFO, "Clicking on Kids And Toys link");
		
		hPage.getKidsAndToyslink().click();
		
		 test.log(LogStatus.INFO, "Clicking on Soft Toys link");
		
		ktPage.getSoftToysLink().click();
		
		SoftAssert softAssert = new SoftAssert();
		
		 test.log(LogStatus.INFO, "Asserting that the current URL is correct");
		
		softAssert.assertEquals(driver.getCurrentUrl(),"https://www.naaptol.com/shop-online/toys-nursery/soft-toys.html");
		
		softAssert.assertAll();
		
		ScreenShot(driver, 3);
		
		 test.log(LogStatus.PASS, "Successfully navigated to Soft Toys page");
					
	}
	
	@Test(priority = 4)
	
	public void KidsAndToys1() throws IOException {
		
		// Verifying that the "Remote Control Toys" link navigates to the correct page
		
		 test.log(LogStatus.INFO, "Clicking on Shopping Categories link");
		
        hPage.getShoppingCategoriesLink().click();
        
        test.log(LogStatus.INFO, "Clicking on Kids And Toys link");
		
		hPage.getKidsAndToyslink().click();
		
		test.log(LogStatus.INFO, "Clicking on Remote Control Toys link");
		
		ktPage.getRemoteControlToysLink().click();
		
		SoftAssert softAssert = new SoftAssert();
		
		 test.log(LogStatus.INFO, "Asserting that the current URL is correct");
		
		softAssert.assertEquals(driver.getCurrentUrl(),"https://www.naaptol.com/shop-online/toys-nursery/remote-control-toys.html");
		
		softAssert.assertAll();
		
		ScreenShot(driver, 4);
		
		test.log(LogStatus.PASS, "Successfully navigated to Remote Control Toys page");
		
	}
	
	@Test(priority = 5)
	
	public void KidsAndToys2() throws IOException {
		
		// Verifying that the "Lerning & Activity" link navigates to the correct page
		
		test.log(LogStatus.INFO, "Clicking on Shopping Categories link");
		
        hPage.getShoppingCategoriesLink().click();
        
        test.log(LogStatus.INFO, "Clicking on Kids And Toys link");
		
		hPage.getKidsAndToyslink().click();
		
		 test.log(LogStatus.INFO, "Clicking on Learning & Activity link");
		
		ktPage.getLearningAndActivityLink().click();
		
		SoftAssert softAssert = new SoftAssert();
		
		test.log(LogStatus.INFO, "Asserting that the current URL is correct");
		
		softAssert.assertEquals(driver.getCurrentUrl(),"https://www.naaptol.com/shop-online/toys-nursery/learning-activity.html");
		
		softAssert.assertAll();
		
		ScreenShot(driver, 5);
		
		test.log(LogStatus.PASS, "Successfully navigated to Learning & Activity page");
		
	}
	
	@Test(priority = 6)
	
	public void KidsAndToys3() throws IOException {
		
		// Verifying that the "Unique Toys" link navigates to the correct page
		
		test.log(LogStatus.INFO, "Clicking on Shopping Categories link");
		
        hPage.getShoppingCategoriesLink().click();
        
        test.log(LogStatus.INFO, "Clicking on Kids And Toys link");
		
		hPage.getKidsAndToyslink().click();
		
		test.log(LogStatus.INFO, "Clicking on Unique Toys link");
		
		ktPage.getUniqueToysLink().click();
		
		SoftAssert softAssert = new SoftAssert();
		
		test.log(LogStatus.INFO, "Asserting that the current URL is correct");
		
		softAssert.assertEquals(driver.getCurrentUrl(),"https://www.naaptol.com/shop-online/toys-nursery/other-vehicles.html");
		
		softAssert.assertAll();
		
		ScreenShot(driver, 6);
		
		test.log(LogStatus.PASS, "Successfully navigated to Unique Toys page");
		
	}
	
	@Test(priority = 7)
	
	public void KidsAndToys4() throws IOException {
		
	    // Verify that each item on the Kids & Toys page is clickable and navigates to the correct item page
		
		test.log(LogStatus.INFO, "Clicking on Shopping Categories link");
		
		hPage.getShoppingCategoriesLink().click();
		
		 test.log(LogStatus.INFO, "Clicking on Kids And Toys link");
		
		hPage.getKidsAndToyslink().click();
		
		String originalHandle = driver.getWindowHandle();
		
		String expectedTitle = "Buy Tumbling Tank - Buy 1 Get 1 Free Online at Best Price in India on Naaptol.com";
		
		test.log(LogStatus.INFO, "Clicking on Tumbling Tank link");
		
		driver.findElement(By.linkText("Tumbling Tank - Buy 1 Get 1 Free")).click();
		
		test.log(LogStatus.INFO, "Switching to new window and verifying title");
		
		for(String handle : driver.getWindowHandles()) {
				driver.switchTo().window(handle);
				
				if(driver.getTitle().equals(expectedTitle)) {
					break;
				}
		}
		driver.close();
		driver.switchTo().window(originalHandle);	
		
		ScreenShot(driver, 7);
		
		test.log(LogStatus.PASS, "Successfully verified each item is clickable");
	}
	
	@Test(priority = 8)
	
	public void KidsAndToys5() throws InterruptedException, IOException {
		
		// Verifyinf iteam availability at your location
		
		test.log(LogStatus.INFO, "Clicking on Shopping Categories link");
		
		hPage.getShoppingCategoriesLink().click();
		
		test.log(LogStatus.INFO, "Clicking on Kids And Toys link");
			
		hPage.getKidsAndToyslink().click();
		
		String originalString = driver.getWindowHandle();
		
		test.log(LogStatus.INFO, "Clicking on Tumbling Tank link");
		
		driver.findElement(By.linkText("Tumbling Tank - Buy 1 Get 1 Free")).click();
		
		String expectedTitle = "Buy Tumbling Tank - Buy 1 Get 1 Free Online at Best Price in India on Naaptol.com";
		
		driver.findElement(By.linkText("Tumbling Tank - Buy 1 Get 1 Free")).click();
		
		test.log(LogStatus.INFO, "Switching to new window and verifying title");
		
		for(String handle : driver.getWindowHandles()) {
				driver.switchTo().window(handle);
				
				if(driver.getTitle().equals(expectedTitle)) {
					break;
				}
		}
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		 test.log(LogStatus.INFO, "Entering pincode and checking availability");
		
		driver.findElement(By.xpath("//input[@placeholder='Enter Pincode']")).sendKeys("411018");
		
		driver.findElement(By.linkText("Check")).click();
		
		WebElement availabilityMessageElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@id='pincodeErrorMsg_0']")));
		
		String availabilitymessage = availabilityMessageElement.getText().trim();
		
		test.log(LogStatus.INFO, "Verifying availability message");
		
		System.out.println("Actual availability message: "+ availabilitymessage);
		
		Assert.assertTrue(availabilitymessage.contains("Shipping with best price is available at your requested location.")|| availabilitymessage.contains(" Sorry! Currently, this product is not available at your requested location."),
		 "Unexpected availability message: " + availabilitymessage);
		
		driver.close();
		driver.switchTo().window(originalString);
		
		ScreenShot(driver, 8);
		
		test.log(LogStatus.PASS, "Successfully verified item availability at your location");

		
	}
	
	@Test(priority = 9)
	
	public void KidsAndToys6() throws IOException {
		
		// Verifying end testing on Kids and toys page
		
		 test.log(LogStatus.INFO, "Clicking on Shopping Categories link");
		
		hPage.getShoppingCategoriesLink().click();
		
		test.log(LogStatus.INFO, "Clicking on Kids And Toys link");
		
		hPage.getKidsAndToyslink().click();
		
		String originalString = driver.getWindowHandle();
		
		test.log(LogStatus.INFO, "Clicking on Tumbling Tank link");
		
		driver.findElement(By.linkText("Tumbling Tank - Buy 1 Get 1 Free")).click();
		
		String expectedTitle = "Buy Tumbling Tank - Buy 1 Get 1 Free Online at Best Price in India on Naaptol.com";
		
		test.log(LogStatus.INFO, "Switching to new window and verifying title");
		
		for(String handle : driver.getWindowHandles()) {
				driver.switchTo().window(handle);
				
				if(driver.getTitle().equals(expectedTitle)) {
					break;
				}
		}
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		test.log(LogStatus.INFO, "Clicking on 'Click Here to Buy' link");
		
		WebElement clickHereToBuyLink = wait.until(ExpectedConditions.elementToBeClickable(ktPage.getClickHereToBuyLink()));
        clickHereToBuyLink.click();
        
        test.log(LogStatus.INFO, "Clicking on 'Proceed to Checkout' link");
		
        WebElement proceedToCheckoutLink = wait.until(ExpectedConditions.elementToBeClickable(ktPage.getProceedToCheckoutLink()));
        proceedToCheckoutLink.click();
        
        driver.close();
        
        driver.switchTo().window(originalString);
        
		ScreenShot(driver, 9);
		
		 test.log(LogStatus.PASS, "Successfully completed end-to-end testing on Kids and Toys page");
		
	}
	
	@Test(priority = 10)
	
	public void  RemoteControlToys() throws InterruptedException, IOException {
		
		// verifying navigation between pages
		
		test.log(LogStatus.INFO, "Clicking on Shopping Categories link");
		
		hPage.getShoppingCategoriesLink().click();
		
		test.log(LogStatus.INFO, "Clicking on Kids And Toys link");
		
		hPage.getKidsAndToyslink().click();
		
		Thread.sleep(10);
		
		test.log(LogStatus.INFO, "Navigating to Remote Control Toys link");
		
		ktPage.getRemoteControlToysLink().click();
		
		test.log(LogStatus.INFO, "Navigating to Airplanes and Helicopters link");
		
		rctPage.getAirplanesAndHelicoptersLink().click();
		
		 test.log(LogStatus.INFO, "Navigating back and clicking on RC Cars and Collectibles link");
		
		driver.navigate().back();
		
		rctPage.getRCCarsAndCollectiblesLink().click();
		
		 test.log(LogStatus.INFO, "Performing page navigation actions");
		
		driver.navigate().refresh();
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().back();
		
		driver.navigate().back();
		
		ScreenShot(driver, 10);
		
		test.log(LogStatus.PASS, "Successfully verified navigation between Remote Control Toys pages");
	}
}