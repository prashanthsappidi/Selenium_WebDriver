package day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_CheckBoxes_and_RadioButtons {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		
		//Handling Radio Buttons--->only one can be selected at one time (Male or Females buttons)
		
		WebElement m = driver.findElement(By.id("male"));
		
		//Before Selection
		System.out.println(m.isSelected());  //false
		
		//After Selection
		m.click();
		System.out.println(m.isSelected()); //true
		
		
		
		
		
		
		//Handling CheckBoxes
		
		List<WebElement> days = driver.findElements(By.xpath("//*[@class='form-check-input' and @type='checkbox']"));
		
		for(WebElement d : days) {
			System.out.println(d.getText());
			d.click();
		}
		
		//Select last 3 check boxes
		//7-3=4
		//we need to loop from 4 index
		for(int i=4; i<days.size(); i++) {
			days.get(i).click();
		}
		
		
	}

}
