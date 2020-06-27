package listenerDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


public class TestCase2 {

	public WebDriver driver;
	
	
	@BeforeMethod
	public void setup() {
		
		System.setProperty("webdriver.chrome.driver", "c:\\Users\\H330744\\driver\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://zero.webappsecurity.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.MILLISECONDS);
		}
	
	@Test
	public void login() {
	WebElement signinbtn = driver.findElement(By.id("signin_button"));
	signinbtn.click();
	driver.findElement(By.id("user_login")).sendKeys("username");
	driver.findElement(By.id("user_password")).sendKeys("password");
	driver.findElement(By.name("submit")).click();
	String ActualTitle=driver.getTitle();
	String ExpectedTitle = "Zero - Account Summary";
	Assert.assertEquals(ActualTitle, ExpectedTitle);
	}
	
	@AfterMethod
	public void tearDown() {
	driver.quit();
	
	}


	}


