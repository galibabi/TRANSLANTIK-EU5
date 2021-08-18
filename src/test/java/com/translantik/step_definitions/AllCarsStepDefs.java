package com.translantik.step_definitions;

import com.translantik.pages.AllCarsPage;
import com.translantik.utilities.BrowserUtils;
import com.translantik.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class AllCarsStepDefs {

    @Then("User should see the table  of vehicle information")
    public void user_should_see_the_table_of_vehicle_information() {
        BrowserUtils.waitForPageToLoad(10);
        AllCarsPage allCarsPage = new AllCarsPage();
        String title = Driver.get().getTitle();
        Assert.assertTrue(title.contains("Car"));

    }
    @Then("user should see total recordings")
    public void user_should_see_total_recordings() {
        WebElement element = new AllCarsPage().totalRecordings;
        Assert.assertTrue(element.isDisplayed());
    }
    @When("user selects the format XLS or CSV under ExportGrid dropdown")
    public void user_selects_the_format_XLS_or_CSV_under_ExportGrid_dropdown() {
        BrowserUtils.waitForPageToLoad(10);
        AllCarsPage allCarsPage = new AllCarsPage();
        BrowserUtils.waitFor(10);
        allCarsPage.exportGrid.click();
        BrowserUtils.waitFor(2);
        allCarsPage.csv.click();

    }
    /*  @When("user selects the format XLS or CSV under ExportGrid dropdown")
      public void user_selects_the_format_XLS_or_CSV_under_ExportGrid_dropdown() {
          BrowserUtils.waitForClickablility(By.xpath("//div/a/i[@class='fa-upload']"),30);
          Driver.get().findElement(By.xpath("//div/a/i[@class='fa-upload']")).click();
          Driver.get().findElement(By.xpath("//li/a[@title='CSV']")).click();

      }*/
    @Then("user succesfully downloaded the table")
    public void user_succesfully_downloaded_the_table() {
        BrowserUtils.waitForPresenceOfElement(By.xpath("//div[@class='message']"),15);
        WebElement element = new AllCarsPage().message;
        Assert.assertTrue(element.isDisplayed());
    }
    @When("user selects different page")
    public void user_selects_different_page() {
        AllCarsPage allCarsPage = new AllCarsPage();
        allCarsPage.waitUntilLoaderScreenDisappear();
        allCarsPage.pageNum.sendKeys("2");
        allCarsPage.pageNum.sendKeys(Keys.ENTER);


    }

    @Then("user is on selected page and can see total pages")
    public void user_is_on_selected_page_and_can_see_total_pages() {
        AllCarsPage allCarsPage = new AllCarsPage();
        String expected = "2";
        String actual = allCarsPage.pageNum.getAttribute("value");
        Assert.assertEquals(expected,actual);
        Assert.assertTrue(allCarsPage.totalPages.isDisplayed());
    }
}
