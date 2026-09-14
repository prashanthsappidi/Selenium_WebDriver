package day1;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShots {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		
		//Full-page
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir")+"\\screenshot\\fullpage1.png");
		source.renameTo(target);
		
		
		//Capture the screenshot of specfic section
		WebElement ele = driver.findElement(By.cssSelector("[id='main']"));
		File s = ele.getScreenshotAs(OutputType.FILE);
		File t = new File(System.getProperty("user.dir")+"\\screenshot\\ElementSpecific.png");
		s.renameTo(t);
		
		
		//Capture screenshot at WebElement
		WebElement element = driver.findElement(By.linkText("Data Entry Form"));
		File src = element.getScreenshotAs(OutputType.FILE);
		File trg = new File(System.getProperty("user.dir")+"\\screenshot\\element1.png");
		src.renameTo(trg);
		
	}

}
