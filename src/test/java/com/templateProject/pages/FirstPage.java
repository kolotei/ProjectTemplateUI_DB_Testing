package com.templateProject.pages;

import com.templateProject.utility.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class FirstPage extends BasePage {

    @FindBy(xpath = "//*[@id=\"layout--sidecar\"]/div/div/div/div/p/a")
    public WebElement emailBtnƒ;

    @FindBy(xpath = "//input[@id='urlInput']")
    public WebElement pageUrl;

    @FindBy(xpath = "//textarea[@name='feedback']")
    public WebElement yourMessage;

    @FindBy(xpath = "//input[@id='firstNameInput']")
    public WebElement firstName;

    @FindBy(xpath = "//input[@id='lastNameInput']")
    public WebElement lastName;
    @FindBy (xpath ="//input[@id=\'emailInput\']")
    public WebElement email;

    @FindBy(xpath = "//input[@id='phoneInput']")
    public WebElement phone;

    @FindBy(xpath = "//div[@class='recaptcha-checkbox-border']")
    public WebElement checkBox;

    @FindBy(xpath = "//span[@class='mat-button-wrapper']")
    public WebElement sendBtn;





}
