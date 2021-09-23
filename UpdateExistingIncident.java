package week5.day1.Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UpdateExistingIncident extends IncidentsBaseClass {
	
    @Test
	public void runUpdateExistingIncident() throws InterruptedException {
		
		 driver.switchTo().frame("gsft_main");
		 
		
		 driver.findElement(By.xpath("(//input[@class='form-control'])[1]")).sendKeys("INC0010007", Keys.ENTER);
		 Thread.sleep(2000);
		
		 driver.findElement(By.xpath("(//td[@class='vt']/a)[1]")).click();
		 
		 
		 WebElement findElement = driver.findElement(By.xpath("//select[@id='incident.state']"));
		 Select dropDown = new Select(findElement);
		 dropDown.selectByVisibleText("In Progress");
		 
		 WebElement findElement1 = driver.findElement(By.xpath("//select[@id='incident.urgency']"));
		 Select dropDown1 = new Select(findElement1);
		 dropDown1.selectByValue("1");
		 
		 //driver.findElement(By.xpath("//textarea[@id='activity-stream-work_notes-textarea']")).sendKeys("updating");
		 
		 driver.findElement(By.xpath("//button[@id='sysverb_update']")).click();
		 Thread.sleep(2000);
	
		 String priority = driver.findElement(By.xpath("//td[text()='3 - Moderate']")).getText();
		 if(priority.contains("Moderate"))
			 System.out.println("Priority of Moderate is Verified");
		 else
			 System.out.println("Priority is not verified");
		 
		 String state = driver.findElement(By.xpath("//td[text()='In Progress']")).getText();
		if(state.contains("Progress"))
			System.out.println("State as In Progress is verified");
		else
			System.out.println("State as In Progress is Not verified");
		

	}

}
