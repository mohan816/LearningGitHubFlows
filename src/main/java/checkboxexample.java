

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkboxexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Files\\chromedriver.current version\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/checkbox.html");
		WebElement firsttext = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[1]/div[4]/input"));
		WebElement firsttext1 = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[1]/div[2]/input"));
		firsttext.click();
		firsttext1.click();
		
		WebElement Selectselenium = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/input"));
		Boolean status = Selectselenium.isSelected();
		System.out.println(status);
		
		WebElement DeSelect = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[3]/div[2]/input"));
		Boolean De = DeSelect.isSelected();
		
		if(DeSelect.isSelected()) {
			
			DeSelect.click();
			
		}
		
		
		
		
		

	}

}
