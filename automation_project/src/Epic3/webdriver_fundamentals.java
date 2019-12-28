package Epic3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdriver_fundamentals {

	public static void main(String[] args) {
			
		//Lets verify that you have set-up everything on your machine properly and can launch a browser
		System.setProperty("webdriver.chrome.driver", "C:\\\\Program Files (x86)\\\\Google\\\\Chrome\\\\Application\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		//the stuff above is essential for you to be able to continue. 
		
		// Webdriver is an Interface and ChromeDriver is a class the implements it.
		//in other words WebDriver is a set of functions and ChromeDriver can call/use them. All of them
		
		
		//now lets go on ahead and open up a browser once again
	
		driver.get("http://google.com");
		
		//lets MAXIMIZE the screen
		driver.manage().window().maximize();
		
		//GET THE TITLE
		driver.getTitle();
		
		//PRINT THE TITLE
		System.out.println(driver.getTitle());
		
		//GET THE URL
		driver.getCurrentUrl();
		
		//PRINT THE URL
		System.out.println(driver.getCurrentUrl());
		
		//CLOSE THE BROWSER 
		//generally you want to use this at the end of your script 
		// that way it will not slow down your machine 
		//driver.quit();
		
		//pretty simple right???
		
		
		
		//Lets go to a different website and learn some other actions we can make to the browser
		driver.get("https://facebook.com");
		
		//BACK ON BROWSER
		driver.navigate().back();
		
		//FORWARD ON BROWSER
		driver.navigate().forward();
	


	}

}
