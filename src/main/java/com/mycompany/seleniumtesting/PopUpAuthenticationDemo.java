package com.mycompany.seleniumtesting;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpAuthenticationDemo {
    
    public static String username = "admin";
    public static String password = "admin";
    
    public static void main(String[] args) {
        
        //System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
        
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://"+username+":"+password+"@the-internet.herokuapp.com/basic_auth");
    }    
}
