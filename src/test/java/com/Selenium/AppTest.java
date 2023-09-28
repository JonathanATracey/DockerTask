package com.Selenium;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AppTest {

    @Test
    public void testLogin()
    {
       SeleniumApp myapp = new SeleniumApp();
       Assert.assertEquals(0,myapp.userLogin("abc","abc123"));
    }

    @Test
    public void testLogin2()
    {
        SeleniumApp myapp = new SeleniumApp();
        Assert.assertEquals(1,myapp.userLogin("abc","abc@123"));
    }

}
