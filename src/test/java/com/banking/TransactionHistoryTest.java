package com.banking;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TransactionHistoryTest extends BaseTest {

    @Test
    public void transactionHistoryTest() {

        // Click Transaction History
        driver.findElement(By.linkText("Transaction History")).click();

        // Verify the page title/heading
        String pageText = driver.findElement(By.tagName("body")).getText();

        Assert.assertTrue(
            pageText.contains("Transaction History"),
            "Transaction History page did not open"
        );

        System.out.println("Transaction History test completed successfully");
    }
}