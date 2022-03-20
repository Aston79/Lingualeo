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
    public static final SelenideElement JUNGLE_MUSIC_ELECTRONIC = $(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div/div[2]/div/div/div/div/div[2]/div/div/div/div/div[1]/div/div/div/ul/li[3]/div/a/div/div[2]"));
    public static final SelenideElement JUNGLE_MUSIC_ELECTRONIC_MADONNA = $(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div/div[3]/div[1]/div/div/li[1]/div/a/div/div[2]"));
    public static final SelenideElement MADONNA_YOUTUBE_LINK = $(By.xpath("//*[@id=\"movie_player\"]/a/div/div[1]"));
    public static final SelenideElement JUNGLE_MOVIES_AND_VIDEOS = $(By.xpath("//*[@id=\"topitem-jungle-video\"]/a/span/span[2]"));
    public static final SelenideElement JUNGLE_BOOKS_AND_ARTICLES = $(By.xpath("//*[@id=\"topitem-jungle-books\"]/a/span/span[2]"));
    public static final SelenideElement JUNGLE_COLLECTIONS = $(By.xpath("//*[@id=\"topitem-jungle-collections\"]/a/span/span[2]"));
    public static final SelenideElement JUNGLE_MY_CONTENT = $(By.xpath("//*[@id=\"topitem-jungle-my\"]/a/span/span[2]"));
    public static final SelenideElement JUNGLE_ADD_CONTENT = $(By.xpath("//*[@id=\"topitem-jungle-add\"]/a/span/span[2]"));

    public void checkThatMusicLinkExist(){
        $(JUNGLE).click();
        $(JUNGLE_MUSIC).click();
        $(JUNGLE_MUSIC_ELECTRONIC).click();
        $(JUNGLE_MUSIC_ELECTRONIC_MADONNA).click();
    }
}
