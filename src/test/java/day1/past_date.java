package day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class past_date {

	public static void past(WebDriver driver, String year, String month, String date) {

		while (true) {

			String YEAR = driver.findElement(By.cssSelector("[class='ui-datepicker-year']")).getText();
			String MONTH = driver.findElement(By.cssSelector("[class='ui-datepicker-month']")).getText();

			if (YEAR.equals(year) && MONTH.equals(month)) {
				break;
			}
			driver.findElement(By.xpath("//*[text()='Prev']")).click();
		}

		List<WebElement> DATE = driver.findElements(By.cssSelector("[class='ui-state-default']"));

		for (WebElement d : DATE) {
			String date_value = d.getText();
			if (date_value.equals(date)) {
				d.click();
				break;
			}
		}

	}

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("datepicker")).click();

		String Year = "1999";
		String Month = "November";
		String Date = "27";

		past(driver, Year, Month, Date);

		System.out.println("Done");

	}

}
