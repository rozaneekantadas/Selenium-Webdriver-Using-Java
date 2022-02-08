package com.mycompany.seleniumtesting;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdownMenu {
    
    public static void main(String[] args) throws InterruptedException {
        
//        WebDriverManager.chromedriver().setup();
//        ChromeDriver driver = new ChromeDriver();
//        driver.get("https://www.sugarcrm.com/au/request-demo/");
//        driver.manage().window().maximize();
//        
//        WebElement ddown = driver.findElement(By.name("employees_c"));
//        Select select = new Select(ddown);
//        
//        select.selectByValue("level1");
//        Thread.sleep(2000);
//        
//        select.selectByVisibleText("51 - 100 employees");
//        Thread.sleep(2000);
//        
//        select.selectByIndex(5);
        
        //Multi Select Drop Down
        
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://demo.mobiscroll.com/select/multiple-select");
        driver.manage().window().maximize();
        
        driver.findElement(By.xpath("//*[@id=\"multiple-select-context\"]/label/span[2]/span[1]")).click();
        
        WebElement ddown = driver.findElement(By.id("multiple-select-select"));
        Select select = new Select(ddown);
        
        select.selectByValue("1");
        Thread.sleep(2000);
        select.selectByIndex(2);
        Thread.sleep(2000);
        
        List<WebElement> allItems = select.getAllSelectedOptions();
        System.out.println(allItems);
        System.out.println(allItems.size());
        
        Thread.sleep(2000);
        select.deselectAll();
        Thread.sleep(2000);
        
        select.selectByValue("1");
        Thread.sleep(2000);
        select.selectByIndex(2);
        Thread.sleep(2000);
        select.selectByValue("7");
        Thread.sleep(2000);
        
        select.deselectByValue("7");
        Thread.sleep(2000);
        List<WebElement> allItems1 = select.getAllSelectedOptions();
        System.out.println(allItems1);
        System.out.println(allItems1.size());
        
        
//        WebDriverManager.chromedriver().setup();
//        ChromeDriver driver = new ChromeDriver();
//        driver.get("https://demoqa.com/select-menu");
//        driver.manage().window().maximize();
//        
//        WebElement ddown = driver.findElement(By.id("cars"));
//        Select select = new Select(ddown);
//        
//        select.selectByValue("volvo");
//        Thread.sleep(2000);
//        select.selectByIndex(2);
//        Thread.sleep(2000);
//        
//        List<WebElement> allItems = select.getAllSelectedOptions();
//        System.out.println(allItems);
//        System.out.println(allItems.size());
//        
//        Thread.sleep(2000);
//        select.deselectAll();
//        Thread.sleep(2000);
//        
//        select.selectByValue("volvo");
//        Thread.sleep(2000);
//        select.selectByIndex(2);
//        Thread.sleep(2000);
//        select.selectByValue("audi");
//        Thread.sleep(2000);
//        
//        select.deselectByValue("audi");
//        Thread.sleep(2000);
//        List<WebElement> allItems1 = select.getAllSelectedOptions();
//        System.out.println(allItems1);
//        System.out.println(allItems1.size());
    }    
}
