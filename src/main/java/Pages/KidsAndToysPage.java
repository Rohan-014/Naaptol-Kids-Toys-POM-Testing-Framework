package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KidsAndToysPage {
	
	WebDriver driver;
	
	public KidsAndToysPage(WebDriver driver) {
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "Soft Toys")
	private WebElement SoftToysLink;
	
	@FindBy(css = "[title='Remote Control Toys']")
	private WebElement remoteControlToysLink;
	
	@FindBy(linkText = "Learning & Activity")
	private WebElement learningAndActivityLink;
	
	@FindBy(linkText = "Unique Toys")
	private WebElement uniqueToysLink;
	
	public WebElement getSoftToysLink() {
		return SoftToysLink;
	}

	public WebElement getRemoteControlToysLink() {
		return remoteControlToysLink;
	}

	public WebElement getLearningAndActivityLink() {
		return learningAndActivityLink;
	}

	public WebElement getUniqueToysLink() {
		return uniqueToysLink;
	}
	
	@FindBy(linkText = "Click here to Buy")
	private WebElement ClickHereToBuyLink;

	public WebElement getClickHereToBuyLink() {
		return ClickHereToBuyLink;
	}
	
	@FindBy(xpath = "//ul[@id='shopCartHead']/li[2]/a[2]")
	private WebElement proceedToCheckoutLink;

	public WebElement getProceedToCheckoutLink() {
		return proceedToCheckoutLink;
	}
	
}
