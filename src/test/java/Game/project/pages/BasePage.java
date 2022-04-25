package Game.project.pages;

import Game.framework.Browser;

public class BasePage {
    protected Browser browser;

    public BasePage() {

        this.browser= Browser.BROWSER;
    }
}
