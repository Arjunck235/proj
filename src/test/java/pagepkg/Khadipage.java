package pagepkg;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Khadipage {
	ChromeDriver driver;
	@FindBy(xpath = "//*[@id=\"shopify-section-sections--22765508002114__header\"]/height-observer/x-header/nav[2]/a[1]/svg")
	WebElement loginbtnlick;
	@FindBy(xpath = "//*[@id=\"input-template--22765511868738__main--customeremail\"]")
	WebElement khusername;
	@FindBy(xpath = "//*[@id=\"input-template--22765511868738__main--customerpassword\"]")
	WebElement khpass;
	@FindBy(xpath = " //*[@id=\"customer_login\"]/button")
	WebElement khloginbtn;
	@FindBy(xpath = "//*[@id=\"shopify-section-sections--22765508002114__header\"]/height-observer/x-header/nav[2]/a[2]/svg")
	WebElement khsearchbtn;
	@FindBy(xpath = "//*[@id=\"predictive-search-form\"]/div/input")
	WebElement khsearch;
	@FindBy(xpath = "//*[@id=\"product-list-template--22765512491330__main\"]/product-card[1]/div[1]/a/img[2]")
	WebElement khsoap;
	@FindBy (xpath = "//*[@id=\"product-form-6722678849587-template--22765512425794__main\"]/div/buy-buttons/button[1]")
	WebElement khcart;
	
	public Khadipage(ChromeDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		}
	public void load()
	{
		loginbtnlick.click();
		
	}
	public void loginclick(String uname,String pass)
	{
		
		khusername.sendKeys(uname);
		khpass.sendKeys(pass);
		
	}
	
	public void login()
	{
		khloginbtn.click();
	}
	
   public void search()
   {
	   khsearchbtn.click();
	   
   }
   public void searchprodt (String value)
   {
	   khsearch.sendKeys(value);
	   
   }
   public void product()
   {
	   khsoap.click();
   }
  public void cartpge()

{
	  khcart.click();
	  }
}
