package Game.project.pages;

import Game.framework.Browser;
import Game.framework.elements.ButtonElement;
import Game.utils.ConfigFileReader;
import org.openqa.selenium.By;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class RegistrationOne {
    private static ConfigFileReader config = ConfigFileReader.configFileReader;
    private ButtonElement passwordIn = new ButtonElement(By.xpath("//input[@placeholder='Choose Password']"), "passwordIn");
    private ButtonElement emailIn = new ButtonElement(By.xpath("//input[@placeholder='Your email']"), "emailIn");
    private ButtonElement domainIn = new ButtonElement(By.xpath("//input[@placeholder='Domain']"), "domainIn");
    private ButtonElement clickToSecond = new ButtonElement(By.xpath("//a[@class='button--secondary']"), "clickToSecond");
    private ButtonElement domainClick = new ButtonElement(By.xpath("//div[@class='dropdown__field']"), "domainClick");
    private ButtonElement domainDrop = new ButtonElement(By.xpath("//div[@class='dropdown__list-item']"), "domainDrop");
    private ButtonElement clickAccept = new ButtonElement(By.xpath("//span[@class='checkbox']"), "clickAccept");
    private Browser browser = Browser.BROWSER;

    public void inputPassword() {
        passwordIn.clear();
        passwordIn.sendKeys(config.getPassword());
    }

    public void inputEmail() {
        emailIn.clear();
        emailIn.sendKeys(config.getEmailName());
    }

    public void inputDomain() {
        domainIn.clear();
        domainIn.sendKeys(config.getDomainName());
    }

    public void chooseDomain() {
        domainClick.click();
        Random random = new Random();
        for (int i = 0; i < 1; i++) {
            int item = random.nextInt(11);
            if(domainDrop.findElements().get(item).getText().equals("other")){
                i--;
                continue;
            }else domainDrop.findElements().get(item).click();
        }
        browser.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void acceptTerms() {
        clickAccept.click();
    }

    public void goTosecond() {
        clickToSecond.click();
    }
}

