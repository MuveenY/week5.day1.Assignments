package week5.day1.Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteIncident extends IncidentsBaseClass {
	 
    @Test
	public void runDeleteIncident() throws InterruptedException {
		
				 driver.switchTo().frame("gsft_main");
			
			  driver.findElement(By.xpath("(//input[@class='form-control'])[1]")).sendKeys("INC0010007", Keys.ENTER); 
			  Thread.sleep(2000);
			  
			  driver.findElement(By.xpath("(//td[@class='vt']/a)[1]")).click();
			  
			  driver.findElement(By.xpath("//button[@id='sysverb_delete']")).click();
			 
		 driver.findElement(By.xpath("//button[@id='ok_button']")).click();
		 
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("(//input[@class='form-control'])[1]")).sendKeys("INC0010007", Keys.ENTER);
		 String text = driver.findElement(By.xpath("//td[text()='No records to display']")).getText();
		 if(text.contains("No records to display"))
			 System.out.println("Incident is Deleted");
		 else
			 System.out.println("Incident is Not Deleted");
		
		
		

	}

}
