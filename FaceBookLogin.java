package week2.day2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBookLogin {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement
		(By.xpath("//div[@class='_6ltg']/a")).click();
		
	//	inside login information page
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Chandra");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("dharshini");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("8888888888");
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("OhiO@123");
        WebElement dropDown1=
    		driver.findElement(By.xpath("//select[@name='birthday_day']"));
        Select drop1=new Select(dropDown1);
        drop1.selectByValue("11");
        
        driver.findElement(By.xpath("//select[@name='birthday_month']")).sendKeys("2");
        driver.findElement(By.xpath("//select[@name='birthday_year']")).sendKeys("1986");
        driver.findElement(By.xpath("//input[@class='_8esa'] [@id='u_3_4_Lj']")).click();
        driver.findElement(By.xpath("//button[@id='u_3_s_aa']"));
        
        
			
		
	}

}
