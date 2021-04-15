package kata.eigth_kyu;

import java.util.logging.Level;
import java.util.logging.Logger;


public class CalculateAverage {

    private static final Logger LOGGER = Logger.getLogger( CalculateAverage.class.getName() );

    public static double findAverage(int[] array){

        double result = 0;

        for (int i : array) {
            result += i;
        }

        LOGGER.log(Level.INFO, "Sum: %s".formatted(result), "");

        result = result/array.length;

        LOGGER.log(Level.INFO, "Average: %s".formatted(result), "");
        return result ;

    }

    public static void main(String[] args) {
        findAverage(new int[]{1, 2, 3,4,5,6,7,8});
    }

}
