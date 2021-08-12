package com.translantik.step_definitions;

import com.translantik.pages.AllCarsPage;
import com.translantik.utilities.BrowserUtils;
import com.translantik.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class AllCarsStepDefs {

    @Then("User should see the table  of vehicle information")
    public void user_should_see_the_table_of_vehicle_information() {
        BrowserUtils.waitForPageToLoad(10);
        AllCarsPage allCarsPage = new AllCarsPage();
        String title = Driver.get().getTitle();
        Assert.assertTrue(title.contains("Car"));

    }
    @When("User can download table data in XLS or CSV format")
    public void user_can_download_table_data_in_XLS_or_CSV_format() {

        AllCarsPage allCarsPage = new AllCarsPage();
        BrowserUtils.waitFor(7);
        allCarsPage.exportGrid.click();
        allCarsPage.csv.click();
        BrowserUtils.waitFor(1);
        Assert.assertTrue(allCarsPage.message.isDisplayed());
    }
}
