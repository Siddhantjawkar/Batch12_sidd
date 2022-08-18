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
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class Test_01 {

	private static final String FileUtiles = null;

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement name=driver.findElement(By.xpath("//input[@name='field-keywords']"));
		name.sendKeys("mobile");
		WebElement clk=driver.findElement(By.xpath("//input[@type='submit']"));
		clk.click();
		WebElement speci=driver.findElement(By.xpath("//span[@class='a-truncate-cut']"));
		speci.click();
		String Path="C:\\Users\\siddh\\eclipse-workspace\\Batch12_SJ\\screenshot";
		String m=RandomString.make(3);
		TakesScreenshot rm=(TakesScreenshot)driver;
		File src=rm.getScreenshotAs(OutputType.FILE);
		File destn=new File(Path+"\\"+m+".png");
		FileUtils.copyFile(src, destn);
		WebElement mob_name=driver.findElement(By.xpath("//span[@id='productTitle']"));
		String nm=mob_name.getText();
		System.out.println(nm);
		WebElement txt=driver.findElement(By.xpath("//img[@alt='Happy Independence Day']"));
		String actual=txt.getText();
		System.out.println(actual);
		String expected="Happy Independence Day";
		Assert.assertEquals(actual,expected);
		System.out.println("Test execution done");
	
		
		

	}

}
