package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Parent;
import pages.US601_Content;
import utilities.ConfigReader;
import utilities.GWD;

public class RegistrationSteps extends Parent {
    US601_Content us1 = new US601_Content();

    @Given("Navigate to Parabank website")
    public void navigateToParabankWebsite() {
        GWD.getDriver().get(ConfigReader.getProperty("URL"));
    }

    @When("Click on the Register button")
    public void clickOnTheRegisterButton() {
        myClick(us1.registerBtn);
    }

    @Then("Fill the registration information")
    public void fillTheRegistrationInformation() {
        mySendKeys(us1.customerForm.get(0), "Amal");
        mySendKeys(us1.customerForm.get(1), "Raju");
        mySendKeys(us1.customerForm.get(2), "123 Queen St W, Toronto, ON M5H 2N2");
        mySendKeys(us1.customerForm.get(3), "Toronto");
        mySendKeys(us1.customerForm.get(4), "Ontario");
        mySendKeys(us1.customerForm.get(5), "M5H 2N2");
        mySendKeys(us1.customerForm.get(6), "4165551234");
        mySendKeys(us1.customerForm.get(7), "123456789");
        mySendKeys(us1.customerForm.get(8), "AmalRaju");
        mySendKeys(us1.customerForm.get(9), "SecurePass123");
        mySendKeys(us1.customerForm.get(10), "SecurePass123");
    }

    @And("Click on the Register Submit button")
    public void clickOnTheRegisterSubmitButton() {
        myClick(us1.customerForm.get(11));
    }

    @And("User should see the success message")
    public void userShouldSeeTheSuccessMessage() {
        verifyContainsText(us1.successMessage, "success");
    }
}
