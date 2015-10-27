package romanNumerals;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
/**
 * John Stinson 26 July 2015
 * Roman Numbers Kata - Runner for Cucumber
 */
@RunWith(Cucumber.class)
@CucumberOptions(plugin = "json:target/cucumber-report.json")
public class CucumberRunner {

}
