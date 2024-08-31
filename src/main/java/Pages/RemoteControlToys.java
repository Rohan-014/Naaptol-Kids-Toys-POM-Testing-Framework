package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RemoteControlToys {
	
	WebDriver driver;
	
	public RemoteControlToys(WebDriver driver) {
		
		this.driver = driver;
		 PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(linkText = "Airplanes & Helicopters")
	private WebElement airplanesAndHelicoptersLink;
	
	@FindBy(xpath = "//li[2]/a[contains(text(),'RC Cars and Collectibles')]")
	private WebElement RCCarsAndCollectiblesLink;
	
	public WebElement getAirplanesAndHelicoptersLink() {
		return airplanesAndHelicoptersLink;
	}

	public WebElement getRCCarsAndCollectiblesLink() {
		return RCCarsAndCollectiblesLink;
	}

}//*[contains(text(), 'Buy 1 Get 1 Free')]
