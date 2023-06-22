package akshay;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getALL_Links
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\akshay.bhange\\OneDrive - Infosys Limited\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		List<WebElement> A =driver.findElements(By.xpath("//a"));
		for(WebElement link :A) 
		{
			System.out.println(link.getText());
		}
		
		
		
	
		
		
	}

}
