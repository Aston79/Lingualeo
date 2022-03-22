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
    public static final SelenideElement JUNGLE_MUSIC = $(By.xpath("//*[@id=\"topitem-jungle-music\"]/a/span/span[2]"));
    public static final SelenideElement JUNGLE_MUSIC_ELECTRONIC = $(By.xpath("//*[text()=\"Electronic\"]"));
    public static final SelenideElement JUNGLE_MUSIC_ELECTRONIC_MADONNA = $(By.xpath("//h2[contains(.,'Madonna - Frozen')]"));
    public static final SelenideElement MADONNA_VIDEO_TITLE = $(By.xpath("//span[contains(text(),'Madonna')]"));
    public static final SelenideElement JUNGLE_MOVIES_AND_VIDEOS = $(By.xpath("//*[@id=\"topitem-jungle-video\"]/a/span/span[2]"));
    public static final SelenideElement JUNGLE_BOOKS_AND_ARTICLES = $(By.xpath("//*[@id=\"topitem-jungle-books\"]/a/span/span[2]"));
    public static final SelenideElement JUNGLE_COLLECTIONS = $(By.xpath("//*[@id=\"topitem-jungle-collections\"]/a/span/span[2]"));
    public static final SelenideElement JUNGLE_MY_CONTENT = $(By.xpath("//*[@id=\"topitem-jungle-my\"]/a/span/span[2]"));
    public static final SelenideElement JUNGLE_ADD_CONTENT = $(By.xpath("//*[@id=\"topitem-jungle-add\"]/a/span/span[2]"));

    public void checkThatMusicLinkExist(){
        $(JUNGLE).click();
//        $(JUNGLE_MUSIC).click();
        $(JUNGLE_MUSIC_ELECTRONIC).click();
        $(JUNGLE_MUSIC_ELECTRONIC_MADONNA).click();
    }
}
