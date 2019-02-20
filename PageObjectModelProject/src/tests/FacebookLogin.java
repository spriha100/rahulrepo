package tests;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FacebookLogin {
	public static void main(String[] args) 
	{
     System.setProperty("webdriver.chrome.driver","S:\\EclipseWork\\seleniumautomation\\driver\\chromedriver.exe");
	 WebDriver driver= new ChromeDriver();
     driver.get("http://www.facebook.com");
     driver.manage().window().maximize();
     WebDriverWait wait=new WebDriverWait(driver,20);
  // Wait till the element is clickable
  WebElement ele=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(@title,'Go to Facebook home')]")));
  ele.click();
  System.out.println("Clicked on the link");
  driver.close();

	}

}
