package day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Horizontal_Scrolling_Using_JavascriptExecutor {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();

		JavascriptExecutor js = (JavascriptExecutor) driver;

		// Scroll down by pixel number
		js.executeScript("window.scrollBy(0,1500)", "");
		System.out.println(js.executeScript("return window.pageYOffset;")); // returns output as 1500

		// Scroll the page till WebElement Visible
		WebElement ele = driver.findElement(By.xpath("//*[text()='Errorcode 503']"));
		js.executeScript("arguments[0].scrollIntoView();", ele);
		System.out.println(js.executeScript("return window.pageYOffset;"));

		// Scroll till end of the page
		js.executeScript("window.scrollBy(0, document.body.scrollHeight)");
		System.out.println(js.executeScript("return window.pageYOffset;"));
		Thread.sleep(3000);

		// Scroll till top of the page
		js.executeScript("window.scrollBy(0, -document.body.scrollHeight)");
		System.out.println(js.executeScript("return window.pageYOffset;"));

		// Set Zoom level of 50%
		js.executeScript("document.body.style.zoom = '50%'");

	}

}
