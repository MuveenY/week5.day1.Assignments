package week5.day1.Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignIncident extends IncidentsBaseClass {
	
    @Test
	public void runAssignIncident() throws InterruptedException {
		
		
		 driver.switchTo().frame("gsft_main");
		 driver.findElement(By.xpath("(//input[@class='form-control'])[1]")).sendKeys("INC0010007", Keys.ENTER);
		 Thread.sleep(2000);
		
		 driver.findElement(By.xpath("(//td[@class='vt']/a)[1]")).click();
		
		 
		 WebElement group = driver.findElement(By.xpath("//input[@id='sys_display.incident.assignment_group']"));
         group.clear();
         Thread.sleep(2000);
         group.sendKeys("Software", Keys.ENTER);
         Thread.sleep(3000);
         
		 driver.findElement(By.xpath("//textarea[@id='activity-stream-textarea']")).sendKeys("Update verified");
		 
		 driver.findElement(By.xpath("//button[@id='sysverb_update']")).click();
		 Thread.sleep(2000);

		 String group1 = driver.findElement(By.xpath("(//td[@class='vt']/a)[3]")).getText();
		 if(group1.contains("Software"))
			 System.out.println("Assignment group verified");
		 else
			 System.out.println("Assignment group not verified");
		 
		 
	}    

}
