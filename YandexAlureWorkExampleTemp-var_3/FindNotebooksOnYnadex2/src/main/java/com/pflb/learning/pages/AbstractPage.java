package com.pflb.learning.pages;

import com.pflb.learning.utils.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AbstractPage {
    private WebDriver driver;

    public AbstractPage(WebDriver driver) {
        this.driver = driver;
    }

    public AbstractPage maximize() {
        driver.manage().window().maximize();
        return this;
    }

    public AbstractPage load(String url) {
        driver.get(url);
        return this;
    }

    public AbstractPage goByLinkText(String linkText) {
        List<WebElement> items = driver.findElements(By.linkText(linkText));
        for (WebElement item : items)
            try {
                item.click();
            } catch (Exception ex) { }
        return this;
    }

    public AbstractPage setPriceByXpath(String xpath, String price) {
        driver.findElement(By.id(xpath)).click();
        driver.findElement(By.id(xpath)).clear();
        driver.findElement(By.id(xpath)).sendKeys(price);
        return this;
    }

    public AbstractPage selectCheckById(String id) {
        driver.findElement(By.xpath("//label[@for='" + id + "']")).click();
        if (!driver.findElement(By.id(id)).isSelected())
            driver.findElement(By.id(id)).click();
        return this;
    }

    public AbstractPage clickButtonByXpath(String xpath, int wait) {
        driver.findElement(By.xpath(xpath)).click();
        if (wait > 0)
            Tools.sleep(wait);
        return this;
    }

    public AbstractPage enterSearchText(String text, String id) {
        driver.findElement(By.id(id)).sendKeys(text);
        return this;
    }

    public AbstractPage search(String name, String id, String xpath, int wait) {
        enterSearchText(name, id).
                clickButtonByXpath(xpath, wait);
        return this;
    }
}
