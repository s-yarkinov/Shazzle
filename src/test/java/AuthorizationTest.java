import lib.ui.CoreTestCase;
import lib.ui.LoginPage;
import lib.ui.MainPage;
import org.junit.BeforeClass;
import org.junit.Test;

public class AuthorizationTest extends CoreTestCase {

    @BeforeClass
    public static void LogInToTheApp(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.logIn("1013968", "yarkinov", "s.yarkinov@ya.ru");
    }

    @Test
    public void testGoToSavedMessages() {
        MainPage mainPage = new MainPage(driver);
        mainPage.addContactIsPresent();
        mainPage.writeMassageButtonIsPresent();
        mainPage.searchButtonIsPresent();
    }
}
