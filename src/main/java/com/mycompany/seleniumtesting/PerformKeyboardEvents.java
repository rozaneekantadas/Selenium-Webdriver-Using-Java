package com.mycompany.seleniumtesting;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PerformKeyboardEvents {
    
    public static void main(String[] args) throws InterruptedException {
        
        //System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
        
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://extendsclass.com/text-compare");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        
        Actions action = new Actions(driver);
        
        WebElement copyTextElement = driver.findElement(By.xpath("//*[@id=\"dropZone\"]/div[2]/div/div[6]/div[1]/div/div/div/div[5]/div[8]/pre"));
        action.keyDown(copyTextElement, Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform();
        Thread.sleep(2000);
        
        WebElement pasteTextElement = driver.findElement(By.xpath("//*[@id=\"dropZone2\"]/div[2]/div/div[6]/div[1]/div/div/div/div[5]/div[5]/pre/span"));
        Thread.sleep(2000);
        action.keyDown(pasteTextElement, Keys.CONTROL).sendKeys("a").sendKeys("v").build().perform();
    }    
}
