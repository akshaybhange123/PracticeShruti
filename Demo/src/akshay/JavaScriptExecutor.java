package akshay;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor 
{
	public static void main(String[] args) 
	{
	 System.setProperty("Webdriver.chrome.driver",
			 "C:\\Users\\akshay.bhange\\OneDrive - Infosys Limited\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe");
	      
	      WebDriver driver = new ChromeDriver();
	      
	      driver.get("https://www.orangehrm.com/");
	      


	}

}
