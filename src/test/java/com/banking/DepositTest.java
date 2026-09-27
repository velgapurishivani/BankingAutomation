package com.banking;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class DepositTest extends BaseTest {

    @Test
    public void depositTest() {

        // Click Deposit
        driver.findElement(By.linkText("Deposit")).click();

        // Enter deposit amount
        driver.findElement(By.name("amount")).sendKeys("1000");

        // Submit deposit
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        System.out.println("Deposit test completed successfully");
    }
}