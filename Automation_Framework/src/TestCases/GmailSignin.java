package TestCases;

	import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;

import AllPages.UserName;
	
	public class GmailSignin {
		
			
		public WebDriver driver;
		
		@BeforeMethod
		public void open(){
			
			String baseDirPath = System.getProperty("user.dir");
			String FirefoxServerPath = baseDirPath + "\\Utilites\\geckodriver.exe";
			System.setProperty("webdriver.gecko.driver", FirefoxServerPath);
			WebDriver driver = new FirefoxDriver();
		 	
			driver.navigate().to("https://www.Gmail.com");	
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
		}
		
		@Test
		
		public void gmailLogin(){
			
			UserName name = new UserName();
			name.getuserNameInputField().sendKeys("kabir8933k@gmail.com");
			name.getNexButton().click();
			
			
		
		}
		/*
		@Test
		public void createAccount(){
			System.out.println("account is created");
		}
		@Test
		public void findMyAccount(){
			System.out.println("Account find");
		}
		*/
		
		
			@AfterMethod
			public void close(){
				
				driver.quit();
			
		
		
		
		}
		
		
	
	}


