package com.pages;

import utils.SetupBrowser;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;

public class SearchPageTest {
    private WebDriver driver;
    private HomePage homePage;

    @BeforeClass
    public void setUp() throws IOException {
        driver = SetupBrowser.setUp();
        homePage = new HomePage(driver);
    }

    @Test
    public void testSearchArticle() throws InterruptedException {
        homePage.clickSearchButton();
        Thread.sleep(2000);
        homePage.textSearchArticle("rating");
        Thread.sleep(2000);
        homePage.pressEnterSearchInput();
        Thread.sleep(2000);
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}