package Epic3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
		
		//LETS CLICK A LINK
		//you can see that the HTML attribute for a link is "a"
		//if you see an "a" this means you can click the link by passing the text of the link
			driver.findElement(By.linkText("Forgot account?")).click();


		
	}
}
