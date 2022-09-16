package PageObjects;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class contactuslandingpage{
	WebDriver driver;
	public contactuslandingpage(WebDriver driver) {
	     this.driver=driver;
	     PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//body/nav[@id='navbar']/div[@id='navbarSupportedContent']/ul[@class='navbar-nav mx-auto']/li[4]/a[1]")
	WebElement support;
	@FindBy(xpath="//a[@class='dropdown-item'][normalize-space()='Contact Us']")
	WebElement contactus;
	@FindBy(xpath="//input[@placeholder='Username']")
	WebElement username;
	@FindBy(xpath="//input[@placeholder='Email']")
	WebElement Email;
	@FindBy(xpath="//input[@placeholder='Phone']")
	WebElement phonenumber;
	@FindBy(xpath="//textarea[@placeholder='Message']")
	WebElement message;
	@FindBy(xpath="//input[@value='Send']")
	WebElement send;
	
	public void goTo()
    {
        driver.get("https://mobileworld.banyanpro.com/");
    }
	public WebElement supportdrop()
    {
        return support;
    }
     public WebElement contactusdrop()
     {
         return contactus;
     }
     public WebElement username()
     {
         return username;
     }
     public WebElement Email()
     {
         return Email;
     }
     public WebElement phonenumber()
     {
         return phonenumber;
     }
     public WebElement message()
     {
         return message;
     }
     public WebElement send()
     {
         return send;
     }
}

