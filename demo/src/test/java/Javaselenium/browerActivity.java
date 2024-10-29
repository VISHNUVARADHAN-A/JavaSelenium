package Javaselenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.edge.EdgeDriver;
import java.awt.*;
public class browerActivity {
     public static void main(String[] args) throws InterruptedException{

    EdgeDriver driver= new EdgeDriver();
    
    driver.manage().window().fullscreen();
    // Get current window size
    Thread.sleep(2000);
    Dimension windowSize = driver.manage().window().getSize();
    System.out.println(windowSize);
    // Get screen size
    Dimension screenSize = new Dimension(
            (int)Toolkit.getDefaultToolkit().getScreenSize().getWidth(),
            (int)Toolkit.getDefaultToolkit().getScreenSize().getHeight());
        
    System.out.println(screenSize);
        if (windowSize.getWidth() == screenSize.getWidth() && windowSize.getHeight() == screenSize.getHeight()) {
            System.out.println("Browser is maximized.");
        } else {
            System.out.println("Browser is not maximized.");
        }
    //driver wait till page is full is loaded
    driver.get("C:\\Users\\vishn\\coding\\java\\Javaselenium\\src\\Javaselenium\\test.html");
    //driver will not wait for page to full load
    System.out.println(driver.getTitle());
    driver.navigate().to("https://www.google.com");
    Thread.sleep(2000);
    System.out.println(driver.getTitle());
    driver.navigate().back();
    System.out.println(driver.getTitle());
    driver.navigate().forward();
    System.out.println(driver.getTitle());
    driver.quit();
}
}