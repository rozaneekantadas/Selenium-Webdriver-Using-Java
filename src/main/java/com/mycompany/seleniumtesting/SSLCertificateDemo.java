package com.mycompany.seleniumtesting;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SSLCertificateDemo {
    
    public static void main(String[] args) {
        
        WebDriverManager.chromedriver().setup();
        
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setAcceptInsecureCerts(true);
        
        ChromeOptions coptions = new ChromeOptions();
        coptions.merge(dc);
        
        ChromeDriver driver = new ChromeDriver(coptions);
        driver.get("https://expired.badssl.com/");
        
    }    
}
