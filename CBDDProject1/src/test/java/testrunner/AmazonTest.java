package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src\\test\\resources\\features\\Search1.feature"},
		glue= {"stepdefinitions","myhooks"},
		plugin= {"pretty"})

public class AmazonTest {

}
