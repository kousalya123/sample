package demo.app;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchWindows {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", ".\\chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.naukri.com/");
		 
		 String mainWindow=driver.getWindowHandle();
		 
		 Set<String> set =driver.getWindowHandles();
		 
		 Iterator<String> itr= set.iterator();		 
		 while(itr.hasNext())
		 {
		 String childWindow=itr.next();
		 
			 if(!mainWindow.equals(childWindow))
			 {
				 driver.switchTo().window(childWindow);
				 System.out.println(driver.switchTo().window(childWindow).getTitle());
				 driver.close();
			 }
		 }
		 		 
		 driver.switchTo().window(mainWindow);		 

	}

}
