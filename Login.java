package Week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

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
 driver.findElement(By.linkText("Leads")).click();
 driver.findElement(By.linkText("Create Lead")).click();
 driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
 driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Priyanga");
 driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Lakkaiyan");
 driver.findElement(By.name("submitButton")).click();
String title = driver.getTitle();

System.out.println("Page Title is " +title);

String text = driver.findElement(By.id("viewLead_firstName_sp")).getText();

System.out.println("Fist Name is " +text);


	}

}

