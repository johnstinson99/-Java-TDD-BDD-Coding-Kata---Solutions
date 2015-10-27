package romanNumerals;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.BeforeClass;
//import org.junit.Test;
import java.util.List;

import static org.assertj.core.api.Assertions.*;
/**
 * John Stinson 29 July 2015
 * Roman Numerals Kata - jUnit tests
 */

public class JUnitTestRomanNumerals extends TestCase{
    RomanNumeralGenerator myRomanGenerator;

    @Before
    public void setUp() {
        myRomanGenerator = new RomanNumeralGenerator();
    }

    //Add in negative scenarios for 0, -1, 100 (out of range).
    //Note, can't add scenarios for decimals in Java
    //As Java is type-safe, however Python may throw
    //error at run-time as it uses duck typing.
    public void test_romanNumeralFor_1_returns_I(){
        assertThat(myRomanGenerator.romanNumeralFor(1)).isEqualTo("I");
    }

    public void test_romanNumeralFor_2_returns_II(){
        assertThat(myRomanGenerator.romanNumeralFor(2)).isEqualTo("II");
    }
    public void test_romanNumeralFor_3_returns_III(){
        assertThat(myRomanGenerator.romanNumeralFor(3)).isEqualTo("III");
    }

    //This prints out performance stats to the commandline.
    //Can add assert statement once performance success criteria
    //are understood for the machine this runs on.
    public void testPerformance(){
        //myRomanGenerator.romanNumeralFor(1);  //Add this line to observe impact on performance
        Double runArray[] = {1e0,1e1, 1e2, 1e3, 1e4, 1e5, 1e6};
        for (double noOfRuns: runArray){
            System.out.println(getMillisecondsForNRuns(noOfRuns));
        }
    }

    public double getMillisecondsForNRuns(double noOfRuns){
        long startNanoseconds = System.nanoTime();
        for(double i = 0; i < noOfRuns; i++){
            myRomanGenerator.romanNumeralFor(23);
        }
        long endNanoseconds = System.nanoTime();
        return (endNanoseconds-startNanoseconds)/1e6d;
    }
}
