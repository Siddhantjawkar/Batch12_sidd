package Test;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class Test_3 {

	public static void main(String[] args) throws Exception   {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement username=driver.findElement(By.xpath("//input[@name='email']"));
		username.sendKeys("Abcd@gmail.com");
		
		WebElement pass=driver.findElement(By.xpath("//input[@name='pass']"));
		pass.sendKeys("123456");
		
		WebElement clk_button=driver.findElement(By.xpath("//button[contains(@id,'u_0_9_')]"));
		clk_button.click();
		
		String path="C:\\Users\\siddh\\eclipse-workspace\\Batch12_SJ";
		String rm=RandomString.make(3);
		TakesScreenshot ts=(TakesScreenshot) driver; 
		File src=ts.getScreenshotAs(OutputType.FILE);
		File destn=new File(path+"\\"+rm+".png");
				
		
		FileUtils.copyFile(src, destn);
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
