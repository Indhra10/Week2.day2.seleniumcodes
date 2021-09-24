package week2.day2.leafground;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinkEx {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 WebDriverManager.chromedriver().setup();
	        ChromeDriver driver=new ChromeDriver();
	        driver.manage().window().maximize();
	        
	        
	        driver.navigate().to("http://leafground.com/pages/Link.html");
	        
	       WebElement Link1= driver.findElement(By.linkText("Go to Home Page"));
	       Link1.click();
	      Thread.sleep(3000);
	       driver.navigate().back();
	       
	       WebElement Link2= driver.findElement(By.partialLinkText("without clicking me?"));
	       String secLink=Link2.getAttribute("href");
	       System.out.println("The second link goes to " +secLink);
	       
	       WebElement Link3=driver.findElement(By.linkText("Verify am I broken?"));
	       Link3.click();
	       if(driver.getTitle()== "HTTP Status 404 – Not Found")
	    	   System.out.println("Yes the 3rd link is broken");
	       driver.navigate().back();
	       
	       List<WebElement> noOfLinks=driver.findElements(By.tagName("a"));
	       System.out.println("The no of links are: " +noOfLinks.size());
	        

	}

}
