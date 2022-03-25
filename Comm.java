package com.Nobroker;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
public class Comm
{
    public static void main( String[] args )
    {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.nobroker.in/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[1]/div[3]/div[3]")).click();
        driver.findElement(By.xpath("//div[@id='searchCity']")).click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//div[@class='css-1hwfws3 nb-select__value-container nb-select__value-container--has-value']")).click();
        Actions ac=new Actions(driver);
        for(int i=0;i<2;i++) {
        	ac.sendKeys(Keys.DOWN).perform();
        	}
        ac.sendKeys(Keys.ENTER).perform();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@id='listPageSearchLocality']")).click();
        driver.findElement(By.xpath("//input[@id='listPageSearchLocality']")).sendKeys("Basavanagudi");
        driver.findElement(By.cssSelector("div[class='autocomplete-dropdown-container']")).click();
        driver.findElement(By.xpath("//input[@type='radio' and @id='COMMERCIAL_RENT']")).click();
        driver.findElement(By.xpath("//button[@class='prop-search-button btn btn-primary btn-lg']")).click();
        
    }}

