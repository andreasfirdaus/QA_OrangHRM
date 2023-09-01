package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RecruitmentPage {
    private WebDriver driver;

    public RecruitmentPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[normalize-space()='Recruitment']")
    WebElement menuRecruitment;

    @FindBy(xpath = "//a[normalize-space()='Vacancies']")
    WebElement tabVacancies;

    @FindBy(xpath = "//button[normalize-space()='Add']")
    WebElement btnAdd;

    @FindBy(xpath = "//input[@class='oxd-input oxd-input--active']")
    WebElement vacancyName;

    @FindBy(xpath = "//div[@class='oxd-select-text-input']")
    WebElement jobTitle;

    @FindBy(xpath = "//input[@placeholder='Type for hints...']")
    WebElement hiringManager;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement btnSave;

    // Custom Method
    public void clickMenuRecruitment(){
        menuRecruitment.click();
    }

    public void clickTabVacancies(){
        tabVacancies.click();
    }

    public void clickBtnAdd(){
        btnAdd.click();
    }

    public void inputVacancyName(String vacancyName){
        this.vacancyName.sendKeys(vacancyName);
    }

    public void inputJobTitle(String jobTitle){
        this.jobTitle.sendKeys(jobTitle);
    }

    public void inputHiringManager(String hiringManager){
        this.hiringManager.sendKeys(hiringManager);
    }

    public void clickBtnSave(){
        btnSave.click();
    }

}
