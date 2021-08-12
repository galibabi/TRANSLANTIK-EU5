package com.translantik.step_definitions;

import com.translantik.pages.DashboardPage;
import com.translantik.pages.LoginPage;
import com.translantik.utilities.BrowserUtils;
import com.translantik.utilities.ConfigurationReader;
import com.translantik.utilities.Driver;
import io.cucumber.java.en.*;

public class LoginStepDefs {

    @Given("the user logged in as {string}")
    public void the_user_logged_in_as(String user) {
        Driver.get().get(ConfigurationReader.get("url"));
        String username = null;
        String password = null;
        switch (user){
            case "driver":
                username = ConfigurationReader.get("driver_username");
                password = ConfigurationReader.get("driver_password");
                break;
            case "sales manager":
                username = ConfigurationReader.get("sales_manager_username");
                password = ConfigurationReader.get("sales_manager_password");
                break;
            case "store manager":
                username = ConfigurationReader.get("store_manager_username");
                password = ConfigurationReader.get("store_manager_password");
                break;
        }
        LoginPage login = new LoginPage();
        login.login(username,password);

    }
    @When("the user navigates to {string} {string}")
    public void the_user_navigates_to(String tab, String module) {
        BrowserUtils.waitFor(5);
        new DashboardPage().navigateToModule(tab,module);
        BrowserUtils.waitFor(5);
}


}
