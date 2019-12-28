package Epic3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice_locators {
	public static void main(String[] args) {
			
	System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
/*
Let's practice locating some objects on the webpage

Selenium supports the following locators

Css
Xpath
ID
Name
Class
Link

Let's go to amazon and see how we can investigate a little further on locators
This is the part in the past where I spend most of my time...outside planning a method, locating objects is time-consuming


Lets practice entering a search into the search box
*/

//first lets go to amazon.com
	driver.get("https://amazon.com");
	
//LOCATE THE BOX WITH ID
	driver.findElement(By.id("twotabsearchtextbox")).isDisplayed();
	
//can you tell me why that didnt print out in the console
	System.out.println(	driver.findElement(By.id("twotabsearchtextbox")).isDisplayed());
	
//TYPE IN THE TEXT BOX WITH ID
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("toys");
	
	
//SOMETIMES AN ID WILL NOT BE ASSIGNED TO AN ELEMENT
//TRY THE CLASSNAME LOCATOR
//CLICK SEARCH
	driver.findElement(By.className("nav-input")).click();
	
	
//NOW LETS PRACTICE WHEN YOU DONT HAVE A CLASSNAME OR ID
	driver.get("https://facebook.com");
	
//LETS CLICK A LINK
//you can see that the HTML attribute for a link is "a"
//if you see an "a" this means you can click the link by passing the text of the link
	driver.findElement(By.linkText("Forgot account?")).click();
	
// LETS PRACTIVE WITH NAME
	
	driver.get("https://login.salesforce.com/");
	driver.findElement(By.id("username")).sendKeys("my username");
	driver.findElement(By.id("password")).sendKeys("password");
	
	//classNames cannot have spaces in them so we will not use that
	//driver.findElement(By.className("button r4 wide primary")).click();
	driver.findElement(By.name("Login")).click();
	

	
	}
}
