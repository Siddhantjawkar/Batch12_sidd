package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_4 {

	public static void main(String[] args) {
		//Browser open
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement txt_email=driver.findElement(By.id("email"));
		txt_email.sendKeys("siddhant7069jawkar@gmail.com");
		WebElement txt_password=driver.findElement(By.id("pass"));
		txt_password.sendKeys("Sidd123@!");
		WebElement btn_login=driver.findElement(By.name("login"));
		btn_login.click();
		String title=driver.getTitle();
		System.out.println(title);
		driver.close();
		
		

	}

}
