package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumWebdriverProgram {

	public static void main(String[] args) throws InterruptedException {
		
		// To setup the Webdrivermanager which it will takecare of everything..
		//Instead of system.setproperty we can use this..
		WebDriverManager.chromedriver().setup();

		// Open the browser..
				ChromeDriver driver = new ChromeDriver();
				// Load the URL
				driver.get("http://leaftaps.com/opentaps/control/login");
				// Maximize the browser
				driver.manage().window().maximize();
				// Enter UserName
				WebElement userName = driver.findElement(By.id("username"));
				userName.sendKeys("Demosalesmanager");
				System.out.println(userName);
				// Enter Password..
				driver.findElement(By.id("password")).sendKeys("crmsfa");
				// Click Login
				driver.findElement(By.className("decorativeSubmit")).click();
				// Click CRM/SFA
				driver.findElement(By.partialLinkText("CRM/SFA")).click();
				// Click on Leads Button
				WebElement leads = driver.findElement(By.linkText("Leads"));
				leads.click();
				// Click on create Lead Button
				WebElement createLead = driver.findElement(By.linkText("Create Lead"));
				createLead.click();
				
				//Select "Employee" from Source drop down using Visible Text
				WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
				Select source1 = new Select(source);
				source1.selectByVisibleText("Employee");
				
				//Select "Finance" from Industry drop down using Value..
				WebElement industry = driver.findElement(By.id("createLeadForm_industryEnumId"));
				Select industry1 = new Select(industry);
				industry1.selectByValue("IND_FINANCE");
				
				
				//Select "Partnership" from Ownership drop down using Index..
				WebElement Ownership = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
				Select Ownership1 = new Select(Ownership);
				Ownership1.selectByIndex(2);


	}

}
