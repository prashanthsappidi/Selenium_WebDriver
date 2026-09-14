package day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Upload_Single_File {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		WebElement file = driver.findElement(By.id("singleFileInput"));
		file.sendKeys("C:\\Users\\gs\\Pictures\\Ad1.crx");
		String s = file.getText();
		System.out.println(s);
		System.out.println("Done");

	}

}
