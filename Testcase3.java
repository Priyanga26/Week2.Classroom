package Week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase3 {

	public static void main(String[] args) throws InterruptedException {
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
		 //driver.findElement(By.xpath("//span[text()='Email']")).click();
		// driver.findElement(By.name("emailAddress")).sendKeys("babu@testleaf.com");
		 //Click Find Contacts

		 //driver.findElement(By.xpath("//button[text()='Find Contacts']")).click();
		 //Type first name with your name
		 driver.findElement(By.xpath("//label[text()='Contact Id:']/following::input[@name=\"firstName\"]")).sendKeys("priya");
		 
		 //Click Find Contacts
		 driver.findElement(By.xpath("//button[text()='Find Contacts']")).click();
		 
	
          Thread.sleep(5000);
		 
		 //Print the first contact id
		 String Contactid = driver.findElement(By.xpath("//div[@class='x-grid3-hd-inner x-grid3-hd-partyId']/a")).getText();
		 
		 System.out.println(Contactid);
		 
		 
		 //Click on the first matching contact id
		 driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		 
	}
	
	

}
