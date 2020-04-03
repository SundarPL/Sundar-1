package org.hexa;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTry {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\workspace\\selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/");
		WebElement fstclick = driver.findElement(By.xpath("//a[@href='pages/autoComplete.html']"));
		fstclick.click();
		WebElement findElement = driver.findElement(By.id("tags"));
		findElement.sendKeys("s");
		Thread.sleep(3000);
		List<WebElement> element = driver.findElements(By.xpath("//ul[@id='ui-id-1']/li"));
		for (int i=0;i<element.size();i++) {
			WebElement webElement = element.get(i);
			if((webElement.getText()).equals("Web Services")){
			webElement.click();
			System.out.println(webElement.getText());
			
		}
			
		

	}

}
}
