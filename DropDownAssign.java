package week2.day2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.Select;
public class DropDownAssign {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();	
        ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        driver.get("http://www.leafground.com/pages/Dropdown.html");
        
        WebElement drop6= driver.findElement
        		(By.xpath("//option[contains(text(),'Select your')]"));
         Select dropd6= new Select(drop6);
         
         dropd6.selectByValue("1");
         
         
         
         
         
        
        


	}

}
