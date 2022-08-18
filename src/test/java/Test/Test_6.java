package Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_6 {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		//contact information
		WebElement frst_name=driver.findElement(By.xpath("//input[@name='firstName']"));
		Thread.sleep(2000);
		WebElement last_name=driver.findElement(By.xpath("//input[@name='lastName']"));
		Thread.sleep(2000);
		WebElement phone=driver.findElement(By.xpath("//input[@name='phone']"));
		Thread.sleep(2000);
		WebElement id_email=driver.findElement(By.xpath("//input[@id='userName']"));
		Thread.sleep(2000);
		//Mailing information
		WebElement Address1=driver.findElement(By.xpath("//input[@name='address1']"));
		Thread.sleep(2000);
		WebElement city=driver.findElement(By.xpath("//input[@name='city']"));
		Thread.sleep(2000);
		WebElement State=driver.findElement(By.xpath("//input[@name='state']"));
		Thread.sleep(2000);
		WebElement cty_code=driver.findElement(By.xpath("//input[@name='postalCode']"));
		Thread.sleep(2000);	
		WebElement sel_country=driver.findElement(By.xpath("//select[@name='country']"));
		Thread.sleep(2000);
		////user information
		WebElement user_name=driver.findElement(By.xpath("//input[@name='email']"));
		Thread.sleep(2000);
		WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
		Thread.sleep(2000);
		WebElement conf_pass=driver.findElement(By.xpath("//input[@name='confirmPassword']"));
		Thread.sleep(2000);
		
		String path="C:\\Users\\siddh\\eclipse-workspace\\Batch12_SJ\\Testdata\\Dataforjava.xlsx";
		FileInputStream fis=new FileInputStream(path);
	    XSSFWorkbook wb=new XSSFWorkbook(fis);
	    
	    String data_1=wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
	    
	    String data_2=wb.getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
	    
	    String data_3=wb.getSheet("Sheet1").getRow(0).getCell(2).getStringCellValue();
	    System.out.println(data_3);
	    String data_4=wb.getSheet("Sheet1").getRow(0).getCell(3).getStringCellValue();
	    String data_5=wb.getSheet("Sheet1").getRow(0).getCell(4).getStringCellValue();
	    String data_6=wb.getSheet("Sheet1").getRow(0).getCell(5).getStringCellValue();
	    String data_7=wb.getSheet("Sheet1").getRow(0).getCell(6).getStringCellValue();
	    String data_8=wb.getSheet("Sheet1").getRow(0).getCell(7).getStringCellValue();
	    String data_9=wb.getSheet("Sheet1").getRow(0).getCell(8).getStringCellValue();
	    String data_10=wb.getSheet("Sheet1").getRow(0).getCell(9).getStringCellValue();
	    
	    WebElement btn_submit=driver.findElement(By.xpath("//input[@type='submit']"));
	    btn_submit.click();
	    Thread.sleep(3000);
	    WebElement sign_in=driver.findElement(By.xpath("//a[text()=' sign-in ']"));
	    sign_in.click();
	    WebElement username=driver.findElement(By.xpath("//input[@name='userName']"));
	    username.sendKeys("Sidd@123");
	    WebElement pass=driver.findElement(By.xpath("//input[@name='password']"));
	    pass.sendKeys("Abcd@123");
	    WebElement submit_btn=driver.findElement(By.xpath("//input[@name='submit']"));
	    submit_btn.click();
	    
	    String title=driver.getTitle();
	    System.out.println(title);
	    
	    
	    
	    
	    
	    
	    
	     
		

	}

}
