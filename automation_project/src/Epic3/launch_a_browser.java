package Epic3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launch_a_browser {

	public static void main(String[] args) {
		
		
		// First lets follow tradition and print out hello world
		System.out.print("Hello World");
		
		
		//Lets verify that you have set-up everything on your machine properly and can launch a browser
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
		
		//how to create a class object
		//once you have decided which browser you want to work with you will tell selenium to create an object of that class so you can use it
		
		//Imagine a 3D printer
		//lets say that there is a website out there that people can upload their designs onto this website and if you have access to their designs, you can print all of their work
		//lets say the 3d printer designers name is WebDriver
		
		//lets get access to all of his "designs"
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com");

	}

}
