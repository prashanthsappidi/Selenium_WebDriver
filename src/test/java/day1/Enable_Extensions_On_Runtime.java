package day1;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Enable_Extensions_On_Runtime {

	public static void main(String[] args) {

		ChromeOptions options = new ChromeOptions();
		File BlockAdsFile = new File("C:\\Users\\gs\\Pictures\\Ad-Blocker-Stands-AdBlocker-Chrome-Web-Store.crx");
		options.addExtensions(BlockAdsFile);

		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://text-compare.com/");
		driver.manage().window().maximize();

	}

}
