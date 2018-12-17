package demo.app;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
 
public class Relativitytest {
 
 
 public void doubleClick() throws InterruptedException{
 System.setProperty("webdriver.chrome.driver", ".\\chromedriver.exe");	
 WebDriver driver = new ChromeDriver();
                //Open the required URL where you could do double click action
 driver.get("https://relativity35.dtiglobal.com");
                //Maximize the browser
                driver.manage().window().maximize();
                //As per the above URL we need to switch to frame. The targeted element is in the frame
 driver.switchTo().frame(0);
                //Create the object 'action' 
 Actions action = new Actions(driver);
 //Find the targeted element
 WebElement ele = driver.findElement(By.xpath("//*[@id=\"_main\"]/div[1]/div[1]/a"));
 
 action.click(ele).build().perform();
                //Once clicked on the element, the color of element is changed to yellow color from blue color
                //driver.close();
 }
}

