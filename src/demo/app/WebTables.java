package demo.app;

import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;


public class WebTables {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		driver.get("https://datatables.net/examples/basic_init/zero_configuration.html");
		
		//Get All Columns count
		List<?> cols=driver.findElements(By.xpath("//*[@id=\"example\"]/thead/tr/th"));
		System.out.println("Total Columns:"+cols.size());
		
		//Get All Rows Count
		List<?> rows=driver.findElements(By.xpath("//*[@id=\"example\"]/tbody/tr"));
		System.out.println("Total Rows in this Page:"+rows.size());
		
		//Get No. of Pages in the table 
		List<?> total_pages=driver.findElements(By.xpath("//*[@id=\"example_paginate\"]/span/a"));
		System.out.println("Total No.of pages in the table: "+total_pages.size());
		
		//Get Cell value by Row and Column index
		WebElement dd=driver.findElement(By.xpath("//*[@id=\"example\"]/tbody/tr[4]/td[2]"));
		System.out.println(dd.getText());
	}

}
