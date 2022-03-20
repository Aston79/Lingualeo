package tests;

import com.codeborne.selenide.Condition;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static pages.JunglePage.MADONNA_YOUTUBE_LINK;

public class JungleTest extends BaseTest{

    @Test
    public void checkThatMusicLinkExistTest(){
        loginPage.openPage();
        loginPage.login(username, password);
        junglePage.checkThatMusicLinkExist();
        $(MADONNA_YOUTUBE_LINK).shouldBe(visible);
    }
}
