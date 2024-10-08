package Javaselenium;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;



public class LocatorsDemo {
    public static void main(String[] args) throws InterruptedException {
        
        EdgeDriver driver= new EdgeDriver();
        driver.get("C:\\Users\\vishn\\coding\\java\\Javaselenium\\src\\Javaselenium\\test.html");
        System.out.println("id");
        System.out.println(driver.findElement(By.id("myTextInput")).getText());
        driver.findElement(By.id("myTextInput1")).sendKeys("hi");
        
        
        Thread.sleep(1000);
        System.out.println("Class name");
        System.out.println(driver.findElement(By.className("My_class")).getText());
        driver.findElement(By.className("My_class1")).sendKeys("hello");
        
        Thread.sleep(1000);
        System.out.println("name");
        System.out.println(driver.findElement(By.name("my_input")).getText());
        driver.findElement(By.name("my_input1")).sendKeys("Bye");
        Thread.sleep(1000);
        
        System.out.println("Xpath");
        System.out.println(driver.findElement(By.xpath("//*[@id=\"tbodyId\"]/tr[3]/td[1]")).getText());
        driver.findElement(By.xpath("//*[@id='tbodyId']/tr[3]/td[2]/input")).clear();
        driver.findElement(By.xpath("//*[@id='tbodyId']/tr[3]/td[2]/input")).sendKeys("Hi from Xpath");
        Thread.sleep(1000);

        System.out.println("Link Text");
        driver.findElement(By.linkText("seleniumbase.com")).click();
        String GetTile = driver.getTitle();
        System.out.println(GetTile);
        
        driver.quit();


    }
}
