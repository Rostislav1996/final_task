package Game.project.pages;

import Game.framework.browser.Browser;
import Game.framework.elements.ButtonElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
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
            StringSelection ss = new StringSelection("C:\\Users\\Rostislav\\Pictures\\Camera Roll\\photo_2022-02-10_00-11-24.jpg");
            Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss,null);

            Robot robot = new Robot();
            robot.delay(250);
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            robot.delay(50);
        }


    public void gotoThird() {
        for (int i = 0; i < goToThird.findElements().size(); i++) {
            System.out.println(goToThird.findElements().get(i).getText());
            if (goToThird.findElements().get(i).getText().equals("Next")) goToThird.findElements().get(i).click();
            break;
        }

    }
}

