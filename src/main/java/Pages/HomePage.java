package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(css = "[class=\"cate_head\"]")
	private WebElement ShoppingCategoriesLink;
	
	@FindBy(partialLinkText = "Kids")
	private WebElement KidsAndToyslink;

	public WebElement getShoppingCategoriesLink() {
		return ShoppingCategoriesLink;
	}

	public WebElement getKidsAndToyslink() {
		return KidsAndToyslink;
	}

}
