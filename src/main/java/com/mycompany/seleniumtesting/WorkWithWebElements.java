package com.mycompany.seleniumtesting;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkWithWebElements {
    
    public static void main(String[] args) {
        
        //System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
      
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.sugarcrm.com/au/request-demo/");
        driver.manage().window().maximize();
        
        driver.findElement(By.name("firstname")).sendKeys("Testing Name");
        driver.findElement(By.name("firstname")).clear();
        System.out.println(driver.findElement(By.name("firstname")).getAttribute("class"));
        System.out.println(driver.findElement(By.xpath("//*[@id=\"field1\"]/div/input")).getCssValue("t ext-transform"));
        System.out.println(driver.findElement(By.xpath("//*[@id=\"field1\"]/div/input")).getSize());
        System.out.println(driver.findElement(By.xpath("//*[@id=\"field1\"]/div/input")).getLocation());
        System.out.println(driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/div/div[1]/div/div/div/div[2]/h2")).getText());
        System.out.println(driver.findElement(By.xpath("//*[@id=\"field1\"]/div/input")).getTagName());
        System.out.println(driver.findElement(By.xpath("//*[@id=\"field1\"]/div/input")).isDisplayed());
        System.out.println(driver.findElement(By.xpath("//*[@id=\"field1\"]/div/input")).isEnabled());
        System.out.println(driver.findElement(By.xpath("//*[@id=\"field1\"]/div/input")).isSelected());
    }    
}
