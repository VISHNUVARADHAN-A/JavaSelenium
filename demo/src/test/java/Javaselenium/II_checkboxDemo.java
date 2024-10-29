package Javaselenium;

import org.openqa.selenium.edge.EdgeDriver;

import org.openqa.selenium.By;
public class II_checkboxDemo {
    public static  void main(String[] args) throws InterruptedException {
        
  
    EdgeDriver driver= new EdgeDriver();
    driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

    //###############################Full CSS ###########################
    System.out.println(driver.findElement(By.cssSelector("#ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());
    driver.findElement(By.cssSelector("#ctl00_mainContent_chk_SeniorCitizenDiscount")).click();
    System.out.println(driver.findElement(By.cssSelector("#ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());
    
    //###############################CSS partial text ###########################
    
    driver.findElement(By.cssSelector("#ctl00_mainContent_chk_SeniorCitizenDiscount")).click();
    System.out.println(driver.findElement(By.cssSelector("#ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());
    driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
    System.out.println(driver.findElement(By.cssSelector("#ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());
    driver.quit();
}}