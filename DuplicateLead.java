package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

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
						
						driver.findElement(By.linkText("Leads")).click();
						driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]")).click();
						driver.findElement(By.xpath("//span[contains(text(),'Email')]")).click();
						driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("krish@gmail.com");
						driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
						Thread.sleep(2000);

						WebElement Firstname = driver.findElement(By.xpath("(//a[@class='linktext'])[4]"));
						String FName = Firstname.getText();
						System.out.println("Resulting First name is " + FName);
						Firstname.click();

						driver.findElement(By.xpath("//a[contains(text(),'Duplicate')]")).click();
						System.out.println(driver.getTitle());
						driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
						Thread.sleep(1000);
						System.out.println("The Duplicate Lead Name is same as captured name "
								+ driver.findElement(By.xpath("//span[@id='viewLead_firstName_sp']")).getText());
		
		
		

	}

}
