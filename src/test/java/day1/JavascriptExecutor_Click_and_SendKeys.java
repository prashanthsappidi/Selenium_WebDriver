package day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutor_Click_and_SendKeys {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//SendKey using JavascriptExecutor
		WebElement ele = driver.findElement(By.id("name"));
		js.executeScript("arguments[0].setAttribute('value','prashanth')", ele);
		
		//Click method using JavascriptExecutor
		WebElement e = driver.findElement(By.cssSelector("[id='alertBtn']"));
		js.executeScript("arguments[0].click()", e);
				

	}

}
