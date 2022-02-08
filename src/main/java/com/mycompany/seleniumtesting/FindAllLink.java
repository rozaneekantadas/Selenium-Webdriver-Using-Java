package com.mycompany.seleniumtesting;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindAllLink {
    
    public static void main(String[] args) {
        
        //System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
        
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.sugarcrm.com/au/request-demo/");
        driver.manage().window().maximize();
        
        List<WebElement> alltags = driver.findElementsByTagName("a");
        System.out.println("Total tags are: "+alltags.size());
        
        for (int i = 0; i < alltags.size(); i++) {
            System.out.println("Links on page are: "+alltags.get(i).getAttribute("href"));
            System.out.println("Links on page are: "+alltags.get(i).getText());
        }
    }    
}
