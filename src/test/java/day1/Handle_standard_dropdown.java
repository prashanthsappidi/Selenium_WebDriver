package day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Handle_standard_dropdown {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement dropdown = driver.findElement(By.id("country"));
		
		Select s = new Select(dropdown);
		
		s.selectByVisibleText("India");
		
		s.selectByIndex(1);
		
		s.selectByValue("france");
		
		List<WebElement> dropdown_options = s.getOptions();
		
		System.out.println(dropdown_options.size());
		
		for(WebElement a : dropdown_options) {
			System.out.println(a.getText());
			String opt = a.getText();
			if(opt.equals("China")) {
				a.click();
			}
		}

	}

}
