package week5.day1.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CreateIncident extends IncidentsBaseClass {
	
	@Test
	public void runCreateIncident() throws InterruptedException {
		
		driver.findElement(By.xpath("(//div[text()='Create New'])[1]")).click();
		 driver.switchTo().frame("gsft_main");
		 String incidentNo = driver.findElement(By.xpath("//input[@id='incident.number']")).getAttribute("value");
		System.out.println("Incident Number : " + incidentNo);
		
		WebElement caller = driver.findElement(By.xpath("//input[@id='sys_display.incident.caller_id']"));
		 caller.sendKeys("guest", Keys.ENTER);
		 
		 driver.findElement(By.xpath("//input[@id='incident.short_description']")).sendKeys("TestCase");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//button[text()='Submit'])[1]")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("(//input[@class='form-control'])[1]")).sendKeys(incidentNo, Keys.ENTER);
		Thread.sleep(2000);
		 String incidentNo1 = driver.findElement(By.xpath("(//td[@class='vt'])[1]/a")).getText();
		 
			System.out.println("Incident Number : " + incidentNo1);
			
			if(incidentNo.equals(incidentNo1))
				System.out.println("Incident is created successfully");
			else
				System.out.println("Incident is not Created");

		
	}

}
