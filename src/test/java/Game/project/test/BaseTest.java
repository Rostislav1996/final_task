package Game.project.test;

import Game.framework.browser.Browser;
import Game.utils.ConfigFileReader;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    private ConfigFileReader config = ConfigFileReader.configFileReader;
    @BeforeMethod
    public void before(){
        System.setProperty(config.getDriverAdapter(), config. getDriverPath());
        WebDriver driver= Browser.BROWSER.getDriver();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }


















}
