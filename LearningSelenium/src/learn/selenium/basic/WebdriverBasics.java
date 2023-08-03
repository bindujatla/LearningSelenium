package learn.selenium.basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverBasics {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		//I feel we are missing the location of the driver ??????
		
		driver.get("https://www.selenium.dev/selenium/web/web-form.html");
		String title = driver.getTitle();
		
		//establishing a waiting strategy
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		
		WebElement textBox = driver.findElement(By.name("my-text"));
		WebElement submitButton = driver.findElement(By.cssSelector("button"));
		WebElement message = driver.findElement(By.id("message"));
		
		textBox.sendKeys("Selenium");
		submitButton.click();
		String value = message.getText();
		
		driver.quit();
	}

}
