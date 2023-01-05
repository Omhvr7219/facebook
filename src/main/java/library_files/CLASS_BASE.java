package library_files;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CLASS_BASE {
	public WebDriver driver;

	public void open_fb() {

		System.setProperty("webdriver.chrome.driver", "C:\\Dell\\selenium 4.4\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
}
