package demo.app;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;

public class ScreenShotSample {

	public static void main(String[] args) throws IOException 
	{
		SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyyHHmmss");
		String outputPath=".//ScreenShots//"+sdf.format(new Date())+".png";
		
		System.setProperty("webdriver.chrome.driver", ".\\chromedriver.exe");	
		WebDriver driver=new ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		
		TakesScreenshot ss =((TakesScreenshot)driver);
		File SSFile=ss.getScreenshotAs(OutputType.FILE);
		File outPath=new File(outputPath);
		FileUtils.copyFile(SSFile, outPath);

	}

}
