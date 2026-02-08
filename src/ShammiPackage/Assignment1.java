package ShammiPackage;

import static org.testng.AssertJUnit.assertFalse;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assignment1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("checkBoxOption1")).click();
		Assert.assertTrue(driver.findElement(By.id("checkBoxOption1")).isSelected());
			System.out.println("first checkbox is selected");
		driver.findElement(By.id("checkBoxOption1")).click();
		Assert.assertFalse(driver.findElement(By.id("checkBoxOption1")).isSelected());
			System.out.println("first checkbox is not selected");
		//count of checkbox
			
		List<WebElement> d2 = driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.print(d2.size());
	
			
		
		
		
		// TODO Auto-generated method stub

	}

}
