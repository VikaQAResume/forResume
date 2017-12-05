package com.pflb.learning.pages;

import com.pflb.learning.utils.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.pflb.learning.utils.DriverManager.getDriver;

/**
 * Абстрактный класс, родитель всех Page'ей
 * Сделан для того, чтобы все Page'и наследовали конструктор и поле с драйвером
 */
abstract class AbstractPage {
    static final String url = "https://yandex.ru/";

    /**
     * Дефолтный конструктор. Тут сразу получаем драйвер для взаимодействия с ним
     * А так же инициализируем элементы на Page'ах, которые были заданы с помощью аннотаций @FindBy
     */
    AbstractPage() {
        new WebDriverWait(DriverManager.getDriver(), 10);
        DriverManager.getDriver().navigate().to(url);
        DriverManager.maximize();
        PageFactory.initElements(getDriver(), this);
    }


}