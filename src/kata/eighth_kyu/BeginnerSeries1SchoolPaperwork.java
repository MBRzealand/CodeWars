package kata.eighth_kyu;

import java.util.logging.Level;
import java.util.logging.Logger;

public class BeginnerSeries1SchoolPaperwork {

    private static final Logger LOGGER = Logger.getLogger( BeginnerSeries1SchoolPaperwork.class.getName() );

    public static int paperWork(int n, int m) {

        if(n<0 || m<0){
            LOGGER.log(Level.INFO, "Product of n and m: %s".formatted(0), "");
            return 0;
        } else {
            LOGGER.log(Level.INFO, "Product of n and m: %s".formatted(n*m), "");
            return n*m;
        }

    }

    public static void main(String[] args) {

        paperWork(3,5);

    }

}
