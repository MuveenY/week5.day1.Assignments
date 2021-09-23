package week5.day1.Assignments;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead extends BaseClass {
	@Test(dataProvider = "sendData")

	public void runCreateLead(String firstName, String lastName, String companyName, String phNo) {

		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyName);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phNo);
		driver.findElement(By.name("submitButton")).click();

	}

	@DataProvider
	public String[][] sendData() {
		// rows&columns
		String[][] data = new String[2][4];
		data[0][0] = "Muveen";
		data[0][1] = "Y";
		data[0][2] = "Private";
		data[0][3] = "91";

		data[1][0] = "Chinna";
		data[1][1] = "Y";
		data[1][2] = "Private";
		data[1][3] = "91";

		return data;

	}
}
