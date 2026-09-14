package day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoard_Actions {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();

		driver.findElement(By.id("name")).sendKeys("prashanth");

		Actions act = new Actions(driver);

		// CTRL+A
		act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();

		// CTRL+C
		act.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();

		// TAB
		act.keyDown(Keys.TAB).keyUp(Keys.UP).perform();

		// CTRL+V
		act.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();
		
		//Open Link in new page
		WebElement link = driver.findElement(By.xpath("//*[text()='Blog']"));
		act.keyDown(Keys.CONTROL).click(link).keyUp(Keys.CONTROL).perform();

	}

}
