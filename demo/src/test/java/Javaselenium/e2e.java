package Javaselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class e2e {
    public static void main(String[] args) throws InterruptedException {
        EdgeDriver driver = new EdgeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        //Auto suggest dropdown
        driver.findElement(By.id("autosuggest")).sendKeys("ind");
        Thread.sleep(1000);
        List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
        for (WebElement option : options) {
            if (option.getText().equalsIgnoreCase("india")) {
                option.click();
                break;
            }
        }

        //Is radio button is selected or not
        System.out.println(driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).isSelected());

//
System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
driver.findElement(By.name("ctl00$mainContent$view_date2")).click();
System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
driver.findElement(By.id("ctl00_mainContent_ddl_originStation3_CTXT")).isDisplayed();

        driver.quit();
    }
}

