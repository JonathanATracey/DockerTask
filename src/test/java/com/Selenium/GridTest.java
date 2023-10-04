package com.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class GridTest {

    WebDriver driver;

    @BeforeTest
    @Parameters({"browser"})
    public void setup(@Optional("chrome")String browser) throws MalformedURLException
    {
        DesiredCapabilities cap = new DesiredCapabilities();
        URL url = new URL("http://localhost:4444");
        if(browser.equalsIgnoreCase("chrome"))
        {
            cap.setBrowserName("chrome");
            driver = new RemoteWebDriver(url,cap);
            driver.manage().window().maximize();

            driver.get("https://opensource-demo.orangehrmlive.com/");
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }
    }
}
