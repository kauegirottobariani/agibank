package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Keys;

public class SearchPage {
    private WebDriver driver;

    public SearchPage(WebDriver driver) {
        this.driver = driver;
    }

    // Homepage elements

    // Interacting with page elements
    public String getTitleTextElementArticle(String query) {
        WebElement element = driver.findElement(By.xpath("//div[@class='post-content ast-width-md-6']"));
        return element.getText();
    }

    public String getTitleEmptyArticle() {
        WebElement element = driver.findElement(By.xpath("//div[@class='page-content']/p"));
        return element.getText();
    }
}