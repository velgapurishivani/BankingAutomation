package com.banking;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TransferTest extends BaseTest {

    @Test
    public void transferTest() {

        // Click Fund Transfer
        driver.findElement(By.linkText("Fund Transfer")).click();

        // Enter beneficiary account
        driver.findElement(By.name("account")).sendKeys("1234567890");

        // Enter transfer amount
        driver.findElement(By.name("amount")).sendKeys("500");

        // Click Transfer
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        System.out.println("Transfer test completed successfully");
    }
}