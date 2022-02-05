package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1FB {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// To setup the Webdrivermanager which it will takecare of everything..
		// Instead of system.setproperty we can use this..
		WebDriverManager.chromedriver().setup();

		// Open the browser..
		ChromeDriver driver = new ChromeDriver();
		// Load the URL
		driver.get("https://en-gb.facebook.com");
		// Maximize the browser
		driver.manage().window().maximize();
		// Click on the button..
		WebElement create = driver.findElement(By.linkText("Create New Account"));
		create.click();
		Thread.sleep(3000);
		WebElement firstname = driver.findElement(By.name("firstname"));
		firstname.sendKeys("Krish");
		WebElement lastname = driver.findElement(By.name("lastname"));
		lastname.sendKeys("Srivatsav");
		WebElement email = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		email.sendKeys("xyz@gmail.com");
		WebElement pass = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
		pass.sendKeys("xxxyyy");

		WebElement dob = driver.findElement(By.xpath("//*[@id='day']"));
		Select sel = new Select(dob);
		sel.selectByIndex(1);
		WebElement month = driver.findElement(By.xpath("//*[@id='month']"));
		Select sel1 = new Select(month);
		sel1.selectByVisibleText("Nov");
		WebElement year = driver.findElement(By.xpath("//*[@id='year']"));
		Select sel2 = new Select(year);
		sel2.selectByValue("1997");
		WebElement radiobutton = driver.findElement(By.xpath("//*[text()='Male']"));
		radiobutton.click();
		
		driver.close();
	}

}
