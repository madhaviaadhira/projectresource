package projectnew;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseclassPage {

	static WebDriver driver;
	public static WebDriver launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MADHAVI\\eclipse-workspace\\Snapdeal\\src\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		return driver;
		
	}
	public static void loadurl(String url)
	{
		driver.get(url);
	}
	public static void fill(WebElement e,String value)
	{
		e.sendKeys(value);
	}
	public static void btnclick(WebElement e)
	{
		e.click();
	}
	public static void getTitle()
	{
		driver.getTitle();
	}
	public static void getCurrenturl()
	{
		driver.getCurrentUrl();
	}
	public static void Sbi(WebElement e,int index)
	{
		Select s=new Select(e);
		s.selectByIndex(index);
	}
	public static void Sbv(WebElement e,String value)
	{
		Select s=new Select(e);
		s.selectByValue(value);
	}
	public static void Svt(WebElement e,String value)
	{
		Select s=new Select(e);
		s.selectByVisibleText(value);
	}
	public static void alert(WebElement e)
	{
		Alert a=driver.switchTo().alert();
		a.accept();
	}
	
	public static void winhand()
	{
		String parent=driver.getWindowHandle();
	}
	public static void winhands()
	{
		Set<String> allwin=driver.getWindowHandles();
		for(String v:allwin)
		{
				driver.switchTo().window(v);}
     }
	public static void robo() throws AWTException
	{
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.KEY_RELEASED);
	}
}

			
         
		

	  
	  

