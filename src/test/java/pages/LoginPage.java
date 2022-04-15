package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginPage extends BasePage {

    public static final SelenideElement CHANGE_LANGUAGE = $(By.xpath("//span[@class='ll-locale-selector2__button__arrow ll-locale-selector2__button__arrow__m-down']"));
    public static final SelenideElement CHOOSE_ENG = $(By.xpath("//a[@href='/en']/span/div/div"));
    public static final SelenideElement ACCOUNT_ALREADY_EXIST = $(By.xpath("//button[@class='ll-leokit__button ll-leokit__button__m-color-white ll-leokit__button__m-size-default ll-ModalAuthAlt__switch']/span/span"));
    public static final SelenideElement LOGIN_BUTTON = $(By.xpath("//div[@class='ll-leokit__site-menu__auth-wrapper']/p/span"));
    public static final SelenideElement USERNAME_INPUT = $(By.xpath("//div/form/input[@placeholder='E-mail']"));
    public static final SelenideElement PASSWORD_INPUT = $(By.xpath("//div/form/input[@placeholder='Password']"));
    public static final SelenideElement SIGN_BUTTON = $(By.xpath("//button[@class='ll-leokit__button ll-leokit__button__m-color-white ll-leokit__button__m-size-default ll-ModalAuthAlt__submit']/span[contains(.,'Sign in')]"));
    public static final SelenideElement ERROR_MESSAGE = $(By.xpath("//div[@class='ll-ModalAuthAlt__error']/span"));
    public static final SelenideElement AVATAR = $(By.xpath("//div/a/div[@class='ll-leokit__site-menu__user-menu-toggler']"));


    @Override
    public boolean isPageOpened() {
        return isExist(LOGIN_BUTTON);
    }

    public void openPage() {
        open("https://lingualeo.com/ru");
    }

    public void login(String username, String password) {
        $(CHANGE_LANGUAGE).click();
        $(CHOOSE_ENG).click();
        $(LOGIN_BUTTON).click();
        $(ACCOUNT_ALREADY_EXIST).click();
        $(USERNAME_INPUT).setValue(username);
        $(PASSWORD_INPUT).setValue(password);
    }
}
