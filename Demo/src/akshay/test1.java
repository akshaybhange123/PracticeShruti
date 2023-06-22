package akshay;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Chromrdriver_Path\\chromedriver_win32 (1)\\chromedriver.exe");
	
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com");
	
	driver.manage().window().maximize();
	
	JavascriptExecutor js =(JavascriptExecutor)(driver);
	
	js.executeScript("window.scrollBy(0,600)", "");
	
}
}
