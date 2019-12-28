package Epic5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class wait_practice {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://itgeared.com/demo/1506-ajax-loading.html");
		
		driver.findElement(By.linkText("Click to load get data via Ajax!")).click();
		//driver.findElement(By.xpath("//a[contains(text(),'Click here to return to the tutorial.')]")).click();
		
		//create an object for wait
		WebDriverWait wait = new WebDriverWait(driver,5);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("results")));
		
		
		boolean message = driver.findElement(By.id("results")).isDisplayed();
		
		if(message) {
			System.out.print(true);
			driver.close();
		}else {
			System.out.print(false);
			driver.close();
		}

	}

}
