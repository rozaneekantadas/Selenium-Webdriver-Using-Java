package com.mycompany.seleniumtesting;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestionDropdownDemo {
    
    public static void main(String[] args) throws InterruptedException {
        
        //System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
        
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.makemytrip.com/");
        driver.manage().window().maximize();
        
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[1]/label/span")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[1]/label/span")).click();
        WebElement form = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[1]/div[1]/div/div/div/input"));
        
        form.sendKeys("Sydney");
        Thread.sleep(2000);
        form.sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(2000);
        form.sendKeys(Keys.ENTER);
        Thread.sleep(2000);           
    }    
}
