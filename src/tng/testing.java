package tng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class testing {
	@Test
	public void tester()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\Chromedriver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
	}
}
