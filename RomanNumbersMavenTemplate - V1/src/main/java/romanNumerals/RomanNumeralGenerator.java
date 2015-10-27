package romanNumerals;

import java.util.HashMap;

/**
 * Created by John on 12/10/2015.
 */
public class RomanNumeralGenerator {
    static HashMap<Integer, String> romanLookup = new HashMap<Integer, String>();
    public static void setup(){
        romanLookup.put(0, "");
        romanLookup.put(1, "I");
        romanLookup.put(2, "II");
        romanLookup.put(3, "III");
        romanLookup.put(4, "IV");
        romanLookup.put(5, "V");
        romanLookup.put(6, "VI");
        romanLookup.put(7, "VII");
        romanLookup.put(8, "VIII");
        romanLookup.put(9, "IX");
        romanLookup.put(10, "X");
        romanLookup.put(20, "XX");
        romanLookup.put(30, "XXX");
        romanLookup.put(40, "XL");
        romanLookup.put(50, "L");
        romanLookup.put(60, "LX");
        romanLookup.put(70, "LXX");
        romanLookup.put(80, "LXXX");
        romanLookup.put(90, "XC");
    }

    public static String romanNumeralFor(int inputInteger){
        //Iteration 1
        //return "I"

        //Iteration 2
        /*if(inputInteger == 1)
            return "I";
        else
            return "II";*/

        //Iteration 3
        /*switch(inputInteger){
            case 1:
                return "I";
            case 2:
                return "II";
            case 3:
                return "III";
            //default:
            //    return "Error";
        }
        return "Error";*/

        //Iteration 4: Numbers from 1 to 9
        //return romanLookup.get(inputInteger);

        //Iteration 5: Numbers from 1 to 99
        int units = inputInteger%10;
        int tens = inputInteger - units;
        String unitsRoman = romanLookup.get(units);
        String tensRoman = romanLookup.get(tens);
        String myResult = tensRoman.concat(unitsRoman);
        return myResult;

    }
}

//Iteration n: Recursive solution for numbers 1 to 3999
//Note the smaller dictionary and use of recursion

        /*public class RomanNumeralGenerator{

            final static TreeMap<Integer, String> map = new TreeMap<Integer, String>();

            static {
                map.put(1000, "M");
                map.put(900, "CM");
                map.put(500, "D");
                map.put(400, "CD");
                map.put(100, "C");
                map.put(90, "XC");
                map.put(50, "L");
                map.put(40, "XL");
                map.put(10, "X");
                map.put(9, "IX");
                map.put(5, "V");
                map.put(4, "IV");
                map.put(1, "I");
            }

            public final static String romanNumeralFor(int number) {
                int myKey =  map.floorKey(number);  //greatest key <= given key, or null
                if ( number == myKey ) {
                    return map.get(number);
                }
                return map.get(myKey) + romanNumeralFor(number-myKey);
            }

        }*/