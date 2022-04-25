package Game.project.test;

import Game.project.pages.RegistrationOne;
import Game.project.pages.RegistrationTwo;
import Game.project.pages.WelcomePage;
import Game.utils.ConfigFileReader;
import Game.utils.Logger;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.IOException;

public class MyTest extends BaseTest {

    private ConfigFileReader config = ConfigFileReader.configFileReader;

    @Test
    public void firstTest() throws IOException, InterruptedException, AWTException {

        RegistrationTwo registrationTwo = new RegistrationTwo();
        WelcomePage welcomePage = new WelcomePage();

        welcomePage.open();
        welcomePage.clickHere();

        RegistrationOne registrationOne = welcomePage.openRegistrationOne();

        registrationOne.inputPassword();
        registrationOne.inputEmail();
        registrationOne.inputDomain();
        registrationOne.chooseDomain();
        registrationOne.acceptTerms();
        registrationOne.goTosecond();

        registrationTwo.chooseInterest();
        registrationTwo.uploadImage();
        registrationTwo.gotoThird();
    }
}



    /*public static void main(String[] args) {
        Robot robot = new Robot();
        robot.keyPress('C');
        robot.keyPress(':');
        robot.keyRelease('\\');
        robot.keyPress('U');
        robot.keyRelease('s');
        robot.keyPress('e');
        robot.keyRelease('r');
        robot.keyRelease('s');

        robot.delay(1000);
    }

    }
*/






