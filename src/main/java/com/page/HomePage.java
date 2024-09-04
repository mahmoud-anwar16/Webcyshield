package com.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{
    public HomePage(WebDriver driver) {
        super(driver);
    }
    private final By testScenario=By.id("menu-item-58");


    public void openTestScenario(){
        clickElement(testScenario);
    }
}
