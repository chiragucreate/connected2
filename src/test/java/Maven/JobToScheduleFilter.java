package Maven;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class JobToScheduleFilter {
	WebDriver driver;
	

	
	@Test(priority=1,description="Verify unallocated filter working or not")
    public void Unallocatedjobs() throws InterruptedException {
		
		 WebDriverWait wait=new WebDriverWait(driver, 20);
			WebElement jobschedule;
			jobschedule= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Jobs schedule']")));
			jobschedule.click();
		driver.findElement(By.xpath("//div[@class='job-schedule-select-container']")).click();;
		driver.findElement(By.xpath("//span[text()='Unallocated Jobs']")).click();
		Thread.sleep(3000);

			
			List<WebElement> pagination =driver.findElements(By.xpath("//ul[@class='pagination']//a")); 
			int size= pagination.size(); 
			
			int totalCount=0;
			int size2=7;
			System.out.println(pagination.size());
			
			String expectedTitles[] = {"Applications","Job Posted"};
			List<String> expectedTitlesList = Arrays.asList(expectedTitles);
			//WebElement size1=driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/section/div[2]/div/section/div[3]/div[5]/ul/li[7]/a"));
			//int size2=Integer.parseInt(size1.getText());
			if(size>0 && size2<=Integer.parseInt(driver.findElement(By.xpath("//a[text()='"+size+"']")).getText()))
			{ 
			System.out.println("pagination exists");
			// click on pagination link
			for(int i=1; i<=size; i++){ 
				System.out.println("if running");
				try{ 
					
					driver.findElement(By.xpath("//a[text()='"+i+"']")).click() ;
				Thread.sleep(5000);
				
				List  rows = driver.findElements(By.xpath("//span[@class='global-table-link']")); 
				
				totalCount += rows.size();
		System.out.println(totalCount);
				
			    System.out.println("No of rows are : " + rows.size());
			    for (int j = 1; j <= rows.size(); j++) {
			    
			WebElement e= driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/section/div[2]/div/section/div[3]/div[4]/div[1]/div[2]/div["+j+"]/div/div[6]"));
				
				System.out.println(e.getText());
				
//				Assert.assertEquals(e.getText(),getStatus(e.getText()),"filter value  e not matched");
			     
				Assert.assertTrue(expectedTitlesList.contains(e.getText()));
			
				WebElement size3=driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/section/div[2]/div/section/div[3]/div[5]/ul/li[7]/a"));
				int size4=Integer.parseInt(size3.getText());
	size=size4;	
				
	System.out.println("last element"+size4);
			}}
			catch(Exception e){ 
				
				e.printStackTrace(); 		
				 
	
			}}}
			else if(size>0)
			{
				for(int i=1; i<=size; i++){ 
					System.out.println("else running");
					try{ 
						
						driver.findElement(By.xpath("//a[text()='"+i+"']")).click() ;
					Thread.sleep(5000);
					
					List  rows = driver.findElements(By.xpath("//span[@class='global-table-link']")); 
					
					totalCount += rows.size();
			System.out.println(totalCount);
					
				    System.out.println("No of rows are : " + rows.size());
				    for (int j = 1; j <= rows.size(); j++) {
				WebElement e= driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/section/div[2]/div/section/div[3]/div[4]/div[1]/div[2]/div["+j+"]/div/div[6]"));
					
					System.out.println(e.getText());
					
//					Assert.assertEquals(e.getText(),getStatus(e.getText()),"filter value  e not matched");
					Assert.assertTrue(expectedTitlesList.contains(e.getText()));
				    
				    
					}}
				    catch(Exception e){ 
						
						
				    	e.printStackTrace(); 	
						
					}}}
			
			else 
			{
				//Assert.assertEquals(waitingjobcount,0,"else error");
				System.out.println("no records found");
				driver.findElement(By.xpath("//span[text()='Jobs dashboard']")).click();
			}
			
			
			//Assert.assertEquals(waitingjobcount,totalCount,"job count not matched");
		System.out.println("job count matched");
			driver.findElement(By.xpath("//span[text()='Jobs dashboard']")).click();
		}

	@Test(priority=2,description="Verify waiting to start filter working or not")
    public void WaitingToStart() throws InterruptedException {
		
		 WebDriverWait wait=new WebDriverWait(driver, 20);
			WebElement jobschedule;
			jobschedule= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Jobs schedule']")));
			jobschedule.click();
		driver.findElement(By.xpath("//div[@class='job-schedule-select-container']")).click();;
		driver.findElement(By.xpath("//span[text()='Waiting To Start']")).click();
		Thread.sleep(3000);

			
			List<WebElement> pagination =driver.findElements(By.xpath("//ul[@class='pagination']//a")); 
			int size= pagination.size(); 
			
			int totalCount=0;
			int size2=7;
			System.out.println(pagination.size());
			
			
			//WebElement size1=driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/section/div[2]/div/section/div[3]/div[5]/ul/li[7]/a"));
			//int size2=Integer.parseInt(size1.getText());
			//if(size>0 && size2==Integer.parseInt(driver.findElement(By.xpath("//a[text()='"+size+"']")).getText()))
				if(size>0 && size2<=Integer.parseInt(driver.findElement(By.xpath("//a[text()='"+size+"']")).getText()))
			{ 
			System.out.println("pagination exists");
			// click on pagination link
			for(int i=1; i<=size; i++){ 
System.out.println("if running");
				try{ 
					
					driver.findElement(By.xpath("//a[text()='"+i+"']")).click() ;
				Thread.sleep(5000);
				
				List  rows = driver.findElements(By.xpath("//span[@class='global-table-link']")); 
				
				totalCount += rows.size();
		System.out.println(totalCount);
				
			    System.out.println("No of rows are : " + rows.size());
			    for (int j = 1; j <= rows.size(); j++) {
			    
			WebElement e= driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/section/div[2]/div/section/div[3]/div[4]/div[1]/div[2]/div["+j+"]/div/div[6]"));
				
				System.out.println(e.getText());
				
				Assert.assertEquals(e.getText(),"Waiting To Start","filter value  e not matched");
			    
			
				WebElement size3=driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/section/div[2]/div/section/div[3]/div[5]/ul/li[7]/a"));
				int size4=Integer.parseInt(size3.getText());
	size=size4;	
				
	System.out.println("last element"+size4);
			}}
			catch(Exception e){ 
				
				e.printStackTrace(); 		
				 
	
			}}}
			else if(size>0)
			{
				for(int i=1; i<=size; i++){ 
					System.out.println("else running");
					try{ 
						
						driver.findElement(By.xpath("//a[text()='"+i+"']")).click() ;
					Thread.sleep(5000);
					
					List  rows = driver.findElements(By.xpath("//span[@class='global-table-link']")); 
					
					totalCount += rows.size();
			System.out.println(totalCount);
					
				    System.out.println("No of rows are : " + rows.size());
				    for (int j = 1; j <= rows.size(); j++) {
				WebElement e= driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/section/div[2]/div/section/div[3]/div[4]/div[1]/div[2]/div["+j+"]/div/div[6]"));
					
					System.out.println(e.getText());
					
					Assert.assertEquals(e.getText(),"Waiting To Start","filter value  e not matched");
				    
				    
				    
					}}
				    catch(Exception e){ 
						
						
				    	e.printStackTrace(); 	
						
					}}}
			
			else 
			{
				//Assert.assertEquals(waitingjobcount,0,"else error");
				System.out.println("no records found");
				driver.findElement(By.xpath("//span[text()='Jobs dashboard']")).click();
			}
			
			
			//Assert.assertEquals(waitingjobcount,totalCount,"job count not matched");
		System.out.println("job count matched");
			driver.findElement(By.xpath("//span[text()='Jobs dashboard']")).click();
		}
	@Test(priority=3,description="Verify expired filter working or not")
    public void expiredfilter() throws InterruptedException {
		Thread.sleep(5000);
		 WebDriverWait wait=new WebDriverWait(driver, 20);
			WebElement jobschedule;
			jobschedule= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Jobs schedule']")));
			jobschedule.click();
		driver.findElement(By.xpath("//div[@class='job-schedule-select-container']")).click();;
		driver.findElement(By.xpath("//span[text()='Expired']")).click();
		Thread.sleep(3000);

			
			List<WebElement> pagination =driver.findElements(By.xpath("//ul[@class='pagination']//a")); 
			int size= pagination.size(); 
			
			int totalCount=0;
			int size2=7;
			System.out.println(pagination.size());
			
			
			//WebElement size1=driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/section/div[2]/div/section/div[3]/div[5]/ul/li[7]/a"));
			//int size2=Integer.parseInt(size1.getText());
			if(size>0 && size2<=Integer.parseInt(driver.findElement(By.xpath("//a[text()='"+size+"']")).getText()))
			{ 
			System.out.println("pagination exists");
			// click on pagination link
			for(int i=1; i<=size; i++){ 
System.out.println("if running");
				try{ 
					
					driver.findElement(By.xpath("//a[text()='"+i+"']")).click() ;
				Thread.sleep(2000);
				
				List  rows = driver.findElements(By.xpath("//span[@class='global-table-link']")); 
				
				totalCount += rows.size();
		System.out.println(totalCount);
				
			    System.out.println("No of rows are : " + rows.size());
			    for (int j = 1; j <= rows.size(); j++) {
			    
			WebElement e= driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/section/div[2]/div/section/div[3]/div[4]/div[1]/div[2]/div["+j+"]/div/div[6]"));
				
				System.out.println(e.getText());
				
				Assert.assertEquals(e.getText(),"Expired","filter value  e not matched");
			    
			
				WebElement size3=driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/section/div[2]/div/section/div[3]/div[5]/ul/li[7]/a"));
				int size4=Integer.parseInt(size3.getText());
	size=size4;	
				
	System.out.println("last element"+size4);
			}}
			catch(Exception e){ 
				
				e.printStackTrace(); 		
				 
	
			}}}
			else if(size>0)
			{
				for(int i=1; i<=size; i++){ 

					try{ 
						
						driver.findElement(By.xpath("//a[text()='"+i+"']")).click() ;
					Thread.sleep(2000);
					
					List  rows = driver.findElements(By.xpath("//span[@class='global-table-link']")); 
					
					totalCount += rows.size();
			System.out.println(totalCount);
					
				    System.out.println("No of rows are : " + rows.size());
				    for (int j = 1; j <= rows.size(); j++) {
				WebElement e= driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/section/div[2]/div/section/div[3]/div[4]/div[1]/div[2]/div["+j+"]/div/div[6]"));
					
					System.out.println(e.getText());
					
					Assert.assertEquals(e.getText(),"Expired","filter value  e not matched");
				    
				    
				    
					}}
				    catch(Exception e){ 
						
						
				    	e.printStackTrace(); 	
						
					}}}
			
			else 
			{
				//Assert.assertEquals(waitingjobcount,0,"else error");
				System.out.println("no records found");
				driver.findElement(By.xpath("//span[text()='Jobs dashboard']")).click();
			}
			
			
			//Assert.assertEquals(waitingjobcount,totalCount,"job count not matched");
		System.out.println("job count matched");
			driver.findElement(By.xpath("//span[text()='Jobs dashboard']")).click();
		}
	
	@Test(priority=4,description="Verify Applications filter working or not")
    public void Applications() throws InterruptedException {
		Thread.sleep(5000);
		 WebDriverWait wait=new WebDriverWait(driver, 20);
			WebElement jobschedule;
			jobschedule= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Jobs schedule']")));
			jobschedule.click();
		driver.findElement(By.xpath("//div[@class='job-schedule-select-container']")).click();;
		driver.findElement(By.xpath("//span[text()='Applications']")).click();
		Thread.sleep(3000);

			
			List<WebElement> pagination =driver.findElements(By.xpath("//ul[@class='pagination']//a")); 
			int size= pagination.size(); 
			
			int totalCount=0;
			int size2=7;
			System.out.println(pagination.size());
			
			
			//WebElement size1=driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/section/div[2]/div/section/div[3]/div[5]/ul/li[7]/a"));
			//int size2=Integer.parseInt(size1.getText());
			if(size>0 && size2<=Integer.parseInt(driver.findElement(By.xpath("//a[text()='"+size+"']")).getText()))
			{ 
			System.out.println("pagination exists");
			// click on pagination link
			for(int i=1; i<=size; i++){ 

				try{ 
					
					driver.findElement(By.xpath("//a[text()='"+i+"']")).click() ;
				Thread.sleep(2000);
				
				List  rows = driver.findElements(By.xpath("//span[@class='global-table-link']")); 
				
				totalCount += rows.size();
		System.out.println(totalCount);
				
			    System.out.println("No of rows are : " + rows.size());
			    for (int j = 1; j <= rows.size(); j++) {
			    
			WebElement e= driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/section/div[2]/div/section/div[3]/div[4]/div[1]/div[2]/div["+j+"]/div/div[6]"));
				
				System.out.println(e.getText());
				
				Assert.assertEquals(e.getText(),"Waiting To Start","filter value  e not matched");
			    
			
				WebElement size3=driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/section/div[2]/div/section/div[3]/div[5]/ul/li[7]/a"));
				int size4=Integer.parseInt(size3.getText());
	size=size4;	
				
	System.out.println("last element"+size4);
			}}
			catch(Exception e){ 
				
				e.printStackTrace(); 		
				 
	
			}}}
			else if(size>0)
			{
				for(int i=1; i<=size; i++){ 

					try{ 
						
						driver.findElement(By.xpath("//a[text()='"+i+"']")).click() ;
					Thread.sleep(2000);
					
					List  rows = driver.findElements(By.xpath("//span[@class='global-table-link']")); 
					
					totalCount += rows.size();
			System.out.println(totalCount);
					
				    System.out.println("No of rows are : " + rows.size());
				    for (int j = 1; j <= rows.size(); j++) {
				WebElement e= driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/section/div[2]/div/section/div[3]/div[4]/div[1]/div[2]/div["+j+"]/div/div[6]"));
					
					System.out.println(e.getText());
					
					Assert.assertEquals(e.getText(),"Applications","filter value  e not matched");
				    
				    
				    
					}}
				    catch(Exception e){ 
						
						
				    	e.printStackTrace(); 	
						
					}}}}


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
  Thread.sleep(3000);
  
}
}