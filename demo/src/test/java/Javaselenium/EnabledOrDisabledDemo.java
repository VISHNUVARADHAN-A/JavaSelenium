package Javaselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class EnabledOrDisabledDemo {
        public static  void main(String[] args) throws InterruptedException {
        
  
    EdgeDriver driver= new EdgeDriver();
    driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
    System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
    driver.findElement(By.name("ctl00$mainContent$view_date2")).click();
    System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
    System.out.println(driver.findElement(By.id("ctl00_mainContent_ddl_originStation3_CTXT")).isDisplayed());
    Thread.sleep(5000);
    driver.quit();
    }
}
