package akshay;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class File_Uploding 
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Chromrdriver_Path\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(1000);
		
		 WebElement wb = driver.findElement(By.xpath("//select[@id='month']"));
		Thread.sleep(1000);
		
		Select S1 = new Select(wb);
		
		//S1.selectByVisibleText("Sep");
	    //S1.selectByIndex(9);
		S1.selectByValue("11");
		
		File Src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println(Src);
		File Destination = new File ("C:\\Users\\akshay.bhange\\OneDrive - Infosys Limited\\Desktop\\TakesScreenshot\\Sample1.jpg");
		FileHandler.copy(Src, Destination);
		
		
		
		
		
		
		
		
		
	}

}
