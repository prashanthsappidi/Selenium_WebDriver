package day1;

import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Broken_Links {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		int broken_links = 0;
		int not_broken_links = 0;

		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		System.out.println(links.size());

		for (WebElement link : links) {
			String href_value = link.getAttribute("href");
			if (href_value == null || href_value.isEmpty()) {
				System.out.println("href value is null or empty, so we can't check link is broken or not");
				continue;
			}
			try {
				URL Linkurl = URI.create(href_value).toURL();
				HttpURLConnection conn = (HttpURLConnection) Linkurl.openConnection();
				conn.connect();

				if (conn.getResponseCode() >= 400) {
					System.out.println(Linkurl + "---> Broken Link");
					broken_links++;

				} else {
					System.out.println(Linkurl + "---> Not a Broken Link");
					not_broken_links++;
				}

			} catch (Exception e) {
				System.out.println(e);
			}

		}
		System.out.println("Number of Broken Links " + broken_links);
		System.out.println("Number of not broken Links " + not_broken_links);
	}

}
