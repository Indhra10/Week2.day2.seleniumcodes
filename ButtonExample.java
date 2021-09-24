package week2.day2.leafground;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ButtonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.get("http://leafground.com/pages/Button.html");
        
        WebElement Button4=driver.findElement(By.id("size"));
        int szh=Button4.getSize().height;
        System.out.println("Height of button is " +szh);
        int szw=Button4.getSize().width;
        System.out.println("Width of button is " +szw);
        
        String color=driver.findElement(By.id("color")).getCssValue("background-color");
        System.out.println("The RGB value of button color: " +color);
        
        WebElement Button2=driver.findElement(By.id("position"));
        int posX= Button2.getLocation().getX();
        int posY=Button2.getLocation().getY();
        System.out.println("xaxis " +posX);
        System.out.println("yaxis " +posY);
        
        driver.findElement(By.id("home")).click();
        
        
        
	}

}
