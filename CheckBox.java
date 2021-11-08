package Week2.day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leafground.com/pages/checkbox.html");

		driver.manage().window().maximize();
		List<WebElement> input = driver.findElements(By.xpath("//input[@type='checkbox']"));
		int size = input.size();
		System.out.println("Number of checkboxs "  +size);
		

	}

}
