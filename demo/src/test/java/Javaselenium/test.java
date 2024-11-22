package Javaselenium;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
public class test {
     public static void main(String[] args) throws InterruptedException{

    EdgeDriver driver= new EdgeDriver();

    driver.get("https://www.google.co.in/");
    Actions Objaction = new Actions(driver);
    Objaction.moveToElement(driver.findElement(By.className("gLFyf"))).click().keyDown(Keys.SHIFT).sendKeys("hello").build().perform();
    Thread.sleep(2000);
    driver.quit();
}
}