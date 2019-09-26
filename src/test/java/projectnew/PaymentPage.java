package projectnew;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentPage extends BaseclassPage
{
	public PaymentPage()throws Throwable
	{
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//*[@class='card_number change_card_fill valid']")
	private WebElement cardnum;
	@FindBy(id="CS2")
	private WebElement exyr;
	@FindBy(id="CS3")
	private WebElement exmth;
	@FindBy(xpath="//*[@class=\"security_code valid\"]")
	private WebElement cvv;
	@FindBy(id="creditcard-continue")
	private WebElement pay;
	public WebElement getCardnum() {
		return cardnum;
	}
	
	public WebElement getExyr() {
		return exyr;
	}
	
	public WebElement getExmth() {
		return exmth;
	}
	
	public WebElement getCvv() {
		return cvv;
	}
	
	public WebElement getPay() {
		return pay;
	
	}
}
