package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_67 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		
		WebElement drp_country=driver.findElement(By.xpath("//select[@name='country']"));
		
		Select sel=new Select(drp_country);
		sel.selectByIndex(15);
		Thread.sleep(3000);
		sel.selectByValue("BAHAMAS");
		Thread.sleep(3000);
		sel.selectByVisibleText("BANGLADESH");
		Thread.sleep(5000);
		sel.selectByIndex(20);
		Thread.sleep(5000);
		
		driver.quit();
		
		
		
		
		
	}

}
