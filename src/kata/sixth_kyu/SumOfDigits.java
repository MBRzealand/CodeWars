package kata.sixth_kyu;

import java.util.logging.Level;
import java.util.logging.Logger;

public class SumOfDigits {

    private static final Logger LOGGER = Logger.getLogger( SumOfDigits.class.getName() );

    public static int digitalRoot(int n) {

        String number = Integer.toString(n);
        String[] splitNumber =  number.split("");

        int result = 0;
        String resultString = "0";

        LOGGER.log(Level.INFO, "Input: %s".formatted(number), "");

        while (splitNumber.length > 1) {

            for (String s : splitNumber) {
                result += Integer.parseInt(s);
            }

            LOGGER.log(Level.INFO, "Sum: %s".formatted(result), "");

            resultString = Integer.toString(result);
            result = 0;

            if (resultString.length() == 1){
                break;
            } else {
                splitNumber = resultString.split("");
            }

        }

        LOGGER.log(Level.INFO, "Result: %s".formatted(resultString), "");
        return Integer.parseInt(resultString);

    }


    public static void main(String[] args) {

        digitalRoot(123456);

    }


}