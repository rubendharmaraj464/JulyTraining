package seleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;


public class DragndDrop {

	public static void main(String[] args) throws Exception
	{
		  System.setProperty("webdriver.chrome.driver", "C:\\Personal\\Selenium\\chromedriver_win32\\chromedriver.exe");  
		  WebDriver driver=new ChromeDriver(); 
		  //Launch App URL
	      driver.navigate().to("https://the-internet.herokuapp.com/drag_and_drop"); 
         //Maximize the browser 
	      driver.manage().window().maximize();
	      
	      Thread.sleep(5000); 
	      
	      WebElement Source = driver.findElement(By.id("column-a"));
	      
	      WebElement Destination = driver.findElement(By.id("column-b"));
	      
	      Actions builder = new Actions(driver);
	      
	      builder.dragAndDrop(Source, Destination).build().perform();
	    //act.clickAndHold(Source).moveToElement(Destination).release().build().perform();
	      //dragdrop.perform();
	      
	      
	      
	      
	     // act.dragAndDrop(Source, Destination).build().perform();
	      
	      
	      
	  Thread.sleep(2000);    
	      
	      
	      

	}

}
