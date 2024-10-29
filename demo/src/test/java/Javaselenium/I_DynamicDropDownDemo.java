package Javaselenium;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;


public class I_DynamicDropDownDemo {
    public static void main(String[] args) throws InterruptedException {

        EdgeDriver driver= new EdgeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='dropdownGroup1']/div/ul[1]/li[6]/a")).click();
        Thread.sleep(1000);
       driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
       driver.findElement(By.xpath("(//a[@value='BHO'])[2]")).click();
       Thread.sleep(1000);
       driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
//############################parent-child######################
      driver.findElement(By.xpath("(//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='GOI'])")).click();
       Thread.sleep(1000);
        driver.quit();


    }
}
