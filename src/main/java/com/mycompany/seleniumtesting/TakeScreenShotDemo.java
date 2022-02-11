package com.mycompany.seleniumtesting;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenShotDemo {
    
    public static void main(String[] args) throws IOException {
        
        //System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
        Date currentdate = new Date();
        String ssFileName = currentdate.toString().replace(" ", "-").replace(":", "-");
        System.out.println(ssFileName);
        
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");
        
        File screenshots = driver.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshots, new File(".//screenshot/"+ssFileName+".png"));
    }    
}
