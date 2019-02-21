 package pageObjects;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class Login_Page 
{
private static WebElement element = null;

public static WebElement txtbx_UserName(WebDriver driver)
{
 element = driver.findElement(By.id("email"));
 
 return element;
}

public static WebElement txtbx_Password(WebDriver driver)
{
element = driver.findElement(By.id("pass"));

return element;
}

public static WebElement btn_LogIn(WebDriver driver)
{
element = driver.findElement(By.xpath("//input[@value='Log In']"));

return element;

}

}