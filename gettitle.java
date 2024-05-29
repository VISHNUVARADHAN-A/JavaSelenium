package Javaselenium;

import java.util.Scanner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class gettitle {
    public static void main(String[] args) {
        Scanner InputObj = new Scanner(System.in);
        System.out.printf("Enter URL: ");
        String GetUrl = InputObj.nextLine();
        InputObj.close();
        WebDriver driver = new EdgeDriver();
        driver.get(GetUrl);
        String GetTile = driver.getTitle();
        driver.close();
        System.out.println(GetTile);
    }
}
