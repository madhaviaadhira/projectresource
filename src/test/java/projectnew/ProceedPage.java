package projectnew;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProceedPage extends BaseclassPage
{
	public ProceedPage()throws Throwable
	{
		PageFactory.initElements(driver,this);
	}
	@FindBy(id="make-payment")
	private WebElement paymentok;
	
	public WebElement getPaymentok() {
		return paymentok;
	}
	
	

}

