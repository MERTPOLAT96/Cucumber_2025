package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

        tags = "@Regression or @SmokeTest", // hangi senaryolarda bu etiket varsa onları çalıştır
        // or yerine and yazılırsa hem smoke hem de regression tag i olanları çalıştırır.

        // "@Regression and @SmokeTest" 2 sinin birlikte sahip olduğu etiketleri çalıştırır.
        features = {"src/test/java/FeatureFiles"},
        glue = {"StepDefinitions"}
)

public class _05_TestRunnerRegression extends AbstractTestNGCucumberTests {
}
