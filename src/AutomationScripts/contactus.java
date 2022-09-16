package AutomationScripts;

import org.testng.annotations.Test;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjects.contactuslandingpage;
public class contactus{
	//@SuppressWarnings("deprecation")
	@Test(dataProvider="contactus")
	public void contactuslandingpage(String username,String Email,String phonenumber,String message) throws Exception
	{
		 System.setProperty("webdriver.chrome.driver","C:/users/deepakraj.n/Downloads/chromedriver_win32/chromedriver.exe");
         WebDriver driver = new ChromeDriver();
         contactuslandingpage contactuspage = new contactuslandingpage(driver);
         contactuspage.goTo();
  //       driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
         contactuspage.supportdrop().click();
         Thread.sleep(1000);
         contactuspage.contactusdrop().click();
         Thread.sleep(1000);
         Set<String> id = driver.getWindowHandles();
         java.util.Iterator<String> it = id.iterator();
         String parentId = it.next();
         String childId = it.next();
         driver.switchTo().window(childId);
         driver.manage().window().maximize();
         contactuspage.username().sendKeys(username);
         Thread.sleep(1000);
         contactuspage.Email().sendKeys(Email);
         Thread.sleep(1000);
         contactuspage.phonenumber().sendKeys(phonenumber);
         contactuspage.message().sendKeys(message);
         Thread.sleep(1000);
         contactuspage.send().click();   
         driver.close();
	}
         
         @DataProvider(name="contactus")
         public Object[][] getdata()
         {
             Object [][] data=new Object[2][4];
              data [0][0]="Deepak";
              data [0][1]="deepak@gmail.com";
              data [0][2]="9876543212";
              data [0][3]="kuksnfn iefb jabf";
              
              data [1][0]="Nayak";
              data [1][1]="nayak@gmail.com";
              data [1][2]="8296399944";
              data [1][3]="humaaaa babeee";
              return data;
             
            }

        
         
         
	}


