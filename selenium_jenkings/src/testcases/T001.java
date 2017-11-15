package testcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class T001 {
	
	@Test
	public void  test() {
		
		
		String exePath = ".\\Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://twitter.com/");
		driver.findElementByXPath("//*[@id=\"doc\"]/div[1]/div/div[1]/div[2]/a[3]").click();
		driver.findElementByXPath("//*[@id=\"login-dialog-dialog\"]/div[2]/div[2]/div[2]/form/div[1]/input").sendKeys("josuerogelio345@gmail.com");
		driver.findElementByXPath("//*[@id=\"login-dialog-dialog\"]/div/div[2]/div[2]/form/div[2]/input").sendKeys("Joanbreca123");
		driver.findElementByXPath("//*[@id=\"login-dialog-dialog\"]/div[2]/div[2]/div[2]/form/input[1]").click();
	}

}
