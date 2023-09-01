package com.juaracoding;

import com.juaracoding.Hooks;
import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.pages.LoginPage;
import com.juaracoding.pages.RecruitmentPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class TestRecruitment {
    static WebDriver driver;
    static ExtentTest extentTest;
    static LoginPage loginPage = new LoginPage();
    static RecruitmentPage recruitmentPage = new RecruitmentPage();

    public TestRecruitment(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @When("User click menu recruitment")
    public void user_click_menu_recruitment(){
        loginPage.login();
        recruitmentPage.clickMenuRecruitment();
        extentTest.log(LogStatus.PASS, "User click menu recruitment");
    }

    @When("User click tab vacancies")
    public void user_click_tab_vacancies(){
        recruitmentPage.clickTabVacancies();
        extentTest.log(LogStatus.PASS, "User click tab vacancies");
    }

    @When("User click button add")
    public void user_click_button_add(){
        recruitmentPage.clickBtnAdd();
        extentTest.log(LogStatus.PASS, "User click button add");
    }

    @When("User input Vacancy Name")
    public void user_input_vacancy_name(){
        recruitmentPage.inputVacancyName("Test");
        extentTest.log(LogStatus.PASS, "User input Vacancy Name");
    }

    @When("User input Job Title")
    public void user_input_job_title(){
        recruitmentPage.inputJobTitle("D");
        extentTest.log(LogStatus.PASS, "User input Job Title");
    }

    @When("User input Hiring Manager")
    public void user_input_hiring_manager(){
        recruitmentPage.inputHiringManager("test");
        DriverSingleton.delay(5);
        recruitmentPage.inputHiringManager(""+Keys.ARROW_DOWN+Keys.ENTER);
        extentTest.log(LogStatus.PASS, "User input Hiring Manager");
    }

    @When("User click button save")
    public void user_click_button_save(){
        recruitmentPage.clickBtnSave();
        extentTest.log(LogStatus.PASS, "User click button save");
    }


}
