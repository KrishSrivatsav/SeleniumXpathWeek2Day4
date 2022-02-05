package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath {

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
						
						 //Enter first name with <your name> //input[@id= 'createLeadForm_firstName']
						WebElement firstName = driver.findElement(By.xpath("//input[@id= 'createLeadForm_firstName']"));
						firstName.sendKeys("Krish");
						
						// Enter last name with <your last name>
						WebElement lastName = driver.findElement(By.xpath("//input[@id= 'createLeadForm_lastName']"));
						lastName.sendKeys("Srivatsav");
						
						 // Enter Company name with "TestLeaf"
						WebElement compName = driver.findElement(By.xpath("//input[contains(@id,'createLeadForm_companyName')]"));
						compName.sendKeys("Test Leaf");
						
						Thread.sleep(3000);
						 // Click on the Create Lead button 
						WebElement button = driver.findElement(By.xpath("//input[@class='smallSubmit']"));
						button.click();  
						
		

	}

}
