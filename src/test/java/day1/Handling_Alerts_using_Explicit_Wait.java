package day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Handling_Alerts_using_Explicit_Wait {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();

		//Simple Alert(Normal alert with OK button)
		driver.findElement(By.xpath("//*[normalize-space()='Simple Alert']")).click();
		Alert alert1 = wait.until(ExpectedConditions.alertIsPresent());
		alert1.accept();
		
		//Confirmation Alert
		driver.findElement(By.id("confirmBtn")).click();
		Alert alert2 = wait.until(ExpectedConditions.alertIsPresent());
		alert2.dismiss();
		
		
		//Prompt Alert
		driver.findElement(By.id("promptBtn")).click();
		Alert alert3 = wait.until(ExpectedConditions.alertIsPresent());
		alert3.sendKeys("keerthi");
		alert3.accept();

	}

}
