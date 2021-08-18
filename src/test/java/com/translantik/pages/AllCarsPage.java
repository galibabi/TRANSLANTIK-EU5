package com.translantik.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AllCarsPage extends BasePage{
    @FindBy(tagName = "table")
    public WebElement table;

    @FindBy(xpath = "//div/a/i[@class='fa-upload']")
    public WebElement exportGrid;

    @FindBy(xpath = "//li/a[@title='CSV']")
    public WebElement csv;

    @FindBy(xpath = "//li/a[@title='XLSX']")
    public WebElement xlsx;

    @FindBy(xpath = "//div[@class='message']")
    public WebElement message;

    @FindBy(className = "input-widget")
    public WebElement pageNum;

    @FindBy(xpath = "//label[contains(text(),'of ')][1]")
    public WebElement totalPages;

    @FindBy(xpath = "//label[contains(text(),'Total of')]")
    public WebElement totalRecordings;


}
