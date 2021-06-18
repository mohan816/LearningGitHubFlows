

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Files\\chromedriver.current version\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Alert.html");
		WebElement Alert = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[1]/div/div/button"));
		Alert.click();
		// To switch the control to alert we need to use below code
		Alert alert = driver.switchTo().alert();
		alert.accept();
		WebElement ConfirmBox =driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/button"));
		Alert.click();
		Alert alert123 = driver.switchTo().alert();
		alert123.dismiss();
		
		WebElement Promptbox = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[3]/div/div/button"));
		Promptbox.click();
		Alert alertprompt = driver.switchTo().alert();
		  alertprompt.sendKeys("Mohan");
		 Thread.sleep(5000);
		  alertprompt.accept();
		
		
		
		
		
		
		
		
	
		

	}

}
