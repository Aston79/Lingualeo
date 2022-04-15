package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static pages.LoginPage.AVATAR;

public class TasksPage extends BasePage {

    @Override
    public boolean isPageOpened() {
       return isExist((SelenideElement) AVATAR);
    }

    public static final SelenideElement TASKS = $(By.xpath("//*[@class='ll-leokit__site-menu-top-item__content']/span[contains(.,'Tasks')]"));
    public static final SelenideElement PROGRESS_MAP = $(By.xpath("//*[@class='ll-leokit__site-menu-sub-item__content']/span[contains(.,'Progress map')]"));
    public static final SelenideElement MY_PROGRESS = $(By.xpath("//*[@class='ll-leokit__site-menu-sub-item__content']/span[contains(.,'My progress')]"));
    public static final SelenideElement TUTORS = $(By.xpath("//*[@class='ll-leokit__site-menu-sub-item__content']/span[contains(.,'Tutors')]"));
    public static final SelenideElement STEP_FIRST_ON_MAP = $(By.xpath("//div[@style='background-image: url(\"https://contentcdn.lingualeo.com/uploads/banners/image/pic-lib-1612946083.png\");']"));
    public static final SelenideElement STEP_FIRST_INITIAL_COURSE = $(By.xpath("//div[@class='ll-leokit__task-card__header']/following-sibling::div/p[contains(.,\"Начальный курс\")]"));
    public static final SelenideElement STEP_FIRST_LESSON_FIRST = $(By.xpath("//div[@class='ll-leokit__learn-course-lesson__lesson-start']/h2"));
    public static final SelenideElement STEP_FIRST_LEO_SPRINT = $(By.xpath("//div[@class='ll-leokit__task-card__header']/following-sibling::div/p[contains(.,'Leo Sprint')]"));
    public static final SelenideElement WARNING_MESSAGE = $(By.xpath("//div[@class='ll-leokit__premium-modal__item']/h3/span"));
    public static final SelenideElement STEP_FIRST_WORD_TRANSLATION = $(By.xpath("//div[@class='ll-leokit__task-card__header']/following-sibling::div/p[contains(.,'Word-Translation')]"));
    public static final SelenideElement STEP_FIRST_ADDITIONAL_TASK = $(By.xpath("//div[@class='ll-leokit__task-card__header']/h2[contains(.,'Additional task')]"));
    public static final SelenideElement HI_MESSAGE = $(By.xpath("//div/span[@class='ll-translatable-text__sentence']/child::span[contains(.,'Hi')]"));
    public static final SelenideElement LEOS_SATIATION = $(By.xpath("//div[@class='ll-progress-journal__block__title']/span[1]"));

    public void checkTheFirstStepIsExistOnMap(){
        $(TASKS).hover();
        $(PROGRESS_MAP).click();
    }

    public void moveToInitialCourseThrowProgressMap(){
        $(TASKS).hover();
        $(PROGRESS_MAP).click();
        $(STEP_FIRST_ON_MAP).click();
        $(STEP_FIRST_INITIAL_COURSE).click();
    }

    public void moveToLeoSprintThrowProgressMap(){
        $(TASKS).hover();
        $(PROGRESS_MAP).click();
        $(STEP_FIRST_ON_MAP).click();
        $(STEP_FIRST_LEO_SPRINT).click();
    }

    public void moveToWordTranslationThrowProgressMap(){
        $(TASKS).hover();
        $(PROGRESS_MAP).click();
        $(STEP_FIRST_ON_MAP).click();
        $(STEP_FIRST_WORD_TRANSLATION).click();
    }

    public void moveToAdditionalTaskThrowProgressMap(){
        $(TASKS).hover();
        $(PROGRESS_MAP).click();
        $(STEP_FIRST_ON_MAP).click();
        $(STEP_FIRST_ADDITIONAL_TASK).click();
    }

    public void checkTheLeosSatiation(){
        $(TASKS).hover();
        $(MY_PROGRESS).click();
    }

    public static final SelenideElement READING_SKILL = $(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div/div/div/div/div/div[2]/div/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/span"));
    public static final SelenideElement GRAMMAR_SKILL = $(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div/div/div/div/div/div[2]/div/div[2]/div[2]/div/div[2]/div/div[2]/div[2]/span"));
    public static final SelenideElement VOCABULARY_SKILL = $(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div/div/div/div/div/div[2]/div/div[2]/div[2]/div/div[2]/div/div[3]/div[2]/span"));
    public static final SelenideElement LISTENING_SKILL = $(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div/div/div/div/div/div[2]/div/div[2]/div[2]/div/div[2]/div/div[4]/div[2]/span"));
    public static final SelenideElement WRITING_SKILL = $(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div/div/div/div/div/div[2]/div/div[2]/div[2]/div/div[2]/div/div[5]/div[2]/span"));
    public static final SelenideElement SPEAKING_SKILL = $(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div/div/div/div/div/div[2]/div/div[2]/div[2]/div/div[2]/div/div[6]/div[2]/span"));

    public void checkTheVisibilityProgressBySkills(){
        $(TASKS).hover();
        $(MY_PROGRESS).click();
        $(READING_SKILL).click();
        $(GRAMMAR_SKILL).click();
        $(VOCABULARY_SKILL).click();
        $(LISTENING_SKILL).click();
        $(WRITING_SKILL).click();
        $(SPEAKING_SKILL).click();
    }

    public static final SelenideElement BUSINESS_BUTTON = $(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div/div/div/div/div/div/div/div/div[2]/div/div/div[1]"));
    public static final SelenideElement BUSINESS_SKILL_IS_EXIST = $(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div/div/div/div/div/div/div/div/div[3]/div[1]/div[1]/div[2]/div[1]"));
    public static final SelenideElement LITERATURE_BUTTON = $(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div/div/div/div/div/div/div/div/div[2]/div/div/div[4]"));
    public static final SelenideElement LITERATURE_SKILL_IS_EXIST = $(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div/div/div/div/div/div/div/div/div[3]/div[1]/div[1]/div[2]/div[5]"));
    public static final SelenideElement TOEFL_BUTTON = $(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div/div/div/div/div/div/div/div/div[2]/div/div/div[10]"));
    public static final SelenideElement TOEFL_SKILL_IS_EXIST = $(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div/div/div/div/div/div/div/div/div[3]/div/div[1]/div[2]/div[1]"));

    public void findTheTutorOfBusinessSkill(){
        $(TASKS).hover();
        $(TUTORS).click();
        $(BUSINESS_BUTTON).click();
    }

    public void findTheTutorOfLiteratureSkill(){
        $(TASKS).hover();
        $(TUTORS).click();
        $(LITERATURE_BUTTON).click();
    }

    public void findTheTutorOfTOEFLSkill(){
        $(TASKS).hover();
        $(TUTORS).click();
        $(TOEFL_BUTTON).click();
    }
}
