package tests;

import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static pages.JunglePage.*;
import static pages.LoginPage.SIGN_BUTTON;

public class JungleTest extends BaseTest {

    @Test
    public void checkThatMusicLinkExistTest() {
        loginPage.openPage();
        loginPage.login(username, password);
        $(SIGN_BUTTON).click();
        junglePage.checkThatMusicLinkExist();
        $(MADONNA_VIDEO_TITLE).shouldBe(visible);
    }

    @Test
    public void checkThatMoviesAndVideoLinkExistTest() {
        loginPage.openPage();
        loginPage.login(username, password);
        $(SIGN_BUTTON).click();
        junglePage.checkThatMoviesAndVideoLinkExistTest();
        $(TITLE_OF_DARK_KNIGHT_CARTOON).shouldBe(visible);
    }

    @Test
    public void checkThatBooksAndArticlesExist(){
        loginPage.openPage();
        loginPage.login(username, password);
        $(SIGN_BUTTON).click();
        junglePage.checkThatBooksAndArticlesExist();
        $(TITLE_OF_BOOK_AD22).shouldBe(visible);
    }

    @Test
    public void checkThatCollectionsLinkExistTest(){
        loginPage.openPage();
        loginPage.login(username, password);
        $(SIGN_BUTTON).click();
        junglePage.checkThatCollectionsLinkExist();
        $(TITLE_OF_JADES_LESSON).shouldBe(visible);
    }

    @Test
    public void checkThatMyContentExistTest(){
        loginPage.openPage();
        loginPage.login(username, password);
        $(SIGN_BUTTON).click();
        junglePage.checkThatMyContentExist();
        $(JUNGLE_MY_CONTENT_MESSAGE).shouldBe(visible);
    }

    @Test
    public void addToShortContentTest(){
        loginPage.openPage();
        loginPage.login(username, password);
        $(SIGN_BUTTON).click();
        junglePage.addToShortContent();
        $(JUNGLE_ADD_CONTENT_ERROR_MESSAGE).shouldBe(visible);
    }
}
