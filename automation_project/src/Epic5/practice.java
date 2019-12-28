package Epic5;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class practice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.path2usa.com/travel-companions");
		

//type Chicago in the 'From' field
		driver.findElement(By.cssSelector("#travel_from")).sendKeys("Chicago");
		Thread.sleep(3000);
		
		
		// select the second option
		driver.findElement(By.cssSelector("#travel_from")).sendKeys(Keys.DOWN);
		driver.findElement(By.cssSelector("#travel_from")).sendKeys(Keys.ENTER);
		
		
		//select the date May 21 2020
		driver.findElement(By.cssSelector("#travel_date")).click();
		
		while (!driver.findElement(By.cssSelector("div[class='datepicker-days'] [class='datepicker-switch']"))
				.getText().contains("May")) {
			driver.findElement(By.cssSelector("div[class='datepicker-days'] th[class='next']")).click();
		}
		//get the list
		List<WebElement> dates = driver.findElements(By.cssSelector("div[class='datepicker-days'] td[class='day']"));
		//store the size of the list inside of a variable
		
		int size_of_dates = dates.size();
		
		//user the size of the list to establish the max number of iterations for i
		for (int i = 0; i < size_of_dates; i++) {
			String num = dates.get(i).getText();
			System.out.print(num);
			
			if(num.equalsIgnoreCase("j")) {
				dates.get(i).click();
				break;
			}
		}
		
		//type hindi and click ENTER
		driver.findElement(By.cssSelector("#travel_language")).click();
		driver.findElement(By.cssSelector("option[value='Hindi']")).click();

		//type hyder and click ENTER
		driver.findElement(By.cssSelector("#travel_to")).sendKeys("hyder");
		Thread.sleep(3000);
		
		
		// select the second option
		driver.findElement(By.cssSelector("#travel_from")).sendKeys(Keys.ENTER);
		
		//select Airline
		driver.findElement(By.cssSelector("select[id='travel_airline'] option[value='Alitalia']")).click();
		
		//click SEARCH
		driver.findElement(By.cssSelector("button[class='btn btn-primary']")).click();

		//Verify that No listing found is displayed
		

		System.out.println(driver.findElement(By.cssSelector("//p[contains(text(),'No listing found')]")));
		
		driver.close();
	}

}
