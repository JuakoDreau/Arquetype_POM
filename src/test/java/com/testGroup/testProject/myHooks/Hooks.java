package com.testGroup.testProject.myHooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Hooks {
    public static WebDriver driver;

    @Before
    static void setupClass() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

    }
    @After
    void teardown() {
        driver.quit();
    }
}
