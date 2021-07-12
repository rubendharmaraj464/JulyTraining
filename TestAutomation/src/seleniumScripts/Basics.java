package seleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basics {

	public static void main(String[] args) throws Exception {
		
		// TODO Auto-generated method stub
		//  System.setProperty("webdriver.chrome.driver", "C:\\Personal\\Selenium\\chromedriver_win32\\chromedriver.exe");  
		  //WebDriver driver=new ChromeDriver(); 
		  //Launch App URL
		  ExcelHandling obj = new ExcelHandling();
		  obj.excelWrite();
		/*  obj.excelReader();
	      driver.navigate().to(obj.url); 
         //Maximize the browser 
	      driver.manage().window().maximize();
	      Thread.sleep(5000);
	      String LoginTitle  = driver.getTitle();
	      System.out.println("Login Page :"+LoginTitle);
	      driver.findElement(By.id("ctl00_MainContent_username")).sendKeys(obj.username);
          driver.findElement(By.name("ctl00$MainContent$password")).sendKeys(obj.password);
          driver.findElement(By.name("ctl00$MainContent$login_button")).click();
          String HomePageTitle  = driver.getTitle();
          System.out.println("Home Page :"+HomePageTitle);
          if(HomePageTitle.equals("Web Orders"))
          {
        	  System.out.println("Login is success");
          }
          else
          {
        	  System.out.println("Login is Unsuccess"); 
          }
          
          driver.findElement(By.linkText("Order")).click();  */
          //Close the Browser 
         // driver.quit();
          
         /// Locators obj = new Locators();
         // obj.Testmethod();
        		  
	}

}
