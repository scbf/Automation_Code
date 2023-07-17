package StepDefinitonCat;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\GoldenIndiaFile\\Working_On_Golden_India\\Working_On_Golden_India\\src\\test\\resources\\Features\\KitchenParameter.feature", glue = {
"StepDefinitionCat" },
monochrome = true, 
plugin= {"pretty", "html:categories/HTMLReports"})

public class TestRunner {

}
