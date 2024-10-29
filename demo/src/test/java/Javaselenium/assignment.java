package Javaselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

import org.testng.Assert;


public class assignment {
    public static void main(String[] args) throws InterruptedException{

    
    EdgeDriver driver= new EdgeDriver();
    driver.get("https://rahulshettyacademy.com/AutomationPractice/");
    System.out.println(driver.findElement(By.cssSelector("input[value='checkbox']")).getSize());
    
    driver.quit();

        
    }
}
