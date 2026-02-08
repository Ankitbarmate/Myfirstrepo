package ShammiPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("autosuggest")).sendKeys("Ind");
		
		Thread.sleep(3000);
		
		List<WebElement> Options = driver.findElements(By.id("ui-id-1"));
		
		for(WebElement Option : Options) {
			If(Option.getText().equalsIgnoreCase("India"));
			{
		     Option.click();
		     }
			
		}
		
		}

	private static void If(boolean equalsIgnoreCase) {
		// TODO Auto-generated method stub
		
	}

}
