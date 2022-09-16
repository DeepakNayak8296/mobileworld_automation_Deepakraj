package PageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class signuplandingpage {
        
        WebDriver driver;
        public signuplandingpage(WebDriver driver)
        {
            this.driver=driver;
            PageFactory.initElements(driver, this);
        }
        @FindBy(xpath="//button[.='SIGN IN']")
        WebElement signin;
        @FindBy(xpath="//a[normalize-space()='Sign up']")
        WebElement signup;
        @FindBy(xpath="//input[@id='myName']")
        WebElement FirstName; 
        @FindBy(xpath="//input[@placeholder='Last Name']")
        WebElement LastName; 
        @FindBy(xpath="//input[@placeholder='Enter Email']")
        WebElement Email;
        @FindBy(xpath="//input[@placeholder='Password']")
        WebElement Password;
        @FindBy(xpath="//input[@type='date']")
        WebElement date;
        @FindBy(xpath="//div[@class='col-md-2']//input[@name='gender']")
        WebElement gender;
        @FindBy(xpath="//input[@placeholder='91XXXXXXXXXX']")
        WebElement phonenumber;
        @FindBy(xpath="//textarea[@placeholder='Short Bio']")       
        WebElement shortbio;
        @FindBy(xpath="//button[normalize-space()='Register']")
        WebElement register;
        
        public void goTo()
        {
            driver.get("https://mobileworld.banyanpro.com/");
        }
       
        public WebElement signin()
        {
        	return signin;
        }
        public WebElement signup()
        {
        return signup;
        }
        public WebElement FirstName()
        {
        	return FirstName;
        }
        public WebElement LastName()
        {
        	return LastName;
        }
        public WebElement Email()
        {
        	return Email;
        }
        public WebElement Password()
        {
        	return Password;
        }
        public WebElement date()
        {
        	return date;
        }
        public WebElement gender()
        {
        	return gender;
        }
        public WebElement phonenumber()
        {
        	return phonenumber;
        	
        }
        public WebElement shortbio()
        {
        	return shortbio;
        }
        public WebElement register()
        {
        	return register;
        }
}
