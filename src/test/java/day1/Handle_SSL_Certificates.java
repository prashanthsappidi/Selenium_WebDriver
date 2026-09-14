package day1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Handle_SSL_Certificates {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		

		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://expired.badssl.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());

	}

}
