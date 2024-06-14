package com.example.demotest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.Assert.assertTrue;

public class GoogleSearchTest {
    private WebDriver driver;

    @Before
    public void setUp() {
        // Imposta il percorso del driver di Chrome
        System.setProperty("webdriver.chrome.driver", "C:\\chromeDriver\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void testGoogleSearch() {
        // Naviga alla pagina di Google
        driver.get("https://www.google.com");

        // Trova la casella di testo per la ricerca
        WebElement searchBox = driver.findElement(By.name("q"));

        // Inserisci la query di ricerca
        searchBox.sendKeys("Selenium WebDriver");

        // Invia la query di ricerca
        searchBox.submit();

        // Usa WebDriverWait per attendere che il titolo contenga "Selenium WebDriver"
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.titleContains("Selenium WebDriver"));

        // Verifica che il titolo della pagina contenga "Selenium WebDriver"
        assertTrue(driver.getTitle().contains("Selenium WebDriver"));
    }

    @After
    public void tearDown() {
        // Chiudi il browser
        if (driver != null) {
            driver.quit();
        }
    }
}


    // @Test
    // public void testGoogleSearch() {
    // // Naviga alla pagina di Google
    // driver.get("https://www.google.com");

    // // Trova la casella di testo per la ricerca
    // WebElement searchBox = driver.findElement(By.name("q"));

    // // Inserisci la query di ricerca
    // searchBox.sendKeys("Selenium WebDriver");

    // // Invia la query di ricerca
    // searchBox.submit();

    // // Attendi che la pagina dei risultati venga caricata e controlla il titolo
    // try {
    // Thread.sleep(6000); // Attesa di 2 secondi (meglio usare WebDriverWait per
    // test reali)
    // } catch (InterruptedException e) {
    // e.printStackTrace();
    // }

    // // Verifica che il titolo della pagina contenga "Selenium WebDriver"
    // }