package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://www.facebook.com/");
	    
	    driver.findElement(By.xpath("//input[@id='email']")).sendKeys("testleaf.2023@gmail.com");
	    driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("Tuna@321");
	    //Thread.sleep(2000);
        driver.findElement(By.xpath("//button[contains(@name,'login')]")).click();
        Thread.sleep(5000);
        driver.close();
	}

}
