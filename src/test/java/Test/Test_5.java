package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_5 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		 
		//send value by using xpath attribute
		WebElement username=driver.findElement(By.xpath("//input[@id='email']"));
		username.sendKeys("Abcd1234@");
		
		// send value of password by using relative 
		WebElement pass=driver.findElement(By.xpath("//input[@id='pass']"));
		pass.sendKeys("Pqrs123@");
		
		//click on login button by using relative 
		WebElement clk=driver.findElement(By.xpath("//button[contains(@id, 'u_0_9_')]"));
		clk.click();
		
		//click on forgotten password button by using relative 
		WebElement forgot=driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
		forgot.click();

		driver.close();
	

		
		
		
	}

}
