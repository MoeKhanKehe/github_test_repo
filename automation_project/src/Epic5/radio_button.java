package Epic5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class radio_button {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		
		//I realized that every time I get to the landing page I see a banner at the bottom so we just need to accept the message inside the banner so it doesn't restrict us from continuing. 
		driver.findElement(By.id("cookie_action_close_header")).click();
		Thread.sleep(3000);
		//I was using the line of code below but i kept getting the following error: Element <input id="sex-0" name="sex" type="radio" value="Male"> is not clickable at point
//		driver.findElement(By.xpath("//div[@class='control-group']/input[@id='sex-0']")).click();
		
		//did a google search for that exact error which led me to the following stackoverflow page:
//		driver.get("https://stackoverflow.com/questions/11908249/debugging-element-is-not-clickable-at-point-error");]
				
		
//		and I got an answer that I tried....and it worked. Great example of how development works. So a lot of the times you will need to research when you are stuck.
		driver.findElement(By.xpath("//div[@class='control-group']/input[@id='sex-0']")).click();

		//Actions actions = new Actions(driver);
		//actions.moveToElement(element).click().perform();
		
		driver.close();
		System.out.println("Success!!!");


	}

}
