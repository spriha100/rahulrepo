package tests;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.Home_Page;// Import package pageObjects.*
import pageObjects.Login_Page;
public class TC_01 {
private static WebDriver driver=null;
public static void main(String[] args) throws AWTException 
{
System.setProperty("webdriver.chrome.driver","S:\\EclipseWork\\seleniumautomation\\driver\\chromedriver.exe");
	 driver= new ChromeDriver();
     driver.get("http://www.facebook.com");
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
// Use page Object library now
Login_Page.txtbx_UserName(driver).sendKeys("rahulkumar_8550@rediffmail.com");
Login_Page.txtbx_Password(driver).sendKeys("Shinjini@123");
Login_Page.btn_LogIn(driver).click();
System.out.println("Login Successfully");
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
/*Robot r=new Robot();
r.keyPress(KeyEvent.VK_TAB);
r.keyPress(KeyEvent.VK_ENTER); */
Home_Page.lnk_Profile(driver).click();
System.out.println("Clicked on profile");
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
Home_Page.lnk_AccountSetting(driver).click();
System.out.println("Clicked on Account setting");
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
Home_Page.lnk_LogOut(driver).click(); 
System.out.println("Succesfully Logged out");
driver.close();
}
}