package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static pages.LoginPage.AVATAR;

public class JunglePage extends BasePage {

    @Override
    public boolean isPageOpened() {
        return isExist((SelenideElement) AVATAR);
    }

    public static final SelenideElement JUNGLE = $(By.xpath("//*[@id=\"topitem-jungle\"]/a/span/span[2]"));
    public static final SelenideElement JUNGLE_MUSIC_ELECTRONIC = $(By.xpath("//*[text()=\"Electronic\"]"));
    public static final SelenideElement JUNGLE_MUSIC_ELECTRONIC_MADONNA = $(By.xpath("//h2[contains(.,'Madonna - Frozen')]"));
    public static final SelenideElement MADONNA_VIDEO_TITLE = $(By.xpath("//span[contains(text(),'Madonna')]"));
//    public static final SelenideElement JUNGLE_MOVIES_AND_VIDEOS = $(By.xpath("//span[contains(.,'Movies and videos')]"));
    public static final SelenideElement JUNGLE_MOVIES_AND_VIDEOS_CARTOONS = $(By.xpath("//h2[contains(.,'Cartoons')]"));
    public static final SelenideElement JUNGLE_CARTOONS_DARK_KNIGHT = $(By.xpath("//h2[contains(.,'How The Dark Knight Should Have Ended')]"));
    public static final SelenideElement TITLE_OF_DARK_KNIGHT_CARTOON = $(By.xpath("//span[contains(.,'How The Dark Knight Should Have Ended')]"));
    public static final SelenideElement JUNGLE_BOOKS_AND_ARTICLES = $(By.xpath("//*[@id=\"topitem-jungle-books\"]/a/span/span[2]"));
    public static final SelenideElement JUNGLE_COLLECTIONS = $(By.xpath("//*[@id=\"topitem-jungle-collections\"]/a/span/span[2]"));
    public static final SelenideElement JUNGLE_MY_CONTENT = $(By.xpath("//*[@id=\"topitem-jungle-my\"]/a/span/span[2]"));
    public static final SelenideElement JUNGLE_ADD_CONTENT = $(By.xpath("//*[@id=\"topitem-jungle-add\"]/a/span/span[2]"));

    public void checkThatMusicLinkExist(){
        $(JUNGLE).click();
        $(JUNGLE_MUSIC_ELECTRONIC).click();
        $(JUNGLE_MUSIC_ELECTRONIC_MADONNA).click();
    }

    public void checkThatMoviesAndVideoLinkExistTest(){
        $(JUNGLE).click();
//        $(JUNGLE_MOVIES_AND_VIDEOS).click();
        $(JUNGLE_MOVIES_AND_VIDEOS_CARTOONS).click();
        $(JUNGLE_CARTOONS_DARK_KNIGHT).click();
    }
}
