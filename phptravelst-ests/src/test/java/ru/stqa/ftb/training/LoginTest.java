package ru.stqa.ftb.training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LoginTest extends TestBase {
    ChromeDriver driver;

    @BeforeMethod
    public void setUp() throws Exception {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @Test
    public void newAddAddress

    @Test
    public void loginTest() {

        goToPage(driver);
        login(driver, "taffytrip@gmail.com", "GreenOlivia1@");
        submitLogin(driver);
        myAddressesButton(driver);
        addNewAddressButton(driver);
        inputStreet(driver, "59013 Lakeland Ave");
        inputCity(driver, "Lakeland");
        selectState(driver);
        inputZip(driver, "33803");
        selectCountry(driver);
        inputPhoneNumber(driver, "7279635478");
        inputAddressTitle(driver, "Friend's address");
        saveButton(driver);


    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    public void saveButton(WebDriver driver) {
        WebElement saveButton = driver.findElement(By.xpath("//span[contains(text(),'Save')]"));
        saveButton.click();
    }

    public void inputAddressTitle(WebDriver driver, String addresstitle) {
        WebElement addressTitle = driver.findElement(By.id("alias"));
        addressTitle.sendKeys(addresstitle);
    }

    public void inputPhoneNumber(WebDriver driver, String mobilephone) {
        WebElement phone = driver.findElement(By.id("phone_mobile"));
        phone.sendKeys(mobilephone);
    }

    public void selectCountry(WebDriver driver) {
        WebElement country = driver.findElement(By.xpath("//select[@id='id_country']"));
        Select countryDrDown = new Select(country);
        countryDrDown.selectByVisibleText("United States");
    }

    public void inputZip(WebDriver driver, String zipcode) {
        WebElement zip = driver.findElement(By.id("postcode"));
        zip.sendKeys(zipcode);
    }

    public void selectState(WebDriver driver) {
        WebElement state = driver.findElement(By.xpath("//select[@id='id_state']"));
        Select stateDrDown = new Select(state);
        stateDrDown.selectByVisibleText("Florida");
    }

    public void inputCity(WebDriver driver, String cityname) {
        WebElement city = driver.findElement(By.id("city"));
        city.sendKeys(cityname);
    }

    public void inputStreet(WebDriver driver, String street) {
        WebElement address = driver.findElement(By.id("address1"));
        address.sendKeys(street);
    }

    public void addNewAddressButton(WebDriver driver) {
        WebElement addNewAddress = driver.findElement(By.xpath("//span[contains(text(),'Add a new address')]"));
        addNewAddress.click();
    }

    public void myAddressesButton(WebDriver driver) {
        WebElement myAddresses = driver.findElement(By.xpath("//span[contains(text(),'My addresses')]"));
        myAddresses.click();
    }

}
