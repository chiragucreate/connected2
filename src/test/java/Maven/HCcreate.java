package Maven;

import java.awt.List;
import org.openqa.selenium.Keys;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HCcreate {
	public WebDriver driver;

	
	  @Test(priority=6,description="When Admin create HC with valid details")
	  
	  public void hcwithvaliddetails() throws InterruptedException {
	  //driver.findElement(By.xpath("//input[@name='email']")).sendKeys("test3@ucreate.it");
	  //driver.findElement(By.xpath("//input[@name='password']")).sendKeys("FOHPI92pUbttZ8WNRSkCluWdnszmO2");
	  //driver.findElement(By.xpath("//button[@class='green-primary-btn']")).click();
	  //driver.findElement(By.xpath("//span[text()='add hc']")).click();
		  driver.findElement(By.cssSelector("input#companyName")).clear();
		  driver.findElement(By.cssSelector("input#email")).clear();
		  driver.findElement(By.cssSelector("input#companyNumber")).clear();
		  driver.findElement(By.cssSelector("input#websiteUrl")).clear();
		  driver.findElement(By.cssSelector("input#mainContact")).clear();
		  driver.findElement(By.cssSelector("input#position")).clear();
	  driver.findElement(By.cssSelector("input#companyName")).sendKeys("New hc");
	  driver.findElement(By.cssSelector("input#email")).sendKeys("hc4@yopmail.com");
	  driver.findElement(By.cssSelector("input#companyNumber")).sendKeys("12345");
	  driver.findElement(By.cssSelector("input#websiteUrl")).sendKeys("https://www.test1.com"); 
	  WebElement autoOptions=driver.findElement(By.cssSelector("input#autocomplete"));
	  autoOptions.sendKeys("280"); Thread.sleep(2000);
	  autoOptions.sendKeys(Keys.ARROW_DOWN); autoOptions.sendKeys(Keys.ENTER);
	  driver.findElement(By.cssSelector("input#mainContact")).sendKeys("Test main contact");
	  driver.findElement(By.cssSelector("input#position")).sendKeys("Test position"); 
	  Thread.sleep(2000);
	  driver.findElement(By.cssSelector("button.green-primary-btn-small")).click();
	  Thread.sleep(2000);
	
	 
	  WebElement Element =driver.findElement(By.xpath("//span[text()='add hc']")); 
	  System.out.println(Element.getText()); 
	  String expectedtext ="add hc";
	  
	  Assert.assertEquals(Element.getText(),expectedtext,"testcase passed with invalid email");
	  
	  System.out.println("Successfully passed "); }
	
	  
	  
//	  @Test(priority=1,description="When try ot register with blank details")
//	  
//	  public void hcwithblankdetails() throws InterruptedException {
//	  //driver.findElement(By.xpath("//input[@name='email']")).sendKeys("test3@ucreate.it");
//	  //driver.findElement(By.xpath("//input[@name='password']")).sendKeys("FOHPI92pUbttZ8WNRSkCluWdnszmO2");
//	  //driver.findElement(By.xpath("//button[@class='green-primary-btn']")).click();
//	  //driver.findElement(By.xpath("//span[text()='add hc']")).click();
//	  Thread.sleep(2000);
//	  driver.findElement(By.cssSelector("button.green-primary-btn-small")).click();
//	  Thread.sleep(2000); SoftAssert softAssert = new SoftAssert(); String
//	  ActualErrorMEssage =driver.findElement(By.xpath("//input[@id='companyName']//following::span[2]")).getText(); 
//	  String ActualErrorMEssage2 =driver.findElement(By.xpath("//input[@id='companyName']//following::span[2]")).getText(); 
//	  String ActualErrorMEssage3 =driver.findElement(By.xpath("//input[@id='companyName']//following::span[2]")).getText(); 
//	  String ActualErrorMEssage4 =driver.findElement(By.xpath("//input[@id='companyName']//following::span[2]")).getText(); 
//	  String ActualErrorMEssage5 =driver.findElement(By.xpath("//input[@id='companyName']//following::span[2]")).getText(); 
//	  String ActualErrorMEssage6 =driver.findElement(By.xpath("//input[@id='companyName']//following::span[2]")).getText(); 
//	  String ActualErrorMEssage7 =driver.findElement(By.xpath("//input[@id='companyName']//following::span[2]")).getText(); 
//	  String ExpectedErrorMEssage="This is a required field";
//	  softAssert.assertEquals(ActualErrorMEssage,ExpectedErrorMEssage);
//	  softAssert.assertEquals(ActualErrorMEssage2,ExpectedErrorMEssage);
//	  softAssert.assertEquals(ActualErrorMEssage3,ExpectedErrorMEssage);
//	  softAssert.assertEquals(ActualErrorMEssage4,ExpectedErrorMEssage);
//	  softAssert.assertEquals(ActualErrorMEssage5,ExpectedErrorMEssage);
//	  softAssert.assertEquals(ActualErrorMEssage6,ExpectedErrorMEssage);
//	  softAssert.assertEquals(ActualErrorMEssage7,ExpectedErrorMEssage);
//	  softAssert.assertAll(); }
//	 
//
//
//	  @Test(priority=2,description="When HC enter invalid postcode")
//	  
//	  public void hcwithinvalidpostcode() throws InterruptedException {
//		  
//	  //driver.findElement(By.xpath("//input[@name='email']")).sendKeys("test3@ucreate.it");
//	  //driver.findElement(By.xpath("//input[@name='password']")).sendKeys("FOHPI92pUbttZ8WNRSkCluWdnszmO2");
//	  //driver.findElement(By.xpath("//button[@class='green-primary-btn']")).click();
//	  //driver.findElement(By.xpath("//span[text()='add hc']")).click();
//	  driver.findElement(By.cssSelector("input#companyName")).sendKeys("New hc");
//	  driver.findElement(By.cssSelector("input#email")).sendKeys("hc2@yopmail.com");
//	  driver.findElement(By.cssSelector("input#companyNumber")).sendKeys("12345");
//	  driver.findElement(By.cssSelector("input#websiteUrl")).sendKeys("https://www.test1.com"); 
//	  WebElement autoOptions=driver.findElement(By.cssSelector("input#autocomplete"));
//	  autoOptions.sendKeys("280"); Thread.sleep(2000);
//	  autoOptions.sendKeys(Keys.ARROW_DOWN); autoOptions.sendKeys(Keys.ENTER);
//	  Thread.sleep(1000);
//	  driver.findElement(By.cssSelector("input#postCode")).clear();
//	  driver.findElement(By.cssSelector("input#postCode")).sendKeys("dsfsdfsdf");
//	  driver.findElement(By.cssSelector("input#mainContact")).sendKeys("Test main contact");
//	  driver.findElement(By.cssSelector("input#position")).sendKeys("Test position"); 
//	  Thread.sleep(2000);
//	  driver.findElement(By.cssSelector("button.green-primary-btn-small")).click();
//	  Thread.sleep(1000); 
//	  WebElement Element =driver.findElement(By.xpath("//span[text()='Please enter a valid postcode']")); 
//	  System.out.println(Element.getText()); String expectedtext ="Please enter a valid postcode";
//	  
//	  Assert.assertEquals(Element.getText(),expectedtext,"testcase passed with invalid email");
//	  
//	  System.out.println("Successfully passed "); }
////	  
//	 
//	  @Test(priority=3,description="When HC enter invalid email")
//	 
//	 public void hcwithinvalidemail() throws InterruptedException {
//	  //driver.findElement(By.xpath("//input[@name='email']")).sendKeys("test3@ucreate.it");
//	  	 // driver.findElement(By.xpath("//input[@name='password']")).sendKeys("FOHPI92pUbttZ8WNRSkCluWdnszmO2");
//	  //driver.findElement(By.xpath("//button[@class='green-primary-btn']")).click();
//	  //driver.findElement(By.xpath("//span[text()='add hc']")).click();
//		  driver.findElement(By.cssSelector("input#companyName")).clear();
//		  driver.findElement(By.cssSelector("input#email")).clear();
//		  driver.findElement(By.cssSelector("input#companyNumber")).clear();
//		  driver.findElement(By.cssSelector("input#websiteUrl")).clear();
//		  driver.findElement(By.cssSelector("input#mainContact")).clear();
//		  driver.findElement(By.cssSelector("input#position")).clear();
//	  driver.findElement(By.cssSelector("input#companyName")).sendKeys("New hc");
//	  driver.findElement(By.cssSelector("input#email")).sendKeys("hc2@");
//	  driver.findElement(By.cssSelector("input#companyNumber")).sendKeys("12345");
//	  driver.findElement(By.cssSelector("input#websiteUrl")).sendKeys("https://www.test1.com");
//	  WebElement autoOptions=driver.findElement(By.cssSelector("input#autocomplete"));
//	  autoOptions.sendKeys("280"); 
//	  Thread.sleep(2000);
//	  autoOptions.sendKeys(Keys.ARROW_DOWN); autoOptions.sendKeys(Keys.ENTER);
//	  Thread.sleep(1000);
//	
//	  
//	  driver.findElement(By.cssSelector("input#mainContact")).sendKeys("Test main contact");
//	  
//	  driver.findElement(By.cssSelector("input#position")).sendKeys("Test position"
//	  ); Thread.sleep(2000);
//	  driver.findElement(By.cssSelector("button.green-primary-btn-small")).click();
//	  Thread.sleep(2000);
//	  WebElement Element =driver.findElement(By.xpath("//span[text()='Please provide valid email address']")); 
//	  System.out.println(Element.getText()); String expectedtext ="Please provide valid email address";
//	  
//	  Assert.assertEquals(Element.getText(),
//	  expectedtext,"testcase passed with invalid email");
////	  
//	  System.out.println("Successfully passed "); }
////	  
//	  @Test(priority=4,description="When Admin try to create hc with already created email")
//	 
//	 public void hcwithexistingemail() throws InterruptedException {
//	  //driver.findElement(By.xpath("//input[@name='email']")).sendKeys("test3@ucreate.it");
//	  	  //driver.findElement(By.xpath("//input[@name='password']")).sendKeys("FOHPI92pUbttZ8WNRSkCluWdnszmO2");
//	  //driver.findElement(By.xpath("//button[@class='green-primary-btn']")).click();
//	  //driver.findElement(By.xpath("//span[text()='add hc']")).click();
//		  driver.findElement(By.cssSelector("input#companyName")).clear();
//		  driver.findElement(By.cssSelector("input#email")).clear();
//		  driver.findElement(By.cssSelector("input#companyNumber")).clear();
//		  driver.findElement(By.cssSelector("input#websiteUrl")).clear();
//		  driver.findElement(By.cssSelector("input#mainContact")).clear();
//		  driver.findElement(By.cssSelector("input#position")).clear();
//	
//	  driver.findElement(By.cssSelector("input#companyName")).sendKeys("New hc");
//	  driver.findElement(By.cssSelector("input#email")).sendKeys("hc2@yopmail.com");
//	  driver.findElement(By.cssSelector("input#companyNumber")).sendKeys("12345");
//	  driver.findElement(By.cssSelector("input#websiteUrl")).sendKeys("https://www.test1.com");
//	  WebElement autoOptions=driver.findElement(By.cssSelector("input#autocomplete"));
//	  autoOptions.sendKeys("280"); 
//	  Thread.sleep(2000);
//	  autoOptions.sendKeys(Keys.ARROW_DOWN); autoOptions.sendKeys(Keys.ENTER);
//	  Thread.sleep(1000);
//	
//	  
//	  driver.findElement(By.cssSelector("input#mainContact")).sendKeys("Test main contact");
//	  
//	  driver.findElement(By.cssSelector("input#position")).sendKeys("Test position"
//	  ); Thread.sleep(2000);
//	  driver.findElement(By.cssSelector("button.green-primary-btn-small")).click();
//	  Thread.sleep(2000);
//	  WebElement Element =driver.findElement(By.xpath("//span[text()='Email already exists']")); 
//	  System.out.println(Element.getText()); 
//	  String expectedtext ="Email already exists";
//	  
//	  Assert.assertEquals(Element.getText(),expectedtext,"testcase passed with invalid email");
//	  
//	  System.out.println("Successfully passed "); }
//	  
//	  @Test(priority=5,description="when admin try to create hc with input invalid URL")
// public void hcwithinvalidurl() throws InterruptedException {
//	  //driver.findElement(By.xpath("//input[@name='email']")).sendKeys("test3@ucreate.it");
//	  	//  driver.findElement(By.xpath("//input[@name='password']")).sendKeys("FOHPI92pUbttZ8WNRSkCluWdnszmO2");
//	  //driver.findElement(By.xpath("//button[@class='green-primary-btn']")).click();
//	  //driver.findElement(By.xpath("//span[text()='add hc']")).click();
//		  driver.findElement(By.cssSelector("input#companyName")).clear();
//		  driver.findElement(By.cssSelector("input#email")).clear();
//		  driver.findElement(By.cssSelector("input#companyNumber")).clear();
//		  driver.findElement(By.cssSelector("input#websiteUrl")).clear();
//		  driver.findElement(By.cssSelector("input#mainContact")).clear();
//		  driver.findElement(By.cssSelector("input#position")).clear();
//	
//	  driver.findElement(By.cssSelector("input#companyName")).sendKeys("New hc");
//	  driver.findElement(By.cssSelector("input#email")).sendKeys("hc2@yopmail.com");
//	  driver.findElement(By.cssSelector("input#companyNumber")).sendKeys("12345");
//	  driver.findElement(By.cssSelector("input#websiteUrl")).sendKeys("https://www.test1");
//	  WebElement autoOptions=driver.findElement(By.cssSelector("input#autocomplete"));
//	  autoOptions.sendKeys("280"); 
//	  Thread.sleep(2000);
//	  autoOptions.sendKeys(Keys.ARROW_DOWN); autoOptions.sendKeys(Keys.ENTER);
//	  Thread.sleep(1000);
//	
//	  
//	  driver.findElement(By.cssSelector("input#mainContact")).sendKeys("Test main contact");
//	  
//	  driver.findElement(By.cssSelector("input#position")).sendKeys("Test position"
//	  ); Thread.sleep(2000);
//	  driver.findElement(By.cssSelector("button.green-primary-btn-small")).click();
//	  Thread.sleep(2000);
//	  WebElement Element =driver.findElement(By.xpath("//span[text()='Please provide valid url']")); 
//	  System.out.println(Element.getText()); 
//	  String expectedtext ="Please provide valid url";
//	  
//	  Assert.assertEquals(Element.getText(),expectedtext,"testcase passed with invalid email");
//	  
//	  System.out.println("Successfully passed "); }
// 
// 
// 
// 
// 
// 
//	 
	
	@BeforeTest

	public void beforeMethod() throws InterruptedException {
		String exePath = "C:\\Users\\ucreate-65\\Downloads\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://uat-connected-2-webapp.herokuapp.com/admin");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.findElement(By.xpath("//input[@name='email']")).sendKeys("test3@ucreate.it");
		  driver.findElement(By.xpath("//input[@name='password']")).sendKeys("FOHPI92pUbttZ8WNRSkCluWdnszmO2");
		  driver.findElement(By.xpath("//button[@class='green-primary-btn']")).click();
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//span[text()='add hc']")).click();

	}
	
	

	  @AfterMethod
		 
		  public void afterMethod() {
		 
		   // Close the driver
		 
		      //driver.quit();
		 
		  }

}
