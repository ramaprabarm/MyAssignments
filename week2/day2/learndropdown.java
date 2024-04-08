package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class learndropdown {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	   // driver.get("https://www.facebook.com/");
	    driver.get("https://www.leafground.com/select.xhtml");
	    
      WebElement dropdown = driver.findElement(By.className("ui-selectonemenu"));
		

		Select dd=new Select(dropdown);
		
		Thread.sleep(2000);
	
		dd.selectByIndex(1);

		//non select dropdown
		driver.findElement(By.id("j_idt87:country_label")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.id("j_idt87:country_2")).click();
		
		driver.close();
	}

}
