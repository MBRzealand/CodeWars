package kata.seventh_kyu;

import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class Isograms {

    private static final Logger LOGGER = Logger.getLogger( Isograms.class.getName() );

    public static boolean isIsogram(String str) {

        String[] splitString = str.toLowerCase().split("");
        Collection<List<String>> resultCollection = Arrays.stream(splitString).collect(Collectors.groupingBy(s -> s)).values();

        LOGGER.log(Level.INFO, "Contained Letters: %s".formatted(resultCollection), "");

        if (resultCollection.size() == splitString.length){
            LOGGER.log(Level.INFO, "Isogram?: %s".formatted(true), "");
            return true;

        } else {
            LOGGER.log(Level.INFO, "Isogram?: %s".formatted(false), "");
            return false;

        }

    }


    public static void main(String[] args) {
        isIsogram("isThisAnIsogram");
    }

}
