package com.banking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BaseTest {

    protected WebDriver driver;
    protected WebDriverWait wait;

    @BeforeMethod
    public void setUp() {

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://localhost/Banking_Application/");

        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Enter username
        wait.until(
            ExpectedConditions.visibilityOfElementLocated(By.name("username"))
        ).sendKeys("admin");

        // Enter password
        driver.findElement(By.name("password")).sendKeys("admin123");

        // Click Login
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        // Wait for dashboard
        wait.until(
            ExpectedConditions.urlContains("dashboard.php")
        );
    }

    @AfterMethod
    public void tearDown() {

        if (driver != null) {
            driver.quit();
        }
    }
}