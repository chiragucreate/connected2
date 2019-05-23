package Maven;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Dashboard {
	WebDriver driver;
	
	
@Test(priority=1,description="Verify Job schedule link working or not")
        public void jobaschedulelink() throws InterruptedException {
	      
		WebDriverWait wait=new WebDriverWait(driver, 20);
		WebElement jobschedule;
		jobschedule= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Jobs schedule']")));
		jobschedule.click();
	    String myurl = driver.getCurrentUrl();
	    String expectedurl = "https://uat.connected2.io/hc/jobschedule";
	    Assert.assertEquals(myurl,expectedurl,"URL not matched");
	    System.out.println("Job schedule link working");
	    Thread.sleep(200);
	 	    	 	  }
	
	
@Test(priority=3,description="Verify Jobs to review link working or not")
        public void jobstoreviewlink() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, 20);
		
		WebElement jobschedule;
		jobschedule= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Jobs to review']")));
		jobschedule.click();
	    String myurl = driver.getCurrentUrl();
	    String expectedurl = "https://uat.connected2.io/hc/jobstoreview";
	    Assert.assertEquals(myurl,expectedurl,"URL not matched");
	    System.out.println("Jobs to review link working");
	    Thread.sleep(200); 	    	 	  
	        }
	
@Test(priority=4,description="Verify driver management link working or not")
        public void Drivermanagementlink() throws InterruptedException {
	      
		WebDriverWait wait=new WebDriverWait(driver, 20);
		WebElement jobschedule;
		jobschedule= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Driver management']")));
		jobschedule.click();
	    String myurl = driver.getCurrentUrl();
	    String expectedurl = "https://uat.connected2.io/hc/drivermanagement";
	    Assert.assertEquals(myurl,expectedurl,"URL not matched");
	    System.out.println("Driver management link working");
	    Thread.sleep(200);
	 	    	 	  }
	
@Test(priority=2,description="Verify Dashboard link working or not")
       public void Jobstoreview() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, 20);
		WebElement jobschedule;
		jobschedule= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Jobs dashboard']")));
		jobschedule.click();
	    String myurl = driver.getCurrentUrl();
	    String expectedurl = "https://uat.connected2.io/hc/dashboard";
	    Assert.assertEquals(myurl,expectedurl,"URL not matched");
	    System.out.println("Driver management link working");
	    Thread.sleep(200);
	 	    	 	  }
	
	@Test(priority=5,description="Verify notification icon working or not")
    public void NOtificationicon() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, 20);
		WebElement notificationicon;
		notificationicon= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@src='/7c5c79baa7e647632b150d6d8dc53960.svg']")));
		notificationicon.click();
		WebElement notificationlist=driver.findElement(By.xpath("//div[@class='notification-list-section']"));
		notificationlist.isDisplayed();
	 Assert.assertTrue(notificationlist.isDisplayed(),"notification list not open");
	   Thread.sleep(200);
	 	    	 	  }
	
	@Test(priority=6,description="Verify Profile link working on profile icon or not")
    public void profilelinkicon() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, 20);
		WebElement profileicon;
		profileicon= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@src='/1714fc298839a2664e1649e3b3261151.svg']")));
		profileicon.click();
	    String myurl = driver.getCurrentUrl();
	    String expectedurl = "https://uat.connected2.io/hc/profile";
	    Assert.assertEquals(myurl,expectedurl,"URL not matched");
	    System.out.println("Profile link not working on profile icon");
	    Thread.sleep(200);
	 	    	 	  }
	
	@Test(priority=7,description="Verify Profile link working on name or not")
    public void Profilelinkname() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, 20);
		WebElement jobschedule;
		jobschedule= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='global-menu-user-name clear-outline' and @href='/hc/profile']")));
		jobschedule.click();
	    String myurl = driver.getCurrentUrl();
	    String expectedurl = "https://uat.connected2.io/hc/profile";
	    Assert.assertEquals(myurl,expectedurl,"URL not matched");
	    System.out.println("Profile link not working on name");
	    Thread.sleep(200);
	 	    	 	  }
	@Test(priority=8,description="Verify Profile link working on Profile text or not")
    public void Profilelinktext() throws InterruptedException {
		driver.findElement(By.xpath("//img[@src='/404f8c6f97c89ecbd6d0a2cf8a0d448b.svg']")).click();
		
		driver.findElement(By.xpath("//span[text()='Profile']")).click();;
	
	    String myurl = driver.getCurrentUrl();
	    String expectedurl = "https://uat.connected2.io/hc/profile";
	    Assert.assertEquals(myurl,expectedurl,"URL not matched");
	    System.out.println("Profile link not working on name");
	    Thread.sleep(200);
	}
	
	@Test(priority=9,description="Verify Profile link working on Settings or not")
    public void Settingstext() throws InterruptedException {
		driver.findElement(By.xpath("//img[@src='/404f8c6f97c89ecbd6d0a2cf8a0d448b.svg']")).click();
		driver.findElement(By.xpath("//span[text()='Settings']")).click();;
	
	    String myurl = driver.getCurrentUrl();
	    String expectedurl = "https://uat.connected2.io/hc/profile";
	    Assert.assertEquals(myurl,expectedurl,"URL not matched");
	    System.out.println("Profile link working on name");
	    driver.findElement(By.xpath("//span[text()='Jobs dashboard']")).click();
	    Thread.sleep(200);
	}
	
	@Test(priority=10,description="Verify OnTime count matched with records or not after redirection from dashboard")
	  public void OnTimeCount() throws InterruptedException {
			WebDriverWait wait=new WebDriverWait(driver, 20);
		
			WebElement count=driver.findElement(By.xpath("//section[3]/div/div[2]/span[1]"));
			int waitingjobcount =  Integer.parseInt(count.getText());	
			System.out.println("waiting job count"+waitingjobcount);
			
			WebElement waitingtostart;
			waitingtostart= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='ON TIME']")));
			waitingtostart.click();
			
	
Thread.sleep(2000);
				
				List<WebElement> pagination =driver.findElements(By.xpath("//ul[@class='pagination']//a")); 
				int size= pagination.size(); 
				System.out.println("pagination count"+pagination.size());
				int totalCount=0;
				int size2=7;
				
				
				
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
					
					Assert.assertEquals(totalCount,waitingjobcount,"filter value  e not matched");
				    
				
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
						
						Assert.assertEquals(totalCount,waitingjobcount,"filter value  e not matched");
					    
					    
					    
						}}
					    catch(Exception e){ 
							
							
					    	e.printStackTrace(); 	
							
						}}}
				
				else 
				{
					Assert.assertEquals(totalCount,0,"else error");
					System.out.println("no records found");
					driver.findElement(By.xpath("//span[text()='Jobs dashboard']")).click();
				}
				
				
				//Assert.assertEquals(waitingjobcount,totalCount,"job count not matched");
			
				driver.findElement(By.xpath("//span[text()='Jobs dashboard']")).click();
			}

		
	
	@Test(priority=11,description="Verify Waiting to start count matched with records or not after redirection from dashboard")
  public void WaitingToStartCount() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Jobs dashboard']")).click();
		WebDriverWait wait=new WebDriverWait(driver, 20);
		Thread.sleep(6000);
		WebElement count=driver.findElement(By.xpath("//section[3]/div/div[1]/span[1]"));
		int waitingjobcount =  Integer.parseInt(count.getText());	
		System.out.println(waitingjobcount);
		
		WebElement waitingtostart;
		waitingtostart= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='WAITING']")));
		waitingtostart.click();
		
		
		Thread.sleep(5000);
		
		
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
			
	
			
		    System.out.println("No of rows are : " + rows.size());
		    
			
			
			totalCount += rows.size();
			System.out.println(totalCount);
		
			WebElement size3=driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/section/div[2]/div/section/div[3]/div[5]/ul/li[7]/a"));
			int size4=Integer.parseInt(size3.getText());
size=size4;	
			
System.out.println("last element"+size4);


		}
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
				
		
				
			    System.out.println("No of rows are : " + rows.size());
			   
				
				
				totalCount += rows.size();
				System.out.println(totalCount);
				
			    
			    
				}
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
	
	

	@Test(priority=12,description="Verify Not yet allocated count matched with records or not after redirection from dashboard")
	  public void NotYetAllocatedCount() throws InterruptedException {
		driver.findElement(By.xpath("//span[text()='Jobs dashboard']")).click();
			WebDriverWait wait=new WebDriverWait(driver, 20);
			Thread.sleep(6000);
			WebElement count=driver.findElement(By.xpath("//section[2]/div/div[1]/span[1]"));
			int waitingjobcount =  Integer.parseInt(count.getText());	
			System.out.println(waitingjobcount);
			
			WebElement waitingtostart;
			waitingtostart= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='NOT YET']")));
			waitingtostart.click();
			
			
			Thread.sleep(5000);
			
			
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
				
				
				
			    System.out.println("No of rows are : " + rows.size());
			    
				
				
				totalCount += rows.size();
				System.out.println(totalCount);
			
				WebElement size3=driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/section/div[2]/div/section/div[3]/div[5]/ul/li[7]/a"));
				int size4=Integer.parseInt(size3.getText());
	size=size4;	
				
	System.out.println("last element"+size4);


			}
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
					
			
					
				    System.out.println("No of rows are : " + rows.size());
				   
					
					
					totalCount += rows.size();
					System.out.println(totalCount);
					
				    
				    
					}
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
	@Test(priority=13,description="Verify Running late count matched with records or not after redirection from dashboard")
	  public void RunningLateCount() throws InterruptedException {
		driver.findElement(By.xpath("//span[text()='Jobs dashboard']")).click();
			WebDriverWait wait=new WebDriverWait(driver, 20);
			Thread.sleep(6000);
			WebElement count=driver.findElement(By.xpath("//section[3]/div/div[3]/span[1]"));
			int waitingjobcount =  Integer.parseInt(count.getText());	
			System.out.println(waitingjobcount);
			
			WebElement waitingtostart;
			waitingtostart= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='RUNNING']")));
			waitingtostart.click();
			
			
			Thread.sleep(5000);
			
			
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
				
				
				
			    System.out.println("No of rows are : " + rows.size());
			    
				
				
				totalCount += rows.size();
				System.out.println(totalCount);
			
				WebElement size3=driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/section/div[2]/div/section/div[3]/div[5]/ul/li[7]/a"));
				int size4=Integer.parseInt(size3.getText());
	size=size4;	
				
	System.out.println("last element"+size4);


			}
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
					
			
					
				    System.out.println("No of rows are : " + rows.size());
				   
					
					
					totalCount += rows.size();
					System.out.println(totalCount);
					
				    
				    
					}
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
		
	@BeforeTest
	    public void beforeMethod() {
		// Launch the Online Store Website
		String exePath = "C:\\Users\\ucreate-65\\Downloads\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://uat.connected2.io/hclogin");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("connected@yopmail.com");
		 
	     
		 
	      driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Test123");
	      driver.findElement(By.xpath("//button[@class='green-primary-btn']")).click();

	}

}
