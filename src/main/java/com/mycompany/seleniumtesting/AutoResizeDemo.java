package com.mycompany.seleniumtesting;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutoResizeDemo {
    
    public static void main(String[] args) {
        
        //System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
        
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/resizable/");
        driver.manage().window().maximize();
        
        WebElement frame = driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
        driver.switchTo().frame(frame);
        
        WebElement element = driver.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));
        
        Actions action = new Actions(driver);
        action.dragAndDropBy(element, 300, 100).perform();
    }    
}
