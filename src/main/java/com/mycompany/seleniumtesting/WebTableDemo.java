package com.mycompany.seleniumtesting;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableDemo {
    
    public static void main(String[] args) {
        
        //System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
        
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www2.asx.com.au/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        driver.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"pnProductNavContents\"]/li[2]")).click();
        
        List<WebElement> rowelements = driver.findElements(By.xpath("//*[@id=\"home_top_five_test\"]/div/div[1]/div/div[1]/table/tr"));
        System.out.println(rowelements.size());
        int rowSize = rowelements.size();
        
        List<WebElement> colelements = driver.findElements(By.xpath("//*[@id=\"home_top_five_test\"]/div/div[1]/div/div[1]/table/tr[1]/th"));
        System.out.println(colelements.size());
        int colSize = colelements.size();
        
        for (int i = 2; i <= rowSize; i++) {
            for (int j = 1; j <= colSize; j++) {
                System.out.print(driver.findElement(
                        By.xpath("//*[@id=\"home_top_five_test\"]/div/div[1]/div/div[1]/table/tr["+i+"]/td["+j+"]"))
                        .getText()+"   ");
            }
            System.out.println("");
        }
    }    
}
