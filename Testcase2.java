package Week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		

		driver.get("http://leaftaps.com/opentaps/control/main");
		

		driver.manage().window().maximize();

		 driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 driver.findElement(By.className("decorativeSubmit")).click();
		 driver.findElement(By.linkText("CRM/SFA")).click();
		 driver.findElement(By.linkText("Contacts")).click();
		 driver.findElement(By.linkText("Find Contacts")).click();
		 driver.findElement(By.xpath("//span[text()='Email']")).click();
		 driver.findElement(By.name("emailAddress")).sendKeys("babu@testleaf.com");
		 driver.findElement(By.xpath("//button[text()='Find Contacts']")).click();
		 driver.close();
		 
	}

}
