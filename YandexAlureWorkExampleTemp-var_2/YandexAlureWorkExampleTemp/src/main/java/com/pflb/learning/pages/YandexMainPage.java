package com.pflb.learning.pages;

import com.pflb.learning.utils.DriverManager;
import org.junit.Test;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.yandex.qatools.allure.annotations.Step;

import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

/**
 * Класс описывает главную страницу Яндекс
 */
public class YandexMainPage extends AbstractPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private static final String url = "https://yandex.ru/";

    @FindBy(xpath = "html/body/div[1]/div[3]/div[2]/div[2]/div/div[2]/div/div[1]/div/a[5]") //найти по xpath
    public WebElement market;


    public YandexMainPage() {
        super();
        //driver = DriverManager.getDriver();
        //wait = new WebDriverWait(driver, 10);
        //driver.navigate().to(url);
        //DriverManager.maximize();
    }

    @Step
    public YandexMarketPage goToMarket (){
        market.click();
        return new YandexMarketPage();
    }

}