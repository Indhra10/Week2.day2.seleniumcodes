package week2.day2.leafground;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://leafground.com/pages/Edit.html");
		
		driver.findElement(By.id("email")).sendKeys("indhra.be08@gmail.com");
		driver.findElement(By.xpath("//label[contains(text(),'press')]/following-sibling::input")).sendKeys("Nag"); 
 String str= driver.findElement(By.xpath("//input[@value='TestLeaf']")).getAttribute("value");
   System.out.println(str);
   
         driver.findElement(By.xpath("//input[@value='Clear me!!']")).clear();
       WebElement dis=driver.findElement(By.xpath("//*[@id='contentblock']/section/div[5]/div/div/input"));
       if (!dis.isEnabled())
    	   System.out.println("yes, the field is disabled");
		
	}

}
