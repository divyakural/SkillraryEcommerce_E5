package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestingPage {
	//declaration
	//address of selenium 
	@FindBy(id="Selenium Training")
	private WebElement seleniumtrainingdrag;
	//address of mycart
	@FindBy(id="mycart")
	private WebElement mycartdrop;
	//address of facebook
	@FindBy(xpath="(//i[@class='fa fa-facebook'])[2]")
	private WebElement fbicon;
	//initialization
		public TestingPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
			
		}
		//utilization
		public void fbbtn()
		{
			fbicon.click();
		}
		public WebElement getSeleniumtrainingdrag() {
			return seleniumtrainingdrag;
		}
		public WebElement getMycartdrop() {
			return mycartdrop;
		}
	

}
