    package com.test;

    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.chrome.ChromeDriver;
    import org.openqa.selenium.remote.DesiredCapabilities;
    import org.openqa.selenium.remote.RemoteWebDriver;
    import org.testng.annotations.*;

    import java.net.MalformedURLException;
    import java.net.URL;

    public class BaseTest {
        private ThreadLocal<WebDriver> driver = new ThreadLocal<>();
        private String baseURL = "https://testing.todorvachev.com";

        @BeforeMethod
        @Parameters({"browser"})
        public void setup(@Optional("chrome") String browser) throws MalformedURLException {

            DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

            desiredCapabilities.setBrowserName(browser);
            driver.set(new RemoteWebDriver(new URL("http://192.168.1.103:4444"), desiredCapabilities));


            getDriver().manage().window().maximize();
            getDriver().navigate().to(baseURL);
        }

        public WebDriver getDriver() {
            return driver.get();
        }

        @AfterMethod
        public void tearDown() {
            getDriver().quit();
            driver.remove();
        }


    }