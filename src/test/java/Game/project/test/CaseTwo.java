package Game.project.test;

import Game.framework.elements.ButtonElement;
import org.openqa.selenium.By;

public class CaseTwo {
    private ButtonElement helpForm = new ButtonElement(By.xpath("//button[@class='button button--solid button--blue help-form__send-to-bottom-button']"), "helpForm");
    ButtonElement hiddenForm = new ButtonElement(By.xpath("//div[@class='help-form is-hidden']"), "hiddenForm");

    public void clickHelpFOrm() {
        helpForm.click();
    }
}


