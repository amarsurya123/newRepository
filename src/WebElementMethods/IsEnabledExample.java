package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledExample {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://en-gb.facebook.com/");
	 WebElement Female = driver.findElement(By.xpath("//input[@value='1']"));
		 
		 boolean Result = Female.isSelected();
		 
		 System.out.println(Result);
		 
		 Thread.sleep(2000);
		 
		 Female.click();
		 
		 Thread.sleep(2000);
		 boolean Result1 = Female.isSelected();
		 
		 System.out.println(Result1);

		

	}

}
