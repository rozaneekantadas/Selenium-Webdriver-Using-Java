package com.mycompany.seleniumtesting;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CheckBoxAndScrollPageDemo {
    
    public static void main(String[] args) throws InterruptedException {
        
        //System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
        
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.sugarcrm.com/au/request-demo/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll\"]")).click();
        Thread.sleep(1000);
        
        WebElement radio = driver.findElement(By.xpath("//*[@id=\"doi0\"]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(radio);
        actions.perform();
                
        driver.findElement(By.name("interest_market_c")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("interest_market_c")).click();
        Thread.sleep(2000);
        
        //Find All Checkbox
        
        System.out.println("Size: "+driver.findElements(By.xpath("//input[@type='checkbox']")).size());
        System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")));
          
    }    
}
