package tests;

import com.codeborne.selenide.Condition;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static pages.LogOutPage.AVATAR_BUTTON;
import static pages.LoginPage.SIGN_BUTTON;

public class LogOutTest extends BaseTest{

    @Test
    public void LogOutTest(){
        loginPage.openPage();
        loginPage.login(username, password);
        $(SIGN_BUTTON).click();
        logOutPage.loggingOut();
        $(AVATAR_BUTTON).shouldNot(visible);
    }
}
