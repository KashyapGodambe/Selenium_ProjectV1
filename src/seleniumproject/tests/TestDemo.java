package seleniumproject.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestDemo {
	
	
	@Test
	public void googleSearch()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");	
	}

}
