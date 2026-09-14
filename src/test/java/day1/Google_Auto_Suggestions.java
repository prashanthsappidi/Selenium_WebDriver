package day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Auto_Suggestions {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();

		driver.findElement(By.cssSelector("[id='ti6dpd']")).sendKeys("keerthi");

		List<WebElement> list = driver
				.findElements(By.xpath("//div[@class=\"wM6W7d\" and @role=\"presentation\"]/span"));

		for (WebElement ls : list) {
			String s = ls.getText();
			if (s.equals("Keerthy Suresh")) {
				ls.click();
			}
		}

	}

}
