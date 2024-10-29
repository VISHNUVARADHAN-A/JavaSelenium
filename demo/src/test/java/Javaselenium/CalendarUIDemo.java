package Javaselenium;

import org.openqa.selenium.edge.EdgeDriver;

import org.openqa.selenium.By;
public class CalendarUIDemo {
    public static  void main(String[] args) throws InterruptedException {
        
  
    EdgeDriver driver= new EdgeDriver();
    driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
    driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_originStation1_CTXT")).click();
    driver.findElement(By.cssSelector("a[value='BLR']")).click();
    driver.findElement(By.xpath("//*[@id=\'ctl00_mainContent_ddl_destinationStation1_CTXT\']")).click();
    driver.findElement(By.cssSelector("a[value='MAA']")).click();
    Thread.sleep(2000);
    //put . and class name to change class name to css
    driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
    Thread.sleep(2000);
    driver.quit();
}}