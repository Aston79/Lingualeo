package tests;

import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static pages.JunglePage.*;

public class JungleTest extends BaseTest {

    @Test
    public void checkThatMusicLinkExistTest() {
        loginPage.openPage();
        loginPage.login(username, password);
        junglePage.checkThatMusicLinkExist();
        $(MADONNA_VIDEO_TITLE).shouldBe(visible);
    }

    @Test
    public void checkThatMoviesAndVideoLinkExistTest() {
        loginPage.openPage();
        loginPage.login(username, password);
        junglePage.checkThatMoviesAndVideoLinkExistTest();
        $(TITLE_OF_DARK_KNIGHT_CARTOON).shouldBe(visible);
    }

    @Test
    public void checkThatBooksAndArticlesExist(){
        loginPage.openPage();
        loginPage.login(username, password);
        junglePage.checkThatBooksAndArticlesExist();
        $(TITLE_OF_BOOK_AD22).shouldBe(visible);
    }

    @Test
    public void checkThatCollectionsLinkExistTest(){
        loginPage.openPage();
        loginPage.login(username, password);
        junglePage.checkThatCollectionsLinkExist();
        $(TITLE_OF_JADES_LESSON).shouldBe(visible);
    }
}
