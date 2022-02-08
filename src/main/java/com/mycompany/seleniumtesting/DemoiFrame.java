package com.mycompany.seleniumtesting;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoiFrame {
    
    public static void main(String[] args) throws InterruptedException {
        
        //System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
        
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        //driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
        driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
        driver.manage().window().maximize();
        //index
        //driver.switchTo().frame(0);
        //id
        driver.switchTo().frame("iframeResult");
        //by frame element
//        WebElement frame1 = driver.findElement(By.id("frameElement"));
//        driver.switchTo().frame(frame1);
        
        driver.findElement(By.xpath("/html/body/button")).click();
        Alert alert = driver.switchTo().alert();
        
        System.out.println(alert.getText());
        alert.sendKeys("Supto Das");
        Thread.sleep(4000);
        alert.accept();
        
        driver.switchTo().parentFrame();
        System.out.println(driver.getTitle());
    }    
}
