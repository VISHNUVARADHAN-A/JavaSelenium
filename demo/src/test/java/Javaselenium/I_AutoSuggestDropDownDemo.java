package Javaselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;


public class I_AutoSuggestDropDownDemo {
    public static void main(String[] args) throws InterruptedException {

        EdgeDriver driver= new EdgeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.findElement(By.id("autosuggest")).sendKeys("ind");
        Thread.sleep(1000);
        List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
        for(WebElement option : options){
            if (option.getText().equalsIgnoreCase("india"))
            {
                option.click();
                break;
            }
            
        }
        driver.quit();


    }
}
