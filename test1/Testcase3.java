package week1.test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Testcase3 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("Democsr");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.partialLinkText("Leads")).click();
		driver.findElement(By.partialLinkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("ruthiran");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("kp");
		WebElement source=driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select dropDown =new Select(source);
		dropDown.selectByVisibleText("Employee");
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("11/30/1994");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("babu");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("k");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Dear manager");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("selenium training");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("CS");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("5l");
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("10");
		WebElement currency=driver.findElement(By.id("createLeadForm_currencyUomId"));
		Select dropDown4=new Select(currency);
		dropDown4.selectByVisibleText("INR - Indian Rupee");
		WebElement industry=driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select dropDown5=new Select(industry);
		dropDown5.selectByVisibleText("Computer Software");
		WebElement ownership=driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select dropDown6=new Select(ownership);
		dropDown6.selectByVisibleText("Public Corporation");
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("123456");
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("selenium");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("learn basic selenium");
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("teaching program");
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("+91");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("987456321");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("123654");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("sir");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("onlinetestleaf@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("testleaf.com");
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("ruthiran");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("p");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("kovil");
		driver.findElement(By.name("generalAddress2")).sendKeys("puram");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("madurai");
		WebElement state=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dropDown1=new Select(state);
		dropDown1.selectByVisibleText("Kansas");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("620026");
		WebElement country=driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select dropDown3=new Select(country);
		dropDown3.selectByVisibleText("Singapore");
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("60026");
		driver.findElement(By.className("smallSubmit")).click();
		
		
	
		
		
		
		
		
	}

}
