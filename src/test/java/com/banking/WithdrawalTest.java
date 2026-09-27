package com.banking;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class WithdrawalTest extends BaseTest {

    @Test
    public void withdrawalTest() {

        // Click Withdrawal
        driver.findElement(By.linkText("Withdrawal")).click();

        // Enter withdrawal amount
        driver.findElement(By.name("amount")).sendKeys("500");

        // Submit withdrawal
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        System.out.println("Withdrawal test completed successfully");
    }
}