package com.pflb.learning.test;

import com.pflb.learning.pages.AbstractPage;
import com.pflb.learning.pages.YandexMainPage;
import com.pflb.learning.utils.DriverManager;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class YandexNotebooksPageTest {

    /*WebDriver driver;

    @BeforeClass
    public void setUp() {
        this.driver = DriverManager.getDriver();
    }*/

    @Test
    //@DisplayName("Go to Notebooks")
    //@Severity(SeverityLevel.NORMAL)
    public void successGoToMarket(){
        //AbstractPage pageNotebooks = new YandexMainPage(driver);
        AbstractPage pageNotebooks = new YandexMainPage(DriverManager.getDriver());
        pageNotebooks.maximize()
                .load("http://yandex.ru/")
                .goByLinkText("Маркет")
                .goByLinkText("Компьютеры")
                .goByLinkText("Ноутбуки")
                .setPriceByXpath("glf-priceto-var", "30000")
                .clickButtonByXpath(
                        "//div[@class='n-filter-panel-aside__apply']//button[.='Применить']", 10);

    }

    @AfterClass //Аннотация Junit. Говорит, что метод должен запускаться каждый раз после всех тестов
    public static void tearDown() {
        DriverManager.getDriver().quit();
    }
}
