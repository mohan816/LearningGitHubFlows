

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Files\\chromedriver.current version\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/frame.html");
        //Inside a html another html will be present that is called frame.Driver only access the outer html.So to give access
		//to the nested html below code is used in the selenium
		driver.switchTo().frame(0);
		WebElement button1 = driver.findElement(By.id("Click"));
		button1.click();
		String text =driver.findElement(By.id("Click")).getText();
		System.out.println(text);
		//To navigate original page below code is used
		driver.switchTo().defaultContent();
		// Inside Html there is no name present for frame. so we used frame1 because it is the second frame in the html page
		driver.switchTo().frame(1);
		// Inside second frame there is another frame and name of the frame is frame2
		driver.switchTo().frame("frame2");
		WebElement button2 = driver.findElement(By.id("Click1"));
		button2.click();
		String text1 =driver.findElement(By.id("Click1")).getText();
		System.out.println(text1);
		//To count number of frames we used below code
		driver.switchTo().defaultContent();
		List<WebElement> totalFrames = driver.findElements(By.tagName("iframe"));
		int number= totalFrames.size();
		System.out.println(number);
		
		
		
	}

}
