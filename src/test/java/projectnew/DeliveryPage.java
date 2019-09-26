package projectnew;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeliveryPage extends BaseclassPage 
{
	public DeliveryPage()throws Throwable
	{
		PageFactory.initElements(driver,this);
	}

	@FindBy(id="zip")
	private WebElement pincode;
	@FindBy(id="fullName")
	private WebElement firstname;
	@FindBy(id="address")
	private WebElement address;
	@FindBy(id="nearestLandmark")
	private WebElement landmark;
	@FindBy(id="city")
	private WebElement city;
	@FindBy(id="state")
	private WebElement state;
	@FindBy(id="mobile")
	private WebElement mobile;
	@FindBy(id="home-mobile")
	private WebElement home;
	@FindBy(id="delivery-modes-continue")
	private WebElement select;
	public WebElement getPincode() {
		return pincode;
	}
	
	public WebElement getFirstname() {
		return firstname;
	}
	
	public WebElement getAddress() {
		return address;
	}
	
	public WebElement getLandmark() {
		return landmark;
	}
	
	public WebElement getCity() {
		return city;
	}
	
	public WebElement getState() {
		return state;
	}
	
	public WebElement getMobile() {
		return mobile;
	}
	
	public WebElement getHome() {
		return home;
	}
	
	public WebElement getSelect() {
		return select;
	}
	
	
	
			
	
	

}
