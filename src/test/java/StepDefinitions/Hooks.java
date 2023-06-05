package StepDefinitions;

import Utilities.GWD;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.bs.A;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;

public class Hooks {

    @After
    public void after(Scenario scenario){
        System.out.println("senaryo bitti");

        if (scenario.isFailed()){

            TakesScreenshot ts=(TakesScreenshot) GWD.getDriver();
                   final byte[] hafızadakihali=ts.getScreenshotAs(OutputType.BYTES);
                    scenario.attach(hafızadakihali, "image/png","screenshot name");
        }
        GWD.quitDriver();
    }
}
