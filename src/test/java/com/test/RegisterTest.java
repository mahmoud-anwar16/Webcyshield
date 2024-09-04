package com.test;

import com.page.*;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.IOException;

public class RegisterTest extends BaseTest
{
    @Parameters("browser")
    @Test(dataProvider = "validTest" ,dataProviderClass = FileReader.class )
    public void validRegister(int id , int pass, String n, String location,int zip,String mail){

        RegisterPage register=new RegisterPage(getDriver());
        HomePage homePage=new HomePage(getDriver());
        TestScenarioPage scenarioPage=new TestScenarioPage(getDriver());
        homePage.openTestScenario();
        scenarioPage.clickOnRegisterForm();
        register.enterUserId(id);
        register.setPassword(pass);
        register.setName(n);
        register.setAddress(location);
        register.selectCountry();
        register.setZipCode(zip);
        register.setEmail(mail);
        register.clickRegister();
    }
    @Parameters("browser")
    @Test(dataProvider = "invalidTest" ,dataProviderClass = FileReader.class )
    public void invalidRegister(int id , int pass, String n, String location,int zip,String mail) throws IOException {
        RegisterPage register=new RegisterPage(getDriver());
        HomePage homePage=new HomePage(getDriver());
        TestScenarioPage scenarioPage=new TestScenarioPage(getDriver());
        homePage.openTestScenario();
        scenarioPage.clickOnRegisterForm();
        register.enterUserId(id);
        register.setPassword(pass);
        register.setName(n);
        register.setAddress(location);
        register.selectCountry();
        register.setZipCode(zip);
        register.setEmail(mail);
        register.clickRegister();
        Assert.assertEquals(register.getErrorMessage(), new Json().getValue("src/main/resources/data.json", "userIDErrMessage"));

    }
}
