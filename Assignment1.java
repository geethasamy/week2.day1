package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.partialLinkText("Create")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("csw");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Geetha");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Periyasamy");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Gee");
		driver.findElement(By.name("departmentName")).sendKeys("IT");
		driver.findElement(By.name("description")).sendKeys("This is a demo project");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("geetha@gmail.com");
		
		WebElement dropdown1 = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select select = new Select(dropdown1);
		select.selectByVisibleText("New York");
		driver.findElement(By.name("submitButton")).click();
		String str = driver.getTitle();
		if(str.equalsIgnoreCase("View Lead | opentaps CRM"))
		{
			System.out.println("Verified the Tiltle successfully "
					+ "\n" + str);
		}
		else
		{
			System.out.println("Wrong Title" + str);
		}
	
		

	}

}
