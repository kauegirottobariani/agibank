package com.pages;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import utils.SetupBrowser;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utils.ReturnHome;

import java.io.IOException;

public class HomePageTest {
    private WebDriver driver;
    private HomePage homePage;
    private ReturnHome returnHome;

    @BeforeClass
    public void setUp() throws IOException {
        driver = SetupBrowser.setUp();
        homePage = new HomePage(driver);
        returnHome = new ReturnHome(driver);
    }

    @AfterMethod
    public void tearDownMethod() {
        returnHome.clickCustomLogo();
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
    public void tearDownClass() {
        driver.quit();
    }
}