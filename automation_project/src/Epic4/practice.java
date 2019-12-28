package Epic4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Program Files (x86)\\\\Google\\\\Chrome\\\\Application\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://google.com/");
		
		/*
		driver.findElement(By.xpath("//input[@id='username']"));
		driver.findElement(By.xpath("//input[@id='password']"));
		
		driver.findElement(By.cssSelector("#username")).sendKeys("my css");
		driver.findElement(By.cssSelector("#password")).sendKeys("my css password");
		driver.findElement(By.name("pw")).sendKeys("my pw password");
		
		driver.findElement(By.cssSelector("input[id='username']"));
		driver.findElement(By.cssSelector("input[id='password']"));
	*/
		/*
		LETS PRINT OUT SOME TEXT THAT IS DISPLAYED ON THE PAGE
				
		THE SCENARIO IS
			Given I have entered an invalid username/password
			When I click the "Log In" button
			Then I will get an error message that reads:
			"Please check your username and password. 
			If you still can't log in, contact your Salesforce administrator."
		*/
		
		
		///find username
		//driver.findElement(By.cssSelector("input[id='username']")).sendKeys("username");;
		///find password
		//driver.findElement(By.cssSelector("#password")).sendKeys("my css password");
		///click login
//		driver.findElement(By.cssSelector("#Login")).click();
		//relative
		//driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
		
		//absolute
		//driver.findElement(By.xpath("/html[1]/body[1]/header[1]/div[2]/div[2]/div[1]/div[1]/nav[1]/div[1]/div[1]/div[3]/div[1]/div[5]/div[1]/a[1]")).click();

		
		
		///find error message
		//driver.findElement(By.cssSelector("#error")).equals("Please check your username and password. If you still can't log in, contact your Salesforce administrator.");
		
		
		/*
		driver.get("https://www.pinterest.com/");
		driver.findElement(By.cssSelector("#email")).sendKeys("asdfas");
		driver.findElement(By.cssSelector("input[id='password']")).sendKeys("asdfas");

		driver.findElement(By.cssSelector("#age")).sendKeys("asdfas");

		
		driver.findElement(By.xpath("//input[@id='email'")).sendKeys("asdfas");
		driver.findElement(By.xpath("//input[@id='password'")).sendKeys("asdfas");
		driver.findElement(By.xpath("//input[@id='age'")).sendKeys("asdfas");
		
		driver.findElement(By.xpath("//button[@class='red SignupButton active'")).click();
		
*/

		
		//IN THIS EXAMPLE WE START AT A LEVEL WHERE WE CAN GET A UNIQUE CLASS AND DRILL INSIDE OF IT
		driver.findElement(By.cssSelector("div[class='RNNXgb'] div div[class='a4bIc'] input")).sendKeys("Hello");
		driver.findElement(By.cssSelector("div[class='SDkEP'] div[class='a4bIc'] input")).sendKeys("Hello");

//can also do
		driver.findElement(By.cssSelector("div[id='searchform'] form div div div div input")).sendKeys("World");
//and also this	
		driver.findElement(By.cssSelector("*[id='searchform'] form div div div div input")).sendKeys("World");

		
		driver.findElement(By.xpath("//div[@class='RNNXgb']/div/div[@class='a4bIc']/input")).sendKeys("HELLO");
//can also do
		driver.findElement(By.xpath("//div[@id='searchform']/form/div/div/div/div/div/input")).sendKeys("WORLD");
//and also this
		driver.findElement(By.xpath("//*[@id='searchform']/form/div/div/div/div/div/input")).sendKeys("WORLD");

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
/*
	    LINE OF HTML CODE:
		<input class="button r4 wide primary" type="submit" id="Login" className="Login123" value="Log In" xpath="1">		
			
		tagName = input
		attribute = id
		value = Login
		}
		
		//tagName[@attribute='value']
		//input[@id='Login']
		 * 
		 * 
		//tagName[contains(@attribute,'value')]
		//input[contains(@className,'Login')]
		 * 
		 * 
		 * 
		 * 
		tagName[attribute='value']
		input[id-'Login']
		
		tagName#id
		
		input#Login
		#Login
		
		tagName.className
		input.Login123
		
		*/
		
	
		
		
		
	}

}
