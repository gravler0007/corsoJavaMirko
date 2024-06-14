package com.example.demotest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\chromeDriver\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        try {
            Thread.sleep(10000); // Pausa di 10 secondi per vedere il browser aperto
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
    }
}
