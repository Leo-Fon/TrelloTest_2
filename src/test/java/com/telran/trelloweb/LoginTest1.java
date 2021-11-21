package com.telran.trelloweb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LoginTest1 extends TestBase {
    @AfterMethod
    public void preCondition () {
       logOut();
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

       // Assert.assertTrue(wd.findElements(By.cssSelector("_2W6d4IdyPwMlNi")).size() > 0);


    }

}
