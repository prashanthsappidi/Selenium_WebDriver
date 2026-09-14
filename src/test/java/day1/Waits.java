package day1;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {

	public static void main(String[] args) {

		// implicit wait
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Explicit Wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // ----> Explicit wait declaration

		WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(By.id("name"))); // ----->condition
		ele.click();

		// Fluent wait
		Wait<WebDriver> Wait = new FluentWait<>(driver)
				 .withTimeout(Duration.ofSeconds(10))
				 .pollingEvery(Duration.ofSeconds(2))
				 .ignoring(NoSuchElementException.class)
				 .ignoring(StaleElementReferenceException.class);

		WebElement ele1 = Wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='name']")));
		ele1.click();
	}

}
