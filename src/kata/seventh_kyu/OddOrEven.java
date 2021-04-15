package kata.seventh_kyu;

import java.util.logging.Level;
import java.util.logging.Logger;

public class OddOrEven {

    private static final Logger LOGGER = Logger.getLogger( OddOrEven.class.getName() );

    public static String oddOrEven (int[] array) {

        int arraySum = 0;

        for (int i = 0; i < array.length; i++) {

            arraySum += array[i];

        }

        LOGGER.log(Level.INFO, "Sum of Array: %s".formatted(arraySum), "");

        if (arraySum%2 == 0){
            LOGGER.log(Level.INFO, "Odd or Even?: %s".formatted("even"), "");
            return "even";
        } else {
            LOGGER.log(Level.INFO, "Odd or Even?: %s".formatted("odd"), "");
            return "odd";
        }

    }

    public static void main(String[] args) {
        oddOrEven(new int[]{-45,30,10,2,-5});
    }

}
