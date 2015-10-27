package romanNumerals;


import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
//import romanNumerals.RomanNumeralGenerator;
import static org.assertj.core.api.Assertions.*;

/**
 * Created by John on 26/07/2015.
 */

public class CucumberStepDefs {
    int inputNo;
    RomanNumeralGenerator myRomanNumeralGenerator = new RomanNumeralGenerator();

    @When("^I generate roman numeral for (-?[0-9]+)$")
    public void generateNumberFor(int myInputNo) throws Throwable {
        inputNo = myInputNo;
    }

    @Then("^the result is \"(.*)\"$")
    public void the_result_is(String myResult) throws Throwable {
        assertThat(myRomanNumeralGenerator.romanNumeralFor(inputNo))
                .isEqualTo(myResult);
        //assertThat(1).isEqualTo(1);
    }

}
