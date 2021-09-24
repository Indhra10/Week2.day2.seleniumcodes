package week2.day2.leafground;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBoxEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriverManager.chromedriver().setup();
	        ChromeDriver driver=new ChromeDriver();
	        driver.manage().window().maximize();
	        
	        driver.get("http://leafground.com/pages/checkbox.html");
	        
	        driver.findElement(By.xpath("//*[@id='contentblock']/section/div[1]/div[1]/input")).click();
	        
	        WebElement checkbox2=driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/input"));
	        if(checkbox2.isSelected())
	        	System.out.println("The check box 2 is checked");
	     
	        driver.findElement(By.xpath("//*[@id='contentblock']/section/div[3]/div[2]/input")).click();
	        
	    //    for(int i=1;i<=5;i++)
	      //  {
	        driver.findElement(By.xpath("//*[@id='contentblock']/section/div[4]/div[1]/input")).click();
	        driver.findElement(By.xpath("//*[@id='contentblock']/section/div[4]/div[2]/input")).click();
	        driver.findElement(By.xpath("//*[@id='contentblock']/section/div[4]/div[3]/input")).click();
	        driver.findElement(By.xpath("//*[@id='contentblock']/section/div[4]/div[4]/input")).click();
	        driver.findElement(By.xpath("//*[@id='contentblock']/section/div[4]/div[5]/input")).click();
	        
	       // }
	}

}
