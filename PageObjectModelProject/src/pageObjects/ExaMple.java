package pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ExaMple {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","S:\\EclipseWork\\seleniumautomation\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	    driver.get("https://fletcherbuilding.com/our-business/distribution/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    WebElement business=driver.findElement(By.xpath("//*[@id='MainWrapper']/div[4]/div/div[3]/select"));
	    Select s =new Select(business);
	    s.selectByVisibleText("Distribution");
	    
	    
	    
	     
	
	}

}
