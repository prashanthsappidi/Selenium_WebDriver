package day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Handle_Browser_Windows {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();

		Actions act = new Actions(driver);

		WebElement Udemy_Courses = driver.findElement(By.linkText("Udemy Courses"));
		WebElement Online_Trainings = driver.findElement(By.linkText("Online Trainings"));
		WebElement Blog = driver.findElement(By.linkText("Blog"));
		WebElement Playwright = driver.findElement(By.linkText("PlaywrightPractice"));

		act.keyDown(Keys.CONTROL).click(Udemy_Courses).keyUp(Keys.CONTROL).perform();
		act.keyDown(Keys.CONTROL).click(Online_Trainings).keyUp(Keys.CONTROL).perform();
		act.keyDown(Keys.CONTROL).click(Blog).keyUp(Keys.CONTROL).perform();
		act.keyDown(Keys.CONTROL).click(Playwright).keyUp(Keys.CONTROL).perform();

		Set<String> IDS = driver.getWindowHandles();

		ArrayList<String> ids = new ArrayList<>(IDS);

		for (String id : ids) {

			String title = driver.switchTo().window(id).getTitle();

			if (title.equals("Automation Testing Practice: PlaywrightPractice") || title.equals("Automation Testing Practice")) {
					
				System.out.println(driver.getCurrentUrl());
				
				driver.close();
			}
		}

	}
}
