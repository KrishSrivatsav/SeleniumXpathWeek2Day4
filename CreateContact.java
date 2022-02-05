package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

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
						
						driver.findElement(By.linkText("Contacts")).click();
						driver.findElement(By.linkText("Create Contact")).click();
						driver.findElement(By.id("firstNameField")).sendKeys("Krish");
						driver.findElement(By.id("lastNameField")).sendKeys("Srivatsav");
						driver.findElement(By.id("createContactForm_departmentName")).sendKeys("CSE");
						driver.findElement(By.id("createContactForm_description")).sendKeys("Doing course in Test Leaf");
						driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("krish@gmail.com");

						WebElement State = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
						Select Dropdown = new Select(State);
						Dropdown.selectByVisibleText("India");

						driver.findElement(By.name("submitButton")).click();
						Thread.sleep(3000);
						driver.findElement(By.xpath("//a[contains(text(),'Edit')]")).click();
						driver.findElement(By.id("updateContactForm_description")).clear();
						driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Hi, I am learnig selenium in Testleaf.");
						driver.findElement(By.xpath("//input[contains(@name,'submit')]")).click();
						System.out.println(driver.getTitle());
		
		
		

	}

}
