package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class LeftNav extends Parent{

    public LeftNav() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy (xpath = "(//span[text()='Setup'])[1]")
    public WebElement setup;

    @FindBy (xpath = "//span[text()='Parameters']")
    public WebElement parameters;

    @FindBy (xpath = "//span[text()='Countries']")
    public WebElement countries;

    @FindBy (xpath = "//span[text()='Citizenships']")
    public WebElement citizenShip;

    @FindBy (xpath = "(//span[text()='Nationalities'])[1]")
    public WebElement nationalities;

    @FindBy (xpath = "//span[text()='Bank Accounts']")
    public WebElement bankAccounts;

    @FindBy(xpath = "//span[text()='Fees']")
    public WebElement fees;

    @FindBy(xpath = "(//span[text()='Entrance Exams'])[1]")
    private WebElement entranceExamsOne;

    @FindBy(xpath = "(//span[text()='Setup'])[2]")
    private WebElement setupTwo;

    @FindBy(xpath = "(//span[text()='Entrance Exams'])[2]")
    private WebElement entranceExamsTwo;



    public WebElement getWebElement(String strButton){

        WebElement myElement=null;

        switch (strButton){

            case "setup" : return setup;
            case "parameters" : return parameters;
            case "countries" : return countries;
            case "citizenShip" : return citizenShip;
            case  "nationalities" : return nationalities;
            case  "bankAccounts" : return bankAccounts;
            case "fees" : return fees;
            case "entranceExamsOne" : return entranceExamsOne;
            case "setupTwo" : return setupTwo;
            case  "entranceExamsTwo" : return entranceExamsTwo;

        }

          return null;
    }




}
