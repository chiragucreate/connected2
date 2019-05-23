package Maven;

import java.awt.AWTException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Forgotpassword {

	public WebDriver driver;

	@BeforeMethod

	public void beforeMethod() throws InterruptedException {

		String exePath = "C:\\Users\\ucreate-65\\Downloads\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "t");
		driver.get("https://uat-connected-2-webapp.herokuapp.com/hclogin");
		Thread.sleep(2000);

	}
	
//	@Test(description="Test case 1-----when HC click on forgot password link.Need to verify redirection")
//	public void testredirectforgot() throws InterruptedException {
//		
//	driver.findElement(By.xpath("//span[text()='Forgot your password?']")).click();
//	WebElement Element = driver.findElement(By.xpath("//span[text()='Let’s find your password!']"));
//    System.out.println(Element.getText());
//    String expectedtext = "Let’s find your password!";
// 	  Assert.assertEquals(Element.getText(),expectedtext,"testcase failed text not matched.");
//      System.out.println("Successfully passed ");
//	}
//
//	@Test(description="Test case 2-----when HC entered valid email in forgot password screen")
//	public void testwithvalidemail() throws InterruptedException {
//		
//	driver.findElement(By.xpath("//span[text()='Forgot your password?']")).click();		
// 	driver.findElement(By.cssSelector("input.login-input")).sendKeys("connected@yopmail.com");
// 	driver.findElement(By.xpath("//button[@class='green-primary-btn additional-margin-top']")).click();
// 	Thread.sleep(3000);
//   	 WebElement Element = driver.findElement(By.xpath("//span[text()='An email has been sent to you with password reset instructions.']"));
//	      System.out.println(Element.getText());
//	      String expectedtext = "An email has been sent to you with password reset instructions.";
//	   	  Assert.assertEquals(Element.getText(),expectedtext,"testcase failed text not matched.");
//      System.out.println("Successfully passed ");
//			    
//		}
//	@Test(description="Test case 3-----when HC entered invalid email in forgot password screen")
//	
//	    public void testwithinvalidemail() throws InterruptedException {
//		driver.findElement(By.xpath("//span[text()='Forgot your password?']")).click();		
//	 	driver.findElement(By.cssSelector("input.login-input")).sendKeys("connected@yo");
//	 	driver.findElement(By.xpath("//button[@class='green-primary-btn additional-margin-top']")).click();
//	 	Thread.sleep(3000);
//	   	WebElement Element = driver.findElement(By.xpath("//span[text()='Please enter a valid email.']"));
//		System.out.println(Element.getText());
//	    String expectedtext = "Please enter a valid email.";
//		Assert.assertEquals(Element.getText(),expectedtext,"testcase failed text not matched.");
//	    System.out.println("Successfully passed ");
//			
//			}
//	
//	@Test(description="Test case 4-----when HC entered blank email in forgot password screen")
//	
//	    public void testwithblankemail() throws InterruptedException {
//		driver.findElement(By.xpath("//span[text()='Forgot your password?']")).click();		
//	 	driver.findElement(By.cssSelector("input.login-input")).sendKeys("");
//	 	driver.findElement(By.xpath("//button[@class='green-primary-btn additional-margin-top']")).click();
//	 	Thread.sleep(3000);
//	   	WebElement Element = driver.findElement(By.xpath("//span[text()='Please enter a valid email.']"));
//		System.out.println(Element.getText());
//		String expectedtext = "Please enter a valid email.";
//		Assert.assertEquals(Element.getText(),expectedtext,"testcase failed text not matched.");
//	    System.out.println("Successfully passed ");
//			 
			//}
	@Test(description="Test case 5-----when HC entered the valid password in reset password screen for successfully changing the password")
	
		public void testwithvalidpassword() throws InterruptedException, AWTException {
        driver.findElement(By.xpath("//span[text()='Forgot your password?']")).click();
		driver.findElement(By.cssSelector("input.login-input")).sendKeys("newhc@yopmail.com");
		driver.findElement(By.xpath("//button[@class='green-primary-btn additional-margin-top']")).click();
		WebDriverWait wait=new WebDriverWait(driver, 20);
		WebElement Element= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='An email has been sent to you with password reset instructions.']")));
		
		
		
		System.out.println(Element.getText());
		String expectedtext = "An email has been sent to you with password reset instructions.";
		Assert.assertEquals(Element.getText(), expectedtext, "testcase passed with invalid details");
		System.out.println("Successfully passed ");
		driver.get("http://www.yopmail.com/en/");
		driver.findElement(By.cssSelector("input.scpt")).sendKeys("newhc@yopmail.com");
		driver.findElement(By.cssSelector("input.sbut")).click();
		Thread.sleep(1000);
		driver.switchTo().frame("ifmail");
		driver.findElement(By.xpath("//*[@id=\"mailmillieu\"]/div[2]/table/tbody/tr/td/table/tbody/tr[4]/td/a")).click();
        ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"resetPasswordForm\"]/input[1]")).sendKeys("Test12345");
		driver.findElement(By.xpath("//*[@id=\"resetPasswordForm\"]/input[2]")).sendKeys("Test12345");
		driver.findElement(By.xpath("//button[@class='green-primary-btn']")).click();
		Thread.sleep(3000);
		WebElement Element1 = driver.findElement(By.xpath("//span[text()='Your password has been changed successfully.']"));
		System.out.println(Element1.getText());
		String expectedtext1 = "Your password has been changed successfully.";
		Assert.assertEquals(Element1.getText(), expectedtext1, "testcase passed with invalid details");
	    System.out.println("Successfully passed ");
	}
	
//	@Test(description="Test case 6-----when HC entered the blank password in reset password screen")
//	
//	    public void testwithblankpassword() throws InterruptedException, AWTException {
//		WebDriverWait wait=new WebDriverWait(driver, 20);
//		WebElement Forgotpassword;
//		Forgotpassword= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Forgot your password?']")));
//		Forgotpassword.click();
//		driver.findElement(By.cssSelector("input.login-input")).sendKeys("newhc@yopmail.com");
//		driver.findElement(By.xpath("//button[@class='green-primary-btn additional-margin-top']")).click();
//		Thread.sleep(3000);
//		WebElement Element = driver.findElement(
//		By.xpath("//span[text()='An email has been sent to you with password reset instructions.']"));
//		System.out.println(Element.getText());
//		String expectedtext = "An email has been sent to you with password reset instructions.";
//		Assert.assertEquals(Element.getText(), expectedtext, "testcase passed with invalid details");
//		System.out.println("Successfully passed ");
//		driver.get("http://www.yopmail.com/en/");
//		driver.findElement(By.cssSelector("input.scpt")).sendKeys("newhc@yopmail.com");
//		driver.findElement(By.cssSelector("input.sbut")).click();
//		Thread.sleep(1000);
//		driver.switchTo().frame("ifmail");
//		driver.findElement(By.xpath("//*[@id=\"mailmillieu\"]/div[2]/table/tbody/tr/td/table/tbody/tr[4]/td/a")).click();
//        ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
//		driver.switchTo().window(tabs.get(1));
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//button[@class='green-primary-btn']")).click();
//		Thread.sleep(3000);
//		WebElement Element1 = driver.findElement(By.xpath("//span[text()='Please provide details']"));
//		System.out.println(Element1.getText());
//		String expectedtext1 = "Please provide details";
//		Assert.assertEquals(Element1.getText(), expectedtext1, "testcase passed with invalid details");
//		System.out.println("Successfully passed ");
//	}
//	
//	@Test(description="Test case 7-----when HC entered the password which not matched the password format  in reset password screen")
//	
//	    public void testwithunmatchedformatpassword() throws InterruptedException, AWTException {
//        driver.findElement(By.xpath("//span[text()='Forgot your password?']")).click();
//		driver.findElement(By.cssSelector("input.login-input")).sendKeys("newhc@yopmail.com");
//		driver.findElement(By.xpath("//button[@class='green-primary-btn additional-margin-top']")).click();
//		Thread.sleep(3000);
//		WebElement Element = driver.findElement(
//		By.xpath("//span[text()='An email has been sent to you with password reset instructions.']"));
//		System.out.println(Element.getText());
//		String expectedtext = "An email has been sent to you with password reset instructions.";
//		Assert.assertEquals(Element.getText(), expectedtext, "testcase passed with invalid details");
//		System.out.println("Successfully passed ");
//		driver.get("http://www.yopmail.com/en/");
//		driver.findElement(By.cssSelector("input.scpt")).sendKeys("newhc@yopmail.com");
//		driver.findElement(By.cssSelector("input.sbut")).click();
//		Thread.sleep(1000);
//		driver.switchTo().frame("ifmail");
//		driver.findElement(By.xpath("//*[@id=\"mailmillieu\"]/div[2]/table/tbody/tr/td/table/tbody/tr[4]/td/a")).click();
//        ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
//		driver.switchTo().window(tabs.get(1));
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"resetPasswordForm\"]/input[1]")).sendKeys("ert");
//		driver.findElement(By.xpath("//*[@id=\"resetPasswordForm\"]/input[2]")).sendKeys("ert");
//		driver.findElement(By.xpath("//button[@class='green-primary-btn']")).click();
//		Thread.sleep(3000);
//		WebElement Element1 = driver.findElement(By.xpath("//span[text()='Password must contain: 6 characters, 1 upper case character, 1 number.']"));
//		System.out.println(Element1.getText());
//		String expectedtext1 = "Password must contain: 6 characters, 1 upper case character, 1 number.";
//		Assert.assertEquals(Element1.getText(), expectedtext1, "testcase passed with invalid details");
//		System.out.println("Successfully passed ");
//	}
//	
//	@Test(description="Test case 8-----when HC entered the different password in reset password screen")
//	
//	    public void testwithdifferentpassword() throws InterruptedException, AWTException {
//        driver.findElement(By.xpath("//span[text()='Forgot your password?']")).click();
//		driver.findElement(By.cssSelector("input.login-input")).sendKeys("newhc@yopmail.com");
//		driver.findElement(By.xpath("//button[@class='green-primary-btn additional-margin-top']")).click();
//		Thread.sleep(3000);
//		WebElement Element = driver.findElement(
//		By.xpath("//span[text()='An email has been sent to you with password reset instructions.']"));
//		System.out.println(Element.getText());
//		String expectedtext = "An email has been sent to you with password reset instructions.";
//		Assert.assertEquals(Element.getText(), expectedtext, "testcase passed with invalid details");
//		System.out.println("Successfully passed ");
//		driver.get("http://www.yopmail.com/en/");
//		driver.findElement(By.cssSelector("input.scpt")).sendKeys("newhc@yopmail.com");
//		driver.findElement(By.cssSelector("input.sbut")).click();
//		Thread.sleep(1000);
//		driver.switchTo().frame("ifmail");
//		driver.findElement(By.xpath("//*[@id=\"mailmillieu\"]/div[2]/table/tbody/tr/td/table/tbody/tr[4]/td/a")).click();
//         // Store all currently open tabs in tabs
//        ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
//		driver.switchTo().window(tabs.get(1));
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"resetPasswordForm\"]/input[1]")).sendKeys("Test1234");
//		driver.findElement(By.xpath("//*[@id=\"resetPasswordForm\"]/input[2]")).sendKeys("Test12345");
//		driver.findElement(By.xpath("//button[@class='green-primary-btn']")).click();
//		Thread.sleep(3000);
//		WebElement Element1 = driver.findElement(By.xpath("//span[text()='Passwords do not match']"));
//		System.out.println(Element1.getText());
//		String expectedtext1 = "Passwords do not match";
//		Assert.assertEquals(Element1.getText(), expectedtext1, "testcase passed with invalid details");
//		System.out.println("Successfully passed ");
//	}
	  @AfterMethod
	  public void afterMethod() {
	 
	   //Close the driver
	 
	      driver.quit();
	 
	  }
}
