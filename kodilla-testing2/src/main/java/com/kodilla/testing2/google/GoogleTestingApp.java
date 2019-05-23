package com.kodilla.testing2.google;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleTestingApp {
    public static final String SEARCHEDFIELD = "gLFyf";

    public static void main(String[] args) {

        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.FIREFOX);
        driver.get("https://www.google.com");

        WebElement searchField = driver.findElement(By.className(SEARCHEDFIELD));
        searchField.sendKeys("Kodilla");
        searchField.submit();

    }
}
