package ru.stqa.ftb.phphtravels;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTest {

    @Test
    public void loginTest() {
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();

    String url = "https://www.google.com/";
    driver.get(url);

    driver.quit();

    }
}
