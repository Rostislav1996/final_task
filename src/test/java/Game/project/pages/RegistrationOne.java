package Game.project.pages;

import Game.framework.browser.Browser;
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
    public ButtonElement numberOfPage = new ButtonElement(By.xpath("//div[@class='page-indicator']"), "numberOfPage");
    public ButtonElement cookie = new ButtonElement(By.xpath("//button[@class='button button--solid button--transparent']"), "coockie");
    public ButtonElement timer = new ButtonElement(By.xpath("//div[@class='timer timer--white timer--center']"), "timer");
    private ButtonElement helpForm = new ButtonElement(By.xpath("//button[@class='button button--solid button--blue help-form__send-to-bottom-button']"), "helpForm");
    public ButtonElement hiddenForm = new ButtonElement(By.xpath("//div[@class='help-form is-hidden']"), "hiddenForm");


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
    public String checkPageFirst(ButtonElement buttonElement) {

        return buttonElement.getText();
    }

    public void acceptTerms() {
        clickAccept.click();
    }

    public void goTosecond() {
        clickToSecond.click();
    }
    public void clickCookie() {
        cookie.click();
    }

    public void clickHelpFOrm() {
        helpForm.click();
    }
}