package week1.test1;

//import java.time.Duration;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Seleniumtest1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		//System.out.println(System.getProperty("webDriver.chrome.driver"));
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(600));
		driver.findElement(By.id("username")).sendKeys("Democsr");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.partialLinkText("Contacts")).click();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("ruthiran");
		driver.findElement(By.id("lastNameField")).sendKeys("kp");
		driver.findElement(By.className("smallSubmit")).click();
		//Thread.sleep(8000);
	    String fristname=driver.findElement(By.id("viewContact_fristName_sp")).getText();
		System.out.println(fristname);
	    System.out.println(driver.getTitle());
		driver.close();
		
		//driver.get("http://leaftaps.com/opentaps/control/main");
		//driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoCSR");
		//driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		
		
		
		
		
		
		
		
		
		
		
	}

}
