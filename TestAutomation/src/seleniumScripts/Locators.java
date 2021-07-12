package seleniumScripts;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Locators {
	public String name = null;
	public void Testmethod()
	{
		System.out.println("This is locators method");
	}

	public static void main(String[] args) throws Exception {
		
		   Reporting obj  =  new Reporting();
		
		  // ExtentTest test = obj.reports.createTest("TC001-Validate Login");
	       
	     
		
		  System.setProperty("webdriver.chrome.driver", "C:\\Personal\\Selenium\\chromedriver_win32\\chromedriver.exe");  
		  WebDriver driver=new ChromeDriver(); 
		  //Launch App URL
		  try {
	      driver.navigate().to("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
	      //test.log(Status.PASS, "Launch URL");
		  
         //Maximize the browser 
	      driver.manage().window().maximize();
	      Thread.sleep(5000);
		  }catch(Exception e)
		  {
			  //test.log(Status.FAIL, "Launch URL");
		  }
		  
		  
	     // driver.findElement(By.linkText("Sign in")).click();
	      
	    //  driver.findElement(By.partialLinkText("create an")).click();
	      
	     // driver.findElement(By.partialLinkText("previous amendment")).click();
	      
	    //  driver.findElement(By.xpath("/html/body/form/div[3]/input[1]")).sendKeys("Tester");
		  try {
	      
	      driver.findElement(By.xpath("//*[@id=\'ctl00_MainContent_username\']")).sendKeys("Tester");
	    //  test.log(Status.PASS, "Enter UserName");
	      
	      driver.findElement(By.xpath("//input[@name = 'ctl00$MainContent$password']")).sendKeys("test");
	   //   test.log(Status.PASS, "Enter Password");
	      
	      driver.findElement(By.name("ctl00$MainContent$login_button")).click();
	    //  test.log(Status.PASS, "Click on Login");
		  }catch(Exception e)
		  {
			// test.log(Status.FAIL, "Click on Login");
		  }
	      
	      String Title = driver.getTitle();
	      if(Title.equalsIgnoreCase("Web Orders"))
	      {
	    	  
	    	  driver.findElement(By.linkText("Order")).click();
	    	  Select se = new Select(driver.findElement(By.id("ctl00_MainContent_fmwOrder_ddlProduct")));
	    	  //se.selectByValue("ScreenSaver");
	    	  se.selectByIndex(2);
	    	  Thread.sleep(5000);
	    	  WebElement QunatityTxt = driver.findElement(By.name("ctl00$MainContent$fmwOrder$txtQuantity"));
	    	  QunatityTxt.clear();
	    	  QunatityTxt.sendKeys("20");
	    	  Thread.sleep(5000);
	    	  
	    	  driver.findElement(By.xpath("//*[@id=\'ctl00_MainContent_fmwOrder\']/tbody/tr/td/ol[1]/li[5]/input[2]")).click();
	    	  
	    	 // driver.findElement(By.xpath("//*[@value=\'Reset\']")).click();
	    	 
	    	  
	    	 // driver.findElement(By.id("ctl00_MainContent_fmwOrder_cardList_2")).click();
	    	  
	    	 // driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtTotal")).getText();
	    	  
	    	//  driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtTotal")).getAttribute("type");
	    	  
	    	  
	    	List<WebElement> list =  driver.findElements(By.className("btn_dark"));
	    	int count = list.size();
	    	System.out.println(count); 
	    	
			
			 for (WebElement ele : list) {
			    String btnvalue  =ele.getAttribute("value");
			    System.out.println(btnvalue);
			    if(btnvalue.equals("Reset"))
			    {
			    	ele.click();
			    }
			 }
			 
	    	  
	    	  
	      }
	      else
	      {
	    	  System.out.println("Login is not Sucess");
	      }
	      
	      
	      
	      

	}

}
