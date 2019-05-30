package Maven;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


	public class Login
	{
		WebDriver driver;
	
		
		
//		
//
@Test(priority=6)
          public void testwithvaliddetails() {
	driver.findElement(By.xpath("//input[@name='email']")).clear();
	driver.findElement(By.xpath("//input[@name='password']")).clear();
		 
		 // Find the element that's ID attribute is 'account'(My Account)
		 
		      driver.findElement(By.xpath("//input[@name='email']")).sendKeys("connected@yopmail.com");
		 
		     
		 
		      driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Test123");
		 
		      // Now submit the form. WebDriver will find the form for us from the element
		 
		      driver.findElement(By.xpath("//button[@class='green-primary-btn']")).click();
		      //Explicit
		      WebDriverWait wait = new WebDriverWait(driver, 10);
		      WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Unallocated jobs')]")));
		      
		      //Implicit
		      //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		      
		      //WebElement Element1 = driver.findElement(By.xpath("//span[contains(text(),'Unallocated jobs')]"));
		      
		      System.out.println(element.getText());
		      String expectedtext="Unallocated jobs";
		      
		     // String myurl = driver.getCurrentUrl();
		      
		      //String expectedurl = "https://uat-connected-2-webapp.herokuapp.com/hc/dashboard";
		     
		      
		      //Through text
		      
		      Assert.assertEquals(element.getText(),expectedtext,"testcase passed with valid email and password");
		      
		      
		        System.out.println("Successfully passed!");
		 
		    
		 
		  }
		 
		
@Test(priority=1)
		  public void testwithvalidpassword() {
	
		 
		 // Find the element that's ID attribute is 'account'(My Account)
		 
		      driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Test123");
		 
		      // Now submit the form. WebDriver will find the form for us from the element
		 
		      driver.findElement(By.xpath("//button[@class='green-primary-btn']")).click();
		      //Explicit
		      //WebDriverWait wait = new WebDriverWait(driver, 10);
		     // WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Unallocated jobs')]")));
		      
		      //Implicit
		      
		      
		      WebElement Element1 = driver.findElement(By.xpath("//span[@class='error']/span"));
		      System.out.println(Element1.getText());
		      
		     // String myurl = driver.getCurrentUrl();
		      //System.out.println(myurl);
		      String expectedtext = "Please provide both your username and password";
		     //Through text
		      Assert.assertEquals(Element1.getText(),expectedtext,"testcase passed with valid email");
		      
		        System.out.println("Successfully passed!");
		 
		    
		 
		  }
		  

		  @Test(priority=2)
		  public void testwithvalidemail() {
			
				driver.findElement(By.xpath("//input[@name='password']")).clear();
		 
		 // Find the element that's ID attribute is 'account'(My Account)
		 
			  driver.findElement(By.xpath("//input[@name='email']")).sendKeys("connected@yopmail.com");
		 
		      // Now submit the form. WebDriver will find the form for us from the element
		 
		      driver.findElement(By.xpath("//button[@class='green-primary-btn']")).click();
		      //Explicit
		      //WebDriverWait wait = new WebDriverWait(driver, 10);
		     // WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Unallocated jobs')]")));
		      
		      //Implicit
		      
		      
		      WebElement Element1 = driver.findElement(By.xpath("//span[@class='error']/span"));
		      System.out.println(Element1.getText());
		      
		     // String myurl = driver.getCurrentUrl();
		      //System.out.println(myurl);
		      String expectedtext = "Please provide both your username and password";
		     //Through text
		      Assert.assertEquals(Element1.getText(),expectedtext,"testcase passed with valid email");
		      
		        System.out.println("Successfully passed ");
		 
		    
		 
		  }
		
		  @Test(priority=3)
		  public void testwithinvaliddetails() {
				 
				 // Find the element that's ID attribute is 'account'(My Account)
			  driver.findElement(By.xpath("//input[@name='email']")).clear();
				 
					  driver.findElement(By.xpath("//input[@name='email']")).sendKeys("connected123@yopmail.com");
				 
				      // Now submit the form. WebDriver will find the form for us from the element
					  driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Test123345345");
				 
				      driver.findElement(By.xpath("//button[@class='green-primary-btn']")).click();
				      //Explicit
				      //WebDriverWait wait = new WebDriverWait(driver, 10);
				     // WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Unallocated jobs')]")));
				      
				      //Implicit
				      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				      
				      WebElement Element1 = driver.findElement(By.xpath("//span[@class='error']/span"));
				      System.out.println(Element1.getText());
				      
				     // String myurl = driver.getCurrentUrl();
				      //System.out.println(myurl);
				      String expectedtext = "The username or password you have entered is incorrect";
				     //Through text
				      Assert.assertEquals(Element1.getText(),expectedtext,"testcase passed with invalid details");
				      
				        System.out.println("Successfully passed ");
		  }
		
	@Test(priority=4)
		  public void testwithinvalidemail() {
				 
				 // Find the element that's ID attribute is 'account'(My Account)
		driver.findElement(By.xpath("//input[@name='email']")).clear();
		driver.findElement(By.xpath("//input[@name='password']")).clear();
		
				 
					  driver.findElement(By.xpath("//input[@name='email']")).sendKeys("connected1@yopmail.com");
				 
				      // Now submit the form. WebDriver will find the form for us from the element
					  driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Test123");
				 
				      driver.findElement(By.xpath("//button[@class='green-primary-btn']")).click();
				      //Explicit
				      //WebDriverWait wait = new WebDriverWait(driver, 10);
				     // WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Unallocated jobs')]")));
				      
				      //Implicit
				      
				      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				      WebElement Element1 = driver.findElement(By.xpath("//span[@class='error']/span"));
				      System.out.println(Element1.getText());
				      
				     // String myurl = driver.getCurrentUrl();
				      //System.out.println(myurl);
				      String expectedtext = "The username or password you have entered is incorrect";
				     //Through text
				      Assert.assertEquals(Element1.getText(),expectedtext,"testcase passed with invalid email");
				      
				        System.out.println("Successfully passed ");
		  }
		
		@Test(priority=5)
		  public void testwithinvalidpassword() {
				 
				 // Find the element that's ID attribute is 'account'(My Account)
			driver.findElement(By.xpath("//input[@name='email']")).clear();
			driver.findElement(By.xpath("//input[@name='password']")).clear();
				 
					  driver.findElement(By.xpath("//input[@name='email']")).sendKeys("connected@yopmail.com");
				 
				      // Now submit the form. WebDriver will find the form for us from the element
					  driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Test123345345");
				 
				      driver.findElement(By.xpath("//button[@class='green-primary-btn']")).click();
				      //Explicit
				      //WebDriverWait wait = new WebDriverWait(driver, 10);
				     // WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Unallocated jobs')]")));
				      
				      //Implicit
				      
				      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				      WebElement Element1 = driver.findElement(By.xpath("//span[@class='error']/span"));
				      System.out.println(Element1.getText());
				      
				     // String myurl = driver.getCurrentUrl();
				      //System.out.println(myurl);
				      String expectedtext = "The username or password you have entered is incorrect";
				     //Through text
				      Assert.assertEquals(Element1.getText(),expectedtext,"testcase passed with invalid password");
				      
				        System.out.println("Successfully passed ");
		  }
		  
		  		  		  
		 @BeforeTest
	    public void beforeMethod() throws InterruptedException {
		// Launch the Online Store Website
		String exePath = "C:\\Users\\ucreate-65\\Downloads\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://uat-connected-2-webapp.herokuapp.com/hclogin");
		
		 WebDriverWait wait = new WebDriverWait(driver,10);
		 wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//*[@id=\"hubspot-messages-iframe-container\"]/iframe")));
		
		 WebElement closeicon;
		 closeicon= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath( "/html/body/div/div[1]/span/div[2]/div/button/span/span")));
		 closeicon.click();
		
		
	    driver.switchTo().defaultContent();}

	

	    @AfterTest

	    public void afterMethod() {

		// Close the driver

		driver.quit();

	}

}