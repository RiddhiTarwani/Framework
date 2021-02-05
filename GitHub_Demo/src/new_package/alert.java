//12.1
//Handling Alert

package new_package;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.NoAlertPresentException;	
import org.openqa.selenium.Alert;

public class alert {
	
public static void main(String[] args) throws InterruptedException, NoAlertPresentException {
		
		System.setProperty("webdriver.gecko.driver","src\\drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		WebDriverWait wait1 = new WebDriverWait(driver, 180);
		
		try {
			
			String baseUrl = "https://demoqa.com/alerts";
			driver.get(baseUrl);
	        System.out.println("Title of parent tab:" +driver.getTitle());
	        //normal alert
	        driver.findElement(By.id("alertButton")).click();
	        Alert alert=driver.switchTo().alert();
	        String message=driver.switchTo().alert().getText();
	        System.out.println(message);
	        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	        alert.accept();
	        //timer alert
	        driver.findElement(By.id("timerAlertButton")).click();
	        Thread.sleep(5000);
	        String message1=driver.switchTo().alert().getText();
	        System.out.println(message1);
	        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	        alert.accept();
	        //confirmation alert
	        driver.findElement(By.id("confirmButton")).click();
	        String message2=driver.switchTo().alert().getText();
	        System.out.println(message2);
	        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	        alert.accept();
	        //alert.dismiss();
		}
		finally {}

}
}
