package com.example.locators.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement; // Import WebElement from Selenium WebDriver


public class LoginPageLocators {
    public WebElement userName;
    public WebElement password;
    public WebElement titleText;
    public WebElement missingUsernameErrorMessage;
    public WebElement missingPasswordErrorMessage;
    public WebElement login;
    public WebElement errorMessage;
    public WebElement linkedInIcon;
    public WebElement faceBookIcon;
    public WebElement ForgotYourPasswordLink;

    public LoginPageLocators(WebDriver driver) {
        userName = driver.findElement(By.name("username"));
        password = driver.findElement(By.name("password"));
        titleText = driver.findElement(By.id("logInPanelHeading"));
        missingUsernameErrorMessage = driver.findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/span"));
        missingPasswordErrorMessage = driver.findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/span"));
        login = driver.findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
        errorMessage = driver.findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/p"));
        linkedInIcon = driver.findElement(By.xpath("//*[@href='https://www.linkedin.com/company/orangehrm/mycompany/']"));
        faceBookIcon = driver.findElement(By.xpath("//*[@href='https://www.facebook.com/OrangeHRM/mycompany']"));
        ForgotYourPasswordLink = driver.findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[4]/p"));
    }
}
