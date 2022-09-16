package AutomationScripts;
import org.testng.annotations.Test;

import PageObjects.signuplandingpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class signup {
	@Test(dataProvider="signup") //SIGNUP
	 public void sign(String Firstname,String Lastname,String Email,String password,String date,String phonenumber,String shortbio) throws Exception
	 {
		System.setProperty("webdriver.chrome.driver","C:/users/deepakraj.n/Downloads/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
		
		signuplandingpage page=new signuplandingpage(driver);
        page.goTo();
        
        page.signin().click();
        Thread.sleep(1000);
        page.signup().click();
        Thread.sleep(1000);
        page.FirstName().sendKeys(Firstname);
        Thread.sleep(1000);
        page.LastName().sendKeys(Lastname);
        Thread.sleep(1000);
        page.Email().sendKeys(Email);
        Thread.sleep(1000);
        page.Password().sendKeys(password);
        Thread.sleep(1000);
        page.date().sendKeys(date);
        Thread.sleep(1000);
        page.gender().click();
        Thread.sleep(1000);
        page.phonenumber().sendKeys(phonenumber);
        Thread.sleep(1000);
        page.shortbio().sendKeys(shortbio);
        Thread.sleep(1000);
        page.register().click();
        Thread.sleep(1000);
        //driver.close();
	 }
	 @DataProvider(name="signup")
	    public Object[][] getdata()
	    {
	        Object [][] data=new Object[2][7];
	        data [0][0]="Deepak";
	        data [0][1]="raj";
	        data [0][2]="deepak@123";
	        data [0][3]="934f34";
	        data [0][4]="12/07/2000";
	        data [0][5]="9876543214";
	        data [0][6]="Good things";
	        data [1][0]="De";
	        data [1][1]="raj";
	        data [1][2]="deepak@123";
	        data [1][3]="934f34";
	        data [1][4]="12/07/2000";
	        data [1][5]="9876543214";
	        data [1][6]="Takes time";
	    return data;
	
	
}
}