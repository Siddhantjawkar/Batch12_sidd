package Test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_2 {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver Driver=new ChromeDriver();
		Driver.get("https://demo.guru99.com/test/delete_customer.php");
		Driver.manage().window().maximize();
		
		WebElement txt_cusid=Driver.findElement(By.xpath("//input[@name='cusid']"));
		txt_cusid.sendKeys("123");
		
		WebElement submit=Driver.findElement(By.xpath("//input[@name='submit']"));
		submit.click();
		
		//handle alert windows 
		Alert alert=Driver.switchTo().alert();
		String alt=alert.getText();
		System.out.println(alt);    //do you really want to delete this customer?
		alert.dismiss();
		
		Driver.close();
		
		
		
		
		
		
		
		
		
	}

}
