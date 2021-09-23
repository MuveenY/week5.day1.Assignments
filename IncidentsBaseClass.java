package week5.day1.Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IncidentsBaseClass {
	
	public ChromeDriver driver;
  
	@BeforeMethod
	public void preCondition() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://dev96761.service-now.com");
		 String title = driver.getTitle();
		 System.out.println(title);
		 driver.manage().window().maximize();
		 
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.switchTo().frame("gsft_main");
		 
		 driver.findElement(By.xpath("//div[@class='login']//input[@id='user_name']")).sendKeys("admin");
		 driver.findElement(By.xpath("//div[@class='login']//input[@id='user_password']")).sendKeys("Ad94FSpiWjhW");
		 driver.findElement(By.xpath("//button[@id='sysverb_login']")).click();
		 driver.findElement(By.xpath("//input[@id='filter']")).sendKeys("incident");
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("(//div[text()='All'])[2]")).click();

			}
	
	@AfterMethod
	public void postCondition() {
		driver.close();
	}
	
	
	
}
