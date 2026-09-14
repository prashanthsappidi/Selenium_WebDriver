package day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Actions {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		

		Actions act = new Actions(driver);
		
		//doubleClick
		driver.findElement(By.id("field1")).clear();
		driver.findElement(By.id("field1")).sendKeys("Hi Keerthi");
		WebElement dc = driver.findElement(By.xpath("//*[normalize-space()='Copy Text']"));
		act.doubleClick(dc).perform();
		
		//Mouse hovering
		WebElement point_me = driver.findElement(By.xpath("//*[normalize-space()='Point Me']"));
		WebElement mobiles = driver.findElement(By.xpath("//*[text()='Mobiles']"));
		act.moveToElement(point_me).moveToElement(mobiles).click().perform();
		
		//Right-click or Context click
		WebElement rc = driver.findElement(By.id("name"));
		act.contextClick(rc).perform();
		
		//dragAndDrop
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		act.dragAndDrop(source, target).perform();
		
		
		
		
	}

}
