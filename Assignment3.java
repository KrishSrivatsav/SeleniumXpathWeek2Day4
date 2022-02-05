package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// To setup the Webdrivermanager which it will takecare of everything..
				//Instead of system.setproperty we can use this..
				WebDriverManager.chromedriver().setup();

				// Open the browser..
						ChromeDriver driver = new ChromeDriver();
						// Load the URL
						driver.get("https://acme-test.uipath.com/login");
						// Maximize the browser
						driver.manage().window().maximize();
						// Enter UserName
						WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
						email.sendKeys("kumar.testleaf@gmail.com");
						//pass
						WebElement pass = driver.findElement(By.xpath("//input[@id='password']"));
						pass.sendKeys("leaf@12");
						//login
						WebElement login = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
						login.click();
						
						Thread.sleep(3000);
						
						String title = driver.getTitle();
						System.out.println(title);
						
						WebElement logout = driver.findElement(By.partialLinkText("Log Out"));
						logout.click();
						
						driver.close();
						
	}

}
