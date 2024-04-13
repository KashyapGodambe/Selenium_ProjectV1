package seleniumproject.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSelenium02 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,600)");
		Thread.sleep(4000);
		//for product/courses table :
		//print no. of rows present
		//print no. of columns present
		//print 2nd row of table [2]
		js.executeScript("document.querySelector('.table-display')");
		
		//print no. of rows present
		List<WebElement>rowsValues = driver.findElements(By.cssSelector(".table-display tr"));
		System.out.println(rowsValues.size() + " rows are present");
		
		
		//print no. of columns present
		List<WebElement>columnValues = driver.findElements(By.cssSelector(".table-display td"));
		System.out.println(columnValues.size() + " columns are present");
		
		//List<WebElement>secondRecord = driver.findElements(By.cssSelector(".table-display tr"));
				
		 
		for(int i=0; i< rowsValues.size(); i++) {
		    if(i==2) 
		    { // Note that array indices start from 0, so the second row has index 1
		        WebElement row = rowsValues.get(i);
		        List<WebElement> cells = row.findElements(By.cssSelector("td"));
		        for(int j=0; j<cells.size(); j++) {
		            System.out.println("Cell " + (j+1) + ": " + cells.get(j).getText());
		        }
		    }
		}
		
		driver.quit();

	}

}
