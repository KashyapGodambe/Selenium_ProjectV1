package seleniumproject.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSelenium03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
        
        // Open a website
        driver.get("https://app.vwo.com/#/login");
        
        driver.findElement(By.id("login-username")).sendKeys("kashgodambe@gmail.com");
        driver.findElement(By.id("login-password")).sendKeys("Kashyap@123");

	}

}
