package com.eric;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

/**
 *
 */
public class MyITCase {
   private WebDriver webDriver = FirefoxWebDriverFactory.createFirefoxDriver();

    @Test
    public void myTest () {
        webDriver.navigate().to("http://localhost:8080/webapp");
        Assert.assertEquals("Hello World!", webDriver.getTitle());
        webDriver.close();
    }
}
