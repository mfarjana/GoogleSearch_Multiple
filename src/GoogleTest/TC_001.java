package GoogleTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC_001 {
	WebDriver driver = new FirefoxDriver();
	
	@BeforeMethod
	public void OPenBrowser(){
		System.out.println("this is Open browser");
		driver.get("https://www.google.com/");
	}
	
	@Test
	public void Test_1() throws InterruptedException{		
		System.out.println("This TEST 001");
		
		driver.findElement(By.name("q")).sendKeys("Dhaka University");
		driver.findElement(By.name("btnK")).submit();
		Thread.sleep(5000);
	}
	
	@Test
	public void Test_2() throws InterruptedException{		
		System.out.println("This TEST 002");
		Thread.sleep(5000);
		driver.findElement(By.name("q")).sendKeys("New York City");
		driver.findElement(By.name("btnK")).submit();
		Thread.sleep(5000);
	}
	@AfterTest
	public void ClosingBrowser(){
		driver.close();
	}

}
