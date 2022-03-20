package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static pages.LoginPage.AVATAR;
import static pages.LoginPage.ERROR_MESSAGE;

public class LoginTest extends BaseTest {

    @Test
    public void loginTest() {
        loginPage.openPage();
        loginPage.login(username, password);
        $(AVATAR).shouldBe(visible);
    }

    @Test
    public void loginWIthWrongUsernameTest(){
        loginPage.openPage();
        loginPage.login("lingualeo", password);
        $(AVATAR).shouldNot(visible);
    }

    @Test
    public void loginWrongEmailTest(){
        loginPage.openPage();
        loginPage.login("lingualeo@gmail.com", password);
        $(AVATAR).shouldNot(visible);
    }

    @Test
    public void loginInputDigitsIntoEmailFieldTest() {
        loginPage.openPage();
        loginPage.login("12233456", password);
        $(AVATAR).shouldNot(visible);
    }

    @Test
    public void loginPasswordIntoEmailFieldTest(){
        loginPage.openPage();
        loginPage.login(password, password);
        $(AVATAR).shouldNot(visible);
    }

    @Test
    public void loginWithEmptyUsernameFieldTest(){
        loginPage.openPage();
        loginPage.login("", password);
        $(AVATAR).shouldNot(visible);
    }

    @Test
    public void loginWithIncorrectPasswordTest(){
        loginPage.openPage();
        loginPage.login(username, "1234qweasd");
        $(ERROR_MESSAGE).shouldBe(visible);
    }

    @Test
    public void loginUsernameIntoPasswordFieldTest(){
        loginPage.openPage();
        loginPage.login(username, username);
        $(AVATAR).shouldNot(visible);
    }

    @Test
    public void loginEmailIntoPasswordFieldTest(){
        loginPage.openPage();
        loginPage.login(username, "lingualeo@gmail.com");
        $(AVATAR).shouldNot(visible);
    }

    @Test
    public void loginWithEmptyPasswordFieldTest(){
        loginPage.openPage();
        loginPage.login(username, "");
        $(AVATAR).shouldNot(visible);
    }
}

