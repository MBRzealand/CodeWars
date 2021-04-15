package kata.eighth_kyu;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MakeUpperCase {

    private static final Logger LOGGER = Logger.getLogger( MakeUpperCase.class.getName() );

    public static String upperCase(String str){

        str = str.toUpperCase();

        LOGGER.log(Level.INFO, "Uppercased Text: %s".formatted(str), "");

        return str;

    }

    public static void main(String[] args) {

        upperCase("blabla");

    }

}
