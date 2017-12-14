package com.pflb.learning.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

/**
 * Driver manager (Singleton)
 *
 * @author Viktoriya Ibraimova
 * @version dated Nov 28, 2017
 */
public class DriverManager {
    private static DriverManager instance;
    private WebDriver driver;

    static {
        System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chromedriver.exe");
    }

    private DriverManager() {
        //driver = new ChromeDriver();
    }

    public static WebDriver getDriver() {
        if (instance == null) {
            instance = new DriverManager();
            //instance.driver = new FirefoxDriver(new FirefoxOptions().setLegacy(true));
            instance.driver = new ChromeDriver();
        }
        return instance.driver;
    }


}