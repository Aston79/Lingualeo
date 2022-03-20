package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static pages.LoginPage.AVATAR;

public class LogOutPage extends BasePage{

    @Override
    public boolean isPageOpened() {
        return isExist((SelenideElement) AVATAR);
    }

    public static final SelenideElement AVATAR_BUTTON = $(By.xpath("//*[@id=\"app\"]/div/div[1]/div[1]/div[3]/div/div[10]/a/div"));
    public static final SelenideElement LOGOUT_BUTTON = $(By.xpath("//*[@id=\"topitem-logout\"]/a/span/span[2]"));

    public void loggingOut(){
        $(AVATAR_BUTTON).hover();
        $(LOGOUT_BUTTON).click();
    }
}
