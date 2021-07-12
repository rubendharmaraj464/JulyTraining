package seleniumScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentTest;

public class AlertsHandling extends Reporting
{

	public static void main(String[] args) 
	{
		  System.setProperty("webdriver.chrome.driver", "C:\\Personal\\Selenium\\chromedriver_win32\\chromedriver.exe");  
		  WebDriver driver=new ChromeDriver(); 
		  //Launch App URL
		  ExtentTest tc1 = extent.createTest("TC001-Verify Login");
		  try {
	      driver.navigate().to("https://the-internet.herokuapp.com/javascript_alerts"); 
         //Maximize the browser 
	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	      tc1.pass("Launch Application URL");
		  }catch(Exception e)
		  {
			  tc1.fail("Launch Application URL");
		  }
	      
	      
	      
	      //JS ALERT
	      driver.findElement(By.xpath("//*[contains(text(),'Click for JS Alert')]")).click(); // 6th sec  20sec---14
	      String jsalert = driver.switchTo().alert().getText();	      
	      System.out.println(jsalert);	      
	      driver.switchTo().alert().accept();
	      
	      //JS CONFIRM
          driver.findElement(By.xpath("//*[contains(text(),'Click for JS Confirm')]")).click();
	      String jsConfirm = driver.switchTo().alert().getText();	      
	      System.out.println(jsConfirm);	      
	      driver.switchTo().alert().dismiss();
	      
	      
	      //JS PROMPT
          driver.findElement(By.xpath("//*[contains(text(),'Click for JS Prompt')]")).click();
	      String jsPrompt = driver.switchTo().alert().getText();	      
	      System.out.println(jsPrompt);
	      driver.switchTo().alert().sendKeys("Testing Alerts");
	      driver.switchTo().alert().accept();
	   
	   //   driver.switchTo().alert().sendKeys("Testing Alerts");
	      
	      
	      
	      
	      
	      
	      
	     
	      
	     

	}

}
