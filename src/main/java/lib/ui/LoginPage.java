package lib.ui;

import io.appium.java_client.AppiumDriver;
import org.junit.Assert;
import org.openqa.selenium.By;

public class LoginPage extends BasePage{
    public LoginPage(AppiumDriver driver) {
        super(driver);
    }

    private static final String
        SKIP_BUTTON = "com.shazzle.nativechat:id/skipButton",
        NEXT_BUTTON = "com.shazzle.nativechat:id/nextButton",
        COUNTRY_CODE_FIELD = "com.shazzle.nativechat:id/codeEditText",
        PHONE_NUM_FIELD = "com.shazzle.nativechat:id/phoneEditText",
        DONE_BUTTON = "com.shazzle.nativechat:id/action_done",
        MORE_OPTION_BUTTON = "//*[@content-desc='More options']",
        CODE_FIELD = "//*[@text='Code']",
        OK_BUTTON = "com.shazzle.nativechat:id/action_done",
        NAME_FIELD = "com.shazzle.nativechat:id/nameTextView",
        EMAIL_FIELD = "com.shazzle.nativechat:id/emailTextView",
        ACCESS_TO_CONTACT_Y_BUTTON = "android:id/button1",
        ALLOW_BUTTON = "com.android.packageinstaller:id/permission_allow_button";


    public void logIn(String phone_num, String name, String email) {
        String codeAuthorization = "000000";
        this.waitForElementAndClick(By.id(SKIP_BUTTON), "Skip button not find", 5);
        this.waitForElementPresent(By.id(COUNTRY_CODE_FIELD), "Element country code not visible");
        this.waitForElementAndClear(By.id(COUNTRY_CODE_FIELD), "Cannot clear 'COuntry code field'");
        this.waitForElementAndSendKeys(By.id(COUNTRY_CODE_FIELD), "+998", "Cannot find COUNTRY_CODE_FIELD");
        this.waitForElementAndSendKeys(By.id(PHONE_NUM_FIELD), "931013968", "element 'Phone field' not found");
        this.waitForElementAndClick(By.id(DONE_BUTTON), "Done button not find", 5);
        this.waitForElementAndSendKeys(By.xpath(CODE_FIELD), codeAuthorization, "Code field not found");
        this.waitForElementAndClick(By.id(OK_BUTTON), "Ok button not found", 10);
        this.waitForElementAndSendKeys(By.id(NAME_FIELD),name,"Name field not found");
        this.waitForElementAndSendKeys(By.id(EMAIL_FIELD), email, "Email field not found");
        this.waitForElementAndClick(By.id(OK_BUTTON), "Not found 'ok' button", 5);
        this.waitForElementAndClick(By.id(ACCESS_TO_CONTACT_Y_BUTTON), "Cannot find 'Access button'", 10);
        this.waitForElementAndClick(By.id(ALLOW_BUTTON), "Cannot find 'Allow button'", 10);
        this.waitForElementPresent(By.xpath("//*[@content-desc='Open navigation drawer']"), "Drower menu not found");
    }
}
