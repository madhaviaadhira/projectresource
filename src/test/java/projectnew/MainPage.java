package projectnew;

public class MainPage extends BaseclassPage
{
	public static void main(String[] args)throws Throwable
	{
		HomePage.launchBrowser();
		HomePage.loadurl("https://www.snapdeal.com/");
		driver.getTitle();
		getCurrenturl();
		HomePage hm=new HomePage();
		fill(hm.getSearchbar(),"iphonex");
		btnclick(hm.getSearch());
		btnclick(hm.getIphonex());
		winhand();
		winhands();
	    btnclick(hm.getBuynow());
	    LoginPage lp=new LoginPage();
	    fill(lp.getLogin(),"mmadhaviaadhira@gmail.com");
	    btnclick(lp.getCont());
	    fill(lp.getPass(),"aadhiraaadhira");
	    robo();
	    btnclick(lp.getLog());
	    DeliveryPage dp=new DeliveryPage();
	    fill(dp.getPincode(),"600075");
	    fill(dp.getFirstname(),"madhavi");
	    fill(dp.getAddress(),"no:14,shankar nagar,pammal");
	    fill(dp.getLandmark(),"near shankara vidhyalya");
	    fill(dp.getCity(),"chennai");
	    fill(dp.getState(),"TamilNadu");
	    fill(dp.getMobile(),"9888756545");
	    btnclick(dp.getHome());
	    btnclick(dp.getSelect());
	    ProceedPage pp=new ProceedPage();
	    btnclick(pp.getPaymentok());
	    PaymentPage pm=new PaymentPage();
	    fill(pm.getCardnum(),"6764784678467687");
	    Svt(pm.getExyr(),"05");
	    Svt(pm.getExmth(),"26");
	    fill(pm.getCvv(),"653");
	    btnclick(pm.getPay());
	    
	    
	}

}
