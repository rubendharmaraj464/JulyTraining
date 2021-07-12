package seleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserNavigations {

	public static void main(String[] args) {
		
		  System.setProperty("webdriver.chrome.driver", "C:\\Personal\\Selenium\\chromedriver_win32\\chromedriver.exe");  
		  WebDriver driver=new ChromeDriver(); 
		  //Launch App URL
	      driver.navigate().to("https://www.softwaretestingmaterial.com/software-testing/"); 
         //Maximize the browser 
	      driver.manage().window().maximize();
	      
	      driver.findElement(By.id("menu-item-6227")).click();
	      
	      //driver.navigate().refresh();
	      
	      driver.navigate().back();
	      
	      driver.navigate().forward();
	      
	      driver.close();
	      
	      
	      

	}

}
