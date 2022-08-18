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

public class Test_8 {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement txt_email=driver.findElement(By.xpath("//input[@name='email']"));
		txt_email.sendKeys("Siddhant7069jawkar@gmail.com");
		WebElement password=driver.findElement(By.xpath("//input[@name='pass']"));
		password.sendKeys("Abcd123@1");
		WebElement btn_login=driver.findElement(By.name("login"));
		btn_login.click();
		Thread.sleep(4000);
		
		String path="C:\\Users\\siddh\\eclipse-workspace\\Batch12_SJ\\screenshot";
		
		String rm=RandomString.make(5);
		
		
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File destn=new File(path+"\\"+rm+".png");
		
		FileUtils.copyFile(src, destn);
		
		driver.close();
		
	
		
		
		
		
		
		
	}

}
