package com.pages;

import org.testng.Assert;
import utils.SetupBrowser;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;

public class HomePageTest {
    private WebDriver driver;
    private HomePage homePage;

    @BeforeClass
    public void setUp() throws IOException {
        driver = SetupBrowser.setUp();
        homePage = new HomePage(driver);
    }

    @Test
    public void validatePageTitle() throws InterruptedException {
        Thread.sleep(2000);
        String homePageTitle = homePage.getPageTitle();
        Thread.sleep(2000);
        String expectedTitle = "Blog do Agi | Tudo sobre empréstimo e educação financeira";
        Thread.sleep(2000);
        Assert.assertEquals(homePageTitle, expectedTitle, "O título da página inicial não corresponde ao esperado");
    }

    @Test
    public void validateSearchField() throws InterruptedException {
        boolean isSearchInputPresent = homePage.isSearchInputPresent();
        Assert.assertTrue(isSearchInputPresent, "O campo de busca não está presente na página");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}