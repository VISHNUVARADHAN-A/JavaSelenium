package Javaselenium;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.openqa.selenium.By;
public class I_TestngDemo {
    public static  void main(String[] args) throws InterruptedException {
        
  
    EdgeDriver driver= new EdgeDriver();
    driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

    //###############################Full CSS and assertFalse True###########################
    Assert.assertFalse(driver.findElement(By.cssSelector("#ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());
    //System.out.println(driver.findElement(By.cssSelector("#ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());
    
    driver.findElement(By.cssSelector("#ctl00_mainContent_chk_SeniorCitizenDiscount")).click();
    Assert.assertTrue(driver.findElement(By.cssSelector("#ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());
    //System.out.println(driver.findElement(By.cssSelector("#ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());
    
    //###############################CSS partial text assertFalse True ###########################
    
    driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
    Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
    //System.out.println(driver.findElement(By.cssSelector("#ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());
    driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
    //System.out.println(driver.findElement(By.cssSelector("#ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());
    

    driver.findElement(By.id("divpaxinfo")).click();
    Thread.sleep(2000);
    
    int i = 1;
    while(i<5){
            driver.findElement(By.id("hrefIncAdt")).click();
            i++;
    }
    for(int j=1; j<5;j++)
{
    driver.findElement(By.id("hrefIncChd")).click();
}

    driver.findElement(By.id("btnclosepaxoption")).click();
    //############################Assert Equals ###########################
    Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(),"5 Adult, 4 Child");
    System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
    Thread.sleep(1000);
    driver.quit();
}}