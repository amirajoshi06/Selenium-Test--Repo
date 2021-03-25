import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
public class Question_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		//Setting driver properties
		System.setProperty("webdriver.chrome.driver", "C:\\browser driver\\chromedriver.exe");
		
		//WebDriverManager.chromedriver().setup();
		 ChromeDriver driver = new ChromeDriver();
		 
		 //navigate to amazon.com
		 driver.get("http://www.amazon.com");
		 
		 //Maximize browser window
		 driver.manage().window().maximize();
		 
		 //Adding wait
		 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		 
		 //Click on 'All' dropdown
		 driver.findElement(By.cssSelector("#searchDropdownBox")).click();
		 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		 
		 //Select 'Computers' from the dropdown
		 Select computers = new Select(driver.findElement(By.name("url")));
		 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		 computers.selectByValue("search-alias=computers-intl-ship");
		 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		 
		 //Click on Search button
		 driver.findElement(By.cssSelector("#nav-search-submit-button")).click();
 


	}

}
