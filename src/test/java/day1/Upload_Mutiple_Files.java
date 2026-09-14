package day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Upload_Mutiple_Files {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		String file1 = "C:\\Users\\gs\\Pictures\\Ad1.crx";
		String file2 = "C:\\Users\\gs\\Pictures\\Ad2.crx";

		driver.findElement(By.id("multipleFilesInput")).sendKeys(file1+"\n"+file2);

	}

}
