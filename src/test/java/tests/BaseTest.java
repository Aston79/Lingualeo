package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import lombok.extern.log4j.Log4j2;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import pages.JunglePage;
import pages.LogOutPage;
import pages.LoginPage;
import pages.TasksPage;
import utils.PropertyReader;

@Log4j2
public abstract class BaseTest {

    String username, password;
    public LoginPage loginPage;
    public LogOutPage logOutPage;
    public TasksPage tasksPage;
    public JunglePage junglePage;

    @Parameters({"browser"})
    @BeforeMethod
    public void setUp() {

        Configuration.baseUrl = System.getenv().getOrDefault("LINGUALEO_URL", PropertyReader.getProperty("lingualeo.url"));
        username = System.getenv().getOrDefault("LINGUALEO_USERNAME", PropertyReader.getProperty("lingualeo.username"));
        password = System.getenv().getOrDefault("LINGUALEO_PASSWORD", PropertyReader.getProperty("lingualeo.password"));
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide().screenshots(true).savePageSource(false));
        Configuration.browserSize = "1280x960";
        Configuration.browserPosition = "0x0";
        Configuration.clickViaJs = true;
        Configuration.savePageSource = false;
        Configuration.timeout = 30000;
        Configuration.pageLoadTimeout = 30000;
        Configuration.reportsFolder = "test-result/reports";

        loginPage = new LoginPage();
        logOutPage = new LogOutPage();
        tasksPage = new TasksPage();
        junglePage = new JunglePage();
    }
}
