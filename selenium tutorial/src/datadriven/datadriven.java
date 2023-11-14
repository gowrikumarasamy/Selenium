package datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class datadriven {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver","");
		WebDriver d=new ChromeDriver();
		d.get("http://brm.tremplintech.in/web_pages/ord_reg.aspx");
		//JXL or POI
		// take file-> get workbook->mention sheet->track row-->Read Cell value		

		String fo="‪‪C:/Users/DELL/Desktop/DataExcel.xlsx";
		String fn="‪‪‪C:/Users/DELL/Desktop/DataExcel.xlsx";

		System.out.println(fo.length()+"------->"+fn.length());
		File f=new File(fo);
		FileInputStream fis= new FileInputStream(f);
		XSSFWorkbook b=new XSSFWorkbook(fis);
		XSSFSheet s = b.getSheet("Sheet1");


		String username=s.getRow(0).getCell(0).getStringCellValue();
		String password=s.getRow(1).getCell(0).getStringCellValue();

		d.findElement(By.id("txt_unam")).sendKeys(username);
		d.findElement(By.xpath("//*[@id='txt_pass']")).sendKeys(password);
		d.findElement(By.xpath("//*[@id=\'Button3\']")).click();
		//d.switchTo().alert().accept();
		d.findElement(By.xpath("//*[@id=\"LinkButton1\"]")).click();

	}


}
