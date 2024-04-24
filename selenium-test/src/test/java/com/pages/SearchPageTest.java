package com.pages;

import org.testng.annotations.AfterMethod;
import utils.SetupBrowser;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.Assert;
import utils.ReturnHome;

import java.io.IOException;

public class SearchPageTest {
    private WebDriver driver;
    private HomePage homePage;
    private SearchPage searchPage;
    private ReturnHome returnHome;

    @BeforeClass
    public void setUp() throws IOException {
        driver = SetupBrowser.setUp();
        homePage = new HomePage(driver);
        searchPage = new SearchPage(driver);
        returnHome = new ReturnHome(driver);

    }

    @AfterMethod
    public void tearDownMethod() {
        returnHome.clickCustomLogo();
    }

    @Test
    public void testTitleSearchArticle() throws InterruptedException {
        String insertTextSearch = "Fitch Ratings eleva o Rating do Agibank para A-(bra)";

        homePage.clickSearchButton();
        Thread.sleep(2000);
        homePage.textSearchArticle(insertTextSearch);
        Thread.sleep(2000);
        homePage.pressEnterSearchInput();
        Thread.sleep(2000);

        String getTitleTextSearch = searchPage.getTitleTextElementArticle(insertTextSearch);

        String[] lines = getTitleTextSearch.split("\n");

        boolean foundLine = false;
        for (String line : lines) {
            String cleanedLine = line.trim();
            String cleanedInsertTextSearch = insertTextSearch.trim();

            if (cleanedLine.equals(cleanedInsertTextSearch)) {
                foundLine = true;
                break;
            }
        }

        Assert.assertTrue(foundLine, "A linha '" + getTitleTextSearch + "' não foi encontrada.");

    }

    @Test
    public void testEmptySearchArticle() throws InterruptedException {
        String insertTextSearch = "aaaa bbb ccc ddd";
        String textEmptyArticle = "Lamentamos, mas nada foi encontrado para sua pesquisa, tente novamente com outras palavras.";

        homePage.clickSearchButton();
        Thread.sleep(2000);
        homePage.textSearchArticle(insertTextSearch);
        Thread.sleep(2000);
        homePage.pressEnterSearchInput();
        Thread.sleep(2000);

        String getTitleTextSearch = searchPage.getTitleEmptyArticle();

        Assert.assertEquals(textEmptyArticle.trim(), getTitleTextSearch.trim());
    }

    @AfterClass
    public void tearDownClass() {
        driver.quit();
    }
}