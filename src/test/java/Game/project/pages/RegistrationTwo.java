package Game.project.pages;

import Game.framework.Browser;
import Game.framework.elements.ButtonElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.Random;

public class RegistrationTwo {
    private Browser browser = Browser.BROWSER;
    private ButtonElement clear = new ButtonElement(By.xpath("//label[@for='interest_unselectall']"), "clear");
    private ButtonElement choose = new ButtonElement(By.xpath("//div[@class='avatar-and-interests__interests-list__item']"), "choose");
    private ButtonElement clickInterest = new ButtonElement(By.xpath("//span[@class='checkbox__box']"), "clickInterst");

    private ButtonElement upload = new ButtonElement(By.xpath("//a[@class='avatar-and-interests__upload-button']"), "upload");
    private ButtonElement goToThird = new ButtonElement(By.xpath("//button[@name='button']"), "goToThird");


    public void chooseInterest() {
        clear.click();
        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            int number = random.nextInt(21);
            WebElement choos = choose.findElements().get(number);
            WebElement element = clickInterest.findElements().get(number);
            element.click();
            if (choos.getText().equals("Select all")) {
                if (choos.getText().equals("Unselect all")) {
                    --i;
                } else if (choos.getText().equals("Unselect all")) {
                    --i;
                }
            } else {
                choose.findElements().get(number).click();
            }
        }
    }



        public void uploadImage() throws IOException, InterruptedException, AWTException {

            upload.click();

            Thread.sleep(5000);

            Robot robot = new Robot();  // Robot class throws AWT Exception
            Thread.sleep(1800); // Thread.sleep throws InterruptedException
            robot.keyPress(KeyEvent.VK_DOWN);  // press arrow down key of keyboard to navigate and select Save radio button

            Thread.sleep(1800);  // sleep has only been used to showcase each event separately
            robot.keyPress(KeyEvent.VK_TAB);
            Thread.sleep(1800);
            robot.keyPress(KeyEvent.VK_TAB);
            Thread.sleep(1800);
            robot.keyPress(KeyEvent.VK_TAB);
            Thread.sleep(1800);
            robot.keyPress(KeyEvent.VK_ENTER);
            // press enter key of keyboard to perform above selected action
        }


    public void gotoThird() {

        for (int i = 0; i < goToThird.findElements().size(); i++) {
            if (goToThird.findElements().get(i).getText().equals("Next")) goToThird.findElements().get(i).click();
            break;
        }

    }
}
