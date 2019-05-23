package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    public static final String XPATH_SELECT_DAY = "//span[@data-type = \"selectors\"]/span/select[@name = \"birthday_day\" and @id = \"day\"]";
    public static final String XPPATH_SELECT_MONTH = "//span[@data-type = \"selectors\"]/span/select[@name = \"birthday_month\" and @id = \"month\"]";
    public static final String XPPATH_SELECT_YEAR = "//span[@data-type = \"selectors\"]/span/select[@name = \"birthday_year\" and @id = \"year\"]";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");

        while (!driver.findElement(By.xpath(XPATH_SELECT_DAY)).isDisplayed());

        WebElement selectComboDay = driver.findElement(By.xpath(XPATH_SELECT_DAY));
        Select selectDay = new Select(selectComboDay);
        selectDay.selectByValue("22");

        WebElement selectComboMonth = driver.findElement(By.xpath(XPPATH_SELECT_MONTH));
        Select selectMonth = new Select(selectComboMonth);
        selectMonth.selectByIndex(2);

        WebElement selectComboYear = driver.findElement(By.xpath(XPPATH_SELECT_YEAR));
        Select selectYear = new Select(selectComboYear);
        selectYear.selectByValue("1999");
    }
}
