package Game.project.pages;

import Game.framework.Browser;
import Game.framework.elements.Write;
import Game.utils.ConfigFileReader;
import org.openqa.selenium.By;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class RegistrationOne {
    private static ConfigFileReader config = ConfigFileReader.configFileReader;
    private Write passwordIn = new Write(By.xpath("//input[@placeholder='Choose Password']"), "passwordIn");
    private Write emailIn = new Write(By.xpath("//input[@placeholder='Your email']"), "emailIn");
    private Write domainIn = new Write(By.xpath("//input[@placeholder='Domain']"), "domainIn");
    private Write clickToSecond = new Write(By.xpath("//a[@class='button--secondary']"), "clickToSecond");
    private Write domainClick = new Write(By.xpath("//div[@class='dropdown__field']"), "domainClick");
    private Write domainDrop = new Write(By.xpath("//div[@class='dropdown__list-item']"), "domainDrop");
    private Write clickAccept = new Write(By.xpath("//span[@class='checkbox']"), "clickAccept");
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

