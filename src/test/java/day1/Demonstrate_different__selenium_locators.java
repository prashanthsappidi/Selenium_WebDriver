package day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demonstrate_different__selenium_locators {

	public static void main(String[] args) {
		

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("name")).sendKeys("Prashanth");
		System.out.println(driver.findElements(By.className("form-control")).size());		//[class="form-control"]----> 7
		System.out.println(driver.findElements(By.tagName("a")).size());                  // a[href]  ----> 33
		System.out.println(driver.findElement(By.linkText("Blog")).getText());
		System.out.println(driver.findElement(By.partialLinkText("Udemy")).getText());
		driver.findElement(By.cssSelector("[placeholder='Enter Phone']")).sendKeys("9908497995");
		driver.findElement(By.xpath("//input[@id='input1']")).sendKeys("This is Prashanth");

	}

}
