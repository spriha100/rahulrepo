package tests;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

public class FluentWaitExample {
	static WebDriver driver;
	public static void main(String[] args) 
	{
     System.setProperty("webdriver.chrome.driver","S:\\EclipseWork\\seleniumautomation\\driver\\chromedriver.exe");
	 driver= new ChromeDriver();
     driver.get("http://www.facebook.com");
     driver.manage().window().maximize();
   
  // Waiting 30 seconds for an element to be present on the page, checking
  // for its presence once every 5 seconds.  
 Wait<WebDriver> w = new FluentWait<WebDriver>(driver)
  .withTimeout(30,TimeUnit.SECONDS)
  .pollingEvery(5,TimeUnit.SECONDS)
  .ignoring(NoSuchElementException.class);
  //Function is an interface
  WebElement ele = w.until(new Function<WebDriver,WebElement>()
  {
    public WebElement apply(WebDriver driver) 
    {    	
    return driver.findElement(By.id("email"));
    }
    }
  );
  ele.sendKeys("rahul");//once 
  driver.quit();

	}

}
