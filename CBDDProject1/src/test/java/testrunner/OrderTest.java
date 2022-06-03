package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src\\test\\resources\\features\\Order.feature"},
		glue= {"stepdefinitions"},
		plugin= {"pretty"})
public class OrderTest {

}
