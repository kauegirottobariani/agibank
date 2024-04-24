package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ReturnHome {

    private WebDriver driver;

    public ReturnHome(WebDriver driver) {
        this.driver = driver;
    }

    public void clickCustomLogo() {
        driver.findElement(By.className("custom-logo")).click();
    }
}
