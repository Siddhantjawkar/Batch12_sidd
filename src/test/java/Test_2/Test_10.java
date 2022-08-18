package Test_2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_10 {
	
	@Test
	public void verifyTest_001() throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)", "");
		Thread.sleep(4000);
		//js.executeScript("window.scrollBy(0,-500)", "");
		Thread.sleep(4000);
		WebElement marathi=driver.findElement(By.xpath("//a[@title='Marathi']"));
		marathi.click();
		js.executeScript("arguments[0].scrollIntoView()", marathi);
		
		}

	
	
	
	
	
	

}
