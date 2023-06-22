package akshay;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListBox_Dropdown 
{
	public static void main(String[] args) 
	{
    System.setProperty("webdriver.chrome.driver", 
    		"C:\\Chromrdriver_Path\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.flipkart.com/search?q=Redmi%20note%209%20Pro%20max&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=off&as=off");
	
	driver.manage().window().maximize();
	//WebElement list =driver.findElement(By.xpath("//span[@class='_2I9KP_ _2WDRax']"));
	
	
	
		
	}

}
