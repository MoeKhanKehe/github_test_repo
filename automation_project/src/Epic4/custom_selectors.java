package Epic4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class custom_selectors {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Program Files (x86)\\\\Google\\\\Chrome\\\\Application\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	//****DOWNLOAD CHROPATH****//
//YOU CAN GENERALLY GET MOST LOCATORS FROM CHROPATH, WHICH MAKES OUR JOB EASY

//LETS PRACTICE WITH XPATH
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("name using xpath");
		driver.findElement(By.xpath("/html//input[@id='Login']")).click();
		
		
		
//LETS PRACTICE THE SAME THING BUT THIS TIME WITH CSS
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.cssSelector("#username")).sendKeys("name using css");
		driver.findElement(By.cssSelector("[name='pw']")).sendKeys("password using css");
		driver.findElement(By.cssSelector("[name='Login']")).click();

		
		
/*
LETS PRINT OUT SOME TEXT THAT IS DISPLAYED ON THE PAGE
		
THE SCENARIO IS
	Given I have entered an invalid username/password
	When I click the "Log In" button
	Then I will get an error message
*/
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.cssSelector("#username")).sendKeys("name using css");
		driver.findElement(By.cssSelector("[name='pw']")).sendKeys("password using css");
		driver.findElement(By.cssSelector("[name='Login']")).click();
		
//LETS STORE THE VALUE OF THAT ERROR IN A VARIABLE
		String error = driver.findElement(By.cssSelector("div[id='error']")).getText();
		
		System.out.println(error);
		
		
		
		//------WHEN ALL ELSE FAILS....HAVE NO FEAR...CUSTOM SELECTORS ARE HERE-----//
		
/*		
SYNTAX FOR CUSTOM XPATH & CSS
	
	    LINE OF HTML CODE:
		<input class="button r4 wide primary" type="submit" id="Login" className="Login123" value="Log In" xpath="1">		
			
		tagName = input
		attribute = id
		value = Login
		
		
CUSTOM XPATH SYNTAX:
		//tagName[@attribute='value']
		//input[@id='Login']
		 		 		
REGEX(Regular Expression) XPATH SYNTAX:
		//tagName[contains(@attribute,'value')]
		//input[contains(@className,'Login')]     < ---- notice how I didnt enter the exact className, just a subtext of what it contains: Login123 contains Login 
		 
CUSTOM CSS SYNTAX:
		tagName[attribute='value']
		input[id=Login]
		
REGEX CSS SYNTAX:
		tagName[attribute*=['value']
		 
	CSS FOR ID ONLY
		tagName#id or #id (can do without tagName if id is unique)
		input#Login
		
	CSS FOR CLASSNAME ONLY
		tagName.className 
		input.Login123

*/
		
//LETS SEE IF IT WORKS 
		driver.get("https://login.salesforce.com");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("my xpath");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("my xpath pass");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		
		
//LETS DO THE SAME THING WITH CSS
		driver.get("https://www.facebook.com");
		driver.findElement(By.cssSelector("input[id='username']")).sendKeys("my css");
		driver.findElement(By.cssSelector("input[id='password']")).sendKeys("my css pass");
		
		driver.findElement(By.cssSelector("input#password")).click();
		
		
/*
//NOW LETS TRY TO SEE THE DIFFERENCE BETWEEN RELETIVE XPATH VS ABSOLUTE XPATH
SCENARIO
	 Given I am on the salesforce landing page
	 When I click the "Login" button
	 Then I am taken to the login page
 */
		
//now we don't have a way to get this button with ID, Name, Or className which means we need to use CSS or Xpath
		
		driver.get("https://login.salesforce.com/");
		
//here is a relative xpath
		
		driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
		
//now lets look at a absolute xpath for the same button
		
		driver.findElement(By.xpath("/html[1]/body[1]/header[1]/div[2]/div[2]/div[1]/div[1]/nav[1]/div[1]/div[1]/div[3]/div[1]/div[5]/div[1]/a[1]")).click();
//as you can see the absolute xpath is very long and unstable due to the fact that now a days web-sites are constantly changing. One slight change can ruin your entire test
		
		
		
/*
 HOW TO VALIDATE IF THE LOCATOR IS CORRECT?
	IN THE CONSOLE CLICK CRL + F
	YOU WILL SEE A SEARCH BAR COME UP
	NOW LETS COPY AN XPATH OF SOMETING ON THE PAGE
	PASTE IT(XPATH) IN THE SEARCH BAR AND YOU WILL SEE THAT COMPONENT HIGHLIGHTED IN THE BROWSER
*/
		
		driver.get("https://www.pinterest.com/");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("my xpath");
		driver.findElement(By.cssSelector("#password")).sendKeys("my xpath pass");
		driver.findElement(By.xpath("//button[@class='red SignupButton active']")).click();

		

	}

}
