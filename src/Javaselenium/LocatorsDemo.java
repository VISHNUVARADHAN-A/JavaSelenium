package Javaselenium;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class LocatorsDemo {
    public static void main(String[] args) throws InterruptedException {
        //Locators
        // ID
        // NAME
        // CLASS
        // Xpath
        // TAG
        // CSS 
        // Link
        // Partial link
        EdgeDriver driver= new EdgeDriver();
        driver.get("C:\\Users\\vishn\\coding\\java\\Javaselenium\\src\\Javaselenium\\test.html");
        
        System.out.println("#########ID#########");
        System.out.println(driver.findElement(By.id("myTextInput")).getText());
        driver.findElement(By.id("myTextInput1")).sendKeys("hi");
        Thread.sleep(1000);

        System.out.println("#########name#########");
        System.out.println(driver.findElement(By.name("my_input")).getText());
        driver.findElement(By.name("my_input1")).sendKeys("Bye");
        Thread.sleep(1000);

        System.out.println("#########Class name#########");
        System.out.println(driver.findElement(By.className("My_class")).getText());
        driver.findElement(By.className("My_class1")).sendKeys("hello");
        Thread.sleep(1000);

        System.out.println("#########Xpath#########");
        System.out.println(driver.findElement(By.xpath("//*[@id=\'ForXpath\']")).getText());
        driver.findElement(By.xpath("//*[@id='MyXpathinput']")).sendKeys("Hi from Xpath");
        Thread.sleep(1000);

        System.out.println("#########Full Xpath#########");
        System.out.println(driver.findElement(By.xpath("/html/body/form/table/tbody/tr[4]/td[3]")).getText());
        driver.findElement(By.xpath("/html/body/form/table/tbody/tr[4]/td[4]/input")).sendKeys("Hi from Xpath");
        Thread.sleep(1000);

        System.out.println("#########CSS se#########");
        System.out.println(driver.findElement(By.cssSelector("#tbodyId > tr:nth-child(3) > td:nth-child(3)")).getText());
        driver.findElement(By.cssSelector("#tbodyId > tr:nth-child(3) > td:nth-child(4) > input[type=text]")).sendKeys("Hi from CSS");
        Thread.sleep(1000);

        System.out.println("#########Link Text#########");
        System.out.println(driver.findElement(By.linkText("seleniumbase.com")).getText());
        
        System.out.println("#########Link Text#########");
        driver.findElement(By.partialLinkText("GitHub")).click();
        String GetTile1 = driver.getTitle();
        System.out.println(GetTile1);
        
        driver.quit();


    }
}
