package tests;

import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static pages.JunglePage.MADONNA_VIDEO_TITLE;

public class JungleTest extends BaseTest {

    @Test
    public void checkThatMusicLinkExistTest() {
        loginPage.openPage();
        loginPage.login(username, password);
        junglePage.checkThatMusicLinkExist();
        $(MADONNA_VIDEO_TITLE).shouldBe(visible);
    }
}
