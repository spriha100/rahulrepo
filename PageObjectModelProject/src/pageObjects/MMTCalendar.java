package pageObjects;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MMTCalendar {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","S:\\EclipseWork\\seleniumautomation\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	     driver.get("https://www.makemytrip.com/");
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     
	    WebElement e= driver.findElement(By.id("hp-widget__return"));
	    e.click();
	     
	     
	     
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    // List<WebElement> months=driver.findElements(By.xpath("//span[contains(@class,'ui-datepicker-month')]"));
	     driver.findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-last']/table/tbody/tr/td/a[contains(text(),'23')]")).click();
	    /* for(WebElement n:data)
	     {	 System.out.println(n);
	    	
	     String z=n.getText();
			if(z.equalsIgnoreCase("28"))
			{
				n.click();
				break;
			}
	     }*/
	    /* for(WebElement b:months)
	    	 {
	    	 String month=b.getText();
			if(month.equalsIgnoreCase("March"))
			{
				List<WebElement> allDates=  driver.findElements(By.tagName("td"));
				 for(WebElement a:allDates)
		    	 {
		    	 String date=a.getText();
					if(date.equalsIgnoreCase("28"))
					{
						a.click();
						break;
					}
		    	 }
				
			} 
	    	}
	    
*/
	}

}
