package Maven;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Createjob {

	WebDriver driver;
	
	 

	
@Test(priority=1,description="When HC create a job with valid details")
public  void main() throws InterruptedException
	
	{
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;

		driver.findElement(By.xpath("//span[text()='Jobs schedule']")).click();
		driver.findElement(By.xpath("//span[text()='CREATE JOB']")).click();
		driver.findElement(By.xpath("//input[@name='jobTitle']")).sendKeys("Job12");
		driver.findElement(By.xpath("//textarea[@name='jobDescription']")).sendKeys("Test description for the job");
		Select drivers = new Select(driver.findElement(By.xpath("//select[@name='numberOfDrivers']")));
		drivers.selectByValue("1");
		driver.findElement(By.xpath("//button[@class='green-primary-btn-small create-job']")).click();
        WebElement licence = driver.findElement(By.xpath("//input[@id='CE']"));
        licence.click();
        driver.findElement(By.xpath(" //textarea[@placeholder='Add your special instructions.']")).sendKeys("Test special instructions");
        driver.findElement(By.xpath(" //button[@class='green-primary-btn-small create-job']//span[text()='NEXT']")).click();
        driver.findElement(By.xpath("//input[@id='date-picker-field']")).click();
       
 //For getting the current date and time and splitting of all-----------------------------
       
        DateFormat dateFormat = new SimpleDateFormat("d/MMMM/yyyy");
        DateFormat dateFormat1 = new SimpleDateFormat("HH:mm");
        System.out.println(dateFormat);
		Date date = new Date();
		String date1 = dateFormat.format(date);
		  System.out.println(date1);
		  String[] date2 = date1.split("/");
		  String day = date2[0]; 
		  String month = date2[1];
		  String year =date2[2];
		  String monthyear= month+" "+year;
		  System.out.println(monthyear);
		  
		  String time = dateFormat1.format(date);
		  System.out.println(time);
	  
	         String[] time1 = time.split(":");
	    
			System.out.println(day);
			String hour=time1[0];
			String mins=time1[1];
			 int hrs = Integer.parseInt(hour) + 1;
		System.out.println(hrs);
		
//--------------------------------------------------------------------------------------------------
		Thread.sleep(100);
			driver.findElement(By.xpath("//div[@aria-label='day-"+day+"']")).click();	
			driver.findElement(By.xpath("//input[@placeholder='0']")).click();
			driver.findElement(By.xpath("//span[text()="+hrs+"]")).click();
			driver.findElement(By.xpath("//input[@placeholder='00']")).click();
			driver.findElement(By.xpath("//span[text()='55']")).click();
		    WebElement autoOptions=driver.findElement(By.xpath("//input[@name='destination']"));
			autoOptions.sendKeys("280"); 
			Thread.sleep(2000);
			autoOptions.sendKeys(Keys.ARROW_DOWN); autoOptions.sendKeys(Keys.ENTER);
			Thread.sleep(1000);
			Select expectedhours = new Select(driver.findElement(By.xpath("//select[@name='expected-shift-duration']")));
		    expectedhours.selectByIndex(2);
			driver.findElement(By.xpath("//button[@class='green-primary-btn-small create-job']//span[text()='CREATE JOB']")).click();
			Thread.sleep(4000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollDown = arguments[1];",driver.findElement(By.xpath("//*[@id='657']")), 100);
			WebElement oCheckBox = driver.findElement(By.xpath("//*[@id='657']"));
			oCheckBox.click();
		     driver.findElement(By.xpath("//button[@class='green-primary-btn-small send-job-to-driver']")).click();
		     
	}
@Test(priority=2,description="Verify that Create job button disable on Step 1")
public  void nextbuttondisable () throws InterruptedException

{
	
	Thread.sleep(2000);
	
driver.findElement(By.xpath("//span[text()='CREATE JOB']")).click();


	WebElement e = driver.findElement(By.xpath("//button[@class='green-primary-btn-small create-job']"));

	
	Assert.assertFalse(e.isEnabled(),"Button is enabled");
	System.out.println("Testcase passed as button is disable");
	
	      
	
}

@Test(priority=3,description="Verify Next button is disable on Step 2 of create job when redirectiong from step 1")
public  void nextbuttondisableandbackbuttonenable () throws InterruptedException

{
	
Thread.sleep(3000);
driver.findElement(By.xpath("//span[text()='Jobs schedule']")).click();
driver.findElement(By.xpath("//span[text()='CREATE JOB']")).click();

driver.findElement(By.xpath("//input[@name='jobTitle']")).sendKeys("Job2");
driver.findElement(By.xpath("//textarea[@name='jobDescription']")).sendKeys("Test description for the job");
Select drivers = new Select(driver.findElement(By.xpath("//select[@name='numberOfDrivers']")));
drivers.selectByValue("1");

driver.findElement(By.xpath("//button[@class='green-primary-btn-small create-job']")).click();
Thread.sleep(1000);
	WebElement e1 = driver.findElement(By.xpath("//div[@class='form-input-group faded-field']/button[@class='green-primary-btn-small create-job']"));

	
	Assert.assertFalse(e1.isEnabled(),"Button is enabled");
	System.out.println("Testcase passed as button is disable");
	
	
         
	
}

@Test(priority=4,description="When back button enable on Step2 and redirection working or not")
public  void nextbuttondisableasndbackbuttonenable () throws InterruptedException

{
	
WebElement e1 = driver.findElement(By.xpath("//div[@class='form-input-group faded-field']/button[@class='green-primary-btn-small create-job']"));

	
	Assert.assertFalse(e1.isEnabled(),"Button is enabled");
	System.out.println("Testcase passed as button is enable");
	driver.findElement(By.xpath("//button[@class='green-primary-btn-small create-job']/span[text()='Back']")).click();
	 WebElement Element1 = driver.findElement(By.xpath("//h2[@class='create-job-form-title']//span[text()='Create a job']"));
     System.out.println(Element1.getText());
     
    // String myurl = driver.getCurrentUrl();
     //System.out.println(myurl);
     String expectedtext = "Create a job";
    //Through text
     Assert.assertEquals(Element1.getText(),expectedtext,"testcase passed with invalid details");
     
       System.out.println("Successfully passed ");
      
	      
}

@Test(priority=5,description="Verify Next button is disable on Step 2 of create job when redirectiong from step 1")
public  void nextbuttonenable() throws InterruptedException

{
	
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
driver.findElement(By.xpath("//span[text()='Jobs schedule']")).click();
driver.findElement(By.xpath("//span[text()='CREATE JOB']")).click();

driver.findElement(By.xpath("//input[@name='jobTitle']")).sendKeys("Job2");
driver.findElement(By.xpath("//textarea[@name='jobDescription']")).sendKeys("Test description for the job");
Select drivers = new Select(driver.findElement(By.xpath("//select[@name='numberOfDrivers']")));
drivers.selectByValue("1");

driver.findElement(By.xpath("//button[@class='green-primary-btn-small create-job']")).click();
WebElement licence = driver.findElement(By.xpath("//input[@id='CE']"));
licence.click();
driver.findElement(By.xpath(" //textarea[@placeholder='Add your special instructions.']")).sendKeys("Test special instructions");
Thread.sleep(1000);
	WebElement e1 = driver.findElement(By.xpath("//div[@class='form-input-group']/button[@class='green-primary-btn-small create-job']"));

	
	Assert.assertTrue(e1.isEnabled(),"Button is enabled");
	System.out.println("Testcase passed as button is disable");
	
	
    
	
}
	
	      
	


           @BeforeTest
           public void beforeMethod() throws InterruptedException {
// Launch the Online Store Website
           String exePath = "C:\\Users\\ucreate-65\\Downloads\\chromedriver_win32\\chromedriver.exe";
           System.setProperty("webdriver.chrome.driver", exePath);
           driver = new ChromeDriver();
           driver.manage().window().maximize();
           driver.get("https://uat-connected-2-webapp.herokuapp.com/hclogin");
           driver.findElement(By.xpath("//input[@name='email']")).sendKeys("connected@yopmail.com");
           driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Test123");
           driver.findElement(By.xpath("//button[@class='green-primary-btn']")).click();
         


}
}
