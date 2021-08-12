package com.translantik.pages;

import com.translantik.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AllCarsPage extends BasePage{
    @FindBy(tagName = "table")
    public WebElement table;

    @FindBy(linkText = "         Export Grid           ")
    public WebElement exportGrid;

    @FindBy(xpath = "//li/a[@title='CSV']")
    public WebElement csv;

    @FindBy(xpath = "//li/a[@title='XLSX']")
    public WebElement xlsx;

    @FindBy(xpath = "//div[@class='message']")
    public WebElement message;


}
