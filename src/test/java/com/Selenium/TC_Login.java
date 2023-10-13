package com.Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class TC_Login extends GridTest{

    By username = By.name("username");
    By password = By.name("password");
    By login = By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button");

    @Test
    public void login_test() throws InterruptedException {

        getDriver().findElement(username).sendKeys("Admin");
        getDriver().findElement(password).sendKeys("admin123");

        getDriver().findElement(login).click();

        Thread.sleep(20000);

        getDriver().getTitle();

        Assert.assertEquals(getDriver().getTitle(),"OrangeHRM");
    }
}
