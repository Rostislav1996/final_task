package Game.project.pages;

import Game.framework.Browser;
import Game.framework.elements.ButtonElement;
import Game.utils.ConfigFileReader;
import org.openqa.selenium.By;


public class WelcomePage extends BasePage{
    private static ConfigFileReader config = ConfigFileReader.configFileReader;
    private Browser browser = Browser.BROWSER;
    private ButtonElement clickToButtonHere = new ButtonElement(By.xpath("//a[@class='start__link']"), "clickToButtonHERE");

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

