package day1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_4x {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();

		// New Tab
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.pavantestingtools.com/");
		System.out.println(driver.getTitle());

		// New Window
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.pavanonlinetrainings.com/");
		System.out.println(driver.getTitle());

	}

}
