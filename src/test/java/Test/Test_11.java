package Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_11 {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement username=driver.findElement(By.xpath("//input[@name='email']"));
		WebElement pass=driver.findElement(By.xpath("//input[@name='pass']"));
		
		//WebElement btn_login=driver.findElement(By.xpath("//button[contains(@id, 'u_0_9_')]"));
	
		
		String path="C:\\Users\\siddh\\eclipse-workspace\\Batch12_SJ\\Testdata\\Dataforjava.xlsx";
		FileInputStream fis=new FileInputStream(path); 
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		String data_1=wb.getSheet("Sheet2").getRow(0).getCell(0).getStringCellValue();
		
		System.out.println(data_1);
		
		String data_2=wb.getSheet("Sheet2").getRow(0).getCell(1).getStringCellValue();
		System.out.println(data_2);
		
		String data_3=wb.getSheet("Sheet2").getRow(0).getCell(2).getStringCellValue();
		System.out.println(data_3);
		
		username.sendKeys(data_1);
		pass.sendKeys(data_2);
		WebElement btn_login=driver.findElement(By.xpath("//button[contains(@id, 'u_0_9_')]"));
		btn_login.click();
	}

}
