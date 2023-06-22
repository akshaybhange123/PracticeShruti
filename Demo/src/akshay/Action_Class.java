package akshay;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_Class 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Chromrdriver_Path\\chromedriver_win32 (1)\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		driver.manage().window().maximize();
      // WebElement Dr =driver.findElement(By.xpath("//a[text()='SwitchTo']"));
	  //Actions act = new Actions(driver);
	  //act.moveToElement(Dr).perform();
		
	//driver.findElement(By.xpath("//a[text()='Frames']")).click();
	WebElement DR1 =driver.findElement(By.xpath("//a[text()='Interactions ']"));
	Actions act = new Actions(driver);
	act.moveToElement(DR1).perform();
	
	WebElement DR2 =driver.findElement(By.xpath("//a[text()='Drag and Drop ']"));
	act.moveToElement(DR2).perform();
	
	WebElement DR3=driver.findElement(By.xpath("//a[text()='Dynamic ']"));
     act.moveToElement(DR3).perform();
     DR3.click();
     Thread.sleep(2000);
     

 	JavascriptExecutor js =(JavascriptExecutor)(driver);
 	js.executeScript("window.scrollBy(0,600)", "");

	
		
		
	}

}
