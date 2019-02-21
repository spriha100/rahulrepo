package tests;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.Home_Page;// Import package pageObjects.*
import pageObjects.Login_Page;
public class TC_01withTestNG {
private static WebDriver driver=null;

@BeforeTest
void setup()
{
System.setProperty("webdriver.chrome.driver","S:\\EclipseWork\\seleniumautomation\\driver\\chromedriver.exe");
	 driver= new ChromeDriver();
     driver.get("http://www.facebook.com");
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}
// Use page Object library now
@Test(priority=0)
void Login() throws AWTException
{
Login_Page.txtbx_UserName(driver).sendKeys("rahulkumar_8550@rediffmail.com");
Login_Page.txtbx_Password(driver).sendKeys("Shinjini@123");
Login_Page.btn_LogIn(driver).click();
Robot r=new Robot();
r.keyPress(KeyEvent.VK_TAB);
r.keyPress(KeyEvent.VK_ENTER);
}
@Test(priority=1)
void ClickOnProfile() 
{
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
Home_Page.lnk_Profile(driver).click();


}
@Test(priority=2)
void AccountSetting()
{
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	Home_Page.lnk_AccountSetting(driver).click();
	}
@Test(priority=3)
void LogOut()
{
System.out.println("Clicked on Account setting");
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
Home_Page.lnk_LogOut(driver).click(); 
System.out.println("Succesfully Logged out");
}
@AfterTest
void TearDown()
{
driver.close();
}}
