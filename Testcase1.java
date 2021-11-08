package Week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase1 {

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
		 driver.findElement(By.linkText("Create Contact")).click();
		 driver.findElement(By.id("firstNameField")).sendKeys("Priyanga");
		 driver.findElement(By.id("lastNameField")).sendKeys("Lakkaiyan");
		 driver.findElement(By.name("submitButton")).click();
		 String titl = driver.getTitle();
		 System.out.println("Page Title is " +titl);

		 String tex = driver.findElement(By.id("viewContact_fullName_sp")).getText();

		 System.out.println("Fist Name is " +tex);
        driver.close();

	}

}
