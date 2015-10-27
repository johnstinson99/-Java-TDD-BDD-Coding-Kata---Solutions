package romanNumerals;
import junit.framework.TestCase;
//import org.junit.Test;
import java.util.List;

import static org.assertj.core.api.Assertions.*;
/**
 * John Stinson 29 July 2015
 * Roman Numerals Kata - jUnit tests
 */

public class JUnitTestRomanNumerals extends TestCase{

    public void test_romanNumeralFor_1_returns_I(){
        assertThat(RomanNumeralGenerator.romanNumeralFor(1)).isEqualTo("I");
    }

    public void test_romanNumeralFor_2_returns_II(){
        assertThat(RomanNumeralGenerator.romanNumeralFor(2)).isEqualTo("II");
    }
    public void test_romanNumeralFor_3_returns_III(){
        assertThat(RomanNumeralGenerator.romanNumeralFor(3)).isEqualTo("III");
    }


    public void testPerformance(){
        RomanNumeralGenerator.setup();
        RomanNumeralGenerator.romanNumeralFor(1);
        Double runArray[] = {1e0,1e1, 1e2, 1e3, 1e4, 1e5, 1e6};
        for (double noOfRuns: runArray){
            System.out.println(getMillisecondsForNRuns(noOfRuns));
        }
    }


    public double getMillisecondsForNRuns(double noOfRuns){
        long startNanoseconds = System.nanoTime();
        for(double i = 0; i < noOfRuns; i++){
            RomanNumeralGenerator.romanNumeralFor(23);
        }
        long endNanoseconds = System.nanoTime();
        return (endNanoseconds-startNanoseconds)/1e6;
    }
}
