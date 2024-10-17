package Javaselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

import org.testng.Assert;


public class LocatorParcties {
    public static void main(String[] args) throws InterruptedException{

    EdgeDriver driver= new EdgeDriver();
    driver.get("https://rahulshettyacademy.com/locatorspractice/");
    Assert.assertEquals(driver.findElement(By.cssSelector("#container > div.form-container.sign-in-container > form > h1")).getText(),"Sign in");
    Thread.sleep(1000);
    System.out.println(driver.findElement(By.xpath("//*[@id=\'inputUsername\']")).getAttribute("placeholder"));
    driver.findElement(By.xpath("//*[@id=\'inputUsername\']")).sendKeys("Bot");
    System.out.println(driver.findElement(By.xpath("//*[@id=\'container\']/div[2]/form/input[2]")).getAttribute("placeholder"));
    driver.findElement(By.xpath("//*[@id=\'container\']/div[2]/form/input[2]")).sendKeys("Password");
    driver.findElement(By.xpath("//*[@id=\"container\"]/div[2]/form/button")).click();
    Thread.sleep(1000);
    System.out.println(driver.findElement(By.xpath("//*[@id=\"container\"]/div[2]/form/p")).getText());

    driver.findElement(By.linkText("Forgot your password?")).click();
    Thread.sleep(1000);
    System.out.println(driver.findElement(By.cssSelector("#container > div.form-container.sign-up-container > form > h2")).getText());
    System.out.println(driver.findElement(By.cssSelector("#container > div.form-container.sign-up-container > form > input[type=text]:nth-child(2)")).getAttribute("placeholder"));
    driver.findElement(By.cssSelector("#container > div.form-container.sign-up-container > form > input[type=text]:nth-child(2)")).sendKeys("test1");
    System.out.println(driver.findElement(By.cssSelector("#container > div.form-container.sign-up-container > form > input[type=text]:nth-child(3)")).getAttribute("placeholder"));
    driver.findElement(By.cssSelector("#container > div.form-container.sign-up-container > form > input[type=text]:nth-child(3)")).sendKeys("test1@gmail.com");
    System.out.println(driver.findElement(By.cssSelector("#container > div.form-container.sign-up-container > form > input[type=text]:nth-child(4)")).getAttribute("placeholder"));
    driver.findElement(By.cssSelector("#container > div.form-container.sign-up-container > form > input[type=text]:nth-child(4)")).sendKeys("0987654321");
    driver.findElement(By.cssSelector("#container > div.form-container.sign-up-container > form > div > button.reset-pwd-btn")).click();
    String getpass = driver.findElement(By.cssSelector("#container > div.form-container.sign-up-container > form > p")).getText();
    System.out.println(getpass);
    String[] gotpass = getpass.split("'");
    System.out.println(gotpass);
    String gotpass1 = gotpass[1].split("'")[0];
    System.out.println(gotpass1);
    driver.findElement(By.cssSelector("#container > div.form-container.sign-up-container > form > div > button.go-to-login-btn")).click();
    System.out.println(driver.findElement(By.tagName("h1")).getText());
    driver.findElement(By.id("inputUsername")).clear();
    driver.findElement(By.name("inputPassword")).clear();
    driver.findElement(By.id("inputUsername")).sendKeys("test2");
    driver.findElement(By.name("inputPassword")).sendKeys(gotpass1);
    driver.findElement(By.xpath("//*[@id='container']/div[2]/form/button")).click();
    Thread.sleep(2000);
    Assert.assertEquals(driver.findElement(By.xpath("//*[@id='root']/div/div/div/p")).getText(),"You are successfully logged in.");
    driver.findElement(By.className("logout-btn")).click();
    Thread.sleep(2000);
    Assert.assertEquals(driver.findElement(By.tagName("h1")).getText(), "Sign in");
    driver.quit();

        
    }
}
