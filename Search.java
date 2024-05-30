package Javaselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.edge.EdgeDriver;

public class Search {
    public static void main(String[] args) {
        EdgeDriver driver= new EdgeDriver();
        driver.get("https:\\www.google.com");
        
        driver.findElement(By.id("APjFqb")).sendKeys("hello world");
        driver.findElement(By.id("APjFqb")).sendKeys(Keys.ENTER);
        String pageTitle =driver.getTitle();
        driver.close();
        System.out.println(pageTitle);
        if (pageTitle.equals("hello world - Google Search")){
            System.out.println("test passed");}
        else{
                System.out.println("test failed");
        }
    }
}
