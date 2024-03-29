package Maven;



import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Rateupdate {

	WebDriver driver;
	int ERP=1;
	


	@Test(priority=1,description="Verify Error messagw will comes up when HC not filled in LTD and payee rates")
	public void blankLTDrate() throws InterruptedException {

		
		
		
	driver.findElement(By.xpath("//input[@id='AM']")).clear();

	driver.findElement(By.xpath("//input[@id='overtimeAM']")).clear();
		
	driver.findElement(By.xpath("//input[@id='PM']")).clear();

	driver.findElement(By.xpath("//input[@id='overtimePM']")).clear();

	driver.findElement(By.xpath("//input[@id='saturdayRate']")).clear();

	driver.findElement(By.xpath("//input[@id='sundayRate']")).clear();

	driver.findElement(By.xpath("//input[@id='bankHolidayRate']")).clear();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//button[@class='green-primary-btn']")).click();

	SoftAssert softAssert = new SoftAssert(); 
	String ActualErrorMEssage =driver.findElement(By.xpath("//input[@id='AM']//following::span[2]")).getText(); 
	String ActualErrorMEssage2 =driver.findElement(By.xpath("//input[@id='overtimeAM']//following::span[2]")).getText(); 
	String ActualErrorMEssage3 =driver.findElement(By.xpath("//input[@id='PM']//following::span[2]")).getText(); 
	String ActualErrorMEssage4 =driver.findElement(By.xpath("//input[@id='overtimePM']//following::span[2]")).getText(); 
	String ActualErrorMEssage5 =driver.findElement(By.xpath("//input[@id='saturdayRate']//following::span[2]")).getText(); 
	String ActualErrorMEssage6 =driver.findElement(By.xpath("//input[@id='sundayRate']//following::span[2]")).getText(); 
	String ActualErrorMEssage7 =driver.findElement(By.xpath("//input[@id='bankHolidayRate']//following::span[2]")).getText(); 
	String ExpectedErrorMEssage="This is a required field";
	softAssert.assertEquals(ActualErrorMEssage,ExpectedErrorMEssage);
	softAssert.assertEquals(ActualErrorMEssage2,ExpectedErrorMEssage);
	softAssert.assertEquals(ActualErrorMEssage3,ExpectedErrorMEssage);
	softAssert.assertEquals(ActualErrorMEssage4,ExpectedErrorMEssage);
	softAssert.assertEquals(ActualErrorMEssage5,ExpectedErrorMEssage);
	softAssert.assertEquals(ActualErrorMEssage6,ExpectedErrorMEssage);
	softAssert.assertEquals(ActualErrorMEssage7,ExpectedErrorMEssage);
	softAssert.assertAll();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//span[text()='LTD']")).click();
	driver.findElement(By.xpath("//input[@id='AM']")).clear();

	driver.findElement(By.xpath("//input[@id='overtimeAM']")).clear();

	driver.findElement(By.xpath("//input[@id='PM']")).clear();

	driver.findElement(By.xpath("//input[@id='overtimePM']")).clear();

	driver.findElement(By.xpath("//input[@id='saturdayRate']")).clear();
	driver.findElement(By.xpath("//input[@id='sundayRate']")).clear();

	driver.findElement(By.xpath("//input[@id='bankHolidayRate']")).clear();
	Thread.sleep(500);
	driver.findElement(By.xpath("//button[@class='green-primary-btn']")).click();
	SoftAssert softAssert1 = new SoftAssert(); 
	String ActualErrorMEssage11 =driver.findElement(By.xpath("//input[@id='AM']//following::span[2]")).getText(); 
	String ActualErrorMEssage12 =driver.findElement(By.xpath("//input[@id='overtimeAM']//following::span[2]")).getText(); 
	String ActualErrorMEssage13 =driver.findElement(By.xpath("//input[@id='PM']//following::span[2]")).getText(); 
	String ActualErrorMEssage14 =driver.findElement(By.xpath("//input[@id='overtimePM']//following::span[2]")).getText(); 
	String ActualErrorMEssage15 =driver.findElement(By.xpath("//input[@id='saturdayRate']//following::span[2]")).getText(); 
	String ActualErrorMEssage16 =driver.findElement(By.xpath("//input[@id='sundayRate']//following::span[2]")).getText(); 
	String ActualErrorMEssage17 =driver.findElement(By.xpath("//input[@id='bankHolidayRate']//following::span[2]")).getText(); 
	String ExpectedErrorMEssage1="This is a required field";
	softAssert1.assertEquals(ActualErrorMEssage11,ExpectedErrorMEssage1);
	softAssert1.assertEquals(ActualErrorMEssage12,ExpectedErrorMEssage1);
	softAssert1.assertEquals(ActualErrorMEssage13,ExpectedErrorMEssage1);
	softAssert1.assertEquals(ActualErrorMEssage14,ExpectedErrorMEssage1);
	softAssert1.assertEquals(ActualErrorMEssage15,ExpectedErrorMEssage1);
	softAssert1.assertEquals(ActualErrorMEssage16,ExpectedErrorMEssage1);
	softAssert1.assertEquals(ActualErrorMEssage17,ExpectedErrorMEssage1);
	softAssert1.assertAll(); 

	}
	@Test(priority=2,description="Verify the redirection to Paye tab with error messages when hc filled  only filled in LTD rates and click on done ")
	public void blank1LTDrate() throws InterruptedException {
		Thread.sleep(2000);
		
	driver.findElement(By.xpath("//input[@id='AM']")).sendKeys("1");


	driver.findElement(By.xpath("//input[@id='overtimeAM']")).sendKeys("1");

	driver.findElement(By.xpath("//input[@id='PM']")).sendKeys("1");

	driver.findElement(By.xpath("//input[@id='overtimePM']")).sendKeys("1");

	driver.findElement(By.xpath("//input[@id='saturdayRate']")).sendKeys("1");
	driver.findElement(By.xpath("//input[@id='sundayRate']")).sendKeys("1");


	driver.findElement(By.xpath("//input[@id='bankHolidayRate']")).sendKeys("7");
	Thread.sleep(2000);

	driver.findElement(By.xpath("//button[@class='green-primary-btn']")).click();

	SoftAssert softAssert = new SoftAssert(); 
	String ActualErrorMEssage =driver.findElement(By.xpath("//input[@id='AM']//following::span[2]")).getText(); 
	String ActualErrorMEssage2 =driver.findElement(By.xpath("//input[@id='overtimeAM']//following::span[2]")).getText(); 
	String ActualErrorMEssage3 =driver.findElement(By.xpath("//input[@id='PM']//following::span[2]")).getText(); 
	String ActualErrorMEssage4 =driver.findElement(By.xpath("//input[@id='overtimePM']//following::span[2]")).getText(); 
	String ActualErrorMEssage5 =driver.findElement(By.xpath("//input[@id='saturdayRate']//following::span[2]")).getText(); 
	String ActualErrorMEssage6 =driver.findElement(By.xpath("//input[@id='sundayRate']//following::span[2]")).getText(); 
	String ActualErrorMEssage7 =driver.findElement(By.xpath("//input[@id='bankHolidayRate']//following::span[2]")).getText(); 
	String ExpectedErrorMEssage="This is a required field";
	softAssert.assertEquals(ActualErrorMEssage,ExpectedErrorMEssage);
	softAssert.assertEquals(ActualErrorMEssage2,ExpectedErrorMEssage);
	softAssert.assertEquals(ActualErrorMEssage3,ExpectedErrorMEssage);
	softAssert.assertEquals(ActualErrorMEssage4,ExpectedErrorMEssage);
	softAssert.assertEquals(ActualErrorMEssage5,ExpectedErrorMEssage);
	softAssert.assertEquals(ActualErrorMEssage6,ExpectedErrorMEssage);
	softAssert.assertEquals(ActualErrorMEssage7,ExpectedErrorMEssage);
	softAssert.assertAll();
	WebElement e=driver.findElement(By.xpath("//span[contains(@class,'active') and text()='PAYE']"));

	Assert.assertTrue(e.isDisplayed());

	}

	@Test(priority=3,description="Verify the redirection to LTD tab with error messages when hc filled  only filled in Payee rates and click on done ")
	public void blank11LTDrate() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='AM']")).sendKeys("1");


		driver.findElement(By.xpath("//input[@id='overtimeAM']")).sendKeys("1");

		driver.findElement(By.xpath("//input[@id='PM']")).sendKeys("1");

		driver.findElement(By.xpath("//input[@id='overtimePM']")).sendKeys("1");

		driver.findElement(By.xpath("//input[@id='saturdayRate']")).sendKeys("1");
		driver.findElement(By.xpath("//input[@id='sundayRate']")).sendKeys("1");


		driver.findElement(By.xpath("//input[@id='bankHolidayRate']")).sendKeys("1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='LTD']")).click();
		
		driver.findElement(By.xpath("//input[@id='AM']")).clear();

		driver.findElement(By.xpath("//input[@id='overtimeAM']")).clear();

		driver.findElement(By.xpath("//input[@id='PM']")).clear();

		driver.findElement(By.xpath("//input[@id='overtimePM']")).clear();

		driver.findElement(By.xpath("//input[@id='saturdayRate']")).clear();
		driver.findElement(By.xpath("//input[@id='sundayRate']")).clear();

		driver.findElement(By.xpath("//input[@id='bankHolidayRate']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='PAYE']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='green-primary-btn']")).click();
		

		SoftAssert softAssert = new SoftAssert(); 
		String ActualErrorMEssage =driver.findElement(By.xpath("//input[@id='AM']//following::span[2]")).getText(); 
		String ActualErrorMEssage2 =driver.findElement(By.xpath("//input[@id='overtimeAM']//following::span[2]")).getText(); 
		String ActualErrorMEssage3 =driver.findElement(By.xpath("//input[@id='PM']//following::span[2]")).getText(); 
		String ActualErrorMEssage4 =driver.findElement(By.xpath("//input[@id='overtimePM']//following::span[2]")).getText(); 
		String ActualErrorMEssage5 =driver.findElement(By.xpath("//input[@id='saturdayRate']//following::span[2]")).getText(); 
		String ActualErrorMEssage6 =driver.findElement(By.xpath("//input[@id='sundayRate']//following::span[2]")).getText(); 
		String ActualErrorMEssage7 =driver.findElement(By.xpath("//input[@id='bankHolidayRate']//following::span[2]")).getText(); 
		String ExpectedErrorMEssage="This is a required field";
		softAssert.assertEquals(ActualErrorMEssage,ExpectedErrorMEssage);
		softAssert.assertEquals(ActualErrorMEssage2,ExpectedErrorMEssage);
		softAssert.assertEquals(ActualErrorMEssage3,ExpectedErrorMEssage);
		softAssert.assertEquals(ActualErrorMEssage4,ExpectedErrorMEssage);
		softAssert.assertEquals(ActualErrorMEssage5,ExpectedErrorMEssage);
		softAssert.assertEquals(ActualErrorMEssage6,ExpectedErrorMEssage);
		softAssert.assertEquals(ActualErrorMEssage7,ExpectedErrorMEssage);
		softAssert.assertAll();
		WebElement e=driver.findElement(By.xpath("//span[contains(@class,'active') and text()='LTD']"));
		
		Assert.assertTrue(e.isDisplayed());










	}


		@BeforeTest
           public void beforeMethod() throws InterruptedException {
// Launch the Online Store Website
           String exePath = "C:\\Users\\ucreate-65\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe";
           System.setProperty("webdriver.chrome.driver", exePath);
           driver = new ChromeDriver();
           driver.manage().window().maximize();
           driver.get("https://uat-connected-2-webapp.herokuapp.com/hclogin");
      	 WebDriverWait wait = new WebDriverWait(driver,10);
		 wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//*[@id=\"hubspot-messages-iframe-container\"]/iframe")));
		
		 WebElement closeicon;
		 closeicon= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath( "/html/body/div/div[1]/span/div[2]/div/button/span/span")));
		 closeicon.click();
		
		
	    driver.switchTo().defaultContent();
           driver.findElement(By.xpath("//input[@name='email']")).sendKeys("newhc@yopmail.com");
           driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Test12345");
           driver.findElement(By.xpath("//button[@class='green-primary-btn']")).click();
           driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
           driver.findElement(By.xpath("//a[text()='new main contact']")).click();
           driver.findElement(By.xpath("//span[text()='Click here to view/edit it.']")).click();
         


}
		@AfterTest

	    public void afterMethod() {

		// Close the driver

		driver.quit();
}
}
