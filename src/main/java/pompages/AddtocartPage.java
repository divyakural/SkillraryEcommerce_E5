package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddtocartPage {
	//declaration
	//address of add to cart
	@FindBy(xpath="//button[text()=' Add to Cart']")
	private WebElement addtocartbtn;
	//address of + icon
	@FindBy(id="add")
	private WebElement addiconbtn;
	
	//initialization
		public AddtocartPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
			
		}
	//utilization

		public WebElement getAddiconbtn() {
			return addiconbtn;
		}

		public void addtocartbutton()
		{
			addtocartbtn.click();
		}

}
