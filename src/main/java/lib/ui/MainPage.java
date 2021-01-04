package lib.ui;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class MainPage extends BasePage{
    public MainPage(AppiumDriver driver) {
        super(driver);
    }

    private static final String
        DROWER = "//*[@content-desc='Open navigation drawer']",
        ADD_CONTACT_BUTTON = "com.shazzle.nativechat:id/action_add_contact",
        SEARCH_BUTTON = "com.shazzle.nativechat:id/action_search",
        WRITE_MSG_BUTTON = "com.shazzle.nativechat:id/fab";

    public void isOpen() {
        this.waitForElementPresent(By.xpath(DROWER),"Drower is not present");
    }

    public void addContactIsPresent() {
        this.waitForElementPresent(By.id(ADD_CONTACT_BUTTON), "Add contact button is not present");
    }

    public void searchButtonIsPresent() {
        waitForElementPresent(By.id(SEARCH_BUTTON), "SearchButton is not present");
    }

    public void writeMassageButtonIsPresent() {
        waitForElementPresent(By.id(WRITE_MSG_BUTTON), "Write new msg button not found");
    }
}
