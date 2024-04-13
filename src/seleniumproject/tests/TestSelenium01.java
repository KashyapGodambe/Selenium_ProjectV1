package seleniumproject.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;




public class TestSelenium01 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
        
        // Open a website
        /*driver.get("https://app.vwo.com/#/login");
        
        driver.findElement(By.id("login-username")).sendKeys("kashgodambe@gmail.com");
        driver.findElement(By.id("login-password")).sendKeys("Kashyap@123");
       
       
        driver.findElement(By.id("js-login-btn")).click();
        
        //driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);

      //get a error message
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement errMgs = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#js-notification-box-msg")));
        
        System.out.println("Error message is : " +errMgs.getText());
        driver.quit(); */
		
		
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,600)");
		Thread.sleep(4000);
		
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=6000");
		
		List<WebElement>values = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		int sum=0;
		
		for(int i=0; i< values.size(); i++) {
			sum = sum + Integer.parseInt(values.get(i).getText());
			//sum = sum + singleValue;
		}
		
		System.out.println(sum);
		
		String totalText = driver.findElement(By.cssSelector(".totalAmount")).getText();
		
		int total = Integer.parseInt(totalText.split(":")[1].trim());
		System.out.println(total);
		
		//validating if sum of 3rd column & total from text msg are same.
		Assert.assertEquals(sum, total);
				
		driver.quit();
        

	}

}
