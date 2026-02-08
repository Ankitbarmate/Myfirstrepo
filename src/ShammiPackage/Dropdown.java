package ShammiPackage;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		WebElement D = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select sel = new Select(D);
		sel.selectByIndex(3);
		sel.selectByValue("AED");
		System.out.println(sel.getFirstSelectedOption().getText());
		sel.selectByVisibleText("Select");
		System.out.println(sel.getFirstSelectedOption().getText());
		
		//Use Loop for multiple click in dropdrop
		WebElement D2 = driver.findElement(By.id("divpaxinfo"));
		D2.click();
		Thread.sleep(2000);
		for(int i = 0;i<=2;i++)
		{
			WebElement D3 = driver.findElement(By.id("hrefIncChd"));
			D3.click();
			
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		System.out.println(D2.getText());
		
		
		
		
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
