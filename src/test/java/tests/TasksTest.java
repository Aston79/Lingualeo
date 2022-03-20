package tests;

import com.codeborne.selenide.Condition;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static pages.TasksPage.*;

public class TasksTest extends BaseTest{

    @Test
    public void checkTheFirstStepIsExistOnMapTest(){
        loginPage.openPage();
        loginPage.login(username, password);
        tasksPage.checkTheFirstStepIsExistOnMap();
        $(STEP_FIRST_ON_MAP).shouldBe(visible);
    }

    @Test
    public void moveToInitialCourseThrowProgressMapTest(){
        loginPage.openPage();
        loginPage.login(username, password);
        tasksPage.moveToInitialCourseThrowProgressMap();
        $(STEP_FIRST_LESSON_FIRST).shouldBe(visible);
    }

    @Test
    public void moveToLeoSprintThrowProgressMapTest(){
        loginPage.openPage();
        loginPage.login(username, password);
        tasksPage.moveToLeoSprintThrowProgressMap();
        $(WARNING_MESSAGE).shouldBe(visible);
    }

    @Test
    public void moveToWordTranslationThrowProgressMapTest(){
        loginPage.openPage();
        loginPage.login(username, password);
        tasksPage.moveToWordTranslationThrowProgressMap();
        $(WARNING_MESSAGE).shouldBe(visible);
    }

    @Test
    public void moveToAdditionalTaskThrowProgressMapTest(){
        loginPage.openPage();
        loginPage.login(username, password);
        tasksPage.moveToAdditionalTaskThrowProgressMap();
        $(HI_MESSAGE).shouldBe(visible);
    }

    @Test
    public void checkTheLeosSatiationTest(){
        loginPage.openPage();
        loginPage.login(username, password);
        tasksPage.checkTheLeosSatiation();
        $(LEOS_SATIATION).shouldBe(visible);
    }

    @Test
    public void checkTheVisibilityProgressBySkillsTest(){
        loginPage.openPage();
        loginPage.login(username, password);
        tasksPage.checkTheVisibilityProgressBySkills();
    }

    @Test
    public void chooseBusinessTutorTest(){
        loginPage.openPage();
        loginPage.login(username, password);
        tasksPage.findTheTutorOfBusinessSkill();
        $(BUSINESS_SKILL_IS_EXIST).shouldBe(visible);
    }

    @Test
    public void chooseLiteratureTutorTest(){
        loginPage.openPage();
        loginPage.login(username, password);
        tasksPage.findTheTutorOfLiteratureSkill();
        $(LITERATURE_SKILL_IS_EXIST).shouldBe(visible);
    }

    @Test
    public void chooseTOEFLTutorTest(){
        loginPage.openPage();
        loginPage.login(username, password);
        tasksPage.findTheTutorOfTOEFLSkill();
        $(TOEFL_SKILL_IS_EXIST).shouldBe(visible);
    }
}
