package ShammiPackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class OpenApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver dr = new ChromeDriver(); 
		
		dr.get("https://www.facebook.com/login");
		dr.findElement(By.name("email")).sendKeys("Ankitbarmate0@gmail.com");
		dr.findElement(By.name("pass")).sendKeys("c-3pathways");
		dr.findElement(By.name("login")).click();
		
	}

}
