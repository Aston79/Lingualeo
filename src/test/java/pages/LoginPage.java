package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginPage extends BasePage {

    public static final SelenideElement LOGIN_BUTTON = $(By.xpath("//*[@id=\"app\"]/div/div[1]/div[1]/div[3]/div/div[1]/div[2]/div/div[3]/form/button[2]/span"));
    public static final SelenideElement USERNAME_INPUT = $(By.xpath("//*[@id='app']/div/div[1]/div[1]/div[3]/div/div[1]/div[2]/div/div[3]/form/input[1]"));
    public static final SelenideElement PASSWORD_INPUT = $(By.xpath("//*[@id=\"app\"]/div/div[1]/div[1]/div[3]/div/div[1]/div[2]/div/div[3]/form/input[2]"));
    public static final SelenideElement ACCOUNT_ALREADY_EXIST = $(By.xpath("//*[@id=\"app\"]/div/div[1]/div[1]/div[3]/div/div[1]/div[2]/div/div[3]/button/span/span"));
    public static final SelenideElement SIGN_IN_BUTTON = $(By.xpath("//*[@id=\"app\"]/div/div[1]/div[1]/div[3]/div/div[6]/p/span"));
    public static final SelenideElement ERROR_MESSAGE = $(By.xpath("//*[@id=\"app\"]/div/div[1]/div[1]/div[3]/div/div[1]/div[2]/div/div[3]/div[3]/span"));
    public static final SelenideElement AVATAR = $(By.className("ll-leokit__site-menu__user-menu-toggler"));
    public static final SelenideElement CHANGE_LANGUAGE = $(By.xpath("//*[@id=\"app\"]/div/div[1]/div[1]/div[3]/div/div[7]/div[1]"));
    public static final SelenideElement CHOOSE_ENG = $(By.xpath("//*[@id=\"app\"]/div/div[1]/div[1]/div[3]/div/div[7]/div[2]/div[1]/a[6]/span/div/div"));

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
        $(SIGN_IN_BUTTON).click();
        $(ACCOUNT_ALREADY_EXIST).click();
        $(USERNAME_INPUT).setValue(username);
        $(PASSWORD_INPUT).setValue(password);
        $(LOGIN_BUTTON).click();
    }
}
