package week2.day1;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class seleniumSample
  {

	public static void main(String[] args) throws InterruptedException 
	     {
		
			ChromeDriver driver=new ChromeDriver();
		    driver.get("http://leaftaps.com/opentaps/control/main");
		    //EdgeDriver driver1 =new Edgedriver();
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
		    Thread.sleep(2000);
		    driver.close();
	     }
  }

