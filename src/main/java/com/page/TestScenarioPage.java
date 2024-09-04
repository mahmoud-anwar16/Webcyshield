package com.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestScenarioPage extends BasePage{
    public TestScenarioPage(WebDriver driver) {
        super(driver);
    }
    private final By registerForm=By.xpath("//a[@href='https://testing.todorvachev.com/register-form/']\n");

    public void clickOnRegisterForm(){
        waitForVisibility(registerForm);
        clickElement(registerForm);
    }
}
