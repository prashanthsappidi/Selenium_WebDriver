package day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Frames {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();

		// Switching Frame-1 based on the WebElement

		WebElement frame1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));

		driver.switchTo().frame(frame1);
		driver.findElement(By.cssSelector("[name='mytext1']")).sendKeys("Frame-1");
		driver.switchTo().defaultContent();

		// Switching Frame-2 based on the WebElement

		WebElement frame2 = driver.findElement(By.xpath("//frame[@src='frame_2.html']"));

		driver.switchTo().frame(frame2);
		driver.findElement(By.cssSelector("[name='mytext2']")).sendKeys("Frame-2");
		driver.switchTo().defaultContent();

		// Switching Frame-3 based on the WebElement

		WebElement frame3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));

		driver.switchTo().frame(frame3);
		driver.findElement(By.cssSelector("[name='mytext3']")).sendKeys("Frame-3");

		// Switching to inner frame or iframe inside Frame-3

		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//*[normalize-space()='Hi, I am the UI.Vision IDE']//*[@dir='auto']")).click();
		driver.findElement(By.xpath("//*[normalize-space()='Web Testing']//*[@dir='auto']")).click();

		driver.switchTo().defaultContent();

		// Switching Frame-4 based on the WebElement

		WebElement frame4 = driver.findElement(By.xpath("//frame[@src='frame_4.html']"));

		driver.switchTo().frame(frame4);
		driver.findElement(By.cssSelector("[name='mytext4']")).sendKeys("Frame-4");
		driver.switchTo().defaultContent();

		// Switching Frame-5 based on the WebElement

		WebElement frame5 = driver.findElement(By.xpath("//frame[@src='frame_5.html']"));

		driver.switchTo().frame(frame5);
		driver.findElement(By.cssSelector("[name='mytext5']")).sendKeys("Frame-5");
		driver.switchTo().defaultContent();

	}

}
