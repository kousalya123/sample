package demo.app;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorSamples {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", ".\\chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//open url
		js.executeScript("window.location = 'https://www.snapdeal.com';");
		
		//get title
		String title =  js.executeScript("return document.title;").toString();
		System.out.println(title);
		
		//get website domain
        String webDomain =  js.executeScript("return document.domain;").toString();
        System.out.println(webDomain);
        
        //get current url
        String CurrentURL =  js.executeScript("return document.URL;").toString();
        System.out.println(CurrentURL);
        
        //scrolling the page
        js.executeScript("window.scrollBy(0,500)");
        
        //popup
        js.executeScript("alert('I did my istructions');");
        
        
        

	}

}
