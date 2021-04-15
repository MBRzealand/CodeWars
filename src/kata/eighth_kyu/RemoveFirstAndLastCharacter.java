package kata.eighth_kyu;

import java.util.logging.Level;
import java.util.logging.Logger;

public class RemoveFirstAndLastCharacter {

    private static final Logger LOGGER = Logger.getLogger( RemoveFirstAndLastCharacter.class.getName() );

    public static String remove(String str) {

        LOGGER.log(Level.INFO, "Text Return: %s".formatted(str.substring(1,str.length()-1)), "");
        return  str.substring(1,str.length()-1);

    }


    public static void main(String[] args) {
        remove("banana");
    }

}
