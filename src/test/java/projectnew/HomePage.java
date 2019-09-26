package projectnew;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BaseclassPage
{
	public HomePage()
	{
		PageFactory.initElements(driver,this);
	}

	@FindBy(id="inputValEnter")
	private WebElement searchbar;
	@FindBy(xpath="//*[@class='searchformButton col-xs-4 rippleGrey']")
	private WebElement Search;
	@FindBy(xpath="//*[@class='product-title ']")
	private WebElement iphonex;
	@FindBy(xpath="//div[@data-state='Buy Now']")
	private WebElement buynow;
	
	public WebElement getSearchbar() {
		return searchbar;
	}
	
	public WebElement getSearch() {
		return Search;
	}
	
	public WebElement getIphonex() {
		return iphonex;
	}

	public WebElement getBuynow() {
		return buynow;
	}

	
	
	
}
