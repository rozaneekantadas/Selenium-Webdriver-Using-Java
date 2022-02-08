package com.mycompany.seleniumtesting;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindows {
    
    public static void main(String[] args) throws InterruptedException {
        
        //System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
        
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.salesforce.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div/div/div/div[2]/div[1]/div[1]/div[3]/div/div[1]/div/a")).click();
        Set<String> windows = driver.getWindowHandles();
        System.out.println(windows);
        
        Iterator<String> iterator = windows.iterator();
        String parentWindow = iterator.next();
        String childWindow = iterator.next();
        
        driver.switchTo().window(childWindow);
        driver.findElement(By.name("UserFirstName")).sendKeys("Supto");
        driver.findElement(By.name("UserLastName")).sendKeys("Das");
        driver.switchTo().window(parentWindow);
    }    
}
