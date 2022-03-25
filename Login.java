package com.Nobroker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login
{
    public static void main( String[] args )
    {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.nobroker.in/#signup-login");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"navHeader\"]/div[5]/div[2]/div[2]")).click();
        //driver.findElement(By.id("signUp-phoneNumber")).sendKeys("1234567890");
        driver.findElement(By.xpath("//*[@id=\"signUpSubmit\"]")).click();
        
        
        
    }
}

