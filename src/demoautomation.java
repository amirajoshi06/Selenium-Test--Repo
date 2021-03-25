//Question_1

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoautomation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Setting driver properties
		System.setProperty("webdriver.chrome.driver", "C:\\browser driver\\chromedriver.exe");
		//WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
 
		//navigate to gmail.com
		driver.get("http://www.gmail.com");
 
		//Maximize browser window
		driver.manage().window().maximize();
 
		//Adding wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Entering email
		driver.findElement(By.cssSelector(".whsOnd.zHQkBf")).sendKeys("automationtestuser601");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector(".VfPpkd-RLmnJb")).click();
 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 
		//Entering password
		driver.findElement(By.cssSelector("input[name='password'][type='password']")).sendKeys("kathmandu@123");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button/div[2]")).click();

	
		//driver.close();
 
	}

}
