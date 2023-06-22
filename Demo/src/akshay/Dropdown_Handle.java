package akshay;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown_Handle
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Chromrdriver_Path\\chromedriver_win32 (1)\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		//Select s =new Select();
		
		
		
	}

}
