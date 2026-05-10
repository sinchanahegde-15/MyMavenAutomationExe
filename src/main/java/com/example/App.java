package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class App 
{
    public static void main(String[] args) throws InterruptedException
    {
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();

        options.addArguments("--headless=new");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");

        WebDriver driver = new ChromeDriver(options);

        driver.get("https://automationexercise.com/products");

        driver.findElement(By.id("search_product")).sendKeys("blue top");
        driver.findElement(By.id("submit_search")).click();

        Thread.sleep(2000);

        System.out.println("Page Title: " + driver.getTitle());

        driver.quit();
    }
}
