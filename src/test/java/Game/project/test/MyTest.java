package Game.project.test;

import Game.project.pages.RegistrationOne;
import Game.project.pages.RegistrationTwo;
import Game.project.pages.WelcomePage;
import Game.utils.ConfigFileReader;
import Game.utils.Logger;
import org.testng.Assert;
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
    @Test
    public void secondTest() {


        WelcomePage welcomePage = new WelcomePage();
        welcomePage.open();
        welcomePage.clickHere();
        RegistrationOne registrationOne = welcomePage.openRegistrationOne();
        CaseTwo caseTwo = new CaseTwo();
        caseTwo.clickHelpFOrm();
        registrationOne.clickHelpFOrm();
        registrationOne.hiddenForm.findElements().size();



    }
    @Test
    public void thirdTest() {
        WelcomePage welcomePage = new WelcomePage();
        welcomePage.open();
        welcomePage.clickHere();
        RegistrationOne registrationOne = welcomePage.openRegistrationOne();
        CaseThree caseThree = new CaseThree();
        caseThree.cookie.findElements().size();
        registrationOne.clickCookie();
        registrationOne.cookie.findElements().size();

    }
    @Test
    public void forthTest() {
        WelcomePage welcomePage = new WelcomePage();
        welcomePage.open();
        welcomePage.clickHere();
        RegistrationOne registrationOne = welcomePage.openRegistrationOne();
        CaseFour caseFour = new CaseFour();
        Assert.assertEquals(caseFour.timer.getText(), "00:00:00");
    }
}





