package seleniumScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Waits {

	public static void main(String[] args) 
	{
		
		  System.setProperty("webdriver.chrome.driver", "C:\\Personal\\Selenium\\chromedriver_win32\\chromedriver.exe");  
		  WebDriver driver=new ChromeDriver(); 
		  //Launch App URL
	      driver.navigate().to("https://www.softwaretestingmaterial.com/software-testing/"); 
	      
	      driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	      ///
	      //
	      //
	      //
         //Maximize the browser 
	      driver.manage().window().maximize();
	      
	      ///Explicit wait
	      WebElement btn = driver.findElement(By.xpath("//*[contains(text(),'Click for JS Alert')]"));
	      
	      WebDriverWait waitobj = new WebDriverWait(driver,20);
	      
	      waitobj.until(ExpectedConditions.elementToBeClickable(btn));
	      
	      btn.click();
	      
	      
	}

}
