package projectnew;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseclassPage
{
	public LoginPage()throws Throwable
	{
		PageFactory.initElements(driver,this);
	}

	@FindBy(id="username")
	private WebElement login;
	@FindBy(id="login-continue")
	private WebElement cont;
	@FindBy(id="w_password")
	private WebElement pass;
	@FindBy(id="login-done")
	private WebElement log;
	
	
	public WebElement getLogin() {
		return login;
	}
	
	public WebElement getCont() {
		return cont;
	}

	public WebElement getPass() {
		return pass;
	}

	

	public WebElement getLog() {
		return log;
	}

	
	
	
}
