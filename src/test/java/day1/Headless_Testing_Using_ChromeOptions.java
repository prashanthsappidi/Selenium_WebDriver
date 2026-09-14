package day1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Headless_Testing_Using_ChromeOptions {

	public static void main(String[] args) {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless=new");
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		
		
	}

}
