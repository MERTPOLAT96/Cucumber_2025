package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class _01_LoginStep {

    DialogContent dc=new DialogContent();
    @Given("Navigate to Campus")
    public void navigateToCampus() {
        GWD.getDriver().get("https://test.mersys.io/");
        GWD.getDriver().manage().window().maximize();
    }

    @When("Enter username and password and click login button")
    public void enterUsernameAndPasswordAndClickLoginButton() {
        DialogContent dc=new DialogContent();

       // WebDriverWait wait=new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(30));
       // wait.until(ExpectedConditions.visibilityOf(dc.username));
       // dc.username.sendKeys("turkeyts");
       // dc.password.sendKeys("TechnoStudy123");

        dc.findAndSend(dc.username, "turkeyts");
        dc.findAndSend(dc.password, "TechnoStudy123");
        dc.findAndClick(dc.loginButton);
    }

    @Then("User sholud login successfully")
    public void userSholudLoginSuccessfully() {
        dc.verifyContainsTextFunction(dc.txtTechnoStudy, "Techno Study Intern School");
    }
}