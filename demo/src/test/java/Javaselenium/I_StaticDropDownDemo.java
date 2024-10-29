package Javaselenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;


public class I_StaticDropDownDemo {
    public static void main(String[] args) throws InterruptedException {

        EdgeDriver driver= new EdgeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        // ################################Satic DropDown##############################
        WebElement StaticDropDown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
        Select dropdown = new Select(StaticDropDown);
        dropdown.selectByIndex(3);
        System.out.println(dropdown.getFirstSelectedOption().getText());
        dropdown.selectByVisibleText("AED");
        System.out.println(dropdown.getFirstSelectedOption().getText());
        dropdown.selectByValue("INR");
        System.out.println(dropdown.getFirstSelectedOption().getText());

        
        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(2000);
        
        int i = 1;
        while(i<5){
                driver.findElement(By.id("hrefIncAdt")).click();
                i++;
        }
        for(int j=1; j<5;j++)
{
    driver.findElement(By.id("hrefIncChd")).click();
}

        driver.findElement(By.id("btnclosepaxoption")).click();
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
        driver.quit();


    }
}
