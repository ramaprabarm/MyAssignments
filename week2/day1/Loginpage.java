package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
	//import org.openqa.selenium.edge.EdgeDriver;

	public class Loginpage
	  {

		public static void main(String[] args) throws InterruptedException 
		     {
			
				ChromeDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
			    driver.get("https://www.facebook.com/");
			    
			    driver.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
			    driver.findElement(By.name("pass")).sendKeys("Tuna@321");
			    driver.findElement(By.name("login")).click();
			    //driver.findElement(By.linkText("Find your account and log in.")).click();
			    driver.findElement(By.partialLinkText("and log in.")).click();   
			    driver.close();   
		     }
}
