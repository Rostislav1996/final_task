package Game.project.test;

import Game.framework.elements.ButtonElement;
import org.openqa.selenium.By;

public class CaseThree extends BaseTest {
    ButtonElement cookie = new ButtonElement(By.xpath("//button[@class='button button--solid button--transparent']"),"cookie");

    public void clickCookie(){

        cookie.click();
    }
}

