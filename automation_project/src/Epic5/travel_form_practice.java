package Epic5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class travel_form_practice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

				System.setProperty("webdriver.chrome.driver",
						"C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
				ChromeDriver driver = new ChromeDriver();
				driver.get("https://www.path2usa.com/travel-companions");
				
//				PICK A LOCATION
				driver.findElement(By.cssSelector("#travel_from")).sendKeys("chicago ");
				
				
//				CHOOSE A FROM DESTINATION
		//it seems like there is an issue with how quick it(selenium is running). lets tell it to wait until the dropdowns load
				Thread.sleep(3000);
		//lets say that we want to select the second one down
				driver.findElement(By.cssSelector("#travel_from")).sendKeys(Keys.DOWN);
		//lets click ENTER to select our option
				driver.findElement(By.cssSelector("#travel_from")).sendKeys(Keys.ENTER);

				
//				CHOOSE THE DATE APRIL 23
		//April 23
				driver.findElementByXPath(".//*[@id='travel_date']").click();

				while (!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText()
						.contains("April")) {
					driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
				}

				List<WebElement> dates = driver.findElements(By.className("day"));
		//Grab common attribute//Put into list and iterate
				int count = dates.size();

				for (int i = 0; i < count; i++) {
					String text = dates.get(i).getText();
					if (text.equalsIgnoreCase("23")) {
						dates.get(i).click();
						System.out.println("Selected May "+ text);
						break;
					}
				}
				
//				lets do the same for the next field with the dropdown
				driver.findElement(By.cssSelector("#datebetween")).sendKeys(Keys.ENTER);
				
//				CHOOSE A LANGUAGE
				driver.findElement(By.cssSelector("select[id='travel_language'] option[value='Urdu']")).click();
				
//				CHOOSE AN AIRPORT OR CITY NAME
				driver.findElement(By.cssSelector("#travel_to")).sendKeys("Delhi");

		//it seems like there is an issue with how quick it(selenium is running). lets tell it to wait until the dropdowns load
				Thread.sleep(3000);
		//lets click ENTER to select our option
				driver.findElement(By.cssSelector("#travel_from")).sendKeys(Keys.ENTER);
				
//				LETS PICK AN AIRLINE
				driver.findElement(By.cssSelector("select[id='travel_airline'] option[value='Air India']")).click();
				
//				LETS CLICK SEARCH
				driver.findElement(By.cssSelector("button[class*='btn btn']")).click();

	}

}
