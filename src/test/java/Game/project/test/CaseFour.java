package Game.project.test;

import Game.framework.elements.ButtonElement;
import org.openqa.selenium.By;

public class CaseFour extends BaseTest {
    ButtonElement timer = new ButtonElement(By.xpath("//div[@class='timer timer--white timer--center']"),"timer");

}
