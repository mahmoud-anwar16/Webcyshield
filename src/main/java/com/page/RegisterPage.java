package com.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage extends BasePage{
    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    private final By userId=By.name("userid");
    private final By password=By.name("passid");
    private final By name=By.name("username");
    private final By address= By.name("address");
    private final By country=By.name("country");
    private final By zipCode=By.name("zip");
    private final By email=By.name("email");
    private final By registerBtn= By.name("submit");


    public void enterUserId(int id){
        waitForVisibility(userId);
        isDisplayed(userId);
        sendKeys(userId, String.valueOf(id));
    }
    public void setPassword(int pass){
        isDisplayed(password);
        sendKeys(password, String.valueOf(pass));
    }
    public void setName(String n){
        isDisplayed(name);
        sendKeys(name,n);
    }
    public void setAddress(String location){
        isDisplayed(address);
        sendKeys(address,location);
    }
    public void selectCountry(){
       isDisplayed(country);
       selectByIndex(country,1);
    }
    public void setZipCode(int zip){
        isDisplayed(zipCode);
        sendKeys(zipCode, String.valueOf(zip));
    }
    public void setEmail(String mail){
        isDisplayed(email);
        sendKeys(email,mail);
    }
public void clickRegister(){
        isDisplayed(registerBtn);
        clickElement(registerBtn);
}
public String getErrorMessage(){
     return getAlertText();
}







}
