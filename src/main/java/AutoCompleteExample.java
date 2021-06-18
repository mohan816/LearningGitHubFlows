

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.WebElementHandler;

public class AutoCompleteExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Files\\chromedriver.current version\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/autoComplete.html");
		WebElement textbox =driver.findElement(By.id("tags"));
		textbox.sendKeys("p");
		Thread.sleep(4000);
		
		
		List <WebElement> Multiples=driver.findElements(By.xpath("//*[@id='ui-id-1']/li"));
		System.out.println(Multiples.size());
		for (WebElement webElement : Multiples) {
			if(webElement.getText().equals("Protractor")){
			webElement.click();
			System.out.println(webElement.getText());
			}
		
			
		}
			
		}
		
				
				
		

	}


