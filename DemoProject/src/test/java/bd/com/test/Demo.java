package bd.com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo extends DriverSetUp {
	public static String baseUrl = "https://bongobd.com/";

	@Test
	public static void DemoTest() throws InterruptedException {
		driver.get(baseUrl);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		Thread.sleep(2000);
		
		// Page Title Verify 
		 
		
		  String actualTitle = "BONGO | Watch Live Tv, Bangla Movies, Natoks Anytime Anywhere"; 
		  String siteTitle=driver.getTitle();
		  Assert.assertEquals(actualTitle, siteTitle);
		  System.out.println("Title Print: " + siteTitle);
		 
		 
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[3]/div[1]/div[5]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/a[1]/div[1]/div[1]/div[1]")).click();
		
		String text = driver.findElement(By.xpath("//h5[normalize-space()='Nilacholey Kiriti']")).getText();
		System.out.println("The Movie Title is " + text);
		Thread.sleep(20000);
		/*
		 * String text =
		 * driver.findElement(By.xpath("//span[contains(text(),'Sports')]")).getText();
		 * System.out.println("Sports Text Get: "+text); Thread.sleep(10000);
		 */

		/*
		 * if (aTitle.contentEquals(eTitle)) { System.out.println( "Test Passed") ;
		 * continue; } else { System.out.println( "Test Failed" ); break; }
		 */

	}
}
