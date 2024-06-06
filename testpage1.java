package Javaselenium;


import org.openqa.selenium.edge.EdgeDriver;

public class testpage1 {
    public static void main(String[] args) throws InterruptedException {
        EdgeDriver driver = new EdgeDriver();
        driver.get("https://omayo.blogspot.com/");
        Thread.sleep(2000);
        String pagetitle =  driver.getTitle();
        Thread.sleep(2000);
        driver.close();
        System.out.println(pagetitle);

    }
}
