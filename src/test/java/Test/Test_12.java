package Test;

import java.util.List;

import org.apache.commons.compress.harmony.pack200.IntList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_12 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		
		WebElement txt_searchbar=driver.findElement(By.xpath("//input[@name='q']"));
		txt_searchbar.sendKeys("maven");
		
		Thread.sleep(3000);
		List<WebElement> list=driver.findElements(By.xpath("//ul[@class='G43f7e']/li"));
		System.out.println(list.size());
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).getText());
			if(list.get(i).getText().equals("maven dependency"));{
				
				list.get(i).click();
				break;
				
				
				
			}
		}
		System.out.println(list.get(4).getText());
		
		
		
		
		
		
		
	}

}
