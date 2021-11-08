package Week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassRoomLast {
public static void main(String[] args) {
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
 WebElement currency = driver.findElement(By.name("preferredCurrencyUomId"));
 Select sel = new Select(currency);
 sel.selectByVisibleText("INR - Indian Rupee");
WebElement Country = driver.findElement(By.name("generalCountryGeoId"));
 Select sel1 =new Select(Country);
 sel1.selectByValue("IND");
 
driver.findElement(By.className("smallSubmit")).click();

}
}
