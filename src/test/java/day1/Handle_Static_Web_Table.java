package day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_Static_Web_Table {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();

		List<WebElement> r = driver.findElements(By.xpath("//*[@name='BookTable']//tr"));
		List<WebElement> c = driver.findElements(By.xpath("//*[@name='BookTable']//th"));

		int rows = r.size();
		int cols = c.size();
		
		System.out.println("Column Data");
		for (int i = 0; i < cols; i++) {
			System.out.println(c.get(i).getText());
		}
		
		System.out.println("********************************************************************************************************");

		System.out.println("Row Data");
		for (int i = 1; i < rows; i++) {
			System.out.println(r.get(i).getText());
		}
		System.out.println("********************************************************************************************************");
		System.out.println("BookName Author Subject Price");
		for (int i = 2; i <= rows; i++) {
			for (int j = 1; j <= cols; j++) {

				String val = driver.findElement(By.xpath("//*[@name='BookTable']//tr[" + i + "]//td[" + j + "]")).getText();
						

				System.out.print(val+"  ");
			}
			System.out.println();
		}

		driver.quit();
	}
}
