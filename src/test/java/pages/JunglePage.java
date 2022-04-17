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

    public static final SelenideElement JUNGLE = $(By.xpath("//*[@id='topitem-jungle']/a/span/span[contains(.,'Jungle')]"));
//    public static final SelenideElement JUNGLE_MUSIC = $(By.xpath("//span[@class='ll-leokit__side-menu-item__content']/span[contains(.,'Music')]"));
    public static final SelenideElement JUNGLE_MUSIC_ELECTRONIC = $(By.xpath("//div/h2[contains(.,'Electronic')]"));
    public static final SelenideElement JUNGLE_MUSIC_ELECTRONIC_MADONNA = $(By.xpath("//div/h2[contains(.,'Madonna - Frozen')]"));
    public static final SelenideElement MADONNA_VIDEO_TITLE = $(By.xpath("//span[contains(.,'Madonna')]"));
    public static final SelenideElement JUNGLE_MOVIES_AND_VIDEOS_CARTOONS = $(By.xpath("//div/h2[contains(.,'Cartoons')]"));
    public static final SelenideElement JUNGLE_CARTOONS_DARK_KNIGHT = $(By.xpath("//div/h2[contains(.,'How The Dark Knight Should Have Ended')]"));
    public static final SelenideElement TITLE_OF_DARK_KNIGHT_CARTOON = $(By.xpath("//span[contains(.,'How The Dark Knight Should Have Ended')]"));
    public static final SelenideElement JUNGLE_BOOKS = $(By.xpath("//div/h2[contains(.,'Books')]"));
    public static final SelenideElement JUNGLE_BOOK_AD22 = $(By.xpath("//div/h2[contains(.,'Diary of Samuel Pepys. 1667-1668')]"));
    public static final SelenideElement TITLE_OF_BOOK_AD22 = $(By.xpath("//div/span[2][@class='ll-translatable-text__sentence']/span[contains(.,' 1667-1668')]"));
    public static final SelenideElement JUNGLE_COLLECTIONS = $(By.xpath("//div/a/span[@class=\"ll-leokit__site-menu-sub-item__content\"]/span[contains(.,'Collection')]"));
    public static final SelenideElement JUNGLE_ENGVID = $(By.xpath("//div/h2[contains(.,'engVid')]"));
    public static final SelenideElement JUNGLE_COLLECTIONS_JADE = $(By.xpath("//div[@class='ll-leokit__card__body']/div/h2[contains(.,'Jade')]"));
    public static final SelenideElement JUNGLE_COLLECTIONS_JADES_LESSON = $(By.xpath("//div[@class='ll-leokit__card__body']/div/h2[contains(.,'Learn English The 20-Minute Method')]"));
    public static final SelenideElement TITLE_OF_JADES_LESSON = $(By.xpath("//div/span[contains(.,'20-Minute')]/span[6]"));
    public static final SelenideElement JUNGLE_MY_CONTENT = $(By.xpath("//*[@id='topitem-jungle-my']/a/span/span[2]"));
    public static final SelenideElement JUNGLE_MY_CONTENT_LEARNED = $(By.xpath("//div/h2[contains(.,'Learned')]"));
    public static final SelenideElement JUNGLE_MY_CONTENT_LEARNED_HELLO = $(By.xpath("//div[@class='ll-leokit__card__body']"));
    public static final SelenideElement JUNGLE_MY_CONTENT_MESSAGE = $(By.xpath("//div[@class='ll-translatable-text']/span/span[contains(.,'Lisa')]"));
    public static final SelenideElement JUNGLE_ADD_CONTENT = $(By.xpath("//*[@id=\"topitem-jungle-add\"]/a/span/span[2]"));
    public static final SelenideElement JUNGLE_ADD_CONTENT_CHECKBOX = $(By.xpath("//span[@class='ll-leokit__checkbox__box']"));
    public static final SelenideElement JUNGLE_ADD_CONTENT_CONTINUE_BUTTON = $(By.xpath("//span[@class='ll-leokit__button__content']/span"));
    public static final SelenideElement JUNGLE_ADD_CONTENT_CHOOSE_LANGUAGE = $(By.xpath("//div[@class='ll-leokit__toggle-group ll-leokit__toggle-group__m-theme_azul']/div[contains(.,'English')]"));
    public static final SelenideElement JUNGLE_ADD_CONTENT_SELECT_A_FORMAT = $(By.xpath("//div[@class='ll-leokit__toggle-group ll-leokit__toggle-group__m-theme_azul']/div[contains(.,'Text')]"));
    public static final SelenideElement JUNGLE_ADD_CONTENT_SELECT_A_SECTION = $(By.xpath("//div[@class='ll-leokit__toggle-group ll-leokit__toggle-group__m-theme_azul']/div[contains(.,'Books and articles')]"));
    public static final SelenideElement JUNGLE_ADD_CONTENT_SELECT_A_CATEGORY = $(By.xpath("//div[@class='ll-leokit__select__input__chevron']"));
    public static final SelenideElement JUNGLE_ADD_CONTENT_CATEGORY_STORIES = $(By.xpath("//div[@class='ll-leokit__select ll-leokit__select__m-open']/div/div[contains(.,'Short stories and articles')]"));
    public static final SelenideElement JUNGLE_ADD_CONTENT_NEXT_BUTTON = $(By.xpath("//span[contains(.,'Next')]/span[1]"));
    public static final SelenideElement JUNGLE_ADD_CONTENT_ENTER_A_TITLE = $(By.xpath("//div[@class='ll-jungle-add__form-field__value ll-jungle-add__form-field__value__m-input']/div/input"));
    public static final SelenideElement JUNGLE_ADD_CONTENT_ENTER_A_TEXT = $(By.xpath("//div[@class='ll-jungle-add__form-field__value ll-jungle-add__form-field__value__m-input']/div/textarea"));
    public static final SelenideElement JUNGLE_ADD_CONTENT_SAVE_BUTTON = $(By.xpath("//span[@class='ll-leokit__button__content']/span[contains(.,'Save')]"));
    public static final SelenideElement JUNGLE_ADD_CONTENT_ERROR_MESSAGE = $(By.xpath("//div[@class='ll-leokit__input-wrapper__error-message'][contains(.,'This field is too short')]"));

    public void checkThatMusicLinkExist(){
        $(JUNGLE).click();
        $(JUNGLE_MUSIC_ELECTRONIC).click();
        $(JUNGLE_MUSIC_ELECTRONIC_MADONNA).click();
    }

    public void checkThatMoviesAndVideoLinkExistTest(){
        $(JUNGLE).click();
        $(JUNGLE_MOVIES_AND_VIDEOS_CARTOONS).click();
        $(JUNGLE_CARTOONS_DARK_KNIGHT).click();
    }

    public void checkThatBooksAndArticlesExist(){
        $(JUNGLE).click();
        $(JUNGLE_BOOKS).click();
        $(JUNGLE_BOOK_AD22).click();
    }

    public void checkThatCollectionsLinkExist(){
        $(JUNGLE).click();
        $(JUNGLE).hover();
        $(JUNGLE_COLLECTIONS).click();
        $(JUNGLE_ENGVID).click();
        $(JUNGLE_COLLECTIONS_JADE).click();
        $(JUNGLE_COLLECTIONS_JADES_LESSON).click();
    }

    public void checkThatMyContentExist(){
        $(JUNGLE).click();
        $(JUNGLE).hover();
        $(JUNGLE_MY_CONTENT).click();
        $(JUNGLE_MY_CONTENT_LEARNED).click();
        $(JUNGLE_MY_CONTENT_LEARNED_HELLO).click();
    }

    public void addToShortContent(){
        $(JUNGLE).click();
        $(JUNGLE).hover();
        $(JUNGLE_ADD_CONTENT).click();
        $(JUNGLE_ADD_CONTENT_CHECKBOX).click();
        $(JUNGLE_ADD_CONTENT_CONTINUE_BUTTON).click();
        $(JUNGLE_ADD_CONTENT_CHOOSE_LANGUAGE).click();
        $(JUNGLE_ADD_CONTENT_SELECT_A_FORMAT).click();
        $(JUNGLE_ADD_CONTENT_SELECT_A_SECTION).click();
        $(JUNGLE_ADD_CONTENT_SELECT_A_CATEGORY).click();
        $(JUNGLE_ADD_CONTENT_CATEGORY_STORIES).click();
        $(JUNGLE_ADD_CONTENT_NEXT_BUTTON).click();
        $(JUNGLE_ADD_CONTENT_ENTER_A_TITLE).click();
        $(JUNGLE_ADD_CONTENT_ENTER_A_TITLE).setValue("Test");
        $(JUNGLE_ADD_CONTENT_ENTER_A_TEXT).setValue("Test text.");
        $(JUNGLE_ADD_CONTENT_SAVE_BUTTON).click();
    }
}
