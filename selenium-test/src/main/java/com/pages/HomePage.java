package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Keys;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    // Homepage elements
    private By searchIcon = By.className("ast-search-icon");
    private By searchInput = By.id("search-field");

    // Interacting with page elements
    public void clickSearchButton() {
        driver.findElement(searchIcon).click();
    }

    public boolean isSearchInputPresent() {
        return driver.findElements(searchInput).size() > 0;
    }

    public void textSearchArticle(String query) {
        WebElement textSearchBox = driver.findElement(searchInput);
        textSearchBox.sendKeys(query);
    }

    public void pressEnterSearchInput() {
        WebElement enterSearchBox = driver.findElement(searchInput);
        enterSearchBox.sendKeys(Keys.ENTER);
    }

    public String getPageTitle() {
        return driver.getTitle();
    }
}