package Test_2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_3  extends BaseTest {
	WebDriver driver;
	@BeforeMethod 
	public void setup() {
		// Browser open
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		}
	@Test
	public void Test_01() {
		System.out.println("Test_01");
	}
	@Test
	public void Test_02() {
		System.out.println("Test_02");
	}@Test
	public void Test_03() {
		System.out.println("Test_03");
	}@Test
	public void Test_04() {
		System.out.println("Test_04");
	}@Test
	public void Test_05() {
		System.out.println("Test_05");
	}
	
	
	
	
	
	
	@AfterMethod
	public void AS( ) {
		driver.close();
	}
	
	
	

}
