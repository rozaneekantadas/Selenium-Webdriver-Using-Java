package com.mycompany.seleniumtesting;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicWebDriverMethod {
    
    public static void main(String[] args) {
        
        //System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
        
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        
        String currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        
        String title = driver.getTitle();
        System.out.println(title);
        
        String pagesource = driver.getPageSource();
        System.out.println(pagesource);
        
        //driver.navigate().to("http://google.com");
        
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
        
        List<WebElement> webelements = driver.findElements(By.xpath("//div[@class=\"inventory_list\"]/div"));
        System.out.println(webelements);
        
        driver.navigate().to("https://daffodilvarsity.edu.bd/");
        String windowHandle = driver.getWindowHandle();
        System.out.println(windowHandle);
        
        driver.findElement(By.xpath("//*[@id=\"section-counter\"]/div/div[2]/div/p/a")).click();
        Set<String> windowHandles = driver.getWindowHandles();
        System.out.println(windowHandles);
        
    }    
}
