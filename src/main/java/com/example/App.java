package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        WebDriver driver=new ChromeDriver();
        driver.get("https://automationexercise.com/products");
        driver.manage().window().maximize();
        driver.findElement(By.id("search_product")).sendKeys("Blue top");
        driver.findElement(By.id("submit_search")).click();
    }
}

