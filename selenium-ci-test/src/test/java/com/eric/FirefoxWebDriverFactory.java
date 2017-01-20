package com.eric;

import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

import java.io.File;

/**
 *
 */
public class FirefoxWebDriverFactory {
    static FirefoxDriver createFirefoxDriver () {
        String path = "\\target\\FirefoxPortable32\\FirefoxPortable.exe";
        String userDir = System.getProperty("user.dir");
        File file = new File(userDir + path);
        FirefoxBinary firefoxBinary = new FirefoxBinary(file);

        return new FirefoxDriver(firefoxBinary, new FirefoxProfile());
    }
}
