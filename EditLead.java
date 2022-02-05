package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

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
						WebElement findLeads = driver.findElement(By.linkText("Find Leads"));
						findLeads.click();
						
						driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Krish");
						
						driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
						Thread.sleep(3000);
						
						WebElement Firstname = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName'][1]//a"));
						String Firstname1 = Firstname.getText();
						System.out.println("First Resulting name is:- " +Firstname1);
						Firstname.click();
						WebElement title = driver.findElement(By.xpath("//div[text()='View Lead']"));
						String titleck = title.getText();
						System.out.println("The title is"+titleck);
						
						driver.findElement(By.xpath("//a[contains(text(),'Edit')]")).click();
						driver.findElement(By.id("updateLeadForm_companyName")).clear();
						driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("CTS");
						
						WebElement updateck =driver.findElement(By.xpath("//input[@value='Update']"));
						updateck.click();
						
						 WebElement textUpdateCheck =driver.findElement(By.id("viewLead_companyName_sp"));
						String textUpdateCk = textUpdateCheck.getText();
						 System.out.println("The Updated text"+" "+textUpdateCk);
						 
						driver.close();
		

	}

}
