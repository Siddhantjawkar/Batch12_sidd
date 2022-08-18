package Test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;



import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class Test_58 {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement username=driver.findElement(By.xpath("//input[@id='email']"));
		username.sendKeys("Abcd@123");
		
		WebElement pass=driver.findElement(By.xpath("//input[@id='pass']"));
		pass.sendKeys("pqrs@123");
		WebElement btn_login=driver.findElement(By.name("login"));

		btn_login.click();
		
		
		String path = "C:\\Users\\siddh\\eclipse-workspace\\Batch12_SJ\\Screenshot";
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File scr=ts.getScreenshotAs(OutputType.FILE);
		
		 
		driver.close();
		
		
		
		
		
	}

}
