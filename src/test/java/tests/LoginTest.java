package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static pages.LoginPage.*;

public class LoginTest extends BaseTest {

    @Test
    public void loginTest() {
        loginPage.openPage();
        loginPage.login(username, password);
        $(SIGN_BUTTON).click();
        $(AVATAR).shouldBe(visible);
    }

    @Test
    public void loginWIthWrongUsernameTest(){
        loginPage.openPage();
        loginPage.login("lingualeo", password);
        $(SIGN_BUTTON).shouldNot(visible);
    }

    @Test
    public void loginWrongEmailTest(){
        loginPage.openPage();
        loginPage.login("lingualeo@gmail.com", password);
        $(SIGN_BUTTON).click();
        $(AVATAR).shouldNot(visible);
    }

    @Test
    public void loginInputDigitsIntoEmailFieldTest() {
        loginPage.openPage();
        loginPage.login("12233456", password);
        $(SIGN_BUTTON).shouldNot(visible);
    }

    @Test
    public void loginPasswordIntoEmailFieldTest(){
        loginPage.openPage();
        loginPage.login(password, password);
        $(SIGN_BUTTON).shouldNot(visible);
    }

    @Test
    public void loginWithEmptyUsernameFieldTest(){
        loginPage.openPage();
        loginPage.login("", password);
        $(SIGN_BUTTON).shouldNot(visible);
    }

    @Test
    public void loginWithIncorrectPasswordTest(){
        loginPage.openPage();
        loginPage.login(username, "1234qweasd");
        $(SIGN_BUTTON).click();
        $(ERROR_MESSAGE).shouldBe(visible);
    }

    @Test
    public void loginUsernameIntoPasswordFieldTest(){
        loginPage.openPage();
        loginPage.login(username, username);
        $(SIGN_BUTTON).click();
        $(AVATAR).shouldNot(visible);
    }

    @Test
    public void loginWithEmptyPasswordFieldTest(){
        loginPage.openPage();
        loginPage.login(username, "");
        $(SIGN_BUTTON).shouldNot(visible);
    }
}

