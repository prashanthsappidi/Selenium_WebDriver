package day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Alerts {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		/*--------using driver.switchTo().alert()---------------------------------*/
		
		//Simple Alert(Normal alert with OK button)
		driver.findElement(By.xpath("//*[normalize-space()='Simple Alert']")).click();
		Alert alert1 = driver.switchTo().alert();
		alert1.accept();
		
		//Confirmation Alert
		driver.findElement(By.id("confirmBtn")).click();
		Alert alert2 = driver.switchTo().alert();
		alert2.dismiss();
		alert2.accept();
		
		//Prompt Alert
		driver.findElement(By.id("promptBtn")).click();
		Alert alert3 = driver.switchTo().alert();
		alert3.sendKeys("Prashanth");
		//alert3.accept();
		alert3.dismiss();

	}

}
