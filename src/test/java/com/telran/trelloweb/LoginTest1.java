package com.telran.trelloweb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LoginTest1 {
    WebDriver wd;

    @BeforeClass
    public void setUp() {
        wd = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver","/Users/leon/Webinars/TrelloTest_2/chromedriver");
        wd.manage().window().maximize();  // открыть окно на максимальном размере
        wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  // после открытия браузера ждем 10 секунд
        wd.navigate().to("https://trello.com/");
    }
    @Test
    public void testLogin() throws InterruptedException {
        click(By.cssSelector("[href='/login']"));
        type(By.cssSelector("#user"), "leo.fil87@mail.com");
        Thread.sleep(2000);
        click(By.cssSelector("#login"));
        type(By.name("password"),"TelRan1987");
        click(By.id("login-submit"));
        Thread.sleep(15000);

        


    }

    public void type(By locator2, String text) {
        click(locator2);
        wd.findElement(locator2).clear();
        wd.findElement(locator2).sendKeys(text);
    }

    public void click(By locator) {
        wd.findElement(locator).click();
    }

    @AfterClass
    public void tearDown() {
        wd.quit(); // закрыть браузер
        //wd.close(); // закрыть приложение

    }
}
