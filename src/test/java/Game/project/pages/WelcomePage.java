package Game.project.pages;

import Game.framework.Browser;
import Game.framework.elements.Write;
import Game.utils.ConfigFileReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class WelcomePage extends BasePage{
    private static ConfigFileReader config = ConfigFileReader.configFileReader;
    private Browser browser = Browser.BROWSER;
    private Write clickToButtonHere = new Write(By.xpath("//a[@class='start__link']"), "clickToButtonHERE");

    public  void open() {
        browser.goTo(config.getApplicationUrl());
    }
    public void clickHere() {
        clickToButtonHere.click();
    }

    public RegistrationOne openRegistrationOne(){
        return new RegistrationOne();
    }



}

