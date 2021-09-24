package week2.day2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesforceLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		
		driver.findElement(By.xpath("//div[@class='firstName textFieldInput section']/div/input")).sendKeys("Indhra");
		driver.findElement(By.xpath("//div[@class='lastName textFieldInput section']/div/input")).sendKeys("Sridhar");
		driver.findElement(By.xpath("//div[@class='emailInput textFieldInput section']/div/input")).sendKeys("indhra.be08@gmail.com");
		WebElement JobTitle= driver.findElement(By.xpath("//div[@class='userTitle selectFieldInput section']/div/select"));
            Select dropdown1=new Select(JobTitle);
            dropdown1.selectByVisibleText("IT Manager");
        driver.findElement(By.xpath("//div[@class='company textFieldInput section']/div/input")).sendKeys("Natwest");
        WebElement Employee=driver.findElement(By.xpath("//div[@class='companyEmployees selectFieldInput section']/div/select"));
        Select dropdown2=new Select(Employee);
        dropdown2.selectByIndex(1);
        
        driver.findElement(By.xpath("//div[@class='phoneInput textFieldInput section']/div/input")).sendKeys("9884142031");
        
        
            

	}

}
