package Epic4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class parent_child_relationship {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
/*

THE WAT PARENT CHILE RELATIONS WORK ARE LIKE A FOLDER STRUCTURE
YOU CAN THINK OF div AS BOXES WITH MORE BOXES AND THINGS INSIDE OF THEM

*/
		driver.get("https://google.com/");
		
		//IN THIS EXAMPLE WE START AT A LEVEL WHERE WE CAN GET A UNIQUE CLASS AND DRILL INSIDE OF IT
		driver.findElement(By.cssSelector("div[class='RNNXgb'] div div[class='a4bIc'] input")).sendKeys("Hello");
//can also do
		driver.findElement(By.cssSelector("div[id='searchform'] form div div div div input")).sendKeys("World");
//and also this	
		driver.findElement(By.cssSelector("*[id='searchform'] form div div div div input")).sendKeys("World");
		
		
		//SAME THING FOR XPATH
		driver.findElement(By.xpath("//div[@class='RNNXgb']/div/div[@class='a4bIc']/input")).sendKeys("HELLO");
//can also do
		driver.findElement(By.xpath("//div[@id='searchform']/form/div/div/div/div/div/input")).sendKeys("WORLD");
//and also this
		driver.findElement(By.xpath("//*[@id='searchform']/form/div/div/div/div/div/input")).sendKeys("WORLD");


	}

}
