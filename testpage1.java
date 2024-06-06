package Javaselenium;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class testpage1 {
    public static void main(String[] args) throws InterruptedException {
        EdgeDriver driver = new EdgeDriver();
        driver.get("https://omayo.blogspot.com/");
        Thread.sleep(2000);
        String pagetitle =  driver.getTitle();
        List<WebElement> elementList = driver.findElements(By.cssSelector("##multiselect1 > option:nth-child(1)"));
        Thread.sleep(2000);
        driver.close();
        System.out.println(pagetitle);
        System.out.println(elementList);
    }
}
