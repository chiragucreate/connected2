package Maven;
import java.util.List;

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

public class Driverinvite {

WebDriver driver;

@Test(description="When HC enter invalid email for inviting driver")
public  void createjobwithvaliddetails() throws InterruptedException{
    driver.findElement(By.xpath("//input[@class='driver-management-email-input']")).sendKeys("chirag");
    driver.findElement(By.xpath("//button[@class='green-primary-btn-small invite-button-margin']")).click();
    WebElement Element1 = driver.findElement(By.xpath("//span[text()='This email address has not been recognised']"));
    System.out.println(Element1.getText());
    String expectedtext="This email address has not been recognised";
    Assert.assertEquals(Element1.getText(),expectedtext,"testcase passed with valid email and password");
    System.out.println("Successfully passed!");
    Thread.sleep(5000);
}

@Test(description="when enter valid email id but not registered with C2 platform")
public  void drivervalidemail1() throws InterruptedException{
	driver.findElement(By.xpath("//input[@class='driver-management-email-input']")).clear();
    driver.findElement(By.xpath("//input[@class='driver-management-email-input']")).sendKeys("chirag@gmail.com");
    driver.findElement(By.xpath("//button[@class='green-primary-btn-small invite-button-margin']")).click();
    Thread.sleep(2000);
    WebElement Element2 = driver.findElement(By.xpath("//span[text()='This email address has not been recognised']"));
    System.out.println(Element2.getText());
    String expectedtext1="This email address has not been recognised";
    Assert.assertEquals(Element2.getText(),expectedtext1,"testcase passed with valid email and password");
    System.out.println("Successfully passed!");
    Thread.sleep(5000);
}
//
@Test(priority=4,description="when HC try to invite already invited driver")
public  void drivervalidemail3() throws InterruptedException{
	driver.findElement(By.xpath("//input[@class='driver-management-email-input']")).clear();
    driver.findElement(By.xpath("//input[@class='driver-management-email-input']")).sendKeys("p@d.com");
    driver.findElement(By.xpath("//button[@class='green-primary-btn-small invite-button-margin']")).click();
    Thread.sleep(2000);
    WebElement Element3 = driver.findElement(By.xpath("//span[text()='Driver already invited by HC']"));
    System.out.println(Element3.getText());
    String expectedtext2="Driver already invited by HC";
    Assert.assertEquals(Element3.getText(),expectedtext2,"testcase passed with valid email and password");
    System.out.println("Successfully passed!");
    Thread.sleep(5000);
}



@Test(priority=3,description="Verify  hc able to invite the user")
public  void drivervalidemail() throws InterruptedException{
	WebDriverWait wait=new WebDriverWait(driver, 20);
	driver.findElement(By.xpath("//input[@class='driver-management-email-input']")).clear();
    driver.findElement(By.xpath("//input[@class='driver-management-email-input']")).sendKeys("p@d.com");
    driver.findElement(By.xpath("//button[@class='green-primary-btn-small invite-button-margin']")).click();
   
   WebElement Element3;
   Element3= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Invitation')]")));
  
    //WebElement Element3 = driver.findElement(By.xpath("//span[contains(text(),'email')]"));
    System.out.println(Element3.getText());
    String expectedtext2="Invitation has been successfully sent";
    Assert.assertEquals(Element3.getText(),expectedtext2,"testcase passed with valid email and password");
    System.out.println("Successfully passed!");
    Thread.sleep(5000);
}


@Test(priority=5,description="Verify HC able to cancel the already invited driver")
public  void drivervalidiemail() throws InterruptedException{
    Thread.sleep(2000);

driver.navigate().refresh();
Thread.sleep(3000);

  

    List<WebElement> pagination =driver.findElements(By.xpath("//ul[@class='pagination']//a")); 
int size= pagination.size(); 
System.out.println(pagination.size()); 
if(size>0)
{ 
WebElement e = null;
System.out.println("pagination exists");
// click on pagination link
for(int i=1; i<=size; i++){ 
try{ 
driver.findElement(By.xpath("//ul[@class='pagination']//li["+i+"]")).click() ;
Thread.sleep(5000);
e = driver.findElement(By.xpath("//a[text()='D-530']")); 
Assert.assertTrue(e.isDisplayed(),"");
System.out.println("element found");
driver.findElement(By.xpath("//span[@id='D-530']")).click() ;
driver.findElement(By.xpath("//span[text()='Cancel invitation']")).click() ;
WebElement f=driver.findElement(By.xpath("//div[@id='D-530']"));

Assert.assertTrue(f.isDisplayed(),"f error");
System.out.println("Cancel succesful");
break;
}

catch(Exception error){ 
	if(i == size && !e.isDisplayed()) {
		Assert.assertFalse(e.isDisplayed(),"element found");
		System.out.println("Element not found");
			}
	
	
	driver.findElement(By.xpath("//ul[@class='pagination']//li["+i+"]")).click() ;
} 
}
}
else {
	System.out.println("pagination not exists"); }}


  



   


           @BeforeTest
           public void beforeMethod() throws InterruptedException {
// Launch the Online Store Website
           String exePath = "C:\\Users\\ucreate-65\\Downloads\\chromedriver_win32\\chromedriver.exe";
           System.setProperty("webdriver.chrome.driver", exePath);
           driver = new ChromeDriver();
           WebDriverWait wait=new WebDriverWait(driver, 20);
           driver.manage().window().maximize();
           driver.get("https://uat-connected-2-webapp.herokuapp.com/hclogin");
           driver.findElement(By.xpath("//input[@name='email']")).sendKeys("connected@yopmail.com");
           driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Test123");
           driver.findElement(By.xpath("//button[@class='green-primary-btn']")).click();
         
           
           WebElement drivermanagement= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath( "//a[@href='/hc/drivermanagement']")));
           drivermanagement.click();
         
         


}
           @AfterTest
           public void AfterMethod() throws InterruptedException {
            
           driver.quit();
           } 
}
